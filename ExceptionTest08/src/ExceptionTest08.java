import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		try {
			System.out.print("������: ");
			int a = sc.nextInt();
			System.out.print("������: ");
			int b = sc.nextInt();
			
			int c = a/b;
			
		} catch (InputMismatchException | ArithmeticException e) {
			//e.printStackTrace();
			System.err.println("�Է��� ���ڿ� Ÿ���� ���� �ʽ��ϴ�.");
			
		} catch(ArithmeticException e) {
			System.err.println("0���� ���� ���� �����ϴ�.");
		}
		*/
		// 
		/*
		try {
			System.out.print("������: ");
			int a = sc.nextInt();
			System.out.print("������: ");
			int b = sc.nextInt();
			
			int c = a/b;
			
		} catch (InputMismatchException e) {
			//e.printStackTrace();
			System.err.println("�Է��� ���ڿ� Ÿ���� ���� �ʽ��ϴ�.");
			
		} catch(ArithmeticException e) {
			System.err.println("0���� ���� ���� �����ϴ�.");
		}
		*/
		//
		try {
			System.out.print("������: ");
			int a = sc.nextInt();
			System.out.print("������: ");
			int b = sc.nextInt();
			
			int c = a/b;
			
		// �θ� Ŭ���� Exception
		} catch (Exception e) {
			System.err.println("�������� �� �� ���ܰ� �߻��Ͽ����ϴ�.");
		}
		
		
		sc.close();
	}
}
