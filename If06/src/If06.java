
// ����) ���� 1���� �Է��Ͽ� 1�ڸ�������, 2�ڸ��� �̻������� �Ǻ��Ͻÿ�.

import java.util.Scanner;

public class If06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("���� �Է�: ");
        int n = sc.nextInt();
        
        // 1��
        if(n/10==0) {
            System.out.println(n + "��(��) 1�ڸ��� �Դϴ�.");
        } else {
            System.out.println(n + "��(��) 2�ڸ��� �̻��Դϴ�.");
        }
        System.out.print("\n\n");
        
        // 2��
        if(n>=10 || n<=-10) {
            System.out.println(n + "��(��) 2�ڸ��� �̻��Դϴ�.");
        } else {
            System.out.println(n + "��(��) 1�ڸ��� �Դϴ�.");
        }
        
        
        
        
        sc.close();
    }
}
