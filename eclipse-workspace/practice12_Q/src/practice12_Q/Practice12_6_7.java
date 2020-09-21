package practice12_Q;


/*
 * [12-6] 다음 중 메타 애너테이션이 아닌 것을 모두 고르시오.
a. Documented
b. Target
c. Native
d. Inherited

[정답]
c

@Override 컴파일러에게 오버라이딩하는 메서드라는 것을 알린다.
@Deprecated 앞으로 사용하지 않을 것을 권장하는 대상에 붙인다.
@SuppressWarnings 컴파일러의 특정 경고메시지가 나타나지 않게 해준다.
@SafeVarargs 지네릭스 타입의 가변인자에 사용한다.(JDK1.7)
@FunctionalInterface 함수형 인터페이스라는 것을 알린다.(JDK1.8)
@Native native메서드에서 참조되는 상수 앞에 붙인다.(JDK1.8)
@Target* 애너테이션이 적용가능한 대상을 지정하는데 사용한다.
@Documented* 애너테이션 정보가 javadoc으로 작성된 문서에 포함되게 한다.
@Inherited* 애너테이션이 자손 클래스에 상속되도록 한다.
@Retention* 애너테이션이 유지되는 범위를 지정하는데 사용한다.
@Repeatable* 애너테이션을 반복해서 적용할 수 있게 한다.(JDK1.8)
자바에서 기본적으로 제공하는 표준 애너테이션(*가 붙은 것은 메타 애너테이션)


[12-7] 애너테이션 TestInfo가 다음과 같이 정의되어 있을 대, 이 애너테이션이 올바르
게 적용되지 않은 것은?
@interface TestInfo {
int count() default 1;
String[] value() default "aaa";
}
a. @TestInfo class Exercise12_7 {}
b. @TestInfo(1) class Exercise12_7 {}
c. @TestInfo("bbb") class Exercise12_7 {}
d. @TestInfo("bbb","ccc") class Exercise12_7 {}

[정답]
b, d

[해설]
a. @TestInfo class Exercise12_7 {}
default값이 지정되어 있는 요소는 애너테이션을 적용할 때값을 생략할 수 있다.
b. @TestInfo(1) class Exercise12_7 {}
요소의 이름이 value가 아닌 경우에는 요소의 이름을 생략할 수 없다.
‘@TestInfo(count=1)’이라고 써야 맞음.
c. @TestInfo("bbb") class Exercise12_7 {}
@TestInfo(count=1, value={"bbb"})의 생략된 형태
d. @TestInfo("bbb","ccc") class Exercise12_7 {}
요소의 타입이 배열이고, 지정하려는 값이 여러 개인 경우 괄호{}가 필요함.
@TestInfo({"bbb", "ccc"}) 또는 @TestInfo(value={"bbb","ccc"})와 같이 써야함

 * 
 */
public class Practice12_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
