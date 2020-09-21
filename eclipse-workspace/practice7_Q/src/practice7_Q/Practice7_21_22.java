package practice7_Q;

/*
 * [7-21] 다음과 같이 attack메서드가 정의되어 있을 때, 이 메서드의 매개변수로 가능한것 두 가지를 적으시오.
 * 
 * interface Movable {
 * void move(int x, int y);
 * }
 * void attack(Movable f) {
 *  내용 생략 }
 *  
 *  [정답] null, Movable인터페이스를 구현한 클래스 또는 그 자손의 인스턴스
 *  
 *  [해설] 매개변수의 다형성을 잘 이해하고 있는지를 확인하는 문제이다. 매개변수의 타입
 *  이 인터페이스라는 것은 어떤 의미일지 이해하지 못하는 경우가 많은데, 이것을 이해하는것은 매우 중요하다.
 *  언제라도 누가 ‘Movable인터페이스타입의 매개변수로 가능한 것이 무엇이냐?’고 물었을 때, 주저 없이 얘기할 수 있도록 완전히 외우고 있어야 한다.
 *  
 *  
 *  [7-22] 아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래스와 Rectangle클래스를 작성하시오. 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야한다.
 *  
 *  
 *  (1) 클래스명 : Circle
 *  조상클래스 : Shape
 *  멤버변수 : double r - 반지름
 *  
 *  
 *  (2) 클래스명 : Rectangle
 *  조상클래스 : Shape
 *  멤버변수 : double width - 폭
 *  double height - 높이
 *  
 *  메서드 :
 *  1. 메서드명 : isSquare
 *  기 능 : 정사각형인지 아닌지를 알려준다.
 *  반환타입 : boolean
 *  매개변수 : 없음
 *  
 *  
 *  
 */

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Circle extends Shape{
	
	private double r;	//반지름
	
	public Circle(double r) {
		// TODO Auto-generated constructor stub
		this(new Point(0, 0),r);
	}
	public Circle(Point p, double r) {
		// TODO Auto-generated constructor stub
		super(p);
		this.r=r;
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub		
		return r*r*Math.PI;
	}	
}

class Rectangle extends Shape{
	
	private double width;	//폭
	private double height;	//높이
	
	public Rectangle(double width, double height) {
		// TODO Auto-generated constructor stub
		this(new Point(0, 0),width,height);
	}
	
	public Rectangle(Point p, double width, double height) {
		super(p);
		this.width=width;
		this.height=height;	
	}
	
	boolean isSquare() { //정사각형인지 아닌지를 알려준다.
		// width나 height가 0이 아니고 width와 height가 같으면 true를 반환한다
		return width*height!=0&&width==height;
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub		
		return width*height;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

public class Practice7_21_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Point p = new Point(10, 20);
		Shape r=new Rectangle(new Point(), 30, 30);
		Rectangle r2=(Rectangle)r;
		Shape c= new Circle(new Point(), 15);
		System.out.println("p 아무런 좌표 : "+p.toString());
		System.out.println("r 사격형 넓이 : "+r.calcArea());
		System.out.println("r2 정사격형 인가? : "+r2.isSquare());
		System.out.println("c 원 넓이 : "+c.calcArea());
	}

}
