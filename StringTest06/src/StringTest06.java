
public class StringTest06 {
	public static void main(String[] args) {
		// ����: 20, �ε���: 0~19
		String s1 = "Hello_Java_World.hwp";
		
		// 4. endsWith() : ���ڿ��� Ư�� ���ڿ��� �����°��� ����
		System.out.println(s1.endsWith(".hwp"));
		System.out.println(s1.endsWith(".txt"));
		
		// ������ ���ε��Ͽ� �����ϴ� ���
		if (s1.endsWith(".hwp")) {
			System.out.println("���ε� �Ǿ����ϴ�.");
		} else {
			System.out.println("���ε� ���� �ʾҽ��ϴ�.\n������ hwp�������� ��ȯ�Ͽ� �����Ͻÿ�.");
		}
		
		// 5. startsWith(s): ���ڿ��� Ư�� ���ڿ��� �����ϴ°��� ����
		System.out.println(s1.startsWith("Hello"));
		
		// 6. indexOf(s): �ε������� Ư�� ���ڿ��� �ε����� ��(����)���� ã�Ƽ� �˷���
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.indexOf("JAVA")); // -1, ã�� ����, ���ڿ��� �ε����� �������� �ʴ� ��
		
		// 7. lastIndexOf(s): ���ڿ����� Ư�� ���ڿ��� �ε����� ��(������)���� ã�Ƽ� �˷��� 
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.lastIndexOf("Java"));
		System.out.println(s1.lastIndexOf("."));
		
		
	}
}
