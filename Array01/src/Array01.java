import java.util.Scanner;


/*
 * 문제) A반의 학생 5명의 점수를 입력하여, 
 * 총점과 평균을 구하는 프로그램을 작성하시오.
 * 
 * - 이 프로그램의 문제점 -> 각 학생의 점수를 따로 입력하여 각각 계산하고, 각각 출력하고 있다.
 * -> 해결책: 각 학생의 점수를 배열로 만들어 처리해야 함
 * 
 */


public class Array01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번 학생 점수 입력: ");
		int s1 = sc.nextInt();
		
		System.out.print("2번 학생 점수 입력: ");
		int s2 = sc.nextInt();
		
		System.out.print("3번 학생 점수 입력: ");
		int s3 = sc.nextInt();
		
		System.out.print("4번 학생 점수 입력: ");
		int s4 = sc.nextInt();
		
		System.out.print("5번 학생 점수 입력: ");
		int s5 = sc.nextInt();
		
		int sum = s1 + s2 + s3 + s4 + s5;
		double avg = sum / 5.;
		
		System.out.println("1번 학생 점수: " + s1);
		System.out.println("2번 학생 점수: " + s2);
		System.out.println("3번 학생 점수: " + s3);
		System.out.println("4번 학생 점수: " + s4);
		System.out.println("5번 학생 점수: " + s5);
		
		System.out.printf("총점: %d\n평균: %.2f\n", sum, avg);
		
		
		
		
		sc.close();

	}

}
