package practice7_Q;

/*
 * [7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는 
 * 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
 * [Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
 * 메서드명 : gotoPrevChannel
 * 기 능 : 현재 채널을 이전 채널로 변경한다.
 * 반환타입 : 없음
 * 매개변수 : 없음
 *
 * [실행결과]
 * CH:10
 * CH:20
 * CH:10
 * CH:20
 * 
 * [7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
 * a. public은 접근제한이 전혀 없는 접근 제어자이다.
 * b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.
 * c. 지역변수에도 접근 제어자를 사용할 수 있다.
 * d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.
 * e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.
 * 
 * [정답] 정답 없음
 * 접근 제어자가 사용될 수 있는 곳 - 클래스, 멤버변수, 메서드, 생성자
 * private - 같은 클래스 내에서만 접근이 가능하다.
 * default - 같은 패키지 내에서만 접근이 가능하다.
 * protected - 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다.
 * public - 접근 제한이 전혀 없다.
 * 
 * [7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
 * [정답] 
 * Math클래스의 모든 메서드가 static메서드이고 인스턴스변수가 존재하지 않기 때문에 객체를 생성할 필요가 없기 때문
 * 
 * [해설] Math클래스는 몇 개의 상수와 static메서드만으로 구성되어 있기 때문에 인스턴스를 생성할 필요가 없다. 
 * 그래서 외부로부터의 불필요한 접근을 막기 위해 다음과 같이 생성자의 접근 제어자를 private으로 지정하였다.
 * 
 */
class MyTv3 {
	/*
	 * (1) 문제7-10의 MyTv2클래스에 gotoPrevChannel메서드를 추가하여 완성하시오.
	 */
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	

	/*
	 * (1) 알맞은 코드를 넣어 완성하시오.
	 */
	public void setChannel(int channel) {
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		prevChannel=this.channel;
		this.channel = channel;		
	}

	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;		
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	void gotoPrevChannel() {
		setChannel(prevChannel);		
	}
}

public class Practice7_11_12_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv3 t = new MyTv3();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}

}
