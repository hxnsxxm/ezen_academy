
public class Array2D02 {
	public static void main(String[] args) {
		
	// 3번 방법 - 2차원 배열을 선언하고, 바로 초기화
		// 2차원 배열을 선언하고, 바로 초기화를 할 때는 new int[][]를 생략할 수 있음
		int[][] a = {    // int[][] a = new int[][] { 생략
				{10, 20, 30, 40},    // 0번 행
				{50, 60, 70, 80},    // 1번 행
				{90, 100, 110, 120}, // 2번 행
		};
		
		
	// 4번 방법
		// 2차원 배열의 참조 변수 선언과 초기화를 분리할 때는 반드시 new int[][]를 써야 함
		/*
		int[][] a;
		a = new int[][] {
				{10, 20, 30, 40},    // 0번 행
				{50, 60, 70, 80},    // 1번 행
				{90, 100, 110, 120}, // 2번 행
		};
		*/
		
		// 2차원 배열의 출력
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}
}
