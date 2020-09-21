package practice4_Q;
/*Chapter 4-3 자바의 정석 개인 정답 */
public class Practice4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i =1; i <=10; i++ ) {
			for(int j=1; j<=i;j++) {				
				sum +=j;
			}			
		}		
		System.out.println("sum = "+sum);
	}

}
