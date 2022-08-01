import java.util.Scanner;

/*
 * 조건문: 조건에 따라 다르게 실행할 수 있도록 하는 문
 * 1. if문
 *   
 *   - 형식1)
 *   if(조건식) {
 *       실행문;
 *       ...
 *   }
 *   
 *   - 형식2)
 *   if(조건식) {
 *       실행문;
 *       ...
 *   } else {
 *       실행문;
 *       ...
 *   }
 *   
 *   - 형식3)
 *   if(조건식) {
 *       실행문;
 *       ...
 *   } else if(조건식) {
 *       실행문;
 *       ....
 *   } else {
 *       실행문;
 *       ....
 *   }
 * 
 * 2. switch~case문
 */

// 문제1) 콘솔에서 정수를 입력하여 양수인지를 판별하시오.
// 문제2) 콘솔에서 정수를 입력하여 양수인지, 음수인지를 판별하시오.
// 문제3) 콘솔에서 정수를 입력하여 양수인지, 음수인지, 0인지를 판별하시오.
public class If01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        
        // 형식 1 -> 조건이 1개일 때
        /*
        if(n > 0) {
            System.out.println("양수입니다.");
        }
        */
        
        // 형식 2 -> 조건이 2개일 때
        /*
        if(n > 0) {
            System.out.println("양수입니다.");
        } else {
            System.out.println("음수입니다.");
        }
        */
        
        // 형식 3 -> 조건이 3개일 때
        /*
        if (n>0) {
            System.out.println("양수입니다.");
        } else if (n<0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("0입니다.");
        }
        */
        
        if (n>0) {
            System.out.println("양수입니다.");
        } else if (n<0) {
            System.out.println("음수입니다.");
        } else if (n==0) {
            System.out.println("0입니다.");
        }
        sc.close();
    }
}
