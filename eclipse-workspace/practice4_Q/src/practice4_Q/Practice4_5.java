package practice4_Q;
/*Chapter 4-5 자바의 정석 개인 정답 */
public class Practice4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1; 
		while (i <= 10) {
			int j = 1;
			System.out.print(i+"번째줄 : ");
			while (j <= i) {				
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
