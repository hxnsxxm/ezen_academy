
/*
< Wrapper Ŭ���� >
1. Byte, Short, Integer, Long, Character, Float, Double, Boolean�� 8�� Ŭ������ ��Ī�Ͽ� ����ϴ� �̸�
2. �ڹٿ��� �⺻���� ���������� ��ȯ�Ͽ� ����ϱ� ���� ���� 8���� �⺻���� ���� Ŭ������
3. ���� 1) �⺻���� ������(Ŭ������)���� ����� ���� ����
4. ���� 2) ���ڿ��� �⺻������ ��ȯ�ϱ� ���� ����
5. 8���� Wrapper Ŭ���� �߿��� �⺻������ ���� ���� ����ϴ� Integer, Double�� ���� ���� �����
6. Collection(�÷���)������ �ݵ�� Wrapper Ŭ������ ����ؾ� ��

# �ڽ�(Boxing)    - �⺻���� ���������� ����� �� 
# ��ڽ�(Unboxing) - �������� �⺻������ ����� ��
# ����ڽ�(Auto-Boxing)    - �⺻���� ���������� �ڵ����� �����ϴ� ��
# �����ڽ�(Auto-Unboxing) - ���������� �ڵ����� �⺻���� �����ϴ� ��   
*/


public class WrapperTest01 {
	public static void main(String[] args) {

		// 1�� ����
		int i = 10;                  // �⺻��
		Integer ii = new Integer(i); // ������, �ڽ�  
		int i2 = ii.intValue();  // ��ڽ�
		i2 += 20;
		System.out.println(ii);
		System.out.println(i2);
		System.out.println("-----------");
		
		int j = 10;     // �⺻��
		Integer jj = j; // ������, ����ڽ�, String �� Wrapper Ŭ������ �̷��� ����� �� ����
		jj += 30;       // �����ڽ�
		System.out.println(jj);
		System.out.println("-----------");
		
		// 2�� ����
		String s1 = "10";
		System.out.println(s1 + 20); // ���ڿ� 1020
		
		int a = Integer.parseInt(s1) + 20;
		System.out.println(a);
		
		String s2 = "3.14";
		double radius = 5.5;
		// System.out.println( s2 * radius * radius); // error : ���ڿ��� ���ϱ⸦ �� �� ����
		
		double area = Double.parseDouble(s2) * radius * radius;
		System.out.println(area);
		
		
		
		
	}

}
