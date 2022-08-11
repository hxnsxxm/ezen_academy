
public class StringTest02 {
	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("XYZ");
		String s3 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("-------");
		
		// new �� ���ؼ� ���ο� �ν��Ͻ��� ���������, s1�� s3�� ���� �ؽ��ڵ尡 �߻���
		// - �и�, ���ο� �ν��Ͻ��� ������ ���̰�, ���ڿ��� ������ ���� �� ���� �ؽ��ڵ带 �߻��ϵ��� hashCode() �޼ҵ带 �������̵� �Ͽ��� ����
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("-------");
		
		// ��¥ �ؽ��ڵ�
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}
}
