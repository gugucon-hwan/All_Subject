package practice3_Q;
/*Chapter 3-8 자바의 정석 개인 정답 */
public class Exercise3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 20;
		int c = a + b;
		
		char ch = 'A';
		ch = (char)(int)(ch + 2);
		
		float f = 3.0f / 2;
		long l = 3000L * 3000 * 3000;
		
		float f2 = 0.1f;
		double d = 0.1f;
		
		boolean result = d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}

}
