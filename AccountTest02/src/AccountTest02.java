
/*
 * null - ���������� �ƹ����� �����ϰ� ���� �ʴ� ����, null ����
 * . (����) ������ - ��� ����(access) ������, Ŭ���� ��������� ����� �� �ֵ��� �ϴ� ������
 * 
 * < Ŭ������ ������ �ʾ��� ���� ������ �߿��� �ذ�� �� >
 * 1. ������ ������ ������, �ּ����� �� �� �ִ�                                             --> �ذ���
 * 2. �� ����� ���¶�� �ϳ��� ��� ó���� �� �־�� �ϳ�, �׷��� �ʴ�        --> �ذ���
 * 3. �ƹ��� ������ ���� ���, �Ա��� �� �� �ְ�, ���������� ������ �� �ִ�    --> �ذ����� ���� 
 * 
 * < ���� ���� �ִ� ������>
 * ������ 1 - Ȯ���� �ʱ�ȭ�� ���� ������ ���� �ʰ� �ִ�. ���� ���¶�� �ݵ�� �ʱ�ȭ�� �Ǿ�� �Ѵ�.
 * ������ 2- �ƹ��� ������ ���� ���������� ������ ���ִ�.
 * 
 */
// ���� ���� Ŭ���� - ���¸���, ���¹�ȣ, �����ܰ�
class Account {
	
	// Account Ŭ������ �������
	String name;
	String no;
	int balance;
	
	// �⺻ ������(Default Constructor) 
	//   ��Ģ1. ��� Ŭ�������� �⺻ �����ڰ� �ִ�. �������� �ʾƵ� �����Ѵ�.
	//   ��Ģ2. �ٸ� �����ڸ� �����, �⺻ �����ڴ� �������.
	Account() {
		
	}
	
}

public class AccountTest02 {
	public static void main(String[] args) {
		
		// 1�� ���
		Account john = new Account();   // �ν��Ͻ�, instance, ��ü
		
		// 2�� ���
		Account mary;           // Account Ŭ�������� ��������
		mary = new Account();   // Account Ŭ������ ��ü�� �����ǰ�, �̸� �������� mary�� �����ϰ� ��
		
		// �ʱ�ȭ
		// . (����) : ��� ���� ������
		john.name = "John";
		john.no = "123456";
		john.balance = 1000;
		
		mary.name = "Mary";
		mary.no = "654321";
		mary.balance = 500;
		
		System.out.println("�� John�� ���� ����");
		System.out.println("    ���¸���: " + john.name);
		System.out.println("    ���¹�ȣ: " + john.no);
		System.out.println("    �����ܰ�: " + john.balance);
		System.out.println();
		
		System.out.println("�� Mary�� ���� ����");
		System.out.println("    ���¸���: " + mary.name);
		System.out.println("    ���¹�ȣ: " + mary.no);
		System.out.println("    �����ܰ�: " + mary.balance);
		
		
	}
	
}
