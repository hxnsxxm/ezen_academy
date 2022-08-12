

// String Ŭ������ StringBuffer Ŭ������ ������2
public class StringBufferTest02 {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC");
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		System.out.println("-----------------------");
		
		// < StringBuffer ���� ���ڿ��� �� >
		// 1. == ������ : �� ���ڿ��� ������ ��
		if (sb1 == sb2) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
		
		// �ڡڡڡڡ�
		// 2. equals(): StringBuffer�� equals() �޼ҵ�� ���� �ƴ϶� , ������ ����.
		// - ������: �����ؾ� ��.
		if (sb1.equals(sb2)) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
		
		// �ڡڡڡڡڡڡڡڡڡ�
		// 3. 2�� ������ �ذ�å: ���� ���ϵ��� �ϴ� ���
		// - String Ŭ������ equals() �޼ҵ�� Object Ŭ������ equals() �޼ҵ带 �������̵��Ͽ� ���ڿ��� ���� ����
		// - StringBuffer�� ���� ������ ���ڿ��� ���� ���� String Ŭ������ �ٲ㼭 ���ؾ� ��
		// StringBuffer Ŭ������ toString() �޼ҵ带 �̿��ؼ� String Ŭ������ ��ȯ�� ������ ���Ѵ�.
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		if (s1.equals(s2)) {
			System.out.println("�� ���ڿ��� �����ϴ�.");
		} else {
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		}
		
		
		
	}
}
