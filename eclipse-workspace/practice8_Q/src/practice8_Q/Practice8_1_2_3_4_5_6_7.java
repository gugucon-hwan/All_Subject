package practice8_Q;

public class Practice8_1_2_3_4_5_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 * [8-1] 예외처리의 정의와 목적에 대해서 설명하시오
 * 
 * [정답] 정의 - 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것 목적 - 프로그램의 비정상 종료를 막고,
 * 정상적인 실행상태를 유지하는 것
 * 
 * [해설] 프로그램의 실행도중에 발생하는 에러는 어쩔 수 없지만, 예외는 프로그래머가 이에 대한 처리를 미리 해주어야 한다.
 * 
 * 에러(error) - 프로그램 코드에 의해서 수습될 수 없는 심각한 오류 예외(exception) - 프로그램 코드에 의해서 수습될 수
 * 있는 다소 미약한 오류
 * 
 * 예외처리(exception handling)란, 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의발생에 대비한 코드를 작성하는 것이며,
 * 예외처리의 목적은 예외의 발생으로 인한 실행중인 프로그램의 갑작스런 비정상 종료를 막고, 정상적인 실행상태를 유지할 수 있도록하는 것이다.
 * 
 * 예외처리(exception handling)의 정의 - 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것 목적 -
 * 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
 * 
 * [8-2] 다음은 실행도중 예외가 발생하여 화면에 출력된 내용이다. 이에 대한 설명 중 옳지 않은 것은?
 * 
 * java.lang.ArithmeticException : / by zero at
 * ExceptionEx18.method2(ExceptionEx18.java:12) at
 * ExceptionEx18.method1(ExceptionEx18.java:8) at
 * ExceptionEx18.main(ExceptionEx18.java:4)
 * 
 * a. 위의 내용으로 예외가 발생했을 당시 호출스택에 존재했던 메서드를 알 수 있다. b. 예외가 발생한 위치는 method2 메서드이며,
 * ExceptionEx18.java파일의 12번째 줄이다. c. 발생한 예외는 ArithmeticException이며, 0으로 나누어서
 * 예외가 발생했다. d. method2메서드가 method1메서드를 호출하였고 그 위치는 ExceptionEx18.java파일의 8번째
 * 줄이다.
 * 
 * [정답] d [해설] 예외의 종류는 ArithmeticException이고 0으로 나눠서 발생하였다. 예외가 발생한곳은 method2이고
 * ExceptionEx18.java의 12번째 줄이다. 예외가 발생했을 당시의 호출스택을 보면 아래의 그림과 같다. 호출스택은 맨 위에 있는
 * 메서드가 현재 실행 중인 메서드이고 아래 있는 메서드가 바로 위의 메서드를 호출한 것이다. 그래서 main → method1→
 * method2의 순서로 호출되었음을 알 수 있다.
 * 
 * [8-3] 다음 중 오버라이딩이 잘못된 것은? (모두 고르시오)
 * 
 * void add(int a, int b) throws InvalidNumberException, NotANumberException {}
 * class NumberException extends Exception {} class InvalidNumberException
 * extends NumberException {} class NotANumberException extends NumberException
 * {}
 * 
 * a. void add(int a, int b) throws InvalidNumberException, NotANumberException
 * {} b. void add(int a, int b) throws InvalidNumberException {} c. void add(int
 * a, int b) throws NotANumberException {} d. void add(int a, int b) throws
 * Exception {} e. void add(int a, int b) throws NumberException {}
 * 
 * [정답] d, e [해설] 오버라이딩(overriding)을 할 때, 조상 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다. -
 * 아래의 코드를 보면 Child클래스의 parentMethod()에 선언된 예외의 개수가 조상인 Parent클래스의
 * parentMethod()에 선언된 예외의 개수보다 적으므로 바르게 오버라이딩 되었다.
 * 
 * Class Parent { void parentMethod() throws IOException, SQLException { //.. }
 * } Class Child extends Parent { void parentMethod() throws IOException { //..
 * } //.. }
 *
 * 여기서 주의해야할 점은 단순히 선언된 예외의 개수의 문제가 아니라는 것이다.
 *
 * Class Child extends Parent { void parentMethod() throws Exception { //.. }/
 * /.. }
 *
 * 만일 위와 같이 오버라이딩을 하였다면, 분명히 조상클래스에 정의된 메서드보다 적은 개수의 예외를 선언한 것처럼 보이지만 Exception은
 * 모든 예외의 최고 조상이므로 가장 많은 개수의 예외를 던질 수 있도록 선언한 것이다. 그래서 예외의 개수는 적거나 같아야 한다는 조건을
 * 만족시키지 못하는 잘못된 오버라이딩인 것이다.
 *
 *
 *
 * [8-4] 다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은? (모두 고르시오)
 *
 * void method() throws InvalidNumberException, NotANumberException {} class
 * NumberException extends RuntimeException {} class InvalidNumberException
 * extends NumberException {} class NotANumberException extends NumberException
 * {}
 *
 * a. try {method();} catch(Exception e) {} b. try {method();}
 * catch(NumberException e) {} catch(Exception e) {} c. try {method();}
 * catch(Exception e) {} catch(NumberException e) {} d. try {method();}
 * catch(InvalidNumberException e) {} catch(NotANumberException e) {} e. try
 * {method();} catch(NumberException e) {} f. try {method();}
 * catch(RuntimeException e) {}
 *
 * [정답] c
 *
 * [해설] try블럭 내에서 예외가 발생하면, catch블럭 중에서 예외를 처리할 수 있는 것을을 차례대로 찾아 내려간다. 발생한 예외의
 * 종류와 일치하는 catch블럭이 있으면 그 블럭의 문장들을 수행하고 try-catch문을 빠져나간다. 일치하는 catch블럭이 없으면
 * 예외는처리되지 않는다. 발생한 예외의 종류와 일치하는 catch블럭을 찾을 때, instanceof로 검사를 하기 때문에 모든 예외의
 * 최고조상인 Exception이 선언된 catch블럭은 모든 예외를 다 처리할 수 있다. 한 가지 주의할 점은 Exception을 처리하는
 * catch블럭은 모든 catch블럭 중 제일 마지막에 있어야 한다는 것이다.
 *
 * try { method(); } catch(Exception e) { // 컴파일 에러 발생!!! }
 * catch(NumberException e) {}
 *
 * 위의 코드에서는 Exception을 선언한 catch블럭이 마지막 catch블럭이 아니기 때문에 컴파일 에러가 발생한다.
 *
 * [8-5] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 *
 * class Exercise8_5 { static void method(boolean b) { try {
 * System.out.println(1); if (b) throw new ArithmeticException();
 * System.out.println(2); // 예외가 발생하면 실행되지 않는 문장 } catch (RuntimeException r) {
 * System.out.println(3); return; // 메서드를 빠져나간다.(finally블럭을 수행한 후에) } catch
 * (Exception e) { System.out.println(4); return; } finally {
 * System.out.println(5); // 예외발생여부에 관계없이 항상 실행되는 문장 } System.out.println(6); }
 * 
 * public static void main(String[] args) { method(true); method(false); } //
 * main }
 *
 * [정답] [실행결과] 1 3 5 1 2 5 6
 *
 * [해설] 예외가 발생하면 1,3,5가 출력되고 예외가 발생하지 않으면, 1,2,5,6이 출력된다. ArithmeticException은
 * RuntimeException의 자손이므로 RuntimeException이 정의된 catch블럭에서 처리된다. 이 catch블럭에
 * return문이 있으므로 메서드를 종료하고 빠져나가게 되는데, 이 때도 finally블럭이 수행된다.
 *
 *
 * [8-6] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 *
 * class Exercise8_6 { public static void main(String[] args) { try { method1();
 * } catch (Exception e) { System.out.println(5); } }
 * 
 * static void method1() { try { method2(); System.out.println(1); } catch
 * (ArithmeticException e) { System.out.println(2); } finally {
 * System.out.println(3); } System.out.println(4); } // method1()
 * 
 * static void method2() { throw new NullPointerException(); } }
 *
 * [정답] [실행결과] 3 5
 *
 *
 * [해설] main메서드가 method1()을 호출하고, method1()은 method2()를 호출한다. method2()에서
 * NullPointerException이 발생했는데, 이 예외를 처리해줄 try-catch블럭이 없으므로 method2()는 종료되고, 이를
 * 호출한 method1()으로 되돌아갔는데 여기에는 try-catch블럭이 있긴 하지만 NullPointerException을 처리해줄
 * catch블럭이 없으므로 method1()도 종료되고, 이를 호출한 main메서드로 돌아간다. 이 때 finally블럭이 수행되어 '3'이
 * 출력된다. main메서드에서는 모든 예외를 처리할 수 있는 Exception이 선언된 catch블럭이 있으므로 예외가 처리되고 '5'가
 * 출력된다.
 *
 *
 * [8-7] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 *
 *class Exercise8_7 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				System.exit(0);
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
		method(false);
	} // main
}
 *
 *[정답]
 *[실행 결과]
 *1
 *
 *[해설] 변수 b의 값이 true이므로 System.exit(0);이 수행되어 프로그램이 즉시 종료된다. 
 *이럴 때는 finally블럭이 수행되지 않는다.
 *
 *
 *
 */


//Exception 오버라이딩 테스트 
class NumberException extends Exception {
}

class InvalidNumberException extends NumberException {
}

class NotANumberException extends NumberException {
}

class Parent {
	int a;
	int b;

	Parent() {
		this(0, 0);
	}

	Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void add(int a, int b) throws InvalidNumberException, NotANumberException {
	}
}

class Child extends Parent {
	Child() {
	}

	Child(int a, int b) {
		super(a, b);
	}

	void add(int a, int b) throws InvalidNumberException, NotANumberException {
	}
}
