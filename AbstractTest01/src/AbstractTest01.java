
// �߻� Ŭ���� - �߻� �޼ҵ尡 �ִٸ�, �ݵ�� �߻� Ŭ������ �Ǿ�� ��
abstract class A {
	public abstract void a();
}

// ���߻� Ŭ����
/*// 1��
class B extends A {
	
	@Override
	public void a() { }  // ���߻� �޼ҵ� - �θ� Ŭ������ �߻� �޼ҵ带 �������̵�
}

class C extends B {
	
	@Override
	public void a() { }  // ���߻� �޼ҵ� - �θ� Ŭ������ ���߻� �޼ҵ带 �������̵�
}
*/

// 2��
abstract class B extends A {
	
}

class C extends B {
	
	@Override
	public void a() { }  // ���߻� �޼ҵ� - �θ� Ŭ������ �߻� �޼ҵ带 �������̵�
}

public class AbstractTest01 {
	public static void main(String[] args) {
		
	}
}
