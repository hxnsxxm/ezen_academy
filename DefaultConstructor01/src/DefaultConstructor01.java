// import java.lang.Object; // lang 패키지, 생략 가능

/*
Object 클래스
- java.lang 패키지 안에 존재
- 다른 클래스로부터 상속받지 않는 모든 클래스는 Object로부터 상속받는 관계임
- 자바의 모든 클래스는 Object 클래스의 자손 클래스가 됨
- Object 클래스에는 toString()를 포함한 9개의 메소드가 존재함


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
