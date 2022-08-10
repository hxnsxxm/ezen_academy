package test;

import account.Account;
import account.TimeAccount;

/*
< ������ >
- ��� ���迡 �ִ� �ν��Ͻ����� �迭�̳� �ݷ��ǿ� �� ���� ��Ƽ� �ϰ������� ó���� �� �ִ� Ư��
- �ڽ� Ŭ�������� �ν��Ͻ����� �θ� Ŭ������ ���Եȴ�.

*/

public class AccountTest05 {
	public static void main(String[] args) {
		/*// 1�� ���
		Account[] accounts = new Account[4];
		accounts[0] = new Account("�쿵��", "123456", 6000);
		accounts[1] = new TimeAccount("����ȣ", "654321", 5000, 100);
		accounts[2] = new Account("�Ѽ���", "123457", 800);
		accounts[3] = new TimeAccount("���׶��", "654322", 3000, 50);
		*/
		
		// 2�� ���
		Account[] accounts = new Account[] {
			new Account("�쿵��", "123456", 6000),
			new TimeAccount("����ȣ", "654321", 5000, 100),
			new Account("�Ѽ���", "123457", 800),
			new TimeAccount("���׶��", "654322", 3000, 50),
		};
		
		/*// ��� 1��
		for (int i=0; i<accounts.length; i++) {
			System.out.println(accounts[i]); // ���⿹���ܰ� ��µ�
		}
		*/
		// ��� 2��
		for (Account i : accounts) {
			System.out.println(i);
		}
		
		/*// ������ ������ ���� �߿��� ��
		Account a1 = new Account("�쿵��", "123456", 6000);
		TimeAccount a2 = new TimeAccount("����ȣ", "654321", 5000, 100);
		
		Account a3 = new Account("�Ѽ���", "123457", 800);
		TimeAccount a4 = new TimeAccount("���׶��", "654322", 3000, 50);
		
		// �ڡڡڡڡ�
		Account x;
		x = a1;
		x = a2;  // �θ��� ���������δ� �ڽ��� �ν��Ͻ��� ������ �� �ֵ�.
		
		TimeAccount y;
		y = a1;  // �ڽ��� ���������δ� �θ��� �ν��Ͻ��� ������ �� ����.
		y = a2;
		
		System.out.println(a1);
		System.out.println(a2);
		*/
	}
}
