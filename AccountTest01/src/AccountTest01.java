

/*
 * < Ŭ������ ������� �ʾ��� ���� �������� �ľ��ϱ� ���� ���� >
 * - ���� ���� Ŭ���� - ���¸���, ���¹�ȣ, �����ܰ� 
 * 
 * < ������ >
 * 1. ������ ������ ������, �ּ����� �� �� �ִ�
 * 2. �� ����� ���¶�� �ϳ��� ��� ó���� �� �־�� �ϳ�, �׷��� �ʴ�
 * 3. �ƹ��� ������ ���� ���, �Ա��� �� �� �ְ�, ���������� ������ �� �ִ�
 * 
 */

public class AccountTest01 {

	
	
	public static void main(String[] args) {
		
		// john�� ���� ����
		String johnAccountName = "John";     // john ���¸���
		String johnAccountNumber = "123456"; // john ���¹�ȣ
		int johnAccountBalance = 1000;       // john �����ܰ�
		
		// mary�� ���� ����
		String maryAccountName = "mary";     // mary ���¸���
		String maryAccountNumber = "654321"; // mary ���¹�ȣ
		int maryAccountBalance = 500;        // mary �����ܰ�
	
		johnAccountBalance -= 200;  // ���
		maryAccountBalance += 100;  // �Ա�
		
		System.out.println("�� John�� ���� ����");
		System.out.println("    ���¸���: " + johnAccountName);
		System.out.println("    ���¹�ȣ: " + johnAccountNumber);
		System.out.println("    �����ܰ�: " + johnAccountBalance);
		System.out.println();
		
		System.out.println("�� Mary�� ���� ����");
		System.out.println("    ���¸���: " + maryAccountName);
		System.out.println("    ���¹�ȣ: " + maryAccountNumber);
		System.out.println("    �����ܰ�: " + maryAccountBalance);
		
	}
	
}