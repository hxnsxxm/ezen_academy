package pet;

// �ֿϵ��� Ŭ����
// �θ� Ŭ����
public class Pet {
	private String name;
	private String masterName;
	
	// ������
	public Pet() { }
	
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	// ��� �޼ҵ�
	// getter
	public String getName() { return name; }
	public String getMasterName() { return masterName; }
	
	// setter
	public void setName(String name) { this.name = name; }
	public void setMasterName(String masterName) { this.masterName = masterName; }
	
	// ���
	public void introduce() {
		System.out.println("�� �� �̸��� " + name + "�Դϴ�.");
		System.out.println("�� ���δ��� �̸��� " + masterName + "�Դϴ�.");
	}
}
