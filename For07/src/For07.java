

/*
 * ����) �������� ���� �Է��Ͽ�, �ش� ���� ������ ����Ͻÿ�.
 * < �Է� ȭ�� ���� >
 * �� �Է�: 7
 * 
 * < ��� ȭ�� ���� >
 * 7 * 1 = 7
 * 7 * 2 = 14
 * 7 * 3 = 21
 * ...
 * 7 * 9 = 63
 * 
 * 
 */

import java.util.Scanner;

public class For07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("�� �Է�: ");
        int n = sc.nextInt();
        
        for(int i = 1; i<=9; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
        
        
        sc.close();
    }
}
