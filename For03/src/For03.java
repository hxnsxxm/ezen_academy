

/*
 * ����) ������ �Է��Ͽ�, 1���� 1�� �����Ͽ� �Է��� ���������� 3�� ����̸鼭 4�� ����� ���� ����ϰ�,
 *      ������ �հ踦 ����Ͻÿ�.
 */

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, count = 0, sum = 0;
        
        System.out.print("���� �Է�: ");
        n = sc.nextInt();
        
        for(int i=1 ; i<=n ; i++) {
            if (i%3==0 && i%4==0) {
                System.out.print(i + " ");
                ++count;
                sum += i;
            }
        }
        
        System.out.printf("\n1���� %d������ �� �߿��� 3�� ����̸鼭 4�� ����� ���� ������ %d���̰�, �հ�: %d\n", n, count, sum);
        
        
        sc.close();
    }
}
