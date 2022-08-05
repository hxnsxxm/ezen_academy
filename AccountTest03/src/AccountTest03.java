
/*
 * < 접근 제한자 > 접근 한정자
 *   1. private   - 자신의 클래스에서만 접근 가능 /
 *   2. default   - 같은 패키지에서만 접근 가능 / 접근 제한자를 기입하지 않은 상태 
 *   3. protected - 같은 패키지에서는 물론이고, 다른 패키지라도 상속을 받았다면 접근이 가능 / 
 *   4. public    - 어디에서라도 접근 가능 /
 * 
 * # this - 모든 인스턴스 앞에 존재하고, 자신의 인스턴스의 멤버변수를 참조하는 용도로 사용
 */

class Account {
	// ★★★★★, private - 자신의 클래스 내의 멤버에서만 접근이 가능하다. 외부 클래스에서는 직접 접근이 불가능하다.
	private String name;
	private String no;
	private int balance;
	
	// ★★★★★ 메소드가 아님
	/*
	 * 생성자(Constructor)
	 * < 생성자의 특징 >
	 * 1. 클래스 이름과 같다.
	 * 2. 리턴타입이 없다.
	 * 
	 * < 생성자의 역할 >
	 * 1. 확실한 초기화에 대한 보장을 해준다.
	 * 
	 * < 생성자의 호출 시기 >
	 * 1. 인스턴스를 생성할 때 호출한다. --> 확실한 초기화에 대한 보장이 된다.
	 * 
	 */
	
	// 기본 생성자(Default Constructor) 
	//   규칙1. 모든 클래스에서 기본 생성자가 있다. 기입하지 않아도 존재한다.
	//   규칙2. 다른 생성자를 만들면, 기본 생성자는 사라진다. --> 생성자를 오버로딩하면 기본 생성자는 사라진다.
	//   생성자 오버로딩
	public Account() {
		
	}

	// 대체로 public 붙임
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// main에서 인스턴스를 만들어 메소드를 호출하기 때문에 static 키워드가 붙지 않음
	// public - 어디에서나, 누구에게나 접근이 가능
	
	// 멤버 메소드
	// getter / setter 메소드 생성 - 반드시 생성해야 하는 것이 아니라, 필요에 따라 만들어 쓰면 된다.
	// getter - 멤버변수의 값을 리턴(확인)하는 메소드, this를 잘 안 붙임
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public int getBalance() {
		return balance;
	}
	
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

public class AccountTest03 {

	public static void main(String[] args) {
		
		// 모든 인스턴스는 메모리 공간 앞에 this라는 참조변수를 가지고 있다.
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account jane = new Account();
	
		john.withdraw(100);
		mary.deposit(200);
		
		System.out.println("● John의 은행 계좌");
		System.out.println("    계좌명의: " + john.getName());
		System.out.println("    계좌번호: " + john.getNo());
		System.out.println("    예금잔고: " + john.getBalance());
		System.out.println();
		
		System.out.println("● Mary의 은행 계좌");
		System.out.println("    계좌명의: " + mary.getName());
		System.out.println("    계좌번호: " + mary.getNo());
		System.out.println("    예금잔고: " + mary.getBalance());
	}
}
