package animal;

public class Dog extends Animal {
	
	private String type; // ����
	
	// ������
	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	// getter
	public String getType() { return type; }
	
	// setter
	public void setType(String type) { this.type = type; }
	
	@Override
	public void bark() {
		System.out.println("�۸�");
	}
	
	@Override 
	public String toString() {
		return "�� �̸��� " + getName() + "�̰�, ������ " + type + "�Դϴ�.";
	}
	
	
}
