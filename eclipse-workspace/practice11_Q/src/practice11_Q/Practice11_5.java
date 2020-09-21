package practice11_Q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * [11-5] 다음에 제시된 Student클래스가 Comparable인터페이스를 구현하도록 변경해서 이름(name)이 기본 정렬기준이 되도록 하시오.
 * 
 * [실행결과]
김자바,1,3,80,80,90,250,83.3
남궁성,1,2,90,70,80,240,80.0
안자바,1,5,60,100,80,240,80.0
이자바,1,4,70,90,70,230,76.7
홍길동,1,1,100,100,100,300,100.0
 */

class Student implements Comparable<Student> {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	/**
	  * @Method Name : compareTo
	  * @작성일 : 2020. 8. 27
	  * @작성자 : gugucon
	  * @변경이력 : 
	  * @Method 설명 : 값 비교 후 정렬(오름차순)
	  * @param stu
	  * @return
	  */
	@Override
	public int compareTo(Student stu) {
		// TODO Auto-generated method stub
		return this.name.compareTo(stu.name);
	}
}

public class Practice11_5 {

	/**
	  * @Method Name : main
	  * @작성일 : 2020. 8. 27
	  * @작성자 : gugucon
	  * @변경이력 : 
	  * @Method 설명 : 이름(name)이 기본 정렬기준
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student("남궁성", 1, 2, 90, 70, 80));
		list.add(new Student("김자바", 1, 3, 80, 80, 90));
		list.add(new Student("이자바", 1, 4, 70, 90, 70));
		list.add(new Student("안자바", 1, 5, 60, 100, 80));
		Collections.sort(list);
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
