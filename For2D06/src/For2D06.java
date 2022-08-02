import java.util.Scanner;


/*
 * < 2차원 반복문 연습 - 직각삼각형 출력 >
 * 
 * < 입력 화면 설계 >
 * 가로 길이 입력: 5
 * 
 * < 출력 화면 설계 >
 * 1. 좌하변이 직각인 직각삼각형
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * 2. 좌상변이 직각인 직각삼각형 
 * *****
 * ****
 * ***
 * **
 * *
 * 
 * 3. 우하변이 직각인 직각삼각형
 *     *
 *    **
 *   ***
 *  ****
 * *****
 * 
 * 4. 우상변이 직각인 직각삼각형
 * *****
 *  ****
 *   ***
 *    **
 *     *
 * 
 */

public class For2D06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직각삼각형을 출력합니다.");
		System.out.print("가로 입력: ");
		int n = sc.nextInt();
		
		// 1. 좌하변이 직각인 직각삼각형
		/*
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 2. 좌상변이 직각인 직각삼각형 ***************************
		/*
		for (int i=1; i<=n; i++) {
			// for (int j=i; j<=n; j++) { // 2-1
			// for (int j=n; j>=i; j--) { // 2-2
			for (int j=1; j<=n+1-i; j++) { // 2-3
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 3. 우하변이 직각인 직각삼각형
		/*
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 4. 우상변이 직각인 직각삼각형
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=n+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
