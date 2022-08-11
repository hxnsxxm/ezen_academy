
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// 8. length(): ���ڿ��� ���̸� ����.
		System.out.println("����: " + s1.length());
		
		// 9. replace(): ���ڿ����� Ư�� ���ڿ��� ���ο� ���ڿ��� ��δ� ������.
		s1 = s1.replace("!", "?");
		System.out.println(s1);
		s1 = s1.replace("Java", "Python");
		System.out.println(s1);
		s1 = s1.replace("l", "L");
		System.out.println(s1);
		
		// 10. replaceFirst(): ���ڿ����� Ư�� ���ڿ��� ù��°�� ������ ���ڿ��� ������
		s1 = s1.replaceFirst("o", "O");
		System.out.println(s1);
		
		// 11. toUpperCase(): ���ڿ��� ��� ���ڸ� �빮�ڷ� ������
		System.out.println(s1.toUpperCase());
		
		// 12. toLowerCase(): ���ڿ��� ��� ���ڸ� �ҹ��ڷ� ������
		System.out.println(s1.toLowerCase());
		
		// 13. trim(): ���ڿ��� �յ��� ������ ������
		String t2 = "       Hello    Java      World!!     ";
		System.out.println(t2 + "@");
		System.out.println(t2.trim() + "@");
		
		// 14. equals(): ���ڿ��� ���� ���Ͽ� �������� ���θ� �˷���
		String s3 = new String("ABC");
		String s4 = new String("XYZ");
		String s5 = new String("ABC");
		
		System.out.println(s3 == s5);
		System.out.println(s3.equals(s5));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals("ABC"));
		
		// 15. equalsIgnoreCase(): ���ڿ��� ���� ��ҹ��� ���о��� ��
		String s6 = "abc";
		System.out.println(s3.equals(s6));
		System.out.println(s3.equalsIgnoreCase(s6));
	}
}
