package practice6_Q;


/*개인답 작성자 : hwan
 * [6-2] 문제6-1에서 정의한 SutdaCard클래스에 
 * 두 개의 생성자와 info()를 추가해서 실행 결과와 같은 결과를 얻도록 하시오.

[실행결과]
3
1K

 */

public class Practice6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());		
	}

}
class SutdaCard {
/*
(1) 알맞은 코드를 넣어 완성하시오.
*/
	int num;
	boolean isKwang;
	public SutdaCard() {
		// TODO Auto-generated constructor stub
		this.num=1;
		this.isKwang=true;
	}	
	public SutdaCard(int num, boolean isKwang) {
		this.num=num;
		this.isKwang=isKwang;
	}
	/*
	 * SutdaCard() {
		this(1, true); // SutdaCard(1, true)를 호출한다.
		}
	 */
	
	public String info() {
		String c1 = Integer.toString(num);
		String c2 = "";
		if(isKwang==true) {
		c2 = "K";
		}
		return c1+c2;
	}
	/*
	 * String info() { // 숫자를 문자열로 반환한다. 광(光)인 경우 K를 덧붙인다. 
	 * return num + ( isKwang? "K" : "");
	 * }
	 */
	
};


