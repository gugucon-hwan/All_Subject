package practice14_Q;

import java.util.Random;

public class Practice14_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Random().ints(1,46) // 1~45사이의 정수(46은 포함안됨)
		.distinct() // 중복제거
		.limit(6) // 6개만
		.sorted() // 정렬
		.forEach(System.out::println); // 화면에 출력
	}

}
