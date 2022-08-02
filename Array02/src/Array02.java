

/*
 * 배열(Array) - 같은 타입의 변수의 집합
 * - 변수의 값을 한꺼번에(일괄) 선언하고, 반복문을 통해 한꺼번에(일괄) 처리할  수 있게 함
 * - 배열의 인덱스(index): 배열 개수가 n개라면, 0 ~ n-1까지 존재함
 * - 배열의 기본값: int형 배열 본체는 기본값인 0이 들어 있음
 * 
 */

public class Array02 {
	public static void main(String[] args) {
		
		// 1번 방법, 참조 변수 a, 참조형, 클래스를 포함하는 참조,
		/*
		int[] a;        // 참조 변수 선언, int형의 1차원 배열을 참조하는 참조변수, a 선언
		a = new int[5]; // 참조 변수 a가 int형의 배열의 본체를 참조함
		*/
		
		// 2번 방법, 참조 변수 선언과 동시에 배열의 본체를 참조함
		int[] a = new int[5];   // 기본값(default value), 0으로 초기화되어 있음
		
		// 값을 설정
		a[1] = 10;
		a[3] = 30;
		
//		a.length = 10;  --> Error: 배열의 length는 final 상수이므로 변경이 불가
		
		// 반복문을 사용하여 배열의 값을 출력
		for (int i=0;i<a.length;i++) {
			System.out.println("a[" + i + "] = " +a[i]);
		}
		
		/*
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
//		System.out.print(a[5]); --> 예외(Exception) 발생: 배열의 개수가 5개이면, a[0]~a[4]까지 존재, a[5]는 없음 
		*/
		
	}
}
