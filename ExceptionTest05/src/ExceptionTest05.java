



// ���� 3)
// NullPointerException : null ���ε� ������� �����ڸ� ����Ϸ��� �Ҷ� �����ϴ� ����
// ������ ���� ���� �߻��ϴ� ����, �߰��ϱ⵵ ��ٷӰ�, ó���ϱ⵵ ���ڷο� ����
public class ExceptionTest05 {
	public static void main(String[] args) {
		
		String data = null;
		
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			e.printStackTrace();
		} 
		
		System.out.println("�Ʒ����� ó���ؾ� �ϴ� �����Ͱ� �פ��� �Ϥ���");
	}
}
