


/*
< 에러와 예외 >
1. error (에러) : 컴파일시에 발생하는 문제
2. exception (예외) : 런타임(실행)중에 발생하는 문제
3. 예외처리 - 예외를 처리하여 프로그램이 정상적으로 실행되도록 하는 것
4. Exception 클래스 - 모든 예외의 부모 클래스, java.lang 패키지 안에 존재

예외 1)
ArrayIndexOutOfBoundsException: 배열의 인덱스의 범위를 넘었을 때 발생하는 예외

*/

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50};
		int tot = 0;
		
		for(int i=0; i<=a.length; i++) {
			tot += a[i];
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		// 문제점) 예외가 발생하여 합계를 출력하지 못함
		System.out.println("합계: " + tot);
		
		
	}
}
