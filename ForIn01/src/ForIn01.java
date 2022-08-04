
/*
 * < for문 종류 >
 * 1. 기본 for문: 배열 또는 컬렉션의 인덱스를 활용하여 접근
 * 
 * 2. Enhanced for문(향상된 for문), 확장 for문, for-in문, for-each문: 
 * - 특징: 인덱스가 없다. 특정 범위에 해당하는 값을 다룰 수는 없다.
 * - 무조건 처음부터 끝까지, 값을 다루게 된다.
 * - 인덱스가 없으므로, 특정 인덱스에 해당하는 값에 변화를 줄 수도 없다. 
 * 
 */

public class ForIn01 {
	public static void main(String[] args) {
		int[] a = new int[] {10, 20, 30, 40, 50};
		
		// 1번 - 기본 for문
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 2번 - 확장 for문, for-in문
		for (int i : a) {  // (1) ? : , (2) case : (3) int i : array
		// i 는 값을 가짐
		// a의 데이터를 수정할 수 없음
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
