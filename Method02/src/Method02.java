import java.util.Scanner;

/*
 * ����) ���� �������� �Է��Ͽ� ���� ������ ���� �ѷ��� ���Ͻÿ�.
 * ���� ������ ���� �ѷ��� �޼ұ׸� ����� ����Ͻÿ�.
 */

public class Method02 {

	// ���� ������ ���ϴ� �޼ҵ�
	static double calcArea(double r) {
		double area = Math.PI * r * r;
		return area;
	}
	
	// ���� �ѷ��� ���ϴ� �޼ҵ�
	static double calcPerimeter(double r) {
		double peri = 2 * Math.PI * r;
		return peri;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է�: ");
		double r = sc.nextDouble();
		
		double area = calcArea(r);
		double peri = calcPerimeter(r);
		
		System.out.printf("�������� %.2f�� ���� ����: %.2f, �ѷ�: %.2f\n", r, area, peri);
		
		sc.close();
	}
}
