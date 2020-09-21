package practice4_Q;
/*Chapter 4-15 자바의 정석 개인 정답 */
public class Practice4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12321;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수		
		//StringBuffer str=new StringBuffer("");
		//String str= new String();
		while (tmp != 0) {			
			/*str.append(String.valueOf(tmp%10));
			System.out.println(str);			
			tmp/=10;*/						
			
			result+=(tmp%10);//5->50->54 -> 543 			
			if((tmp/10) == 0) break; // tmp가 더 이상 나눌 수 없을 때 
			tmp/=10;///1234 -> 123->12 -> 1
			result*=10;	
		}		
		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	}
}
