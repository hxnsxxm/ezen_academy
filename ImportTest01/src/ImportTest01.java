//import java.util.Scanner;

public class ImportTest01 {
	public static void main(String[] args) {
		
		// 1. �������ĸ�(Full Qualified Name, FQN) - ��Ű���� ������ Ŭ������ ��ü ��θ� ����ϴ� ���
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// 2. �ܼ���(Simple Name, SN) - Ŭ������ �̸����� ����ϰ�, ��Ű���� import �ϴ� ���
		//Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int x = sc.nextInt();
		
		System.out.println("x : " + x);
		
		sc.close();
	}
}
