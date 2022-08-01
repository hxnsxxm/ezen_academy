

/*
 * 문제) 구구단의 단을 입력하여, 해당 단의 내용을 출력하시오.
 * < 입력 화면 설계 >
 * 단 입력: 7
 * 
 * < 출력 화면 설계 >
 * 7 * 1 = 7
 * 7 * 2 = 14
 * 7 * 3 = 21
 * ...
 * 7 * 9 = 63
 * 
 * 
 */

import java.util.Scanner;

public class For07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("단 입력: ");
        int n = sc.nextInt();
        
        for(int i = 1; i<=9; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
        
        
        sc.close();
    }
}
