import java.util.Scanner;


/*
 * < 2���� �ݺ��� ���� - �����ﰢ�� ��� >
 * 
 * < �Է� ȭ�� ���� >
 * ���� ���� �Է�: 5
 * 
 * < ��� ȭ�� ���� >
 * 1. ���Ϻ��� ������ �����ﰢ��
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * 2. �»��� ������ �����ﰢ�� 
 * *****
 * ****
 * ***
 * **
 * *
 * 
 * 3. ���Ϻ��� ������ �����ﰢ��
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * 
 * 4. ����� ������ �����ﰢ��
 * *****
 *  ****
 *   ***
 *    **
 *     *
 * 
 */

public class For2D06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ﰢ���� ����մϴ�.");
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();
		
		// 1. ���Ϻ��� ������ �����ﰢ��
		/*
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 2. �»��� ������ �����ﰢ�� ***************************
		/*
		for (int i=1; i<=n; i++) {
			// for (int j=i; j<=n; j++) { // 2-1
			// for (int j=n; j>=i; j--) { // 2-2
			for (int j=1; j<=n+1-i; j++) { // 2-3
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 3. ���Ϻ��� ������ �����ﰢ��
		/*
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 4. ����� ������ �����ﰢ��
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=n+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
