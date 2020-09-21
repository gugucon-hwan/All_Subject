package practice10_Q;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * [10-6] 자신이 태어난 날부터 지금까지 며칠이 지났는지 계산해서 출력하시오.
 * 
 * [실행결과]
 * birth day=2000-01-01
 * today =2016-01-29
 * 5872 days
 */
public class Practice10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		String birthDay="2000-01-01";
		String today="2016-01-29";
		Date date1=new Date();
		Date date2=new Date();
		try {
			date1=sdf.parse(birthDay);
			date2=sdf.parse(today);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		long answer=(date2.getTime()-date1.getTime())/(24*60*60*1000);
		System.out.println(Math.abs(answer)+" days");
		
	}
}
