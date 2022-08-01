
// 문제) 정수 1개를 입력하여 1자리수인지, 2자리수 이상인지를 판별하시오.

import java.util.Scanner;

public class If06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        
        // 1안
        if(n/10==0) {
            System.out.println(n + "은(는) 1자리수 입니다.");
        } else {
            System.out.println(n + "은(는) 2자리수 이상입니다.");
        }
        System.out.print("\n\n");
        
        // 2안
        if(n>=10 || n<=-10) {
            System.out.println(n + "은(는) 2자리수 이상입니다.");
        } else {
            System.out.println(n + "은(는) 1자리수 입니다.");
        }
        
        
        
        
        sc.close();
    }
}
