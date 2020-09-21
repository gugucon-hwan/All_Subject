package practice9_Q;

/*
 * [9-10] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 메서드명 : format
 * 기 능 : 주어진 문자열을 지정된 크기의 문자열로 변환한다. 나머지 공간은 공백으로 채운다.
 * 반환타입 : String
 * 매개변수 : String str - 변환할 문자열
 * int length - 변환된 문자열의 길이
 * int alignment - 변환된 문자열의 정렬조건
 * (0:왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)
 * 
 * [실행결과]
	가나다
		가나다
			가나다
 */
public class Practice9_10 {
	/*
	(1) format메서드를 작성하시오.
		1. length의 값이 str의 길이보다 작으면 length만큼만 잘라서 반환한다.
		2. 1의 경우가 아니면, length크기의 char배열을 생성하고 공백으로 채운다.
		3. 정렬조건(alignment)의 값에 따라 문자열(str)을 복사할 위치를 결정한다.
				(System.arraycopy()사용)
		4. 2에서 생성한 char배열을 문자열로 만들어서 반환한다.
	*/
	public static String format(String str, int length, int alignment) {
		
			if(length<str.length())
				return str.substring(0, length);
			else {
				char[] source=str.toCharArray();
				char[] chs=new char[length];
				for(int i=0;i<chs.length;i++)
					chs[i]=' ';
				switch(alignment) {
				case 0:
					default:
						System.arraycopy(source, 0, chs, 0, source.length);
						break;
					case 1:
						System.arraycopy(source, 0, chs, (length-str.length())/2, source.length);
						break;
					case 2:
						System.arraycopy(source, 0, chs, length-str.length(), source.length);
				}
				return new String(chs);	
			}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "가나다";
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}

}
