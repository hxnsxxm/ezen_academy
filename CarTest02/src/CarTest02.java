
/*
 * 문제) 아래의 조건에 부합하도록 인스턴스를 생성하여 확인하시오.
 *   1. 차의 재원(이름, 너비, 높이, 길이)을 입력하여 인스턴스를 생성하시오
 *   2. x, y 좌표와 연료 정보를 활용하여 차를 이동하도록 하는 메소드를 만들어 활용하시오.
 *   - x, y 좌표를 입력하여 이동하도록 하시오. 운직인 커리만큼 연료를 소모하도록 하시오.
 * 
 */
class Car {
	private String name;
	private int width;
	private int length;
	private int height;
	private double x;
	private double y;
	private double fuel;
	
	// 생성자
	public Car(String name, int width, int height, int length, double fuel) {
		 this.name = name;
		 this.width = width;
		 this.length = length;
		 this.height = height;
		 this.fuel = fuel;
		 x = y = 0.0;
	}
	
	// 멤버 메소드
	//getter - x. y
	public double getX() { return x;}
	public double getY() { return y;}
	public double getFuel() { return fuel; }
	
	public void setX(double x) { this.x = x; }
	public void setY(double y) { this.y = y; }
	public void setFuel(double fuel) { this.fuel = fuel; }
	
	
	// 차의 정보 출력 메소드
	public void putSpec() {
		System.out.println("차 이름: " + name);
		System.out.println("차 높이 " + width);
		System.out.println("차 높이" +  height);
		System.out.println("차 길이" + length);
	}
	
	
}

public class CarTest02 {
	public static void main(String[] args) {
		
	}
}
