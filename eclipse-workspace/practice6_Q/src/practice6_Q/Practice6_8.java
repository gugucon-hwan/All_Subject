package practice6_Q;

/*개인답 작성자 : hwan
 * [6-8] 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
 * 
 * - 클래스변수(static변수) : width, height
 * - 인스턴스변수 : kind, num
 * - 지역변수 : k, n, card, args
 */

/*
class PlayingCard {
	int kind;
	int num;
	static int width;
	static int height;

	PlayingCard(int k, int n) {
		kind = k;
		num = n;
	}

	public static void main(String args[]) {
		PlayingCard card = new PlayingCard(1, 1);
	}
}*/

public class Practice6_8 {
	int kind;
	int num;
	static int width;
	static int height;

	Practice6_8(int k, int n) {
		kind = k;
		num = n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice6_8 card = new Practice6_8(1, 1);		
	}

}
