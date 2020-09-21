package practice14_Q;

import java.util.stream.Stream;

public class Practice14_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr= {"aaa","bb","c","dddd"};
		Stream<String> strStream=Stream.of(strArr);		
		int sum=strStream.mapToInt(String::length).sum();
		System.out.println("sum="+sum);
	}

}
