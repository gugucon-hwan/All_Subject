import React, { useState, Suspense } from "react";
import logo from "./logo.svg";
import "./App.css";
import loadable from "@loadable/component";

const SplitMe = React.lazy(() => import("./SplitMe"), {
  fallback: <div>loading...</div>,
});

function App() {
  const [visible, setVisible] = useState(false);
  const onClick = () => {
    setVisible(true);
  };
  const onMouseOVer = () => {
    SplitMe.preload();
  };
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p onClick={onClick} onMouseOver={onMouseOVer}>
          Hello React!
        </p>
        {visible && <SplitMe />}
      </header>
    </div>
  );
}

export default App;
