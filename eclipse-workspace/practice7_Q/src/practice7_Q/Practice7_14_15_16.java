package practice7_Q;

/*
 * 문제7-1에 나오는 섯다카드의 숫자와 종류(isKwang)는 사실 한번 값이 지정되면 변경되어서는 안 되는 값이다. 
 * 카드의 숫자가 한번 잘못 바뀌면 똑같은 카드가 두 장이 될 수 도 있기 때문이다. 
 * 이러한 문제점이 발생하지 않도록 아래의 SutdaCard를 수정하시오.
 * 
 * [해설] 원래 변수 앞에 final을 붙일 때는 선언과 초기화를 동시에 해야 한다.
 * final int MAX_VOLUME = 100;
 * 
 * 그러나 인스턴스변수의 경우, 선언시에 초기화 하지 않고 생성자에서 초기화할 수 있다.
 * 생성할 때 지정된 값이 변하지 않도록 할 수 있는 것이다. 
 * 상수이므로 한번 초기화한 이후로는 값을 바꿀 수 없다.
 * 카드게임에서 카드의 숫자와 무늬가 게임도중에 변경되는 것이 가능하다면, 실수로 같은카드가 두 장이 되는 일이 일어날 수 있기 때문에 
 * 이를 방지하기 위해서 숫자와 무늬는 한번 지정되면 변경할 수 없도록 하는 것이 바람직하다.
 * 
 * [7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?(모두 고르시오.)
 * 
 * class Unit {}
 * class AirUnit extends Unit {}
 * class GroundUnit extends Unit {}
 * class Tank extends GroundUnit {}
 * class AirCraft extends AirUnit {}
 * Unit u = new GroundUnit();
 * Tank t = new Tank();
 * AirCraft ac = new AirCraft();
 * 
 * 
 * a. u = (Unit)ac;
 * b. u = ac;
 * c. GroundUnit gu = (GroundUnit)u;
 * d. AirUnit au = ac;
 * e. t = (Tank)u;
 * f. GroundUnit gu = t;
 * 
 * [정답] e
 * 조상타입의 인스턴스를 자손타입으로 형변환 할 수 없다.
 * Unit클래스는 나머지 네 개 클래스의 조상이므로 형변환이 가능하며, 심지어는 생략할 수도 있다.
 * 
 * AirCraft ac = new AirCraft();
 * u = (Unit)ac; // u는 AirCraft의 조상인 Unit타입이므로 형변환이 가능하다.
 * u = ac; // 업캐스팅(자손→조상)이므로 형변환을 생략할 수 있다.
 * 
 * 조상타입의 참조변수로 자손타입의 인스턴스를 참조하는 것이 가능하기 때문에 아래의 코드는 모두 가능하다.
 * Unit u = new GroundUnit();
 * GroundUnit gu = (GroundUnit)u; // u가 참조하는 객체가 GroundUnit이므로 OK
 * GroundUnit gu = (GroundUnit)new GroundUnit(); // 위의 두 줄을 한 줄로 합침AirCraft ac = new AirCraft();
 * AirUnit au = ac; // AirCraft가 AirUnit의 자손이므로 가능. 형변환 생략됨
 * AirUnit au = new AirCraft(); // 위의 두 줄을 한 줄로 합치면 이렇게 쓸 수 있음
 * Tank t = new Tank();
 * GroundUnit gu = t; // 조상타입의 참조변수로 자손타입의 인스턴스를 참조. OK
 * GroundUnit gu = new Tank(); // 위의 두 줄을 한 줄로 합치면 이렇게 쓸 수 있음
 * 
 * 그러나 조상인스턴스를 자손타입으로 형변환하는 것은 허용하지 않는다. 참조변수 u는 실제로 GroundUnit인스턴스를 참조하고 있다. 
 * (Tank)u는 GroundUnit인스턴스를 자손타입인Tank로 형변환하는 것인데, 자손타입으로 형변환은 허용되지 않으므로 실행시 에러가 발생한다.
 * [참고] 컴파일 시에는 타입만을 체크하기 때문에 에러가 발생하지 않을 수도 있지만, 실행시에 에러가 발생한다.
 * 
 * Unit u = new GroundUnit();
 * Tank t = new Tank();
 * t = (Tank)u; // 조상인스턴스(GroundUnit)를 자손(Tank)으로 형변환할 수 없다.
 * Tank t = (Tank)new GroundUnit; // 허용되지 않음
 * 
 * [7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
 * class Car {}
 * class FireEngine extends Car implements Movable {}
 * class Ambulance extends Car {}
 * FireEngine fe = new FireEngine();
 * 
 * a. fe instanceof FireEngine
 * b. fe instanceof Movable
 * c. fe instanceof Object
 * d. fe instanceof Car
 * e. fe instanceof Ambulance
 * 
 * [정답] e
 * instanceof연산자는 실제 인스턴스의 모든 조상이나 구현한 인터페이스에 대해true를 반환한다. 
 * 그래서, 아래 그림에서 알 수 있듯이 FireEngine인스턴스는 Object,Car, Movable, FireEngine타입에 대해 instanceof연산을 하면 결과로 true를 얻는다. 
 * 어떤 타입에 대해 instanceof연산결과가 true라는 것은 그 타입으로 형변환이 가능하다는것을 뜻한다. 
 * 참조변수의 형변환을 하기에 앞서 instanceof연산자로 형변환이 가능한지미리 확인해 보는 것이 좋다.
 * 
 * 
 */

class SutdaCard {
	final int num;
	final boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Practice7_14_15_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard card = new SutdaCard(1, true);
		System.out.println(card);
	}
}
