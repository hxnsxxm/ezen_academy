import java.util.Vector;

public class VectorTest03 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> v3 = new Vector<Integer>();
		
		v1.add(10); v1.add(20); v1.add(30);
		v2.add(40); v2.add(50); v2.add(60);
		v3.add(30); v3.add(40); v3.add(50);
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		
		System.out.println("--- ���Ϳ� �ٸ� ������ ��� ������ �߰� ---");
		// v1.addAll(v2); // ������
		v1.addAll(1, v2); // �������(�߰�)
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		
		System.out.println("--- ���Ϳ��� �������� ���� ���� Ȯ��(1��) ---");
		System.out.println(v1.contains(10));
		System.out.println(v1.contains(70));
		
		System.out.println("--- ���Ϳ��� �������� ���� ���� Ȯ��(�ٸ� ������ ��� ����) ---");
		System.out.println(v1.containsAll(v2));
		System.out.println(v3.containsAll(v2));
		
		System.out.println("--- ������ ���� ---");
		@SuppressWarnings("unchecked")  // Ÿ�� üũ�� ���� �ʴ� �Ϳ� ���� ��� ���� ����� �ֳ����̼�
		Vector<Integer> v4 = (Vector<Integer>)v1.clone();
		System.out.println(v4);
		
		
		
		
	}
}
