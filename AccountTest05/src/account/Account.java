package account;


// ���� ���� Ŭ����
// TimeAccount Ŭ������ �θ� Ŭ����
public class Account {

	// �ν��Ͻ� ����, ������ �ʵ�
	private String name;
	private String no;
	private int balance;

	// ������
	public Account() { }
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// ��� �޼ҵ�
	//�ν��Ͻ� �޼ҵ�, ������ �޼ҵ�
	public String getName() { return name; }
	public String getNo() {	return no; }
	public int getBalance() { return balance; }
	
	// setter - ��������� ���� ����(����)�ϴ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// ���
	public void withdraw(int money) {
		balance -= money;
	}
	
	// �Ա�
	public void deposit(int money) {
		balance += money;
	}
	
	// ��¸޼ҵ� 1��
	public void showInfo() {
		System.out.println("���¸���: " + name);
		System.out.println("���¹�ȣ: " + no);
		System.out.println("�����ܰ�: " + balance);
	}
	
	// ��¸޼ҵ� 2��
	public String toString() {
		return "���¸���: " + name + ", ���¹�ȣ: " + no + ", �ܰ�: " + balance;
	}
}
