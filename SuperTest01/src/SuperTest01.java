
// �⺻ Ŭ����
class Base {
	protected int x;
	
	public Base() {
		this.x = 1;
	}
	
	public Base(int x) {
		this.x = x;
	}
	
	public void print() {
		System.out.println("Base' x: " + x);
	}
}

// �Ļ� Ŭ����
class Derived extends Base {
	private int x;  // �Ȱ��� �̸��� ���� ���� ����(������ �� ����)
	
	// �θ��� x�� �ڽ��� x�� ��� ������ ���ΰ�
	public Derived(int x1, int x2) {
		super.x = x1;
		this.x = x2;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Derived' x: " + x);
	}
	
}

public class SuperTest01 {
	public static void main(String[] args) {
		Base a = new Base(10);
		a.print();
		System.out.println();
		
		Derived b = new Derived(20, 30);
		b.print();
	}
}
