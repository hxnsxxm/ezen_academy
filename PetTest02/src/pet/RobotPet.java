package pet;

// �κ� �ֿϵ��� Ŭ����
// Pet ���κ��� ��ӹ޴� �ڽ� Ŭ����
public class RobotPet extends Pet {
	
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	/*
	Override
	�θ� Ŭ������ �޼ҵ�� ������ �����ؾ� �Ѵ�. 
	- ���ϰ�, �̸�, �Ű������� ����, �ڷ���
	���� �����ڴ� �θ� Ŭ������ �޼ҵ�� �����ϰų�, ��ȭ�Ǿ�� �Ѵ�.
	 
	�ֳ����̼�(Annotation)
	1. �޼ҵ� ��(��)��  @��ȣ�� �ٿ��� ���� �δ� ��
	2. �����Ϸ��� �˸��� ���ּ�
	
	@Override
	1. �Ʒ��� �޼ҵ尡 �������̵��� �޼ҵ��� ���� �˷��ִ� �ֳ����̼�
	2. �������̵��� �߸� �ϴ� ��츦 ������ �� �ִ� ���
	
	*/
	@Override
	public void introduce() {
		System.out.println("�� ���� �κ��Դϴ�. �̸��� " + getName() + "�Դϴ�.");
		System.out.println("�� ���δ��� " + getMasterName() + "�Դϴ�.");
	}
	
	public void work(int w) {
		switch (w) {
		case 1:
			System.out.println("û�Ҹ� �մϴ�.");
			break;
		case 2:
			System.out.println("������ �մϴ�");
			break;
		case 3:
			System.out.println("���� �����ϴ�.");
			break;
			
		}
	}
	
}
