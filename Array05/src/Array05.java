import java.util.Scanner;

/*
 * 문제2) A반 학생수를 입력하고, 
 * 입력한 학생수 크기의 scores 배열을 생성하고,
 * 각 학생의 점수를 입력하여, 각 학생의 점수를 출력하고, A반의 총점과 평균을 계산하시오.
 * 
 * 
 */

public class Array05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 참조 변수 sc
		
		// 입력 화면 1 : 학생수 입력
		System.out.print("학생 수 입력: ");
		int numStudents = sc.nextInt();
		
		// 1차원 배열 생성
		//int[] scores = new int[numStudents];
		int[] scores; // int scores[];
		scores = new int[numStudents];  // ********* 중요
		
		int sum = 0; 
		double avg = 0.0;
		
		// 입력 화면 2 : 각 학생의 점수 입력
		for (int i=0; i<numStudents; i++) {
			System.out.print("학생" + (i+1) + "의 점수 입력: ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		avg = (double)sum / numStudents;
		
		System.out.println("\n");
		// 출력 화면 : 각 학생의 점수 출력
		for (int i=0; i<numStudents; i++) {
			System.out.println("학생" + (i+1) + "의 점수 : " + scores[i]);
		}
		System.out.printf("A반 학생들의 총점: %d\nA반 학생들의 평균: %.2f\n", sum, avg);
		
		sc.close();
	}
}
