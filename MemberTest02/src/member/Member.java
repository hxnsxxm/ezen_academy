package member;

/*
1. Member 클래스 
- SpecialMember의 부모 클래스
- 멤버변수: 회원이름(name), 회원번호(no), 회원나이(age)
- 생성자
- getter/setter
- 출력 메소드 2가지, showInfo(), toString()
*/

// 부모 클래스
public class Member {
	private String name;
	private String no;
	private int age;
	
	public Member() { }

	public Member(String name) {
		this.name = name;
	}
	
	public Member(String name, String no) {
		this(name);
		this.no = no;
	}
	
	public Member(String name, String no, int age) {
		this(name, no);
		this.age = age;
	}
	
	// getter
	public String getName() { return name; }
	public String getNo() { return no; }
	public int getAge() { return age; }
	
	// setter
	public void setName(String name) { this.name = name; }
	public void setNo(String no) { this.no = no; }
	public void setAge(int age) { this.age = age; }
	
	public void showInfo() {
		 System.out.println("회원이름: " + name);
		 System.out.println("회원번호: " + no);
		 System.out.println("회원나이: " + age);
	}
	
	@Override
	public String toString() {
		return "회원이름: " + name + "\n회원번호: " + no + "\n회원나이: " + age;
	}
	
}
