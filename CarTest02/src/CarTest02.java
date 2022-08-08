import java.util.Scanner;
/*
 * ����) �Ʒ��� ���ǿ� �����ϵ��� �ν��Ͻ��� �����Ͽ� Ȯ���Ͻÿ�.
 *   1. ���� ���(�̸�, �ʺ�, ����, ����)�� ���ᷮ�� �Է��Ͽ� �ν��Ͻ��� �����Ͻÿ�
 *   2. x, y ��ǥ�� ���� ������ Ȱ���Ͽ� ���� �̵��ϵ��� �ϴ� �޼ҵ带 ����� Ȱ���Ͻÿ�.
 *   - x, y ��ǥ�� �Է��Ͽ� �̵��ϵ��� �Ͻÿ�. ������ Ŀ����ŭ ���Ḧ �Ҹ��ϵ��� �Ͻÿ�.
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
	
	// ������
	public Car(String name, int width, int height, int length, double fuel) {
		 this.name = name;
		 this.width = width;
		 this.length = length;
		 this.height = height;
		 this.fuel = fuel;
		 x = y = 0.0;
	}
	
	// ��� �޼ҵ�
	//getter - x. y
	public double getX() { return x;}
	public double getY() { return y;}
	public double getFuel() { return fuel; }
	
	public void setX(double x) { this.x = x; }
	public void setY(double y) { this.y = y; }
	public void setFuel(double fuel) { this.fuel = fuel; }
	
	// ���� ���� ��� �޼ҵ�
	public void putSpec() {
		System.out.println("�� �̸�: " + name);
		System.out.println("�� ����: " + width);
		System.out.println("�� ����: " + height);
		System.out.println("�� ����: " + length);
	}
	
	// x, y ��ǥ�� ���� ���� �̵��ϴ� �޼ҵ�
	// ���ᰡ �Ÿ����� ũ�ٸ� -> ����� ����ϰ�, ���� ������ �� �ִ�.
	// ���ᰡ �Ÿ����� �۴ٸ� -> ���ᰡ �����ϰ�, ���� ������ �� ����.
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
		
		System.out.println("�ڵ����� ����� �Է��Ͻÿ�.");
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.println("�ʺ�: ");
		int width = sc.nextInt();
		System.out.println("����: ");
		int height = sc.nextInt();
		System.out.println("���: ");
		int length = sc.nextInt();
		System.out.println("���ᷮ: ");
		int fuel = sc.nextInt();
		
		Car myCar = new Car(name, width, height, length, fuel);
		
		myCar.putSpec();
		
		// �ڵ����� �̵� ���� Ȯ��, ���� Ȯ��
		while (true) {
			System.out.println("���� ��ġ: (" + myCar.getX() + ", " + myCar.getY()
								+ "), ���� ���ᷮ: " + myCar.getFuel());
			System.out.print("���� �̵��ϰڽ��ϱ�? (YES:1 / NO:0) : ");
			
			int yn = sc.nextInt();
			
			if(yn == 0) {
				break;
			}
			
			System.out.print("x���� �̵��Ÿ�: ");
			double x = sc.nextDouble();
			System.out.print("y���� �̵��Ÿ�: ");
			double y = sc.nextDouble();
			
			if(!myCar.moveCar(x, y)) {
				System.out.println("���ᰡ �����մϴ�!!!");
			}
			
			
			
		}
		System.out.println("���� �����Ͽ����ϴ�...");

		
		sc.close();
	}
}
