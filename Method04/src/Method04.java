import java.util.Scanner;

/*
 * ����) ���� 1���� ���� 1���� �Է��Ͽ�,
 * ���Ϻ��� ������ �����ﰢ���� �Է��� ���ڷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * - �� ���� ����ϴ� �κ��� �޼ҵ�� ����� ����Ͻÿ�.
 * - �޼ҵ��: putChar
 * 
 * 
 * < �Է� ȭ�� ���� >
 * ���� �Է�: 5
 * ���� �Է�: @
 * 
 * < ��� ȭ�� ���� >
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 * 
 */

public class Method04 {

	// �޼ҵ� ����
	static void putChar(int n, char c) {
		
		for (int i=0; i<=n; i++) {
			System.out.print(c);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���Ϻ��� ������ �����ﰢ���� ����մϴ�.");
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();
		System.out.print("���� �Է�: ");
		char c = sc.next().charAt(0);
		
		for (int i=0; i<n; i++) {
			// �޼ҵ� �Ʒ�
			putChar(i, c);
			System.out.println();
		}
		
		sc.close();
	}
}
