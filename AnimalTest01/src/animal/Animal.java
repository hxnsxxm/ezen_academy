package animal;

/*
문제점) 객체의 개별적/구체적인 특성을 적용하기 어려움
ex) 동물 --> 각 종의 개별적인 특성(생김새, 울음소리, ...)

1. 추상 메소드
    (1) 추상 메소드의 특징
    - 메소드의 구현 부분(본체)이 없다. { }
    - 메소드 앞에 abstract를 쓴다.
    (2) 추상 메소드의 목적 규칙?
    - 자식 클래스에서 부모 클래스의 추상 메소드를 오버라이딩해야만 인스턴스를 생성할 수 있다. --> 강제
    - 만약, 자식 클래스에서 부모 클래스의 추상 메소드를 오버라이딩 하지 않으면, 
    	자식 클래스는 추상 메소드를 가지게 되고 --> 추상 클래스가 되고 --> 인스턴스를 생성할 수 없게 된다.
    - 비추상 메소드를 추상 메소드로 오버라이딩 할 수 있다.
    	
2. 추상 클래스
	(1) 추상 클래스의 특징
	- 클래스 이름 앞에 abstract를 쓴다.
	(2) 추상 클래스의 규칙
	- 추상 메소드를 가지면 무조건 추상 클래스가 되어야 한다.
	- 추상 메소드가 없어도 추상 클래스는 될 수 있다. --> 인스턴스를 생성할 수 없다. 
	- 추상 클래스는 인스턴스를 만들 수 없다. --> 부모 클래스로 동작하여 다형성을 구현할 목적임이 분명해짐
    

*/

// 추상 메소드를 포함하는 클래스는, 반드시 추상 클래스가 되어야 함
// 추상 클래스
// 부모 클래스
public abstract class Animal {
	
	private String name;
	
	// 생성자
	public Animal() { }
	public Animal(String name) {
		this.name = name;
	}
	
	// 추상 메소드
	public abstract void bark();
	/*
	public void bark() {
		
	}
	*/
	
	@Override
	public abstract String toString();
	
	public String getName() { return name; }
	
	public void setName(String name) { this.name = name; }
	
	public void introduce() {
		System.out.println(toString());
		bark();  // 구현되어 있지 않지만 호출함 --> 상속받은 자식이 사용하기 위함
	}
	
}
