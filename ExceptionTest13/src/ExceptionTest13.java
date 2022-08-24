
class Account {
	private String name;  // 계좌명의
	private String no;    // 계좌번호
	private int balance;  // 예금잔고
	
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	// 입금 -> 문제발생) 음수를 입력하여 입금을 하게 되는 경우
	/*
	// 1번 방법 - 논리적인 방법으로 해셩
	public void deposit(int money) {
		if (money <= 0) {
			System.out.println("입금금액은 0보다 큰 금액이어야 합니다.");
			return;
		}
		balance += money;
	}
	*/
	// 2번 방법 - 예외 처리로 해결
	public void deposit(int money) throws MinusDepositException {
		if(money <= 0) {
			throw new MinusDepositException("마이너스 입금 오류: " + money + "원은 입금할 수 없습니다.");
		}
		balance += money;
		System.out.println(name + "님 계좌에 " + money + "원이 입금되었습니다.");
	}
// ---------------------------------------------------------	
	// 출금 -> 문제발생) 예금 잔고보다 큰 금액을 출금하게 되는 경우
	/*
	// 1번 방법 - 논리적인 방법으로 해결
	public void withdraw(int money) {
		if (balance < money) {
			System.out.println("예금잔고가 부족합니다.");
			return;
		}
		balance -= money;
	}
	*/
	// 2번 방법 - 예외 처리로 해결, 예외 처리 메소드 생성
	public void withdraw(int money) throws BalanceInsuffientException {
		if(balance < money) {
			throw new BalanceInsuffientException("잔고 부족: " + (money-balance) + "원이 부족합니다.");
		}
		balance -= money;
		System.out.println(name + "계좌에서 " + money + "");
	}
	
	public String toString() {
		return "[" + no + "]" + name + " | " + balance;
	}
}

// 예외 처리 클래스 생성
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
