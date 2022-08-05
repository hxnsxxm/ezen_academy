


/*
 * < 지역변수와 전역변수 >
 * - 사용하는 범위(영역)에 따른 구분
 * 
 * 1. 지역변수(local variable, local field)
 *    - 블럭({}) 안에서 선언되고, 그 안에서 사용되는 변수
 *    - 주로 메소드 안에서 선언되고, 사용되는 변수
 *    - 메소드가 다르면 같은 이름의 변수를 사용할 수 있음
 *     
 * 2. 전역변수(global variable, global field)
 *    - 클래스 안에, 메소드 밖에서 선언하여 사용하는 변수
 *    - 전역변수는 모든 메소드에서 사용할 수 있음
 * 
 */

public class Method09 {
	
	static int x = 70;
	static int y = 50;
	
	static void methodA() {
		int x = 20;
		
		System.out.println("methodA 지역변수 x: " + x);
	}
	
	static void methodB() {
		int x = 30;
		
		System.out.println("methodB 지역변수 x: " + x);
	}
	
	public static void main(String[] args) {
		int x = 10;
		
		System.out.println("main 지역변수 x: " + x);
		methodA();
		methodB();
		
		System.out.println("전역변수 y: " + y);
		System.out.println("전역변수 x: " + Method09.x);
	}
}