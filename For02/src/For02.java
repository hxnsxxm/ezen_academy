


/*
 * ����) ������ �Է��Ͽ�, 1���� 1�� �����Ͽ� �Է��� �������� ���� �߿��� Ȧ���� ����ϰ�, 
 *      �� Ȧ���� ������ �հ踦 ����Ͻÿ�.
 */

import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i=1, n, count=0, sum=0;
        
        System.out.print("���� �Է�: ");
        n = sc.nextInt();
        
        /*
        int t = 0;
        while(t++<10) {  // ���ǽ��� �Ǻ��� ���� �ٷ� t+1�� �ϱ� ������, ���๮���� �״�� �ݿ���
            System.out.print(t + " ");
        }
        */
        
        /*
        while(i<=n) {
            if(i%2==1) {
                System.out.println(i);
                count += 1;
                sum += i;
            }
            i++;
        }
        */
        /*
        for(i=1;i<=n;i++) {
            if(i%2==1) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        */
        System.out.print(i);
        System.out.printf("1���� %d������ �� �߿��� Ȧ���� %d��, �հ�: %d\n", n, count, sum);
        
        sc.close();
    }
}
