
public class StringTest09 {
	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("----------");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("----------");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		// 18. intern(): ���ڿ��� ������ ���� �ν��Ͻ��� ���� ������ ��, �� ���ڿ��� �ϳ��� �ν��Ͻ��� �����ϵ��� ����� ��
		s1 = s1.intern(); // �� �� intern �ؾ� ��
		s2 = s2.intern();
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}
}