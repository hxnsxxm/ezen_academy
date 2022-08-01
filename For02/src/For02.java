


/*
 * 문제) 정수를 입력하여, 1부터 1씩 증가하여 입력한 수까지의 정수 중에서 홀수를 출력하고, 
 *      그 홀수의 개수와 합계를 출력하시오.
 */

import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i=1, n, count=0, sum=0;
        
        System.out.print("정수 입력: ");
        n = sc.nextInt();
        
        /*
        int t = 0;
        while(t++<10) {  // 조건식을 판별한 이후 바로 t+1을 하기 때문에, 실행문에서 그대로 반영됨
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
        System.out.printf("1에서 %d까지의 수 중에서 홀수는 %d개, 합계: %d\n", n, count, sum);
        
        sc.close();
    }
}
