import java.util.Scanner;
// java안에 util 패키지의 scanner 클래스를 import함
// Scanner 클래스: 콘솔(키보드)로부터 값을 입력받는 클래스
// Scanner 클래스를 사용함으로써 "대화식 프로그램"을 작성할 수 있음
// System.in  : 입력스트림(흐름, 통로), 콘솔로부터 데이터를 입력받아 메모리로 전달하는 전체 과정이 필요함
// System.out : 출력스트림
// console : 입출력을 아우르는 장치

// Ctrl + Shift + o : 해당 클래스에 필요한 클래스를 자동으로 import해준다.

// 문제) 반지름을 입력하여 원의 면적과 원의 둘레를 구하는 프로그램을 작성하시오.
public class Scanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 클래스의 메소드를 사용할 수 있도록 만드는 기본적인 형태
        
        
        System.out.print("반지름 입력: ");
        double radius = sc.nextDouble();
        final double PI = 3.141592;
        
        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;
        
        System.out.println("원의 면저: " + area);
        System.out.println("원의 둘레: " + perimeter);
        
        sc.close();
        // 입출력은 메모리 누수가 있기 때문에 그를 방지해야 한다. 메모리 낭비 방지
    }
}
