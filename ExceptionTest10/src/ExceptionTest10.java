
public class ExceptionTest10 {
	public static void main(String[] args) {
		
		// ���ܸ� ������ ���
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
			System.err.println("method1()���� ����ó���� �Ͽ���");
			throw e;
		}
	}
	
	public static void method2() {
		try {
			throw new Exception("method2()���� ���ܰ� �߻���.");
		} catch (Exception e) {
			//e.printStackTrace();
			System.err.println("method2() ���� ó���� �Ǿ���.");
			//throw e;
		}
		
	}
	
}
