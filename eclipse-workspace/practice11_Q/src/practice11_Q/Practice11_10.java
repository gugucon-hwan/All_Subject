package practice11_Q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * [11-10] 다음 예제의 빙고판은 1~30사이의 숫자들로 만든 것인데, 숫자들의 위치가 잘섞이지 않는다는 문제가 있다. 
 * 이러한 문제가 발생하는 이유와 이 문제를 개선하기 위한 방법을 설명하고, 이를 개선한 새로운 코드를 작성하시오.
 * 
 * 
 * [정답] HashSet은 중복을 허용하지 않고 순서를 유지하지 않기 때문에 발생하는 문제이다. 아무리 임의의 순서로 저장을 해도, 
 * 해싱(hashing) 알고리즘의 특성상 한 숫자가 고정된 위치에 저장되기 때문이다.
이 문제를 해결하기 위해서는 저장순서를 유지하는 List인터페이스를 
구현한 컬렉션 클래스를 사용하도록 변경해야 한다.
 */
public class Practice11_10 {

	/**
	  * @Method Name : main
	  * @작성일 : 2020. 8. 29
	  * @작성자 : gugucon
	  * @변경이력 : 
	  * @Method 설명 : 1~30사이의 숫자로 빙고판 만들기
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		int[][] board = new int[5][5];
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1 + "");
		}
		ArrayList list = new ArrayList(set);
		Collections.shuffle(list);
		Iterator it = list.iterator();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}		
	}//main

}
