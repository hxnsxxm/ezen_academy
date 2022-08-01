

/*
 * 문제) 실수 x와 정수 y를 입력하여, x의 y제곱을 구하는 프로그램을 작성하시오.
 * 
 * < 입력 화면 설계 >
 * x의 y제곱을 출력합니다.
 * x 실수 입력: 5.5
 * y 정수 입력: 3
 * 
 * < 출력 화면 설계 >
 * 5.5의 3제곱은 ...입니다.
 * 
 */

import java.util.Scanner;
public class For06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("x의 y제곱을 출력합니다");
        System.out.print("x 실수 입력: ");
        double x = sc.nextDouble();
        System.out.print("y 정수 입력: ");
        int y = sc.nextInt();
        
        double power = 1.0;
        
        for(int i = 1; i<=y;i++) {
            power *= x;
        }
        
        System.out.printf("%.3f의 %d제곱은 %.3f입니다.\n", x, y, power);
        
        
        
        sc.close();
    }
}
