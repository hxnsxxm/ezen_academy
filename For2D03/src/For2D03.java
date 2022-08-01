

/*
 * 문제) 직사각형 만들기
 * < 입력 화면 설계 >
 * 가로 입력: 6
 * 세로 입력: 4
 * 
 * < 출력 화면 설계 >
 * ******
 * ******
 * ******
 * ******
 * 
 */

import java.util.Scanner;

public class For2D03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직사각형을 만듭니다.");
		System.out.print("가로 입력: ");
		int c = sc.nextInt();  // width
		System.out.print("세로 입력: ");
		int r = sc.nextInt();  // height
		
		for(int i = 1; i<=r; i++) {
			for(int j = 1; j<=c; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
