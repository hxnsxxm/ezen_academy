
public class StringTest04 {
	public static void main(String[] args) {
		String s1 = null; // s1�� �ƹ� ���� �����ϰ� ���� ���� ����, null ����
		String s2 = "";   // �� ���ڿ�
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("--------");
		
		//System.out.println(s1.hashCode()); // ����: NullPointerException
		System.out.println(s2.hashCode());
		System.out.println("--------");
		
		char[] c = new char[] {
				'H','E','L','L','O',
		};
		String s3 = new String(c);
		System.out.println(c);
		System.out.println(s3);
		
		
		
	}
}
