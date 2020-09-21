package practice12_Q;

import java.util.ArrayList;

/*
 * [12-1] 클래스 Box가 다음과 같이 정의되어 있을 때, 다음 중 오류가 발생하는 문장은?
경고가 발생하는 문장은?
 * 
 * class Box<T> { // 지네릭 타입 T를 선언
T item;
void setItem(T item) { this.item = item; }
T getItem() { return item; }
}

a. Box<Object> b = new Box<String>();
b. Box<Object> b = (Object)new Box<String>();
c. new Box<String>().setItem(new Object());
d. new Box<String>().setItem("ABC");

[정답] a, b, c

[해설]
a. Box<Object> b = new Box<String>(); // 에러. 대입된 타입이 반드시 같아야 한다.
b. Box<Object> b = (Object)new Box<String>(); // 에러. Object타입을 Box<Object>타
입의 참조변수에 저장불가.(타입 불일치)
c. new Box<String>().setItem(new Object()); // 에러. 대입된 타입이 String이므로,
setItem(T item)의 매개변수 역시, String타입만 허용된다.
d. new Box<String>().setItem("ABC"); // OK. 대입된 타입인 String과 일치하는 타입을
매개변수로 지정했기 때문에 OK.

[12-2] 지네릭 메서드 makeJuice()가 아래와 같이 정의되어 있을 때, 이 메서드를 올바
르게 호출한 문장을 모두 고르시오. (Apple과 Grape는 Fruit의 자손이라고 가정하자.)

class Juicer {
static <T extends Fruit> String makeJuice(FruitBox<T> box) {
String tmp = "";
for(Fruit f : box.getList()) tmp += f + " ";
return tmp;
}
}

a. Juicer.<Apple>makeJuice(new FruitBox<Fruit>());
b. Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());
d. Juicer.makeJuice(new FruitBox<Apple>());
e. Juicer.makeJuice(new FruitBox<Object>());

[정답] c, d

[해설]
a. Juicer.<Apple>makeJuice(new FruitBox<Fruit>()); // 에러. 지네릭 메서드에 대입된
타입이 Apple이므로, 이 메서드의 매개변수는 'FruitBox<Apple>'타입이 된다. new
FruitBox<Fruit>()는 매개변수의 타입과 일치하지 않으며, 자동형변환도 불가능한 타입이
므로 에러이다.
b. Juicer.<Fruit>makeJuice(new FruitBox<Grape>()); // 에러. Grape가 Fruit의 자손이
라고 해도, 타입이 다르기 때문에 같은 이유로 에러.
c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>()); // OK.
d. Juicer.makeJuice(new FruitBox<Apple>()); // OK. 지네릭 메서드의 타입 호출이 생
략된 형태. 생략하지 않았다면, ‘Juicer.<Apple>makeJuice(new FruitBox<Apple>());'과
같다. 대부분의 경우 이처럼 생략한다.
e. Juicer.makeJuice(new FruitBox<Object>()); // 에러. 지네릭 메서드의 타입 호출이
생략되지 않았다면, ‘Juicer.<Object>makeJuice(new FruitBox<Object>());'과 같다. d
번의 경우와같이 타입이 일치하긴 하지만, <T extends Fruit>로 제한이 걸려있으므로, 타
입 T는 Fruit의 자손이어야 한다. Object는 Fruit의 자손이 아니므로 에러.


[12-3] 다음 중 올바르지 않은 문장을 모두 고르시오.
class Box<T extends Fruit> { // 지네릭 타입 T를 선언
T item;
void setItem(T item) { this.item = item; }
T getItem() { return item; }
}

a. Box<?> b = new Box();
b. Box<?> b = new Box<>();
c. Box<?> b = new Box<Object>();
d. Box<Object> b = new Box<Fruit>();
e. Box b = new Box<Fruit>();
f. Box<? extends Fruit> b = new Box<Apple>();
g. Box<? extends Object> b = new Box<? extends Fruit>();

[정답] c, d, g

[해설]
a. Box<?> b = new Box(); // OK. Box<?>는 Box<? extends Object>를 줄여쓴 것이다. 객
체 생성에 지네릭 타입을 지정해 주지 않았지만 문제가 되지는 않는다. 그래도, new
Box()대신 new Box<>()를 사용하는 것이 좋다.
b. Box<?> b = new Box<>(); // OK. new Box<>();는 타입을 생략한 것으로, 일반적으로는
참조변수의 타입과 같은 타입으로 간주된다. 참조변수의 타입이 <?>, 즉 <? extends
Object>이므로 생략된 타입은 Object이라고 생각하기 쉬운데, 여기서는 지네릭 클래스
Box에 정의된 타입이 <T extends Fruit>와 같이 제한되어 있기 때문에, 'Object'가 아니
라‘Fruit'이 생략된 것으로 봐야 한다. 그래서 Box<?> b = new Box<Object>();와 같이
하면 에러가 발생한다. Object는 Fruit의 자손이 아니기 때문이다.

Box<?> b = new Box<>(); // OK. Box<?> b = new Box<Fruit>();와 동일
Box<?> b = new Box<Object>(); // 에러
Box<?> b = new Box<Fruit>(); // OK

‘Box<? extends Object>’는 Box<Object>와 같지 않음에 주의하자. 지네릭 클래스 Box는
타입 T가 Fruit의 자손으로 제한되어 있기 때문에, Box<Object>와 같이 Fruit의 자손이
아닌 클래스를 대입할 수 없다. 그러나, 'Box<? extneds Object>'와 같이 와일드 카드를
사용하는 것은 가능하다.
c. Box<?> b = new Box<Object>(); // 에러 b의 설명 참조
d. Box<Object> b = new Box<Fruit>(); // 에러. 타입 불일치
e. Box b = new Box<Fruit>(); // OK. 바람직하지 않음.‘Box<?> b’가 더 나음.
f. Box<? extends Fruit> b = new Box<Apple>(); // OK.
g. Box<? extends Object> b = new Box<? extends Fruit>(); // 에러. new연산자는 타입
이 명확해야하므로 와일드 카드와 같이 사용불가


[12-4] 아래의 메서드는 두 개의 ArrayList를 매개변수로 받아서, 하나의 새로운
ArrayList로 병합하는 메서드이다. 이를 지네릭 메서드로 변경하시오.

	public static <? extends Product> ArrayList<? extends Product> merge(
			ArrayList<? extends Product> list, ArrayList<? extends Product> list2) {
			ArrayList<? extends Product> newList = new ArrayList<>(list);
			newList.addAll(list2);
			return newList;
	}
	
	public static <T extends Product> ArrayList<T> merge(
			ArrayList<T> list, ArrayList<T> list2) {
			ArrayList<T> newList = new ArrayList<>(list);
			newList.addAll(list2);
			return newList;
	}
	
 */
public class Practice12_1_2_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
