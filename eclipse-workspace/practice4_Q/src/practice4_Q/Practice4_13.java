package practice4_Q;
/*Chapter 4-13 자바의 정석 개인 정답 */
public class Practice4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "12a34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			//if(!(ch-'0'>=0 && ch-'0'<=9))
			if(!(ch>='0' && ch<='9'))
				isNumber=false;			
		}
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}

}
