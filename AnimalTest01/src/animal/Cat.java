package animal;

// Animal Ŭ�����κ��� ��� �޴� �ڽ� Ŭ����
public class Cat extends Animal {
	
	private int age;
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	// getter
	public int getAge() { return age; }
	
	// setter
	public void setAge(int age) { this.age = age; }
	
	@Override
	public void bark() {
		System.out.println("�߿�***");
	}
	
	@Override
	public String toString() {
		return "�� �̸��� " + getName() + "�̰�, ���̴� " + age + "�� �Դϴ�.";
	}
	
	
}
