package practice7_Q;

/*
 * [7-27] 다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.
 * 
 * 
 * [실행결과]
 * 30
 * 20
 * 10
 * 
 */

class Outer3 {
	int value = 10;

	class Inner3 {
		int value = 20;

		void method1() {
			int value = 30;
			System.out.println(value/* (1) */);
			System.out.println(this.value/* (2) */);
			System.out.println(Outer3.this.value/* (3) */);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝

public class Practice7_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (4) 알맞은 코드를 넣어 완성하시오.
		 */
		Outer3 o=new Outer3();
		Outer3.Inner3 inner3=o.new Inner3();
		
		
		inner3.method1();
	}

}
