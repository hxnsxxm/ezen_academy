import java.util.Scanner;

/*
 * < 2���� �ݺ��� ���� - �����ﰢ�� ��� >
 * -> 2�ݺ����� ���ǹ��� Ȱ��
 * 
 * < �Է� ȭ�� ���� >
 * ���� ���� �Է�: 5
 * 
 * < ��� ȭ�� ���� >
 * 1. ���Ϻ��� ������ �����ﰢ��
 *   12345
 * 1 *
 * 2 **
 * 3 ***
 * 4 ****
 * 5 *****
 * 
 * 2. �»��� ������ �����ﰢ��
 *   12345 
 * 1 *****
 * 2 ****
 * 3 ***
 * 4 **
 * 5 *
 * 
 * 3. ���Ϻ��� ������ �����ﰢ��
 *   12345
 * 1     *
 * 2    **
 * 3   ***
 * 4  ****
 * 5 *****
 * 
 * 4. ����� ������ �����ﰢ��
 *   12345
 * 1 *****
 * 2  ****
 * 3   ***
 * 4    **
 * 5     *
 * 
 */

public class For2D07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ﰢ���� ����մϴ�.");
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();
		
		// 1. ���Ϻ��� ������ �����ﰢ��
		/*
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if(j<=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		// 2. �»��� ������ �����ﰢ��
		/*
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if(i+j <= n+1) {    // *********************************
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		// 3. ���Ϻ��� ������ �����ﰢ��
		/*
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if(i+j >= n+1) {    // *********************************
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		// 4. ����� ������ �����ﰢ��
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if(i<=j) {   
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
