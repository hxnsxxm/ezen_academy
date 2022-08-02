import java.util.Scanner;

/*
 * 두 개의 정수를 더하여 합계를 출력하는 프로그램
 * 두 개의 정수를 더하는 부분 -> 메소드로 작성
 * 
 * < 메소드(Method)의 정의 >
 * - 정의: 여러 가지 명령문과 수식을 모아서 처리할 수 있도록 만든 것
 * - 장점: 이 메소드가 필요할 때 간단하게 호출하여 사용할 수 있음. 유지보수가 편해짐
 * - 객체지향의 관점에서는 메소드가 클래스를 구성하는 일부분이 됨
 * - 다른 언어에서는 함수(function)이라고 부르기도 함
 * 
 * < 메소드의 구성 >
 * - 메소드 정의(생성) + 메소드 호출(사옹)
 * 
 * < 메소드를 만드는 규칙 > - 반드시 지켜야 하는 규칙
 * 1. 매개변수의 개수와 탇입은 반드시 일치해야 한다.
 * 2. 리턴값은 반드시 1개 또는 0개여야 한다.
 * 3. 리턴 타입은 리턴값과 반드시 일치해야 한다.
 * 
 * < 메소드를 만들 때의 권장 사항 >
 * - 메소드는 행위(동작)을 의미하므로 동사로 만들 것을 권장한다.
 */

public class Method01 {
	
	// 메소드 정의
	static int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	// static main은 static method만 사용할 수 있음
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a 입력: ");
		int a = sc.nextInt();
		
		System.out.print("정수 b 입력: ");
		int b = sc.nextInt();

		// 메소드로 작성
//		int c = a + b;
		
		// 메소드 호출(사용)
		int c = add(a, b);
		
		System.out.println("합계: " + c);
		
		sc.close();
	}
}
