import java.util.Scanner;


/*
 * 2���� �ݺ��� Ȱ�� - �Ҽ� �Ǻ�
 * �Ҽ�(Prime Number) - 1�� �ڽ����θ� ������ �������� ��
 * ����) ���� 1���� �Է��Ͽ�, 
 * �Է��� ���� ���������� ��� �Ҽ��� ����ϰ�, �Ҽ��� ������ �հ踦 ���Ͻÿ�.
 * 
 * < �Է� ȭ�� ���� >
 * ���� ���� �Է�: 10
 * 
 * < ��� ȭ�� ���� >
 * 2 3 5 7
 * 2���� 10���� ������ �Ҽ� ����: 4
 * 2���� 10���� ������ �Ҽ� �հ�: 17
 * 
 */
public class For2D08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��� ���� ���� ���� �Ҽ��� ���մϴ�.");
		System.out.print("���� ���� �Է�: ");
		int n = sc.nextInt();
		
		int cnt = 0;
		int sum = 0;
		/*
		for (int i=2; i<=n; i++) {
			int count = 0;
			
			for (int j=1; j<=i/2; j++) {
				if(i%j==0) count++;
			}
			
			if(count==1) {
				System.out.print(i + " ");
				sum += i;
				cnt++;
			}
		}
		*/
		
		for (int i=2; i<=n; i++) {
			for (int j=2; j<=i; j++) {
				if (i==j) {     // break ���� ���ؼ� ���������� �ʰ�, ������ �Դٸ�, �� ���� �Ҽ�
					System.out.print(i + " ");
					++cnt;
					sum += i;
				}
				
				if (i%j == 0) { // �ڽ��� �Ǳ� ���� ������ �������� �Ҽ��� �ƴ�
					break;
				}
			}
		}
		
		System.out.println();
		System.out.printf("2���� %d���� ������ �Ҽ� ����: %d\n", n, cnt);
		System.out.printf("2���� %d���� ������ �Ҽ� �հ�: %d\n", n, sum);
		
		
		sc.close();
		
	}
}
