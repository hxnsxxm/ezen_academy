import java.util.Scanner;

/*
 * 2���� �ݺ��� Ȱ�� - ������ �Ǻ�
 * ������(Perfect Number) - �ڽ��� ������ ������� �հ� �ڽ��� �������� ��
 * ����) ���� 1���� �Է��Ͽ�,
 * �Է��� ���� �������� ��� �������� ����ϰ�, �������� ������ �հ踦 ���Ͻÿ�.
 * 
 * < �Է� ȭ�� ���� >
 * ���� ���� �Է�: 10000
 * 
 * < ��� ȭ�� ���� >
 * 6 28 496 8128
 * 2���� 10000���� ������ ������ ����: 4
 * 2���� 10000���� ������ ������ �հ�: 8658
 * 
 */

public class For2D09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��� ���� ���� �ȿ� �ִ� �������� ����մϴ�.");
		System.out.print("���� ���� �Է�: ");
		int n = sc.nextInt();
		
		int sum = 0, cnt = 0;
		for (int i=2; i<=n; i++) {
			int tsum = 0;
			for (int j=1; j<=i/2; j++) {
				if (i%j == 0) {
					tsum += j;
				}
			}
			
			if(tsum == i) {
				System.out.print(i + " ");
				++cnt;
				sum += i;
			}
		}
		
		System.out.println();
		System.out.printf("2���� %d���� ������ ������ ����: %d\n", n, cnt);
		System.out.printf("2���� %d���� ������ ������ �հ�: %d\n", n, sum);
		
		sc.close();
	}
}
