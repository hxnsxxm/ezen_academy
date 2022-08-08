
/*
 ����) main �޼ҵ忡 Id Ŭ������ �ν��Ͻ��� 3�� �����, id�� ���� �ν��Ͻ��� ������ �� �ڵ����� 1�� �����ϵ��� �Ͻÿ�.
 �� �ν��Ͻ��� id���� ����ϰ�, ���ݱ��� ������ �ν��Ͻ��� ���� ����ϵ��� �Ͻÿ�.
  
*/
class Id {
	private static int count = 0; // Ŭ���� ����
	private int id;  // �ν��Ͻ� ����
	
	// ������
	public Id() {
		id = ++count;
	}
	
	// Ŭ���� �޼ҵ�
	public static int getCount() { return count; }
	
	// �ν��Ͻ� �޼ҵ�
	public int getId() { return id; }
	
	public void setId(int id) { this.id = id; }
	
	public String toString() {
		return "ID : " + id;
	}
	
}

public class IdTest01 {
	public static void main(String[] args) {
		Id id01 = new Id();
		Id id02 = new Id();
		Id id03 = new Id();
		
		System.out.println(id01);
		System.out.println(id02);
		System.out.println(id03);
		
		// System.out.println("�� ������ �ν��Ͻ��� ����: " + a.getCount()); // �����ؾ� �ϴ� ���
		// (1) Ŭ���� �޼ҵ� �ӿ��� a���� �޼ҵ�ó�� ���δ�.
		// (2) �ν��Ͻ� a�� �縮���� ������ �߻��� ���α׷��� �������� �ʴ´�.
		System.out.println("�� ������ �ν��Ͻ��� ����: " + Id.getCount());   // �����ϴ� ���
	}
}
