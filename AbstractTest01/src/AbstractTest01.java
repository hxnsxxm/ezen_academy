
// 추상 클래스 - 추상 메소드가 있다면, 반드시 추상 클래스가 되어야 함
abstract class A {
	public abstract void a();
}

// 비추상 클래스
/*// 1번
class B extends A {
	
	@Override
	public void a() { }  // 비추상 메소드 - 부모 클래스의 추상 메소드를 오버라이딩
}

class C extends B {
	
	@Override
	public void a() { }  // 비추상 메소드 - 부모 클래스의 비추상 메소드를 오버라이딩
}
*/

// 2번
abstract class B extends A {
	
}

class C extends B {
	
	@Override
	public void a() { }  // 비추상 메소드 - 부모 클래스의 추상 메소드를 오버라이딩
}

public class AbstractTest01 {
	public static void main(String[] args) {
		
	}
}
