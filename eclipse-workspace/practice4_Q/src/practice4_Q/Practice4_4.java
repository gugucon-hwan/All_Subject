package practice4_Q;
/*Chapter 4-4 자바의 정석 개인 정답 */
public class Practice4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int sum=0, tmp=0;
				
		for(int i=1;sum<100;i++) {
			if(i%2!=0) {
				sum+=i;
				System.out.println("i = "+i);
			}else {		
				tmp=i*(-1);
				sum+=tmp;
				System.out.println("i = "+tmp);
			}
			
			System.out.println("sum="+sum);
			System.out.println();
		}
		
	}

}
