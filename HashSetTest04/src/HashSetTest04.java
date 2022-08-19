import java.util.HashSet;

class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
	
	public void setName(String name) { this.name = name; }
	public void setAge(int age) { this.age = age; }
	
	public String toString() {
		return name + "(" + age + ")";
	}
	
	// - HashSet���� ����ڰ� ���� ���� Ŭ������ �ν��Ͻ� �ߺ��� ������� �ʵ��� �Ϸ���
	// Object Ŭ������ 2�� Ŭ������ �������̵� �ؾ� ��
	// 1. hashCode() �������̵�(equals() �޼ҵ尡 ��� ��)
	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}
	
	// 2. equals() �������̵�
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member)obj;
			return this.name.equals(m.name) && this.age==m.age;
		}
		return false;
	}
	
}



public class HashSetTest04 {
	public static void main(String[] args) {
		
		// �ؽü� ����
		HashSet<Member> set = new HashSet<Member>();
		
		// ������ �߰� - ������ ����.
		set.add(new Member("�쿵��", 27));
		set.add(new Member("����ȣ", 30));
		set.add(new Member("�Ѽ���", 28));
		set.add(new Member("����", 43));
		set.add(new Member("�ǹο�", 31));
		System.out.println(set);
		
		// �ߺ� ������ �߰� 1 - �̸��� ���� ��� : ���
		set.add(new Member("�ǹο�", 37));
		System.out.println(set);
		
		// �ߺ� ������ �߰� 2 - ���̸� ���� ��� : ���
		set.add(new Member("���׶��", 27));
		System.out.println(set);
		
		// �ߺ� ������ �߰� 3 - �̸��� ���̰� ��� ���� ��� : ���
		// ������ : �̸��� ���̰� ��� ���� ���� �ߺ� �������̹Ƿ� set������ ����ϸ� �ȵ�
		// �ذ�å : �¿��� ����ϴ� Ŭ������ Object Ŭ������ hashCode(), equals() �޼ҵ带 �������̵��Ͽ�
		//      ������ ���� �������ν� �ߺ� �����͸� ������� �ʵ��� ��
		set.add(new Member("�Ѽ���", 28));
		System.out.println(set);
		
		// ���� 1 - �̸��� ���� ��� -> �������� ����
		set.remove(new Member("����ȣ", 33));
		System.out.println(set);
		
		// ���� 2 - ���̸� ���� ��� -> �������� ����
		set.remove(new Member("�����", 43));
		System.out.println(set);
		
		// ���� 3 - �̸��� ���̰� ��� ���� ��� -> �������� ����
		// ������ : �̸��� ���̰� ��� ���ٸ� ������ �Ǿ�� ��
		// �ذ�å : Object Ŭ������ hashCode(), equals() �޼ҵ带 �������̵������ν� �� ������ �ذ���
		set.remove(new Member("����ȣ", 30));
		System.out.println(set);
		
	}
}
