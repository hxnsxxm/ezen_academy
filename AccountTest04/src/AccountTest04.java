
/*
< 멤버의 구분 >
1. 멤버변수의 구분
static이 있는 멤버변수 -  클래스 변수,     static field,   정적 필드
static이 없는 멤버변수 - 인스턴스 변수, non-static field, 비정적 필드

2. 멤버메소드의 구분
static이 있는 메소드 -  클래스 메소드,     static method,   정적 메소드
static이 없는 메소드 - 인스턴스 메소드, non-static method, 비정적 메소드

클래스 변수, 클래스 메소드       - 해당 클래스를 사용하는 시점에 딱 1 개만 만들어지고, 모든 인스턴스 사이에서 공유하는 메소드  
인스턴스 변수, 인스턴스 메소드 - 인스턴스를 생성할 때마다 만들어지는 변수, 메소드

3. Static 메소드의 접근 방법
클래스명.클래스메소드명, 

+ 추가
정적 메소드는 정적 변수에만 접근할 수 있지만, 비정적 메소드는 정적/비정적 변수에 모두 접근할 수 있다.
한 번만 만들어진다. 공유한다.

*/

// 문제) 인스턴스를 생성할 때 멤버변수 id에 자동으로 1씩 증가하는 번호를 추가하도록 하고, id를 출력하시오.

class Account {
	// 클래스 변수, 정적 필드
	private static int count = 0;
	// 인스턴스 변수, 비정적 필드
	private int id;  // 계좌의 일련번호(발급순서)
	private String name;
	private String no;
	private int balance;

	// 생성자
	public Account(String name, String no, int balance) {
		
		this.id = ++count;
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// 멤버 메소드
	// 클래스 메소드, 정적 메소드
	public static int getCount() { return count; }
	
	//인스턴스 메소드, 비정적 메소드
	public int getId() { return id; }
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
}

public class AccountTest04 {
	public static void main(String[] args) {
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account tomy = new Account("Tomy", "098776", 2000);
		
		System.out.println("◆ John의 계좌 ◆");
		System.out.println("    일련번호 : " + john.getId());
		System.out.println("    계좌명의 : " + john.getName());
		System.out.println("    계좌번호 : " + john.getNo());
		System.out.println("    예금잔고 : " + john.getBalance());
		System.out.println();
		
		System.out.println("◆ Mary의 계좌 ◆");
		System.out.println("    일련번호 : " + mary.getId());
		System.out.println("    계좌명의 : " + mary.getName());
		System.out.println("    계좌번호 : " + mary.getNo());
		System.out.println("    예금잔고 : " + mary.getBalance());
		System.out.println();
		
		System.out.println("◆ Tomy의 계좌 ◆");
		System.out.println("    일련번호 : " + tomy.getId());
		System.out.println("    계좌명의 : " + tomy.getName());
		System.out.println("    계좌번호 : " + tomy.getNo());
		System.out.println("    예금잔고 : " + tomy.getBalance());
		System.out.println();
		
		// System.out.println("지금까지 생성한 일련번호: " + tomy.getCount());
		System.out.println("지금까지 생성한 일련번호: " + Account.getCount());  // in static way
		
	}
}
