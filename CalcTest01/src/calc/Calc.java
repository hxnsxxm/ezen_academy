package calc;



// class Calc {
// CalcTest01 에서 error : the type ~ is not visible

// public 액세스 클래스
public class Calc {
	
	// public 접근 제한
	public int add(int x, int y) {
		return x + y;
	}
	
	// int subtract(int x, int y) {
	// CalcTest01 에서 인스턴스 생성에서는 에러가 없지만
	// subtract 메소드를 사용하려면 error : the method from the type ~ is not visible
	
	// default 접근 제한
	public int subtract(int x, int y) {
		return x - y;
	}
	
	// 
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		return x / y;
	}
	
}
