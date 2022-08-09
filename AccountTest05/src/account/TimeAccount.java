package account;

// 정기 적금 클래스
// Account 클래스를 상속하는 자식 클래스
public class TimeAccount extends Account{
	private int timeBalance; // 정기 예금 잔고
	
	public TimeAccount(String name, String no, int balance, int timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
	
	public int getTimeBalance() { return timeBalance; }
	
	public void setTimeBalance(int timeBalance) { this.timeBalance = timeBalance; }
	
	// 출력 메소드 1번 오버라이딩
	public void showInfo() {
		super.showInfo();
		System.out.println("정기예금잔고: " + timeBalance);
	}
	
	// 출력 메소드 2번 오버라이딩
	public String toString() {
		return super.toString() + ", 정기예금잔고: " + timeBalance;
	}
}
