package practice7_Q;

/* 개인정답 작성자 : hwan
 * [7-26] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
 * 
 * 
 * [실행결과]
 * 200
 * 
 */

class Outer2 {
	static class Inner2 {
		int iv = 200;
	}
}

public class Practice7_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */		
		Outer2.Inner2 in=new Outer2.Inner2();
		System.out.println(in.iv);
	}
}
