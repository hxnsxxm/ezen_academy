package account;


// 보통 예금 클래스
// TimeAccount 클래스의 부모 클래스
public class Account {

	// 인스턴스 변수, 비정적 필드
	private String name;
	private String no;
	private int balance;

	// 생성자
	public Account() { }
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// 멤버 메소드
	//인스턴스 메소드, 비정적 메소드
	public String getName() { return name; }
	public String getNo() {	return no; }
	public int getBalance() { return balance; }
	
	// setter - 멤버변수의 값을 설정(변경)하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 출금
	public void withdraw(int money) {
		balance -= money;
	}
	
	// 입금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출력메소드 1번
	public void showInfo() {
		System.out.println("계좌명의: " + name);
		System.out.println("계좌번호: " + no);
		System.out.println("예금잔고: " + balance);
	}
	
	// 출력메소드 2번
	public String toString() {
		return "계좌명의: " + name + ", 계좌번호: " + no + ", 잔고: " + balance;
	}
}
