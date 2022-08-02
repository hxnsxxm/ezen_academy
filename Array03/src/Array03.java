
public class Array03 {
	public static void main(String[] args) {
		// 3번 방법  - 배열을 선언하고 바로 초기화
		// 배열의 선언하고 바로 초기화할 때는 new int[]를 생략할 수 있음
		//int[] a = {10, 20, 30, 40, 50}; // new int[] 생략됨
		//int[] a = new int[] {10, 20, 30, 40, 50};
		
		// 4번 방법
		// 배열의 선언과 초기화를 분리할 때는 반드시 new int[]를 써야 함
		int[] a;
		a = new int[] {10, 20, 30, 40, 50}; // initializer - new
		
		for (int i=0; i<a.length; i++) {
			System.out.println("a[" + i +"] = " + a[i]);
		}
	}
}

