package practice10_Q;

import java.math.BigDecimal;
import java.util.Arrays;

/*
 * [10-3] 문자열 “123,456,789.5”를 소수점 첫 번째 자리에서 반올림하고, 그 값을 만 단위마다 콤마(,)로 구분해서 출력하시오.
 * 
 * [실행결과]
data:123,456,789.5
반올림:123456790
만단위:1,2345,6790
 */
public class Practice10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("123,456,789.5");
		String tmp=null;
		int ch = 0;		
		System.out.println("data : "+str);
		str=str.replace(",", "");
		if(str.indexOf(".")!=-1) {
			ch=str.indexOf(".");
			tmp=str.substring(ch+1, ch+2);		
			str=str.substring(0, ch);
		}		
		double num=Double.parseDouble(tmp);
		num/=10;
		//System.out.println("잘라낸 값 소수점 아래 : "+num);
		int num2=Integer.parseInt(str);
		//System.out.println("잘라낸값 정수 : "+num2);		
		//숫자가 너무 커서 부동소수점으로 표현됨 그래서 BigDecimal 사용함		
		BigDecimal answer=new BigDecimal(Math.round(num+num2));
		System.out.println("반올림 : "+answer.toString());		 
		String man=String.valueOf(answer);
		StringBuffer result= new StringBuffer(man);
		StringBuffer dab= new StringBuffer();
		result=result.reverse();
		int a=result.length()/4;
		for(int i=0;i<a+1;i++) {
			if(i>=a) {
				System.out.println(dab.append(","+result.substring(4*i)));
				break;
			}
			System.out.println(dab.append(","+result.substring(0+(4*i),4+(4*i))));
		}		
		dab.reverse();
		dab.deleteCharAt(dab.length()-1);
		System.out.println("만단위 : "+dab.toString());
	}//main
}

/*
String data = "123,456,789.5";
DecimalFormat df = new DecimalFormat("#,###.##"); // 변환할 문자열의 형식을 지정
DecimalFormat df2 = new DecimalFormat("#,####");
try {
Number num = df.parse(data);
double d = num.doubleValue();
System.out.println("data:"+data);
System.out.println("반올림:"+Math.round(d));
System.out.println("만단위:"+df2.format(d));
} catch(Exception e) {}
*/