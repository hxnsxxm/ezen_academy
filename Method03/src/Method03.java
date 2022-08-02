import java.util.Scanner;

/*
 * ����) x�� y������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * x�� �Ǽ� �Է�, y�� ���� �Է��� �ϵ��� �Ͻÿ�.
 * x�� y������ ����ϴ� �κ��� �޼ҵ�� �����Ͽ� �����Ͻÿ�.
 * �޼ҵ��: calcPower
 * 
 * 
 */

public class Method03 {

	// x�� y������ ���ϴ� �޼ҵ�
	static double calcPower(double x, int y) {
		double result = 1.0;
		for (int i=0; i<y; i++) {
			result *= x;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x�� y������ ���մϴ�.");
		System.out.print("�Ǽ� x �Է�: ");
		double x = sc.nextDouble();
		System.out.print("���� y �Է�: ");
		int y = sc.nextInt();
		
		double result = calcPower(x, y);
		
		System.out.printf("%.2f�� %d������ %.4f\n", x, y, result);
		
		sc.close();
	}
}
