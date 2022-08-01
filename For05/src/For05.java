import java.util.Scanner;

/*
문제) 정수 1개를 입력하여, 입력한 수의 팩토리얼 구하시오.
< 입력 화면 설계 >
정수 입력: 5

< 출력 화면 설계 >
5! = 1 * 2 * 3 * 4 * 5 = 120

*/
public class For05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		System.out.print(n + "! = ");
		for(int i=1; i<=n; i++) {
			fact *= i;
			System.out.print(i);
			if(i < n) { // i != n * != 보다 부호를 사용하는 것을 권장 *
				System.out.print(" * ");
			}
		}
		
		System.out.print(" = " + fact);		
		
		sc.close();
	}

}
