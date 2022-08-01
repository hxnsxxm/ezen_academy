

/*
 * 문제) 정수를 입력하여, 1부터 1씩 증가하여 입력한 수까지에서 3의 배수이면서 4의 배수인 수를 출력하고,
 *      개수와 합계를 출력하시오.
 */

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, count = 0, sum = 0;
        
        System.out.print("정수 입력: ");
        n = sc.nextInt();
        
        for(int i=1 ; i<=n ; i++) {
            if (i%3==0 && i%4==0) {
                System.out.print(i + " ");
                ++count;
                sum += i;
            }
        }
        
        System.out.printf("\n1에서 %d까지의 수 중에서 3의 배수이면서 4의 배수인 수의 개수는 %d개이고, 합계: %d\n", n, count, sum);
        
        
        sc.close();
    }
}
