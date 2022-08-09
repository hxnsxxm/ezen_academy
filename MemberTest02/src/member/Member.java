package member;

/*
1. Member Ŭ���� 
- SpecialMember�� �θ� Ŭ����
- �������: ȸ���̸�(name), ȸ����ȣ(no), ȸ������(age)
- ������
- getter/setter
- ��� �޼ҵ� 2����, showInfo(), toString()
*/

// �θ� Ŭ����
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
		 System.out.println("ȸ���̸�: " + name);
		 System.out.println("ȸ����ȣ: " + no);
		 System.out.println("ȸ������: " + age);
	}
	
	@Override
	public String toString() {
		return "ȸ���̸�: " + name + "\nȸ����ȣ: " + no + "\nȸ������: " + age;
	}
	
}
