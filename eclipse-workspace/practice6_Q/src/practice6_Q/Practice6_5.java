package practice6_Q;

/*개인답 작성자 : hwan
 * [6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오.
 * 
 * [실행결과]
 * 홍길동,1,1,100,60,76,236,78.7
 */

public class Practice6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("홍길동",1,1,100,60,76);
		System.out.println(s.info());
	}

}
class Student {
/*개인답 작성자 : hwan
(1) 알맞은 코드를 넣어 완성하시오.
*/
	String name;//학생이름
	int ban;		//반
	int no;		//번호
	int kor;		//국어점수
	int eng;		//영어점수
	int math;	//수학점수
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;		
	}
	
	public String info() {
		int sum=kor+eng+math;
		float avr=Math.round((float)(kor+eng+math)/3*10f+0.5f)/10f;		
		
		return name+", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+sum+", "+avr;		
	}	
}