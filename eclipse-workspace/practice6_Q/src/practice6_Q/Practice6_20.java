package practice6_Q;

import java.util.Arrays;

/*개인답 작성자 : hwan
 * [6-20] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
 * 메서드명 : shuffle
 * 기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
 * 처리한 배열을 반환한다.
 * 반환타입 : int[]
 * 매개변수 : int[] arr - 정수값이 담긴 배열 
 * 
 * [실행결과]
 * [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * [4, 6, 8, 3, 2, 9, 7, 1, 5]
 * 
 */
public class Practice6_20 {
	
	/*
	(1) shuffle메서드를 작성하시오.
	*/
	static int[] shuffle(int[] arr) {
		int Rvalue,temp;
		//int[] arr2=new int[arr.length];		
		//System.arraycopy(arr, 0, arr2, 0, arr.length);
		//System.out.println(Arrays.toString(arr2));		
		
		for(int i=0;i<arr.length;i++) {
			Rvalue=(int)(Math.random()*9)+1;
			
			temp=arr[Rvalue-1];
			arr[Rvalue-1]=arr[i];
			arr[i]=temp;
			
		}
	 return arr;	
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
