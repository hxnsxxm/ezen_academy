package pet;

// 로봇 애완동물 클래스
// Pet 으로부터 상속받는 자식 클래스
public class RobotPet extends Pet {
	
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	// Override
	// 부모 클래스의 메소드와 완전히 동일해야 한다. 
	// - 리턴값, 이름, 매개변수의 개수, 자료형
	// 접근 제한자는 부모 클래스의 메소드와 동일하거나, 완화되어야 한다.
	@Override
	public void introduce() {
		System.out.println("◎ 저는 로봇입니다. 이름은 " + getName() + "입니다.");
		System.out.println("◎ 주인님은 " + getMasterName() + "입니다.");
	}
	
	public void work(int w) {
		switch (w) {
		case 1:
			System.out.println("청소를 합니다.");
			break;
		case 2:
			System.out.println("빨래를 합니다");
			break;
		case 3:
			System.out.println("밥을 짓습니다.");
			break;
			
		}
	}
	
}
