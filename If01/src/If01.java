import java.util.Scanner;

/*
 * ���ǹ�: ���ǿ� ���� �ٸ��� ������ �� �ֵ��� �ϴ� ��
 * 1. if��
 *   
 *   - ����1)
 *   if(���ǽ�) {
 *       ���๮;
 *       ...
 *   }
 *   
 *   - ����2)
 *   if(���ǽ�) {
 *       ���๮;
 *       ...
 *   } else {
 *       ���๮;
 *       ...
 *   }
 *   
 *   - ����3)
 *   if(���ǽ�) {
 *       ���๮;
 *       ...
 *   } else if(���ǽ�) {
 *       ���๮;
 *       ....
 *   } else {
 *       ���๮;
 *       ....
 *   }
 * 
 * 2. switch~case��
 */

// ����1) �ֿܼ��� ������ �Է��Ͽ� ��������� �Ǻ��Ͻÿ�.
// ����2) �ֿܼ��� ������ �Է��Ͽ� �������, ���������� �Ǻ��Ͻÿ�.
// ����3) �ֿܼ��� ������ �Է��Ͽ� �������, ��������, 0������ �Ǻ��Ͻÿ�.
public class If01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("���� �Է�: ");
        int n = sc.nextInt();
        
        // ���� 1 -> ������ 1���� ��
        /*
        if(n > 0) {
            System.out.println("����Դϴ�.");
        }
        */
        
        // ���� 2 -> ������ 2���� ��
        /*
        if(n > 0) {
            System.out.println("����Դϴ�.");
        } else {
            System.out.println("�����Դϴ�.");
        }
        */
        
        // ���� 3 -> ������ 3���� ��
        /*
        if (n>0) {
            System.out.println("����Դϴ�.");
        } else if (n<0) {
            System.out.println("�����Դϴ�.");
        } else {
            System.out.println("0�Դϴ�.");
        }
        */
        
        if (n>0) {
            System.out.println("����Դϴ�.");
        } else if (n<0) {
            System.out.println("�����Դϴ�.");
        } else if (n==0) {
            System.out.println("0�Դϴ�.");
        }
        sc.close();
    }
}
