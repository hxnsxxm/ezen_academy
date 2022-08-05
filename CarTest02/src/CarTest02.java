
/*
 * ����) �Ʒ��� ���ǿ� �����ϵ��� �ν��Ͻ��� �����Ͽ� Ȯ���Ͻÿ�.
 *   1. ���� ���(�̸�, �ʺ�, ����, ����)�� �Է��Ͽ� �ν��Ͻ��� �����Ͻÿ�
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
		System.out.println("�� ���� " + width);
		System.out.println("�� ����" +  height);
		System.out.println("�� ����" + length);
	}
	
	
}

public class CarTest02 {
	public static void main(String[] args) {
		
	}
}