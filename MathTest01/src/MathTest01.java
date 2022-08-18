


/*
< Math Ŭ���� >
- ���п� ���� �پ��� ������ ���ǵǾ� �ִ� Ŭ����
- Ŭ���� �޼ҵ�� Ŭ���� ��������� �����Ǿ� �ִ� Ŭ���� (static, final���� ����)
- public final class Math�� ����Ǿ� �־, �ν��Ͻ��� ������ �� ���� Ŭ����
- ��� Ŭ���� �޼ҵ�� Ŭ���� ����� Math. ���� ����� 



*/


public class MathTest01 {
	public static void main(String[] args) {
		
		System.out.println(Math.abs(-11));  // ����
		System.out.println(Math.sqrt(9));   // ��Ʈ
		System.out.println(Math.PI);        // ������
		System.out.println(Math.ceil(10.1));  // ������ �ø�, 11
		System.out.println(Math.floor(10.9)); // ������ ����, 10
		System.out.println(Math.round(10.4)); // ������ �ݿø�, 10
		System.out.println(Math.round(10.5)); // ������ �ݿø�, 11
		System.out.println("-----------");
		
		double n = 34567.56789;
		System.out.println(n);
		double a = Math.round(n*10)/10.;    // �Ҽ��� ù° �ڸ����� �ݿø�
		System.out.println(a);
		double b = Math.round(n*100)/100.;  // �Ҽ��� ��° �ڸ����� �ݿø�
		System.out.println(b);
		double c = Math.round(n*1000)/1000.; // �Ҽ��� ��° �ڸ����� �ݿø�
		System.out.println(c);
		System.out.println("-----------");
		
		System.out.println(Math.max(10, 20));   // ���� 2�� ���� �ִ�
		System.out.println(Math.max(2.5, 7.7)); // �Ǽ� 2�� ���� �ִ�
		System.out.println(Math.max(Math.max(30, 10), 20)); // ���� 3�� ���� �ִ�
		
		System.out.println(Math.min(10, 20));   // ���� 2�� ���� �ּڰ�
		System.out.println(Math.min(2.5, 7.7)); // �Ǽ� 2�� ���� �ּڰ�
		System.out.println(Math.min(Math.min(30, 10), 20)); // ���� 3�� ���� �ּڰ�
		System.out.println("-----------");
		
		// rint() : �Ǽ����� ����� ���� �������� ���, �� �� �߰��� ���� ¦�� ���� ����
		System.out.println(Math.rint(1.4));
		System.out.println(Math.rint(1.6));
		System.out.println(Math.rint(1.5)); 
		System.out.println(Math.rint(2.5));
		System.out.println(Math.rint(3.5));
		System.out.println(Math.rint(4.5));
		System.out.println(Math.rint(5.5));
		System.out.println(Math.rint(6.5));
		System.out.println(Math.rint(7.5));
		System.out.println("-----------");
		
		System.out.println(Math.pow(2, 3));
		
		
		
	}
}