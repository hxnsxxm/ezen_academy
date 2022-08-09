package member;

/*
2. SpecialMember Ŭ����
- Member Ŭ������ �ڽ� Ŭ����
- �������: Ư�� ����(privilege)
- ������
- getter/setter
- ��� �޼ҵ� 2���� - �������̵��ؼ� ���� 
*/


// �ڽ� Ŭ����
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
		System.out.println("ȸ���̸�: " + super.getName());
		System.out.println("ȸ����ȣ: " + super.getNo());
		System.out.println("ȸ������: " + super.getAge());
		*/
		super.showInfo();
		System.out.println("Ư������: " + privilege);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nƯ������: " + privilege;
	}
}
