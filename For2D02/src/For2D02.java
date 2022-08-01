

import java.util.Scanner;

public class For2D02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("정사각형을 출력합니다.");
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        
        
        for(int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
