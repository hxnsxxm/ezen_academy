package test;

import account.Account;
import account.TimeAccount;

/*
< 다형성 >
- 상속 관계에 있는 인스턴스들을 배열이나 콜렉션에 한 번에 담아서 일괄적으로 처리할 수 있는 특성
- 자식 클래스들의 인스턴스들은 부모 클래스에 포함된다.

*/

public class AccountTest05 {
	public static void main(String[] args) {
		/*// 1번 방법
		Account[] accounts = new Account[4];
		accounts[0] = new Account("우영우", "123456", 6000);
		accounts[1] = new TimeAccount("이준호", "654321", 5000, 100);
		accounts[2] = new Account("한수연", "123457", 800);
		accounts[3] = new TimeAccount("동그라미", "654322", 3000, 50);
		*/
		
		// 2번 방법
		Account[] accounts = new Account[] {
			new Account("우영우", "123456", 6000),
			new TimeAccount("이준호", "654321", 5000, 100),
			new Account("한수연", "123457", 800),
			new TimeAccount("동그라미", "654322", 3000, 50),
		};
		
		/*// 출력 1번
		for (int i=0; i<accounts.length; i++) {
			System.out.println(accounts[i]); // 정기예금잔고도 출력됨
		}
		*/
		// 출력 2번
		for (Account i : accounts) {
			System.out.println(i);
		}
		
		/*// 다형성 구현에 대한 중요한 예
		Account a1 = new Account("우영우", "123456", 6000);
		TimeAccount a2 = new TimeAccount("이준호", "654321", 5000, 100);
		
		Account a3 = new Account("한수연", "123457", 800);
		TimeAccount a4 = new TimeAccount("동그라미", "654322", 3000, 50);
		
		// ★★★★★
		Account x;
		x = a1;
		x = a2;  // 부모의 참조변수로는 자식의 인스턴스를 참조할 수 있따.
		
		TimeAccount y;
		y = a1;  // 자식의 참조변수로는 부모의 인스턴스를 참조할 수 없다.
		y = a2;
		
		System.out.println(a1);
		System.out.println(a2);
		*/
	}
}
