package practice4_Q;

/*Chapter 4-6 자바의 정석 개인 정답 */
public class Practice4_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j==6) {
					System.out.println("["+i+","+j+"] : 두 수의 합이 6인 경우");
				}
			}
		}		
	}
}
