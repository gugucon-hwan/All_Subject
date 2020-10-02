import { createAction, handleActions } from "redux-actions";
import { delay, put, takeEvery, takeLatest } from "redux-saga/effects";

const INCREASE = "counter/INCREASE";
const DECREASE = "counter/DECREASE";

const INCREASE_ASYNC = "counter/INCREASE_ASYNC";
const DECREASE_ASYNC = "counter/DECREASE_ASYNC";

export const increase = createAction(INCREASE);
export const decrease = createAction(DECREASE);

//마우스 클릭 이벤트가 payload안에 들어가지 않도록
//() => undefined를 두 번째 파라미터로 넣어 준다.
export const increaseAsync = createAction(INCREASE_ASYNC, () => undefined);
export const decreaseAsync = createAction(DECREASE_ASYNC, () => undefined);

function* increaseSaga() {
  yield delay(1000); //1초를 기다린다.
  yield put(increase()); //특정 액션은 디스패치한다.
}

function* decreaseSaga() {
  yield delay(1000); //1초를 기다립니다.
  yield put(decrease()); //특정 액션을 디스패치합니다.
}

export function* counterSaga() {
  //takeEvery는 들어오는 모든 애션에 대해 특정 작업을 처리해 준다.
  yield takeEvery(INCREASE_ASYNC, increaseSaga);
  //takeLateset는 기존에 진행 중이던 작업이 있다면 취소 처리하고
  yield takeLatest(DECREASE_ASYNC, decreaseSaga);
}

const initialStore = 0; //상태는 꼭 객체일 필요가 없다 .숫자도 작동해요.

const counter = handleActions(
  {
    [INCREASE]: (state) => state + 1,
    [DECREASE]: (state) => state - 1,
  },
  initialStore
);

export default counter;
