package practice9_Q;

/*
 * [9-3] 다음과 같은 실행결과가 나오도록 코드를 완성하시오.
 * 
 * [실행결과]
 * fullPath:c:\jdk1.8\work\PathSeparateTest.java
 * path:c:\jdk1.8\work
 * fileName:PathSeparateTest.java
 * 
 */
public class Practice9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */
		path=fullPath.substring(0,14);
		fileName=fullPath.substring(15);
		/*
		 * int pos = fullPath.lastIndexOf("\\");
		 * if(pos!=-1) {
		 * path = fullPath.substring(0, pos);
		 * fileName = fullPath.substring(pos+1);
		 * }
		 * 
		 * [해설] lastIndexOf()와 substring()을 사용해서 문자열을 나누는 문제다. 마지막 경로구분자를 찾아야하기 때문에, indexOf()보다는 lastIndexOf()가 적합하다.
		 * lastIndexOf()는 찾는 문자열이 없으면 -1을 반환하기 때문에 조건문을 사용해서 결과가
		 * -1인 경우에는 substring()을 호출하지 않아야 한다.(pos의 값이 음수이면, substring()에서 예외가 발생한다.)
		 * 그래서 if문으로 처리를 해주었는데, try-catch로 처리해도 좋다.(if문 없이 문제를 풀었어도 충분히 좋은 답안이다.)
		 * [참고] 아래의 두 문장은 서로 같은 의미이다.
		 * 
		 */
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}

}
