// java.lang 패키지 - 자바를 사용하는데 필수적인 클래스들이 있는 패키지
// - 따로 import 하지 않아도 자동으로 import 한다.
// - System, String, Math, Object, Exception, ...

// 패키지 이름 명명법 - 무조건 소문자로 작성

import java.util.Scanner;
// import java.lang.Math;

// < static import 방법 >
// - 클래스 메소드, 클래스 상수에 대해서 클래스명을 사용하지 않고, 메소드명, 상수명으로 사용할 수 있도록 하는 방법
// 1. 단일형 static import 방법
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
// 2. 주문형 static import 방법
import static java.lang.Math.*;

// 수학적인 계산을 하는 프로그램
public class ImportTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 인스턴스를 만들 때 사용 --> 인스턴스 메소드, 인스턴스 변수

		System.out.print("반지름 입력: ");
		double radius = sc.nextDouble();
		System.out.print("x좌표값 입력: ");
		double x = sc.nextDouble();
		System.out.print("y좌표값 입력: ");
		double y = sc.nextDouble();
		System.out.print("음수정수 입력: ");
		int n = sc.nextInt();
		
		/*
		double area = Math.PI * radius * radius;   // 원의 면적
		double perimeter = 2 * Math.PI * radius;   // 원의 둘레
		double distance = Math.sqrt(x*x + y*y);    // 거리
		n = Math.abs(n);                           // 절대값 --> Math 클래스의 사용 방법, static way
		*/
		// static import 사용
		double area = PI * radius * radius;   // 원의 면적
		double perimeter = 2 * PI * radius;   // 원의 둘레
		double distance = sqrt(x*x + y*y);    // 거리
		n = abs(n); 
		
		System.out.println("원의 면적: " + area);
		System.out.println("원의 둘레: " + perimeter);
		System.out.println("거리: " + distance);
		System.out.println("절대값: " + n);
		
		
		
		sc.close();
	}
}
