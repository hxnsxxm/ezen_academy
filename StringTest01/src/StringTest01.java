


/*
JVM (Java Virtual Machine), �ڹ� ���� ���
- �ڹٸ� �����ϸ� �ڵ����� �����Ǵ� �ڹ� ���� �ý���

Garbage Collector�� ���� - �������� �ʴ�(��������) �޸� ������ ȸ���Ͽ� ��Ȱ���ϵ��� �ϴ� ����
Garbage Collection - �������� �޸� ������ ȸ���Ͽ� ��Ȱ���ϵ��� �ϴ� ��.

*/

public class StringTest01 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC";
		String s4 = "DEF";
		
		s4 = s1; 
		// s4�� s1�� �����ϴ� ���� �Բ� �����ϰ� �ȴ�. 
		// s4�� �����ϴ� "DEF" �����ʹ� �������� ��.
		// �̶� JVM �ý����� ������
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("---------");
		
		// �ؽ��ڵ�(hashcode) - �� �ν��Ͻ��� ������ ������ ���̵�
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println("---------");
		
		// ��¥ �ؽ��ڵ�
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		
	}
}
