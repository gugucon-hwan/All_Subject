package practice6_Q;

/*
 * 개인답 작성자 : hwan
 * [6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를
 *  MyPoint클래스의 인스턴스메서드로 정의하시오.
 * 
 * [실행결과]
 * 1.4142135623730951
 */

public class Practice6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint p = new MyPoint(1, 1);
		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
	}
}

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*
	 * (1) 인스턴스메서드 getDistance를 작성하시오.
	 */
	
	public double getDistance(int x1, int y1) {
		return Math.sqrt(Math.pow(x, x1)+Math.pow(y, y1));	
	}
}