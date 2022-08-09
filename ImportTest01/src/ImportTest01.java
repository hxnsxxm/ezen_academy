//import java.util.Scanner;

public class ImportTest01 {
	public static void main(String[] args) {
		
		// 1. 완전수식명(Full Qualified Name, FQN) - 패키지를 포함한 클래스의 전체 경로를 사용하는 방법
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		// 2. 단순명(Simple Name, SN) - 클래스의 이름만을 사용하고, 패키지는 import 하는 방법
		//Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int x = sc.nextInt();
		
		System.out.println("x : " + x);
		
		sc.close();
	}
}
