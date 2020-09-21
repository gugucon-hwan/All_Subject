package practice3_Q;
/*Chapter 3-10 자바의 정석 개인 정답 */
public class Exercise3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		char lowerCase = ('A'<=ch&&ch<='Z' ) ? (char)((int) ch+32 ) : ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}

}
