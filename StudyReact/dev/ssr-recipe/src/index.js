import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import App from "./App";
import * as serviceWorker from "./serviceWorker";
import { BrowserRouter } from "react-router-dom";
import { applyMiddleware, createStore } from "redux";
import rootReducer from "./modules";
import thunk from "redux-thunk";
import { Provider } from "react-redux";
import createSagaMiddleware from "redux-saga";
import rootReducer, { rootSaga } from "./modules";

const sagaMiddleware = createSaga;

const store = createStore(
  rootReducer,
  window.__PRELOADED_STATE__, //이 값을 초기 상태로 사용함
  applyMiddleware(thunk, sagaMiddleware)
);

sagaMiddleware.run(rootSaga);

ReactDOM.render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById("root")
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
