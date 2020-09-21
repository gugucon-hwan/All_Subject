package practice4_Q;
/*Chapter 4-9 자바의 정석 개인 정답 */
public class Practice4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;
		for(int i=0; i < str.length(); i++) {
			//int num= str.charAt(i)-'0';
			//ex) '3'-'0'은 51 - 48으로 변환되고 그 결과는 숫자 3이 된다.
			int num= Character.getNumericValue(str.charAt(i));
			System.out.println(num);
			sum+=num;			
		}
		System.out.println("sum="+sum);
	}

}
