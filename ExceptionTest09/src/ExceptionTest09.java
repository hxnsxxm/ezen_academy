
public class ExceptionTest09 {
	public static void main(String[] args) {
		
		// 예외를 발생시키는 방법
		
		try {
			//Exception e = new Exception("고의로 예외를 발생시킴");
			//throw e;
			throw new Exception("고의로 예외를 발생시킴2");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}
}
