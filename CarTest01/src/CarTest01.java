
/*
 * Car 클래스
 *   - 차의 특징: 이름, 크기(너비, 높이, 길리), 이동거리(x, y), 연료
 *   - 멤버 변수: name, width, height, length, x, y, fuel
 *   - 생성자: 멤버변수의 값을 초기화
 *   - 멤버메소드: getter / setter, 필료한 메소드 추가
 *   - 정보 출력 메소드 
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

public class CarTest01 {

	public static void main(String[] args) {
		
	}
}
