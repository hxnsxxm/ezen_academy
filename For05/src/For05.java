import java.util.Scanner;

/*
����) ���� 1���� �Է��Ͽ�, �Է��� ���� ���丮�� ���Ͻÿ�.
< �Է� ȭ�� ���� >
���� �Է�: 5

< ��� ȭ�� ���� >
5! = 1 * 2 * 3 * 4 * 5 = 120

*/
public class For05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();
		
		System.out.print(n + "! = ");
		for(int i=1; i<=n; i++) {
			fact *= i;
			System.out.print(i);
			if(i < n) { // i != n * != ���� ��ȣ�� ����ϴ� ���� ���� *
				System.out.print(" * ");
			}
		}
		
		System.out.print(" = " + fact);		
		
		sc.close();
	}

}
