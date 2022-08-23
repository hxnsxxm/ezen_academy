

// try ~ catch ~ finally
public class ExceptionTest03 {
	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50};
		int tot = 0;
		double avg = 0.0;
		
		// try - ���ܰ� �߻��� �� �ִ� ������ ���´�. �ʼ�
		try {
			for (int i=0; i<=a.length; i++) {
				tot += a[i];
				System.out.println("a[" + i + "] = " + a[i]);
			}
			//avg = (double)tot/a.length; -> ����� ó������ ����
		
		// catch - �߻��� �� �ִ� ���ܿ� ���� ó���� ���´�. 1���� �ʼ�, 2�����ʹ� ����
		} catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage() + "�� �ε����� �������� �ʽ��ϴ�.");
			
		// finally - ������ �߻������� ������� �׻� �����ؾ��ϴ� ������ ���´�.
		} finally {
			// ��� ó�� �κ��� finally �������� �Űܼ� ������ �߻������� ������� ����ǵ��� ��
			avg = (double)tot/a.length;   
		}
		
		System.out.println("�հ� : " + tot );
		System.out.println("���: " + avg);
	
		System.out.println("�Ʒ����� �л����� ������ ���� ó���� �ϰ� �ֽ��ϴ�.");
		// ...
		
		
		
	}
}
