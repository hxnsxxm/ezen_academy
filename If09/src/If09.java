
import java.util.Scanner;

public class If09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 1번 입력: ");
        int n1 = sc.nextInt();
        System.out.print("정수 2번 입력: ");
        int n2 = sc.nextInt();
        System.out.print("연산자 입력: ");
        //String o = sc.next(); // 문자열은 클래스형이기 때문에 다루는 방법이 다름
        char c = sc.next().charAt(0);  // 문자열의 0번 인덱스를 가지고 옴
        
        int result = 0;
        
        switch(c) {
        case '+':
            result = n1 + n2;
            break;
        case '-':
            result = n1 - n2;
            break;
        case '*':
            result = n1 * n2;
            break;
        case '/':
            result = n1/n2;
            break;
        case '%':
            result = n1%n2;
            break;
        default:
            c = 'e';
            break;
        }
        
        /*
        if(c=='+') {
            result = n1 + n2;
            System.out.print("Check\n");
        } else if(c=='-') {
            result = n1 - n2;
        } else if(c=='*') {
            result = n1 * n2;
        } else if(c=='/') {
            result = n1 / n2;
        } else if(c=='%') {
            result = n1%n2;
        } else {
            c = 'e';
        }
        */
        
        if(c=='e') {
            System.out.println("잘못된 연산자를 입력하였습니다.");
        } else {
            System.out.printf("%d %c %d = %d\n", n1, c, n2, result);
        }
        
        
        sc.close();
    }
}
