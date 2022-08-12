
// String Ŭ������ StringBuffer Ŭ������ ������
public class StringBufferTest01 {
	public static void main(String[] args) {
		
		// 1. String�� ������
		// - String Ŭ�������� ���� �߰�, ����, ������ �ϰ� �Ǹ� �ν��Ͻ��� �����ϰ� ��
		// - ���� ���� �ؽ��ڵ�� ���� ���� �ؽ��ڵ尡 �ٸ�.
		// - String Ŭ������ Ư¡: immutable�� Ư��
		
		String s1 = "ABC";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println("------------------");
		
		//s1 = s1 + "DEF";  // s1 += "DEF";
		s1 = s1.concat("DEF");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println("==================");
		
		// 2. StringBuffer
		// - String Ŭ������ immutable�� Ư���� �������� ������
		// - ���� �߰�, ���� �ÿ� �ڽ��� �ν��Ͻ��� �״�� ����, ���ҽ��Ѽ� �����
		// - ���� �߰�, ������ �ϱ� ���� �Ŀ� �ν��Ͻ��� �ؽ��ڵ尡 ����
		// - StringBuffer�� Ư��: mutable�� Ư��
		
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println("------------------");
		
		sb1.append("DEF");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		
		
		
	}
}
