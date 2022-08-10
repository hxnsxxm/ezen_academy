package shape;

// 추상 메소드를 가지고 있는 클래스는 abstract가 있어야 함
public abstract class Shape {

	// 추상적인 메소드 : 구체적이지 않음 --> abstract
	public abstract void draw();
	
	// 추상 메소드
	public abstract String toString();
	
	// 비추상 메소드
	public void print() {
		System.out.println(toString());
		draw();
	}
	
}
