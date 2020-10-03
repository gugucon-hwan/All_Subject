import React from "react";
import ReactDOMServer from "react-dom/server";
import express from "express";
import { StaticRouter } from "react-router-dom";
import App from "./App";
import path from "path";
import fs from "fs";
import { createStore, applyMiddleware } from "redux";
import { Provider } from "react-redux";
import thunk from "redux-thunk";
import rootReducer,{rootSaga} from "./modules";
import PreloadContext from "./lib/PreloadContext";
import createSagaMiddleware from 'redux-saga';
import {END} from 'redux-saga';

//asset-manifest.json에서 파일경로들을 조회합니다.
const manifest = JSON.parse(
  fs.readFileSync(path.resolve("./build/asset-manifest.json"), "utf-8")
);

const chunks = Object.keys(manifest.files)
  .filter((key) => /chunk\.js$/.exec(key)) //chunk.js로 끝나는 키를 찾아서
  .map((key) => `<script src="${manifest.files[key]}"></script>`) //스크립트 태그로 변환하고
  .join(""); //합침

function createPage(root, stateScript) {
  return `<!DOCTYPE html>
    <html lang="en">
    <head>
      <meta charset="utf-8" />
      <link rel="shortcut icon" href="/favicon.ico" />
      <meta
        name="viewport"
        content="width=device-width, initial-scale=1, shrink-to-fit=no"
      />
      <meta name="theme-color" content="#000000"/>
      <title>React App</title>
      <link href="${manifest.files["main.css"]}" rel="stylesheet" />
    </head>
    <body>
      <noscript> You need to enable JavaScript to run this app.</noscript>
      <div id="root">
        ${root}
      </div>
      ${stateScript}
      <script src="${manifest.files["runtime~main.js"]}"></script>
      ${chunks}
      <script src="${manifest.files["main.js"]}"></script>
    </body>
  </html>
  `;
}

const app = express();

const serverRender = (req, res, next) => {
  const context = {};
  const SagaMiddleware = createSagaMiddleware();
  const store=createStore(
    rootReducer,
    applyMiddleware(thunk, SagaMiddleware)
  );

  const sagaPromise=sagaMiddleware.run(rootSaga).toPromise();

  const preloadContext={
    done: false,
    promises:[]
  };

  const jsx=(
    <PreloadContext.PRovider value={preloadContext}>
      <Provider store={store}>
        <StaticRouter location={req,url} context={context}>
          <App />
        </StaticRouter>
      </Provider>
    </PreloadContext.PRovider>
  )

  sagaMiddleware.run(rootSaga);
  const PreloadContext = {
    done: false,
    promises: [],
  };
  const root=ReactDOMServer.renderToString(jsx);//렌더링을 합니다.
  const stateString=JSON.stringify(store.getState()).replace(/</g,'\\u003c');
  res.send(createPage(root, stateScript));//결과물을 응답한다.

  ReactDOMServer.renderToStaticMarkup(jsx);//renderToStaticMarkup으로 한번 렌더링 합니다.
  store.dispatch(END);//redux-saga의 END액션을 발생시키면 액션을 모니터링하는 사가들이 모두 종료된다.
  try{
    await sagaPromise; //기존에 진행 중이던 사가들이 모두 끝날 때까지 기다린다.
    await Promise.all(preloadContext.promise);//모든 프로미스를 기다린다.    
  }catch(e){
    return res.status(500);
  }
  preloadContext.done=true;
  const root = ReactDOMServer.renderToString(jsx); //렌더링을 하고
  res.send(createPage(root)); //클라이언트에게 결과물을 응답합니다.
};

const serve = express.static(path.resolve("./build"), {
  index: false, // '/' 경로에서 index.html을 보여 주지 않도록 설정
});

app.use(serve); //순서가 중요합니다. serverRender 전에 위치해야 합니다.
app.use(serverRender);

app.listen(5000, () => {
  console.log("Running on http://localhost:5000");
});

const html = ReactDOMServer.renderToString(
  <div>Hello Server Side Rendering</div>
);

console.log(html);
