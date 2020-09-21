package practice4_Q;
/*Chapter 4-10 자바의 정석 개인 정답 */
public class Practice4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int sum = 0;

		
		for(int i=0;i<5;i++) {
			int temp1=num%10;
			sum+=temp1;
			num=num/10;			
		}				
		System.out.println("sum="+sum);		
	}
}
