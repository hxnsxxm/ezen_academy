
/*
 * ����) ���� 1���� �Է��ϰ�, �Է��� ���� ����� ����ϰ�,
 *      ������ �հ踦 ����Ͻÿ�.
 */

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0, sum = 0;
        
        System.out.print("���� �Է�: ");
        int n = sc.nextInt();
        
        for(int i =1; i<=n; i++) {  // ����� �ڱ� �ڽ�(����)�� ������ �Ѵ� ����� ���� �� ����. ex) 100�� ��� �� �ִ�� 50
            if(n%i==0) {
                System.out.print(i + " ");
                ++count;
                sum += i;
            }
        }
        
        System.out.printf("\n���� %d�� ����� ������ %d���̰�, �հ�: %d\n", n, count, sum);
        
        sc.close();
    }
}
