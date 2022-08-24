
class Account {
	private String name;  // ���¸���
	private String no;    // ���¹�ȣ
	private int balance;  // �����ܰ�
	
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// �Ա� -> �����߻�) ������ �Է��Ͽ� �Ա��� �ϰ� �Ǵ� ���
	/*
	// 1�� ��� - ������ ������� �ؼ�
	public void deposit(int money) {
		if (money <= 0) {
			System.out.println("�Աݱݾ��� 0���� ū �ݾ��̾�� �մϴ�.");
			return;
		}
		balance += money;
	}
	*/
	// 2�� ��� - ���� ó���� �ذ�
	public void deposit(int money) throws MinusDepositException {
		if(money <= 0) {
			throw new MinusDepositException("���̳ʽ� �Ա� ����: " + money + "���� �Ա��� �� �����ϴ�.");
		}
		balance += money;
		System.out.println(name + "�� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
	}
// ---------------------------------------------------------	
	// ��� -> �����߻�) ���� �ܰ��� ū �ݾ��� ����ϰ� �Ǵ� ���
	/*
	// 1�� ��� - ������ ������� �ذ�
	public void withdraw(int money) {
		if (balance < money) {
			System.out.println("�����ܰ� �����մϴ�.");
			return;
		}
		balance -= money;
	}
	*/
	// 2�� ��� - ���� ó���� �ذ�, ���� ó�� �޼ҵ� ����
	public void withdraw(int money) throws BalanceInsuffientException {
		if(balance < money) {
			throw new BalanceInsuffientException("�ܰ� ����: " + (money-balance) + "���� �����մϴ�.");
		}
		balance -= money;
		System.out.println(name + "���¿��� " + money + "");
	}
	
	public String toString() {
		return "[" + no + "]" + name + " | " + balance;
	}
}

// ���� ó�� Ŭ���� ����
class MinusDepositException extends Exception {

	private static final long serialVersionUID = 1L;

	public MinusDepositException(String msg) {
		super(msg);
	}
}

class BalanceInsuffientException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public BalanceInsuffientException(String msg) {
		super(msg);
	}
}

public class ExceptionTest13 {
	public static void main(String[] args) {
		
		Account john = new Account("JOHN", "123456", 1000);
		
		
		System.out.println(john);
		
		try {
			john.withdraw(3000);
		} catch(BalanceInsuffientException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		try {
			john.deposit(-5000);
		} catch(MinusDepositException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		System.out.println(john);
		
		
	}
}
