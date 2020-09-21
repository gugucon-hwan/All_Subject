package practice6_Q;


/*
 * 개인답 작성자 : hwan
 * [6-10] 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
 * a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
 * b. 생성자는 객체를 생성하기 위한 것이다.
 * c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
 * d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
 * e. 생성자는 오버로딩 할 수 없다.
 * 
 * 정답 : b,e
 * 생성자가 객체를 생성할 때 사용되기는 하지만, 객체를 초기화할 목적으로 사용되는것이다. 
 * 객체를 생성하는 것은 new연산자이다.
 * 
 * 생성자도 오버로딩이 가능해서 하나의 클래스에 여러 개의 생성자를 정의할 수 있다.
 * 
 * 
 * [6-11] 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
 * a. 객체 자신을 가리키는 참조변수이다.
 * b. 클래스 내에서라면 어디서든 사용할 수 있다.
 * c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
 * d. 클래스 메서드 내에서는 사용할 수 없다.
 * 
 * 정답: d
 * 클래스 멤버(static이 붙은 변수나 메서드)에는 사용할 수 없다.
 * this는 인스턴스 자신의 주소를 저장하고 있으며, 모든 인스턴스메서드에 숨겨진 채로 존재하는 지역변수이다. 그래서 인스턴스메서드 내에서만 사용할 수 있다.
 * 
 * 
 * [6-12] 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
 * a. 메서드의 이름이 같아야 한다.
 * b. 매개변수의 개수나 타입이 달라야 한다.
 * c. 리턴타입이 달라야 한다.
 * d. 매개변수의 이름이 달라야 한다.
 * 
 * 정답 : c, d
 * c. 리턴타입이 달라야 한다.
 * → 리턴타입은 오버로딩에 영향을 주지 못한다.
 * d. 매개변수의 이름이 달라야 한다.
 * → 리턴타입은 오버로딩에 영향을 주지 못한다.
 * 
 * << 오버로딩의 조건 >>
 * 1. 메서드 이름이 같아야 한다.
 * 2. 매개변수의 개수 또는 타입이 달라야 한다.
 * 3. 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않는다.
 * (리턴타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다.)
 *  
 * 
 * [6-13] 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
 * long add(int a, int b) { return a+b;}
 * 
 * a. long add(int x, int y) { return x+y;}
 * b. long add(long a, long b) { return a+b;}
 * c. int add(byte a, byte b) { return a+b;}
 * d. int add(long a, int b) { return (int)(a+b);}
 * 
 * 정답 : b, c, d
 * [해설] b, c, d는 모두 메서드의 이름이 add이고 매개변수의 타입이 다르므로 오버로딩이성립한다. 
 * 오버로딩이 성립하기 위한 조건은 다음과 같다.
 * 
 * 
 * [6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
 * a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다.
 * b.지역변수는 사용하기 전에 반드시 초기화해야 한다.
 * c.초기화 블럭보다 생성자가 먼저 수행된다.→ 초기화 블럭이 먼저 수행된다
 * d.명시적 초기화를 제일 우선적으로 고려해야 한다.
 * e.클래스변수보다 인스턴스변수가 먼저 초기화된다.→ 클래스변수가 먼저 초기화됨
 * 
 * 정답 : c, e
 * 클래스변수는 클래스가 처음 메모리에 로딩될 때, 자동 초기화되므로 인스턴스 변수보다 먼저 초기화 된다. 
 * 그리고 생성자는 초기화 블럭이 수행된 다음에 수행된다.
 * 
 * 
 * [6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은?
 * a. 기본값-명시적초기화-초기화블럭-생성자
 * b. 기본값-명시적초기화-생성자-초기화블럭
 * c. 기본값-초기화블럭-명시적초기화-생성자
 * d. 기본값-초기화블럭-생성자-명시적초기화
 * 
 * 정답 : a
 * 클래스변수의 초기화시점 : 클래스가 처음 로딩될 때 단 한번 초기화 된다.
 * 인스턴스변수의 초기화시점 : 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다.
 * 클래스변수의 초기화순서 : 기본값 → 명시적초기화 → 클래스 초기화 블럭
 * 인스턴스변수의 초기화순서 : 기본값 → 명시적초기화 → 인스턴스 초기화 블럭 → 생성자
 * 
 * 
 * [6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
 * a. 자동 초기화되므로 별도의 초기화가 필요없다.
 * b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
 * c. 매서드의 매개변수로 선언된 변수도 지역변수이다.
 * d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
 * e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.
 * 
 * 정답 : a, e
 * 지역변수는 자동 초기화 되지 않기 때문에 사용하기 전에 반드시 적절한 값으로
 * 초기화를 해주어야한다. 
 * 지역변수는 자신이 선언된 블럭이나 메서드가 종료되면 소멸되므로 
 * 메모리 부담이 적다. 
 * 힙(heap)영역에는 인스턴스(인스턴스변수)가 생성되는 영역이며,
 * 지역변수는 호출스택(call stack)에 생성된다.
 * 
 */
public class Practice6_10_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
