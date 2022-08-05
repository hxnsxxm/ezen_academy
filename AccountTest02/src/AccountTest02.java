
/*
 * null - 참조변수가 아무곳도 참조하고 있지 않는 상태, null 참조
 * . (온점) 연산자 - 멤버 접근(access) 연산자, 클래스 멤버변수를 사용할 수 있도록 하는 연산자
 * 
 * < 클래스로 만들지 않았을 때의 문제점 중에서 해결된 것 >
 * 1. 계좌의 정보를 변수명, 주석으로 알 수 있다                                             --> 해결함
 * 2. 한 사람의 계좌라면 하나로 묶어서 처리할 수 있어야 하나, 그렇지 않다        --> 해결함
 * 3. 아무나 변수를 통해 출금, 입금을 할 수 있고, 계좌정보를 변경할 수 있다    --> 해결하지 못함 
 * 
 * < 아직 남아 있는 문제점>
 * 문제점 1 - 확실한 초기화에 대한 보장이 되지 않고 있다. 은행 계좌라면 반드시 초기화가 되어야 한다.
 * 문제점 2- 아무나 변수를 통해 계좌정보를 변경할 수있다.
 * 
 */
// 은행 계좌 클래스 - 계좌명의, 계좌번호, 예금잔고
class Account {
	
	// Account 클래스의 멤버변수
	String name;
	String no;
	int balance;
	
	// 기본 생성자(Default Constructor) 
	//   규칙1. 모든 클래스에서 기본 생성자가 있다. 기입하지 않아도 존재한다.
	//   규칙2. 다른 생성자를 만들면, 기본 생성자는 사라진다.
	Account() {
		
	}
	
}

public class AccountTest02 {
	public static void main(String[] args) {
		
		// 1번 방법
		Account john = new Account();   // 인스턴스, instance, 실체
		
		// 2번 방법
		Account mary;           // Account 클래스형의 참조변수
		mary = new Account();   // Account 클래스의 실체가 생성되고, 이를 참조변수 mary가 참조하게 됨
		
		// 초기화
		// . (온점) : 멤버 접근 연산자
		john.name = "John";
		john.no = "123456";
		john.balance = 1000;
		
		mary.name = "Mary";
		mary.no = "654321";
		mary.balance = 500;
		
		System.out.println("● John의 은행 계좌");
		System.out.println("    계좌명의: " + john.name);
		System.out.println("    계좌번호: " + john.no);
		System.out.println("    예금잔고: " + john.balance);
		System.out.println();
		
		System.out.println("● Mary의 은행 계좌");
		System.out.println("    계좌명의: " + mary.name);
		System.out.println("    계좌번호: " + mary.no);
		System.out.println("    예금잔고: " + mary.balance);
		
		
	}
	
}
