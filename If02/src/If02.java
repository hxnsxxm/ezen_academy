import java.util.Scanner;

// 문제 1) 정수 1개를 입력하여 홀수인지, 짝수인지를 판별하시오
public class If02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 입력: ");
        int n = sc.nextInt();
        
        
        if(n%2 == 1) {
            System.out.println("홀수입니다.");
        } else {
            System.out.println("짝수입니다.");
        }
        
        sc.close();
    }
}
