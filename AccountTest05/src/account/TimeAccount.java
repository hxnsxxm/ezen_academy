package account;

// ���� ���� Ŭ����
// Account Ŭ������ ����ϴ� �ڽ� Ŭ����
public class TimeAccount extends Account{
	private int timeBalance; // ���� ���� �ܰ�
	
	public TimeAccount(String name, String no, int balance, int timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	public int getTimeBalance() { return timeBalance; }
	
	public void setTimeBalance(int timeBalance) { this.timeBalance = timeBalance; }
	
	// ��� �޼ҵ� 1�� �������̵�
	public void showInfo() {
		super.showInfo();
		System.out.println("���⿹���ܰ�: " + timeBalance);
	}
	
	// ��� �޼ҵ� 2�� �������̵�
	public String toString() {
		return super.toString() + ", ���⿹���ܰ�: " + timeBalance;
	}
}
