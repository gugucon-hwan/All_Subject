package practice5_Q;
/*Chapter 5-6 자바의 정석 개인 정답 */
public class Practice5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		System.out.println("money=" + money);
		for (int i = 0; i < coinUnit.length; i++) {
			
			System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
			money%=coinUnit[i];	
			
		 }
	}

}
