
public class ExceptionTest10 {
	public static void main(String[] args) {
		
		// 예외를 던지는 방법
		try {
			method1();
		} catch(Exception e) {
			System.err.println("");
		}
		
	}
	
	public static void method1() {
		try{
			method2();
		} catch (Exception e) {
			System.err.println("method1()에서 예외처리를 하였음");
			throw e;
		}
	}
	
	public static void method2() {
		try {
			throw new Exception("method2()에서 예외가 발생함.");
		} catch (Exception e) {
			//e.printStackTrace();
			System.err.println("method2() 예외 처리가 되었음.");
			//throw e;
		}
		
	}
	
}
