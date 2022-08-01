
/*
 * 문제) 정수 1개를 입력하고, 입력한 수의 약수를 출력하고,
 *      개수와 합계를 출력하시오.
 */

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0, sum = 0;
        
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        
        for(int i =1; i<=n; i++) {  // 약수는 자기 자신(숫자)의 절반을 넘는 약수를 가질 수 없다. ex) 100의 약수 중 최대는 50
            if(n%i==0) {
                System.out.print(i + " ");
                ++count;
                sum += i;
            }
        }
        
        System.out.printf("\n정수 %d의 약수의 개수는 %d개이고, 합계: %d\n", n, count, sum);
        
        sc.close();
    }
}
