import java.util.Vector;

public class VectorTest04 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("�뷮: " + v.capacity()); // �ʱ� �뷮  : 10
		System.out.println("ũ��: " + v.size());     // �ʱ� ũ�� : 0
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("--- 5���� ������ �߰� ---");
		System.out.println("�뷮: " + v.capacity()); // 10
		System.out.println("ũ��: " + v.size());     // 5
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("--- 5���� ������ �߰� ---");
		System.out.println("�뷮: " + v.capacity()); // 10
		System.out.println("ũ��: " + v.size());     // 10
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("--- 5���� ������ �߰� ---");
		System.out.println("�뷮: " + v.capacity()); // 10
		System.out.println("ũ��: " + v.size());     // 15
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("--- 5���� ������ �߰� ---");  
		System.out.println("�뷮: " + v.capacity()); // 20
		System.out.println("ũ��: " + v.size());     // 20
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("--- 5���� ������ �߰� ---");
		System.out.println("�뷮: " + v.capacity()); // 40 -> �뷮�� 20�� �߰�, �뷮�� ����� �ڵ����� ������
		System.out.println("ũ��: " + v.size());     // 25
		
		System.out.println("--- �뷮�� ũ��� ���� ���� ---");
		v.trimToSize();
		System.out.println("�뷮: " + v.capacity()); // 20, -> �뷮�� ũ��� �����ϰ� ����
		System.out.println("ũ��: " + v.size());     // 20
		
		
		
		
		
		
		
		
		
		
	}
}
