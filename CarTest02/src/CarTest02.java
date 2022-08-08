import java.util.Scanner;
/*
 * 문제) 아래의 조건에 부합하도록 인스턴스를 생성하여 확인하시오.
 *   1. 차의 재원(이름, 너비, 높이, 길이)과 연료량을 입력하여 인스턴스를 생성하시오
 *   2. x, y 좌표와 연료 정보를 활용하여 차를 이동하도록 하는 메소드를 만들어 활용하시오.
 *   - x, y 좌표를 입력하여 이동하도록 하시오. 움직인 커리만큼 연료를 소모하도록 하시오.
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
		System.out.println("차 높이: " + width);
		System.out.println("차 높이: " + height);
		System.out.println("차 길이: " + length);
	}
	
	// x, y 좌표를 통해 차를 이동하는 메소드
	// 연료가 거리보다 크다면 -> 연료는 충분하고, 차가 움직일 수 있다.
	// 연료가 거리보다 작다면 -> 연료가 부족하고, 차는 움직일 수 없다.
	public boolean moveCar(double dx, double dy) {
		
		double d = Math.sqrt((dx*dx) + (dy*dy));
		
		if (fuel > d) {
			
			this.x += dx;
			this.y += dy;
			this.fuel -= d;
			
			return true;
		} else {
			
			return false;
		}
	}
}

public class CarTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자동차의 재원을 입력하시오.");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.println("너비: ");
		int width = sc.nextInt();
		System.out.println("높이: ");
		int height = sc.nextInt();
		System.out.println("길기: ");
		int length = sc.nextInt();
		System.out.println("연료량: ");
		int fuel = sc.nextInt();
		
		Car myCar = new Car(name, width, height, length, fuel);
		
		myCar.putSpec();
		
		// 자동차의 이돌 여부 확인, 연료 확인
		while (true) {
			System.out.println("현재 위치: (" + myCar.getX() + ", " + myCar.getY()
								+ "), 남은 연료량: " + myCar.getFuel());
			System.out.print("차를 이동하겠습니까? (YES:1 / NO:0) : ");
			
			int yn = sc.nextInt();
			
			if(yn == 0) {
				break;
			}
			
			System.out.print("x방향 이동거리: ");
			double x = sc.nextDouble();
			System.out.print("y방향 이동거리: ");
			double y = sc.nextDouble();
			
			if(!myCar.moveCar(x, y)) {
				System.out.println("연료가 부족합니다!!!");
			}
			
			
			
		}
		System.out.println("차를 정지하였습니다...");

		
		sc.close();
	}
}
