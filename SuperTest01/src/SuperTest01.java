
// 기본 클래스
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

// 파생 클래스
class Derived extends Base {
	private int x;  // 똑같은 이름의 변수 선언 가능(구분할 수 있음)
	
	// 부모의 x와 자식의 x을 어떻게 구분할 것인가
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
