
/*
 * < ���� ������ > ���� ������
 *   1. private   - �ڽ��� Ŭ���������� ���� ���� /
 *   2. default   - ���� ��Ű�������� ���� ���� / ���� �����ڸ� �������� ���� ���� 
 *   3. protected - ���� ��Ű�������� �����̰�, �ٸ� ��Ű���� ����� �޾Ҵٸ� ������ ���� / 
 *   4. public    - ��𿡼��� ���� ���� /
 * 
 * # this - ��� �ν��Ͻ� �տ� �����ϰ�, �ڽ��� �ν��Ͻ��� ��������� �����ϴ� �뵵�� ���
 */

class Account {
	// �ڡڡڡڡ�, private - �ڽ��� Ŭ���� ���� ��������� ������ �����ϴ�. �ܺ� Ŭ���������� ���� ������ �Ұ����ϴ�.
	private String name;
	private String no;
	private int balance;
	
	// �ڡڡڡڡ� �޼ҵ尡 �ƴ�
	/*
	 * ������(Constructor)
	 * < �������� Ư¡ >
	 * 1. Ŭ���� �̸��� ����.
	 * 2. ����Ÿ���� ����.
	 * 
	 * < �������� ���� >
	 * 1. Ȯ���� �ʱ�ȭ�� ���� ������ ���ش�.
	 * 
	 * < �������� ȣ�� �ñ� >
	 * 1. �ν��Ͻ��� ������ �� ȣ���Ѵ�. --> Ȯ���� �ʱ�ȭ�� ���� ������ �ȴ�.
	 * 
	 */
	
	// �⺻ ������(Default Constructor) 
	//   ��Ģ1. ��� Ŭ�������� �⺻ �����ڰ� �ִ�. �������� �ʾƵ� �����Ѵ�.
	//   ��Ģ2. �ٸ� �����ڸ� �����, �⺻ �����ڴ� �������. --> �����ڸ� �����ε��ϸ� �⺻ �����ڴ� �������.
	//   ������ �����ε�
	public Account() {
		
	}

	// ��ü�� public ����
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// main���� �ν��Ͻ��� ����� �޼ҵ带 ȣ���ϱ� ������ static Ű���尡 ���� ����
	// public - ��𿡼���, �������Գ� ������ ����
	
	// ��� �޼ҵ�
	// getter / setter �޼ҵ� ���� - �ݵ�� �����ؾ� �ϴ� ���� �ƴ϶�, �ʿ信 ���� ����� ���� �ȴ�.
	// getter - ��������� ���� ����(Ȯ��)�ϴ� �޼ҵ�, this�� �� �� ����
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public int getBalance() {
		return balance;
	}
	
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
}

public class AccountTest03 {

	public static void main(String[] args) {
		
		// ��� �ν��Ͻ��� �޸� ���� �տ� this��� ���������� ������ �ִ�.
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account jane = new Account();
	
		john.withdraw(100);
		mary.deposit(200);
		
		System.out.println("�� John�� ���� ����");
		System.out.println("    ���¸���: " + john.getName());
		System.out.println("    ���¹�ȣ: " + john.getNo());
		System.out.println("    �����ܰ�: " + john.getBalance());
		System.out.println();
		
		System.out.println("�� Mary�� ���� ����");
		System.out.println("    ���¸���: " + mary.getName());
		System.out.println("    ���¹�ȣ: " + mary.getNo());
		System.out.println("    �����ܰ�: " + mary.getBalance());
	}
}
