

/*
 * ����) ���� �ﰢ�� �����
 * < �Է� ȭ�� ����>
 * ���� �Է�: 5
 * 
 * < ��� ȭ�� ���� >
 * *
 * **
 * ***
 * ****
 * *****
 * 
 */

import java.util.Scanner;

public class For2D04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ﰢ���� ����մϴ�.");
		System.out.print("���� �Է�: ");
		int width = sc.nextInt();
		
		// for��
		for(int i=1; i<=width; i++) {
			for(int j=1; j<=i; j++) {  // for(int j=i; j>=1; j--)
				System.out.print("*");
			}
			System.out.println();
		}
		
		// while��
		/*
		int x = 1;
		while(x<=width) {
			int y = x;     // y = 1;
			while(y>=1) {  // while(y<=x) y++;
				System.out.print("*");
				y--;
			}
			System.out.println();
			x++;
		}
		*/
		
		sc.close();
	}
}
