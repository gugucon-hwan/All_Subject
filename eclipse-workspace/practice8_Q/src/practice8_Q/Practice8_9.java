package practice8_Q;


/*
 * [8-9] 다음과 같은 조건의 예외클래스를 작성하고 테스트하시오.
[참고] 생성자는 실행결과를 보고 알맞게 작성해야한다.

* 클래스명 : UnsupportedFuctionException
* 조상클래스명 : RuntimeException
* 멤버변수 :
이 름 : ERR_CODE
저장값 : 에러코드
타 입 : int
기본값 : 100
제어자 : final private

* 메서드 :
1. 메서드명 : getErrorCode
기 능 : 에러코드(ERR_CODE)를 반환한다.
반환타입 : int
매개변수 : 없음
제어자 : public

2. 메서드명 : getMessage
기 능 : 메세지의 내용을 반환한다.(Exception클래스의 getMessage()를 오버라이딩)
반환타입 : String
매개변수 : 없음
제어자 : public
 * 
 * [실행결과]
 * Exception in thread "main" UnsupportedFuctionException: [100]지원하지 않는 기능입니다.
 * at Exercise8_9.main(Exercise8_9.java:5)
 * 
 * [해설] 에러메시지를 저장하는 인스턴스변수 msg는 상속받은 것이므로 조상의 생성자를 호출해서 초기화되도록 해야 한다. 
 * ERR_CODE는 한 번 값이 지정되면 바뀌는 값이 아니라서 final을 붙여서 상수로 했다. 그리고 생성자를 통해 초기화하였다.
 * 
 * UnsupportedFuctionException(String msg, int errCode) { // 생성자
 * super(msg); // 조상의 생성자 RuntimeException(String msg)를 호출
 * ERR_CODE = errCode;
 * }
 * 
 * getMessage() 역시 조상으로부터 상속받은 것이며, ERR_CODE도 같이 출력되도록 하기 위해 오버라이딩했다. 
 * 조상의 메서드를 오버라이딩할 때는, 가능하다면 조상의 메서드를 재활용하는 것이 좋다.
 * 
 * public String getMessage() { // Exception의 getMeesage()를 오버라이딩한다.
 * return "["+getErrCode()+"]" + super.getMessage();
 * }
 */
class UnsupportedFuctionException extends RuntimeException{
	private final int ERR_CODE;		
	
	public UnsupportedFuctionException(String msg, int error_code) {
		// TODO Auto-generated constructor stub
		super(msg);
		ERR_CODE=error_code;
	}
	public UnsupportedFuctionException(String msg) {
		this(msg,100);
	}

	public int getErrorCode() {// 에러 코드를 얻을 수 있는 메서드도 추가했다
		return ERR_CODE;// 이 메서드는 주로 getMessage()와 함께 사용될 것이다
	}
	
	public String getMessage() {// Exception의 getMeesage()를 오버라이딩한다.
		return "["+getErrorCode()+"]"+super.getMessage();
	}
}

public class Practice8_9 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
	}
	
}
