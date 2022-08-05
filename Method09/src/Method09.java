


/*
 * < ���������� �������� >
 * - ����ϴ� ����(����)�� ���� ����
 * 
 * 1. ��������(local variable, local field)
 *    - ��({}) �ȿ��� ����ǰ�, �� �ȿ��� ���Ǵ� ����
 *    - �ַ� �޼ҵ� �ȿ��� ����ǰ�, ���Ǵ� ����
 *    - �޼ҵ尡 �ٸ��� ���� �̸��� ������ ����� �� ����
 *     
 * 2. ��������(global variable, global field)
 *    - Ŭ���� �ȿ�, �޼ҵ� �ۿ��� �����Ͽ� ����ϴ� ����
 *    - ���������� ��� �޼ҵ忡�� ����� �� ����
 * 
 */

public class Method09 {
	
	static int x = 70;
	static int y = 50;
	
	static void methodA() {
		int x = 20;
		
		System.out.println("methodA �������� x: " + x);
	}
	
	static void methodB() {
		int x = 30;
		
		System.out.println("methodB �������� x: " + x);
	}
	
	public static void main(String[] args) {
		int x = 10;
		
		System.out.println("main �������� x: " + x);
		methodA();
		methodB();
		
		System.out.println("�������� y: " + y);
		System.out.println("�������� x: " + Method09.x);
	}
}