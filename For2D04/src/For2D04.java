

/*
 * 문제) 직각 삼각형 만들기
 * < 입력 화면 설계>
 * 가로 입력: 5
 * 
 * < 출력 화면 설계 >
 * *
 * **
 * ***
 * ****
 * *****
 * 
 */

import java.util.Scanner;

public class For2D04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직각 삼각형을 출력합니다.");
		System.out.print("가로 입력: ");
		int width = sc.nextInt();
		
		// for문
		for(int i=1; i<=width; i++) {
			for(int j=1; j<=i; j++) {  // for(int j=i; j>=1; j--)
				System.out.print("*");
			}
			System.out.println();
		}
		
		// while문
		/*
		int x = 1;
		while(x<=width) {
			int y = x;     // y = 1;
			while(y>=1) {  // while(y<=x) y++;
				System.out.print("*");
				y--;
			}
			System.out.println();
			x++;
		}
		*/
		
		sc.close();
	}
}
