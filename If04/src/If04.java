import java.util.Scanner;
// 문제) a와 b에 각각 정수를 입력하여, 항상 a에는 작은 수가, b에 큰 수가 저장되도록 프로그램을 작성하시오.
public class If04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("두 개의 정수를 입력하시오.");
        System.out.print("정수 a 입력: ");
        int a = sc.nextInt();
        System.out.print("정수 b 입력: ");
        int b = sc.nextInt();
        
        // swapping (스와핑): 두 개의 변수의 값을 바꾸는 기본적이고, 중요한 방법
        if (a>b) {
            int t = a;
            a = b;
            b = t;
        }
        
        System.out.printf("a는 %d, b는 %d\n", a, b);
        
        sc.close();
    }
}
