import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		try {
			System.out.print("나뉨수: ");
			int a = sc.nextInt();
			System.out.print("나눗수: ");
			int b = sc.nextInt();
			
			int c = a/b;
			
		} catch (InputMismatchException | ArithmeticException e) {
			//e.printStackTrace();
			System.err.println("입력한 숫자에 타입이 맞지 않습니다.");
			
		} catch(ArithmeticException e) {
			System.err.println("0으로 나눌 수는 없습니다.");
		}
		*/
		// 
		/*
		try {
			System.out.print("나뉨수: ");
			int a = sc.nextInt();
			System.out.print("나눗수: ");
			int b = sc.nextInt();
			
			int c = a/b;
			
		} catch (InputMismatchException e) {
			//e.printStackTrace();
			System.err.println("입력한 숫자에 타입이 맞지 않습니다.");
			
		} catch(ArithmeticException e) {
			System.err.println("0으로 나눌 수는 없습니다.");
		}
		*/
		//
		try {
			System.out.print("나뉨수: ");
			int a = sc.nextInt();
			System.out.print("나눗수: ");
			int b = sc.nextInt();
			
			int c = a/b;
			
		// 부모 클래스 Exception
		} catch (Exception e) {
			System.err.println("나눗셈을 할 때 예외가 발생하였습니다.");
		}
		
		
		sc.close();
	}
}
