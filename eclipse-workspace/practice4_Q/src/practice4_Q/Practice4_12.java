package practice4_Q;
/*Chapter 4-12 자바의 정석 개인 정답 */
public class Practice4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp1=1,temp2=2,temp3=2;		
				
		
		for(int i=0;i<9;i++) {			
			for(int j=1;j<=3;j++) {
				if(temp2==10)break;
				System.out.printf("  %2d * %2d = %2d",temp2,temp1,temp2*temp1);
				temp2++;// 가로 구구단 증가		
			}
			temp1++;//곱하는 숫자
			if(temp1>3) { //곱하는 숫자가 3이면
				temp1=1;//곱하는 숫자 초기화
				temp3=temp2;//다음 가로 구구단 단계로 초기화
				System.out.printf("\n\n");
				continue;
			}			
			temp2=temp3;//가로 구구단 초기화
			System.out.println();
		}		
	}
}
