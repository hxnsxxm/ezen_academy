
public class ExceptionTest09 {
	public static void main(String[] args) {
		
		// ���ܸ� �߻���Ű�� ���
		
		try {
			//Exception e = new Exception("���Ƿ� ���ܸ� �߻���Ŵ");
			//throw e;
			throw new Exception("���Ƿ� ���ܸ� �߻���Ŵ2");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
	}
}
