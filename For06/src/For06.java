

/*
 * ����) �Ǽ� x�� ���� y�� �Է��Ͽ�, x�� y������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * < �Է� ȭ�� ���� >
 * x�� y������ ����մϴ�.
 * x �Ǽ� �Է�: 5.5
 * y ���� �Է�: 3
 * 
 * < ��� ȭ�� ���� >
 * 5.5�� 3������ ...�Դϴ�.
 * 
 */

import java.util.Scanner;
public class For06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("x�� y������ ����մϴ�");
        System.out.print("x �Ǽ� �Է�: ");
        double x = sc.nextDouble();
        System.out.print("y ���� �Է�: ");
        int y = sc.nextInt();
        
        double power = 1.0;
        
        for(int i = 1; i<=y;i++) {
            power *= x;
        }
        
        System.out.printf("%.3f�� %d������ %.3f�Դϴ�.\n", x, y, power);
        
        
        
        sc.close();
    }
}
