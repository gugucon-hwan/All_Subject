package practice10_Q;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * [10-4] 화면으로부터 날짜를 “2007/05/11”의 형태로 입력받아서 무슨 요일인지 출력하는 프로그램을 작성하시오.
 * 단, 입력된 날짜의 형식이 잘못된 경우 메세지를 보여주고 다시 입력받아야 한다.
 * 
 * [실행결과]
날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)
>>2009-12-12
날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)
>>2009/12/12
입력하신 날짜는 토요일입니다.
 */
public class Practice10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		while (true) {
		System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11");						
			System.out.print(">>>");
			String str = sc.next();
			Date date = new Date();
			try {
				date = sdf.parse(str);
				cal.setTime(date);				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				continue;
			}
			int theDay = cal.get(Calendar.DAY_OF_WEEK);
			System.out.println(cal.get(Calendar.DAY_OF_WEEK));
			String answer = null;
			switch (theDay) {
			case 1:
				answer = "일";
				break;
			case 2:
				answer = "월";
				break;
			case 3:
				answer = "화";
				break;
			case 4:
				answer = "수";
				break;
			case 5:
				answer = "목";
				break;
			case 6:
				answer = "금";
				break;
			case 7:
				answer = "토";
				break;
			}
			System.out.println("입력하신 날짜는 " + answer + "요일 입니다.");
		}
	}
}
/*
import java.util.*;
import java.text.*;

class Exercise10_4 {
	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		String pattern2 = "입력하신 날짜는 E요일입니다."; // 'E'는 일~토 중의 하나가 된다.
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		Scanner s = new Scanner(System.in);
		Date inDate = null;
		do {
			System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예:2007/05/11)");
			try {
				System.out.print(">>");
				inDate = df.parse(s.nextLine()); // 입력받은 날짜를 Date로 변환한다.
				break; // parse()에서 예외가 발생하면 이 문장은 수행되지 않는다.
			} catch (Exception e) {
			}
		} while (true);
		System.out.println(df2.format(inDate));
	} // main
}
[해설] SimpleDateFormat은 날짜를 지정된 형식으로 출력하거나 문자열을 지정된 형식으
로 변환 또는 유효성 검사에 사용할 수 있다. 이 문제에서는 입력된 날짜가 지정된 형식
에 맞는지 검사하고, 변환하는 역할을 한다.
Scanner를 이용해서 화면으로 부터 날짜를 입력받고, 입력받은 날짜(문자열)가 지정된
형식과 다르면 parse()에서 ParseException이 발생한다.
do {
		System.out.println("날짜를 " + pattern
			+ "의 형태로 입력해주세요.(입력예:2007/05/11)");
		try {
			System.out.print(">>");
			inDate = df.parse(s.nextLine()); // ParseException이 발생할 수 있다.
			break; // parse()에서 예외가 발생하면 이 문장은 수행되지 않는다.
		} catch(Exception e) {}
	} while(true);
parse()에서 예외가 발생하면 break문이 수행되지 않기 때문에 예외가 발생하지 않을 때
까지, 즉 지정된 형식에 맞게 날짜가 입력될 때까지 반복하게 된다.
*/