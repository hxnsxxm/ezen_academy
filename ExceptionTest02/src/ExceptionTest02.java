

/*
< ���ܸ� ó���ϴ� ��� >
- try ��  : ���ܰ� �߻��� �� �ִ� ����, �ʼ�
- catch �� : �� ���ܰ� �߻����� ���� ó��, 1���� �ʼ�, �� �̻��� ����
- finally �� : catch �� �Ʒ��� 1���� ��� ���� ,����, ������ �߻� ������ ������� �׻� ������


1. try ~ catch(����)
2. try ~ catch(����) ~ catch(����) ~ 
->catch�� �߻��ϴ� ������ ������ŭ �� �� ����. ������ �������� �ٸ� ó���� �ϰ� �ʹٸ� ���
3. try ~ catch (���� | ���� | ����)
-> catch �ȿ��� | �� �����ϴ� ���ܴ� ������ ������ ����.
-> �پ��� ������ ���ܿ� ���ؼ� ó���� �� ����. ��� ���ܿ� ���� ó������� �� ������ �� ���.
-> ��Ƽ catch ��, �ڹ� 7�������� ����
4. try ~ catch(exception e)        
-> catch �ȿ� Exception�� ����ϸ� ��� �ڽ� ���ܵ��� ó���� �� ����
-> ��� ���ܸ� ó���� �� �� ������, �����ϰ� � ���ܰ� �߻��ϴ� �� �� �� ����
5. try ~ catch ~ catch ~... ~ catch(Exception)

6. try ~ catch ~ finally


*/

public class ExceptionTest02 {
	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50};
		int tot = 0;
		
		
		
		try {
			for (int i=0; i<=a.length; i++) {
				tot += a[i];
				System.out.println("a[" + i + "] = " + a[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("�հ� : " + tot );
	
		System.out.println("�Ʒ����� �л����� ������ ���� ó���� �ϰ� �ֽ��ϴ�.");
		// ...
		
		
		
	}
}
