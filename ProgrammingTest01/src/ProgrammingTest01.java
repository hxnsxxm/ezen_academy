import java.util.Scanner;

public class ProgrammingTest01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �Է�: ");
		int row = sc.nextInt();
		System.out.print("���� �Է�: ");
		int col = sc.nextInt();
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<row-i-1; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
