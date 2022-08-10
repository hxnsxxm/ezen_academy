
abstract class A {
	public abstract void a();
	public abstract void b();
}

abstract class B extends A {
	@Override
	public void a() { }
}

class C extends B {
	public void b() { }
}

public class AbstractTest02 {
	public static void main(String[] args) {
		
	}
}
