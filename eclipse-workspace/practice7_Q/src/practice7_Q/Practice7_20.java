package practice7_Q;

/*개인정답 작성자 : hwan
 * [7-20] 다음의 코드를 실행한 결과를 적으시오.
 * 
 * [실행결과]
 * p.x = 100
 * Child Method
 * c.x = 200
 * Child Method
 * 
 * 
 * 
 * [해설] 조상 클래스에 선언된 멤버변수와 같은 이름의 인스턴스변수를 자손 클래스에 중복으로 정의했을 때, 
 * 조상타입의 참조변수로 자손 인스턴스를 참조하는 경우와 자손타입의 참조변수로 자손 인스턴스를 참조하는 경우는 서로 다른 결과를 얻는다.
 * 메서드의 경우 조상 클래스의 메서드를 자손의 클래스에서 오버라이딩한 경우에도 참조변수의 타입에 관계없이 항상 실제 인스턴스의 메서드(오버라이딩된 메서드)가 호출되지만,
 * 멤버변수의 경우 참조변수의 타입에 따라 달라진다.
 * 
 * 그리고, Parent클래스와 Child클래스는 서로 같은 멤버들을 정의하고 있다
 * 이 때 조상타입의 참조변수 p로 Child인스턴스의 멤버들을 사용하는 것과 자손타입의 참조변수 c로 Child인스턴스의 멤버들을 사용하는 것의 차이를 알 수 있다.메서드인 method()의 경우 참조변수의 타입에 관계없이 항상 실제 인스턴스의 타입인
 * Child클래스에 정의된 메서드가 호출되지만, 인스턴스변수인 x는 참조변수의 타입에 따라서 달라진다.
 * 
 */

public class Practice7_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
	}

}

class Parent {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}
}