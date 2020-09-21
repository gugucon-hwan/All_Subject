package practice11_Q;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

/*
 * 
 * [11-2] 다음 코드의 실행결과를 적으시오.
 * 
 * [11-3] 다음 중 ArrayList에서 제일 비용이 많이 드는 작업은? 단, 작업도중에 ArrayList의 크기 변경이 발생하지 않는다고 가정한다.
a. 첫 번째 요소 삭제
b. 마지막 요소 삭제
c. 마지막에 새로운 요소 추가
d. 중간에 새로운 요소 추가
 * 
 * [정답] d
 * 
 * [11-4] LinkedList클래스는 이름과 달리 실제로는 이중 원형 연결리스트(doubly circular linked list)로 구현되어 있다. LinkedList인스턴스를 생성하고 11개의 요소를 추가했을 때, 이 11개의 요소 중 접근시간(access time)이 가장 오래 걸리는 요소는 몇 번째 요소인가?
 * 
 * [정답] 여섯 번째 요소(LinkedList에서 제일 가운데 위치한 요소)
 * 
 * LinkedList는 각 요소가 서로 참조로 연결되어 있어서, n번째 요소에 접근하기 위
해서는 첫 번째 요소부터 순서대로 각 요소를 거쳐야 된다. 예를 들어 세 번째 요소에 접
근하기 위해서는 첫 번째 요소에서 두 번째 요소로, 두 번째 요소에서 세 번째 요소로 이
동해야 한다.

이런 식이면 LinkedList의 마지막 요소에 접근하는 것이 시간이 제일 많이 걸릴 것 같은
데, 그렇지 않은 이유는 LinkedList가 실제로는 아래의 그림과 같은 이중 원형 연결리스
트로 되어 있기 때문이다.

이중 원형 연결리스트는 첫 번째 요소와 마지막 요소를 연결해서 LinkedList의 단점인 접
근성(accessibility)를 향상시킨 것이다. 이중 원형 연결리스트에서는 마지막 요소에 접
근하기 위해서는 첫 번째 요소에서 한 번만 이동하면 된다. 마지막 요소에서 첫 번째 요
소에 접근하기 위해서도 역시 한 번만 이동하면 된다.
이것은 마치 Tv리모콘의 첫 번째 채널에서 채널을 감소시키면 마지막 채널로 이동하고,
마지막 채널에서 채널을 증가시키면 첫 번째 채널로 이동하는 것과 같다고 할 수 있다.
그래서 LinkedList의 제일 가운데 있는 요소가 접근시간이 가장 길다는 것을 알 수 있
다.
 */
/**
  * @FileName : Practice11_2.java
  * @Project : practice11_Q
  * @Date : 2020. 8. 27 
  * @작성자 : gugucon
  * @변경이력 :
  * @프로그램 설명 : HashSet, TreeSet, Stack 
  */
public class Practice11_2_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		HashSet set = new HashSet(list);//2367
		Iterator<Integer>s=set.iterator();
		while(s.hasNext()) {
			int tmp=s.next();
			System.out.print(tmp);
		}
		System.out.println();
		TreeSet tset = new TreeSet(set);//2367
		Iterator<Integer> t=tset.iterator();
		while(t.hasNext()) {
			int tmp=t.next();
			System.out.print(tmp);
		}
		System.out.println();
		Stack stack = new Stack();
		stack.addAll(tset);
		while(!stack.empty())
		System.out.println(stack.pop());//7632
	}

}
