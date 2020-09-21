package practice13_Q;

import java.util.Scanner;
import java.util.Vector;

public class Practice13_8 {
	Vector words = new Vector();
	String[] data = { "태연", "유리", "윤아", "효연", "수영", "서현", "티파니", "써니", "제시카" };
	int interval = 2 * 1000; // 2초
	WordGenerator wg = new WordGenerator();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice13_8 game = new Practice13_8();
		game.wg.start();// 단어를 생성하는 쓰레드를 실행시킨다.
		Vector words = game.words;
		while (true) {
			System.out.println(words);
			String prompt = ">>";
			System.out.print(prompt);
			// 화면으로부터 라인단위로 입력받는다.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine().trim();
			int index = words.indexOf(input);// 입력받은 단어를 words에서 찾는다.
			if (index != -1) {// 찾으면
				words.remove(index);// words에서 해당 단어를 제거한다.
			}
		}
	}
	class WordGenerator extends Thread {
		public void run() {
			/*
			 * (1) 아래의 로직에 맞게 코드를 작성하시오. 1. interval(2초)마다 배열 data의 값 중 하나를 임의로 선택해서 2.*
			 * words에 저장한다.
			 */
			while (true) {
				// 1. interval(2초)마다 배열 data의 값 중 하나를 임의로 선택해서
				int rand = (int) (Math.random() * data.length);
				// 2. words에 저장한다.
				words.add(data[rand]);
				try {
					Thread.sleep(interval); // 2초(interval) 동안 쉰다.
				} catch (Exception e) {
				}
			}//while

		} // end of run()
	} // class WordGenerator
}//Practice13_8

