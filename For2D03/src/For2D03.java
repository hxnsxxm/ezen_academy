

/*
 * ����) ���簢�� �����
 * < �Է� ȭ�� ���� >
 * ���� �Է�: 6
 * ���� �Է�: 4
 * 
 * < ��� ȭ�� ���� >
 * ******
 * ******
 * ******
 * ******
 * 
 */

import java.util.Scanner;

public class For2D03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���簢���� ����ϴ�.");
		System.out.print("���� �Է�: ");
		int c = sc.nextInt();  // width
		System.out.print("���� �Է�: ");
		int r = sc.nextInt();  // height
		
		for(int i = 1; i<=r; i++) {
			for(int j = 1; j<=c; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
