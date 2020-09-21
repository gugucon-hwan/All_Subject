package practice10_Q;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * [10-7] 2016년 12월 네번째 화요일의 날짜를 아래의 실행결과와 같은 형식으로 출력하시오.
 * 
 * 
 * [실행결과]
 * 2016-12-27
 * 
 * LocalDate date = LocalDate.of(2016, 12, 1);
 * System.out.println(date.with(dayOfWeekInMonth(4, TUESDAY))); 
 */
public class Practice10_7 {

	/**
	  * @Method Name : main
	  * @작성일 : 2020. 8. 26
	  * @작성자 : gugucon
	  * @변경이력 : 
	  * @Method 설명 :
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.set(2016,Calendar.DECEMBER,1);
		//cal.add(Calendar.DAY_OF_WEEK, 3);
		
		int dayOfWeek;
		int count=0;
		for(int i=0;i<30;i++) {
			dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
			if(dayOfWeek==Calendar.TUESDAY) {
				count++;
				if(count>=4) {
					System.out.println(sdf.format(cal.getTime()));
				}
			}				
			cal.add(Calendar.DATE, 1);//1일 더하기		
		}//for		
				
	}//main

}
