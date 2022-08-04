import java.util.Scanner;

/*
 * 문제) 정수 3개를 입력하여,
 * 그 중에서 최댓값과 최솟값을 구하는 프로그램을 작성하시오.
 * 최댓값을 구하는 부분, 최솟값을 구하는 부분을 각각 메소드로 만들어 구현하시오.
 * - 메소드명: calcMax, calcMin
 * 
 */

public class Method05 {

	static int calcMax(int  n1, int n2, int n3) {
		/*
		if (n1 < n2) {
			if (n2 < n3) return n3;
			else return n2;
		} else {
			if (n3 < n1) return n1;
			else return n3;
		}
		*/
		
		int max = n1;
		if (max < n2) max = n2;
		if (max < n3) max = n3;
		return max;
		
	} 
	
	static int calcMin(int  n1, int n2, int n3) {
		/*
		if (n1 < n2) {
			if (n3 < n1) return n3;
			else return n1;
		} else {
			if (n3 < n2) return n3;
			else return n2;
		}
		*/
		
		int min = n1;
		if (min > n2) min = n2;
		if (min > n3) min = n3;
		return min;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최댓값과 최솟값을 구합니다.");
		System.out.print("첫 번째 정수 입력: ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 정수 입력: ");
		int n2 = sc.nextInt();
		System.out.print("세 번째 정수 입력: ");
		int n3 = sc.nextInt();
		
		int numMax = calcMax(n1, n2, n3);
		int numMin = calcMin(n1, n2, n3);
		
		System.out.printf("\n세 정수 %d, %d, %d 중에서 최댓값: %d, 최솟값: %d\n", n1, n2, n3, numMax, numMin);
		
		sc.close();
	}
}
