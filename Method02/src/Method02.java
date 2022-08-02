import java.util.Scanner;

/*
 * 문제) 원의 반지름을 입력하여 원의 면적과 원의 둘레를 구하시오.
 * 원의 면적과 원의 둘레는 메소그를 만들어 사용하시오.
 */

public class Method02 {

	// 원의 면적을 구하는 메소드
	static double calcArea(double r) {
		double area = Math.PI * r * r;
		return area;
	}
	
	// 원의 둘레를 구하는 메소드
	static double calcPerimeter(double r) {
		double peri = 2 * Math.PI * r;
		return peri;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름 입력: ");
		double r = sc.nextDouble();
		
		double area = calcArea(r);
		double peri = calcPerimeter(r);
		
		System.out.printf("반지름이 %.2f인 원의 면적: %.2f, 둘레: %.2f\n", r, area, peri);
		
		sc.close();
	}
}
