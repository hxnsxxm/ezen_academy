// import java.lang.Object; // lang ��Ű��, ���� ����

/*
Object Ŭ����
- java.lang ��Ű�� �ȿ� ����
- �ٸ� Ŭ�����κ��� ��ӹ��� �ʴ� ��� Ŭ������ Object�κ��� ��ӹ޴� ������
- �ڹ��� ��� Ŭ������ Object Ŭ������ �ڼ� Ŭ������ ��
- Object Ŭ�������� toString()�� ������ 9���� �޼ҵ尡 ������


*/
class A extends Object{
	private int a;
	
	public A() {
		super();
		a = 50; 
	}
	
	public int getA() { return a; }
}

class B extends A {
	
	public B() {
		super();
	}
}

public class DefaultConstructor01 {
	public static void main(String[] args) {
		B x = new B();
		
		System.out.println(x.getA());
	}
}
