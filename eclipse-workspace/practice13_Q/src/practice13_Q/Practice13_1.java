package practice13_Q;

public class Practice13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new Thread(new Thread1());
		th1.start();
	}
}

class Thread1 implements Runnable {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print('-');
		}
	}
}
