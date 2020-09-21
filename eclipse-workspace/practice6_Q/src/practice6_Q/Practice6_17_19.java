package practice6_Q;

/*
 * [6-17] 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
 * ----println----
 *    method1
 *    method2
 *    main
 * a. 제일 먼저 호출스택에 저장된 것은 main메서드이다.
 * b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.
 * c. method2메서드를 호출한 것은 main메서드이다.
 * d. println메서드가 종료되면 method1메서드가 수행을 재개한다.
 * e. main-method2-method1-println의 순서로 호출되었다.
 * f. 현재 실행중인 메서드는 println 뿐이다.
 * 
 * 정답 : b
 *  호출스택의 제일 위에 있는 메서드가 현재 수행중인 메서드이며, 
 *  호출스택 안의 나머지 메서드들은 대기상태이다.
 * 
 * 
 * [6-18] 다음의 코드를 컴파일하면 에러가 발생한다. 
 * 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오.  
class MemberCall {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	static int cv2 = iv; // 라인 A

	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 라인 B
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // 라인 C
	}

static void staticMethod2() {
staticMethod1();
instanceMethod1(); // 라인 D
}

void instanceMethod2() {
staticMethod1(); // 라인 E
instanceMethod1();
*
*정답 : 라인 a, b, d
*라인 A - static변수의 초기화에 인스턴스변수를 사용할 수 없다.
*꼭 사용해야한다면, 객체를 생성해야한다.
*라인 B - static메서드에서는 인스턴스변수를 사용할 수 없다.
*라인 D - static메서드에서는 인스턴스메서드를 사용할 수 없다.
*
*[6-19] 다음 코드의 실행 결과를 예측하여 적으시오.
*
*class Exercise6_19
{
public static void change(String str) {
str += "456";
}
public static void main(String[] args)
{
String str = "ABC123";
System.out.println(str);
change(str);
System.out.println("After change:"+str);
}
}
*정답 : 
*ABC123
*ABC123
*change메서드의 매개변수가 참조형인데도 왜? main메서드의 문자열 str에 변경한
*내용이 반영되지 않은 것일까? 많은 사람들이 매개변수가 참조형이라는 것만 보고 
*main메서드의 문자열 str이 변경될 것이라고 쉽게 생각한다. 
*
*
*/




public class Practice6_17_19 {
	public static void change(StringBuffer str) {
		str.append("456");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("ABC123");
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
	}

}
