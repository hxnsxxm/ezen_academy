


// String Ŭ������ �پ��� �޼ҵ� ����
public class StringTest05 {
	public static void main(String[] args) {
		// ���ڼ�: 17����, �ε���: 0~16
		String s1 = "Hello Java World!";
		
		// 1. charAt(idx): �ε����� �ش��ϴ� �� ���ڸ� ������
		char c1 = s1.charAt(6);
		System.out.println(c1);
		
		// 2. concat(s): ���ڿ��� �����Ͽ� ���ο� ���ڿ��� ����
		//String s2 = s1.concat("Korea~");
		String s2 = s1 + "Korea~";
		System.out.println(s2);
		
		// 3. contains(s): ���ڿ����� ã���� �ϴ� ���ڿ��� �����ϴ� ���� ����. �����ϸ� true, �������� ������ false
		System.out.println(s1.contains("J"));
		System.out.println(s1.contains("Java"));
		System.out.println(s1.contains("JAVA"));
		System.out.println(s2.contains("Korea"));
		System.out.println(s2.contains("KOREA"));
		
		
		
		
			
	}
}
