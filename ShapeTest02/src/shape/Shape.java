package shape;

// �߻� �޼ҵ带 ������ �ִ� Ŭ������ abstract�� �־�� ��
public abstract class Shape {

	// �߻����� �޼ҵ� : ��ü������ ���� --> abstract
	public abstract void draw();
	
	// �߻� �޼ҵ�
	public abstract String toString();
	
	// ���߻� �޼ҵ�
	public void print() {
		System.out.println(toString());
		draw();
	}
	
}
