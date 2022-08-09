package member;

/*
2. SpecialMember 클래스
- Member 클래스의 자식 클래스
- 멤버변수: 특별 혜택(privilege)
- 생성자
- getter/setter
- 출력 메소드 2가지 - 오버라이딩해서 생성 
*/


// 자식 클래스
public class SpecialMember extends Member {
	
	private String privilege;
	
	public SpecialMember() {
		//super();
	}
	
	public SpecialMember(String name) {
		super(name);
	}
	
	public SpecialMember(String name, String no) {
		super(name, no);
	}
	
	public SpecialMember(String name, String no, int age) {
		super(name, no, age);
	}
	
	public SpecialMember(String name, String no, int age, String privilege) {
		super(name, no, age);
		this.privilege = privilege;
	}
	
	// getter
	public String getPrivilege() { return privilege; }
	
	// setter
 	public void setPrivilege(String privilege) { this.privilege = privilege; }
	
	@Override
	public void showInfo() {
		/*
		System.out.println("회원이름: " + super.getName());
		System.out.println("회원번호: " + super.getNo());
		System.out.println("회원나이: " + super.getAge());
		*/
		super.showInfo();
		System.out.println("특별혜택: " + privilege);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n특별혜택: " + privilege;
	}
}
