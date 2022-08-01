import java.util.Scanner;

// 문제) 정수 1개를 입력하여 3의 배수이고 4의 배수인지를 판별하시오.
public class If03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        
        if( n%3 == 0 && n%4 == 0 ) {
            System.out.println(n + "은 3의 배수이고 4의 배수입니다.");
        } else {
            System.out.println(n + "은 3의 배수이고 4의 배수도 아닙니다.");
        }
        
        sc.close();
    }
}
