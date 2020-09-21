package practice7_Q;

/*
 * [7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
 * 옳지 않은 것은? (모두 고르시오)
 * a. 지역변수 - 값을 변경할 수 없다.
 * b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.
 * c. 메서드 - 오버로딩을 할 수 없다.
 * d. 멤버변수 - 값을 변경할 수 없다.
 * 
 * [정답] c
 * [해설] 제어자 final은 '마지막의' 또는 '변경될 수 없는'의 의미를 가지고 있으며 
 * 거의모든 대상에 사용될 수 있다.
 * 
 * 
 * 
 * [7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할수 없도록 제어자를 붙이고 
 * 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 
 * getter와 setter메서드를 추가하라.
 * 
 * [실행결과]
 * CH:10
 * VOL:20 
 */

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	/*
	 * (1) 알맞은 코드를 넣어 완성하시오.
	 */
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		this.channel = channel;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;
		this.volume = volume;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
}

public class Practice7_9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}

}
