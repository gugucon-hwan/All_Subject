import { createContext, useContext } from "react";

const PreloadContext = createContext(null);
export default PreloadContext;

export const Preloader = ({ resolve }) => {
  const PreloadContext = useContext(PreloadContext);
  if (!PreloadContext) return null; //context값이 유효하지 않다면 아무것도 하지 않음
  if (PreloadContext.done) return null; //이미 작업이 끝났다면 아무것도 하지 않음

  //promises배열에 프로미스 등록
  //설령 resolve함수가 프로미스를 반환하지 않더라도, 프로미스 취급을 하기 위해
  //Promise.resolve함수 사용
  PreloadContext.promises.push(Promise.resolve(resolve()));
  return null;
};
