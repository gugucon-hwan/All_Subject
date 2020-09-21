package practice3_Q;
/*Chapter 3-2 자바의 정석 개인 정답 */
public class Exercise3_2 {
	public static void main(String[] args) {
		int numOfApples = 123; // ����� ����
		int sizeOfBucket = 10; // �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = (int)Math.ceil((float)numOfApples/sizeOfBucket); // ��� ����� ��µ� �ʿ��� �ٱ����� ��
		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);
		}
}
