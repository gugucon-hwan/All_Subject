package practice10_Q;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * [10-5] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 메서드명 : getDayDiff
 * 기 능 : yyyymmdd형식의 두 문자열을 넘겨받으면 두 날짜의 차이를 일(day)단위로 반환한다.
 *  * 단, 첫 번째 날짜 빼기 두 번째 날짜의 결과를 반환한다.
 *  만일 주어진 문자열이 유효하지 않으면 0을 반환한다.
 *  
 *  반환타입 : int
 *  
 *  매개변수 : 
 *  String yyyymmdd1 - 시작날짜
 *  String yyyymmdd2 - 끝 날짜
 * 
 * [실행결과]
 * 2
 * 0
 * 0
 */
public class Practice10_5 {
	/*
	 * (1) getDayDiff메서드를 작성하시오.
	 */
	/**
	  * @Method Name : getDayDiff
	  * @작성일 : 2020. 8. 26
	  * @작성자 : gugucon
	  * @변경이력 : 
	  * @Method 설명 :
	  * @param yyyymmdd1
	  * @param yyyymmdd2
	  * @return
	  */
	public static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Date date1 = new Date();
		Date date2 = new Date();
		try {
			date1 = sdf.parse(yyyymmdd1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return 0; // 예외 발생시 0을 반환
		}
		try {
			date2 = sdf.parse(yyyymmdd2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return 0; // 예외 발생시 0을 반환
		}
		// .getTime() 은 해당날짜를 기준으로1970년 00:00:00 부터 몇 밀리초가 흘렀는지를 반환해준다.
		// 이제 24*60*60*1000(각 시간값에 따른 차이점) 을 나눠주면 일수가 나온다.
		long diffDay = date2.getTime() - date1.getTime();
		long Days = diffDay / (24 * 60 * 60 * 1000);
		Days = Math.abs(Days);
		return (int) Days;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDayDiff("20010103", "20010101"));
		System.out.println(getDayDiff("20010103", "20010103"));
		System.out.println(getDayDiff("20010103", "200103"));
	}

}
/*
static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
int diff = 0;
try {
int year1 = Integer.parseInt(yyyymmdd1.substring(0,4));
int month1 = Integer.parseInt(yyyymmdd1.substring(4,6)) - 1;
int day1 = Integer.parseInt(yyyymmdd1.substring(6,8));
int year2 = Integer.parseInt(yyyymmdd2.substring(0,4));
int month2 = Integer.parseInt(yyyymmdd2.substring(4,6)) - 1;
int day2 = Integer.parseInt(yyyymmdd2.substring(6,8));
Calendar date1 = Calendar.getInstance();
Calendar date2 = Calendar.getInstance();
date1.set(year1, month1, day1);
date2.set(year2, month2, day2);
diff = (int)((date1.getTimeInMillis()-date2.getTimeInMillis())
/(24*60*60*1000));
} catch(Exception e) {
diff = 0; // substring(), parseInt()에서 예외가 발생하면 0을 반환한다.
}
return diff;
}
*/