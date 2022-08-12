
/*
< StringBuffer�� StringBuilder Ŭ������ �� >
- StringBuffer�� StringBuilder Ŭ������ ������ ���� ����
- ������: StringBuilder�� ������(thread)�� ����� �����ϰ� �־ ������ ���ϰ� �߻���
- StringBuffer�� StringBuilder���� �������� ����� �����Ͽ� ������ ����Ų Ŭ����

*/

// StringBuffer Ŭ������ �پ��� �޼ҵ�
public class StringBufferTest04 {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		
		// 1. append() : ���ڿ� ���� �ش� ���ڿ��� �߰�
		sb1.append("Hello Java World!");
		System.out.println(sb1);
		System.out.println("---------");
		
		// 2. charAt() : ���ڿ����� �ش� �ε����� ���� Ȯ��
		System.out.println(sb1.charAt(6));
		System.out.println(sb1.charAt(11));
		System.out.println(sb1.capacity());
		//System.out.println(sb1.charAt(15)); // ���� �߻� : StringIndexOutOfBoundsException
		System.out.println("---------");
		
		// 3. deleteCharAt() : ���ڿ����� �ش� �ε����� �� ���ڸ� ���� 
		sb1.deleteCharAt(11);
		System.out.println(sb1);
		System.out.println("---------");
		
		// 4. delete() : ���ڿ����� �ش� �ε����� ������ ���� ����
		sb1.delete(6, 10);  // ���۰�, ���� - ���۰����� ���� �������� ����
		System.out.println(sb1);
		System.out.println("---------");
		
		// 5. insert() : ���ڿ��� �߰�(Ư��) ��ġ�� ���� �߰�
		sb1.insert(6, "Python");
		System.out.println(sb1);
		sb1.insert(13, "W");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println("---------");
		
		// 6. replace() : ���ڿ��� �ش� �ε����� ������ ���� ���ο� ���ڿ��� ����
		sb1.replace(6, 12, "Android");
		System.out.println(sb1.capacity());
		System.out.println(sb1);
		sb1.replace(0,5, "Hi");
		System.out.println("---------");
		
		StringBuffer sb = new StringBuffer("ABCDEF");
		System.out.println(sb);
		sb.replace(2, 4, "hello world");
		System.out.println(sb);
		
		
		// 7. reverse() : ���ڿ��� �Ųٷ� ������
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		System.out.println("---------");
		
		// 8. setCharAt() : �ε����� �ش��ϴ� �� ���ڸ� ����
		sb1.setCharAt(16, '*');
		System.out.println(sb1);
		System.out.println("���ڿ� ����: " + sb1.length());
		System.out.println("---------");
		
		// 9. setLength() : ���ڿ��� ���̸� ����
		sb1.setLength(10);
		System.out.println(sb1);
		System.out.println("���ڿ� ����: " + sb1.length());
		System.out.println("---------");
		
		// 10. substring() : ���ڿ����� �ش� ������ Ư�� ���ڿ��� ����
		sb1.append(" World!");
		System.out.println(sb1);
		String s1 = sb1.substring(3,10); // 3������ 10�� �ձ��� ����
		System.out.println(s1);
		System.out.println(sb1);
		String s2 = sb1.substring(11,17); // 11������ 17�� �ձ��� ����
		System.out.println(s2);
		String s3 = sb1.substring(11); // 11������ ������ ����
		System.out.println(s3);
		System.out.println("---------");
		
		// 11. trimToSize() : ���ڿ��� ũ�⸸ŭ���� �뷮�� ����
		System.out.println("�뷮: " + sb1.capacity());
		System.out.println("ũ��: " + sb1.length());
		sb1.trimToSize();
		System.out.println("�뷮: " + sb1.capacity());
		
		
	}
}
