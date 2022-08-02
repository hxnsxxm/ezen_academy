import java.util.Scanner;

/*
 * < 2차원 반복문 연습 - 직각삼각형 출력 >
 * -> 2반복문과 조건문을 활용
 * 
 * < 입력 화면 설계 >
 * 가로 길이 입력: 5
 * 
 * < 출력 화면 설계 >
 * 1. 좌하변이 직각인 직각삼각형
 *   12345
 * 1 *
 * 2 **
 * 3 ***
 * 4 ****
 * 5 *****
 * 
 * 2. 좌상변이 직각인 직각삼각형
 *   12345 
 * 1 *****
 * 2 ****
 * 3 ***
 * 4 **
 * 5 *
 * 
 * 3. 우하변이 직각인 직각삼각형
 *   12345
 * 1     *
 * 2    **
 * 3   ***
 * 4  ****
 * 5 *****
 * 
 * 4. 우상변이 직각인 직각삼각형
 *   12345
 * 1 *****
 * 2  ****
 * 3   ***
 * 4    **
 * 5     *
 * 
 */

public class For2D07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직각삼각형을 출력합니다.");
		System.out.print("가로 입력: ");
		int n = sc.nextInt();
		
		// 1. 좌하변이 직각인 직각삼각형
		/*
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if(j<=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		// 2. 좌상변이 직각인 직각삼각형
		/*
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if(i+j <= n+1) {    // *********************************
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		// 3. 우하변이 직각인 직각삼각형
		/*
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if(i+j >= n+1) {    // *********************************
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		// 4. 우상변이 직각인 직각삼각형
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				if(i<=j) {   
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
