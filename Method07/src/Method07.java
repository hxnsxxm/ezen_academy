import java.util.Scanner;

/*
 * < 메소드와 1차원 배열의 활용 >
 * 문제) A반 학생수를 입력하여 int형 배열 scores를 생성하고,
 * 총점, 평균, 최고점수, 최저점수를 구하는 프로그램을 작성하시오.
 * - 학생수를 입력하여 배열을 생성하는 부분을 메소드로 만들어 구현하시오.
 * - 각 학생의 점수를 입력하는 부분을 메소드로 만들어 구현하시오.
 * - 총점, 평균, 최고점수, 최저점수를 구하는 부분을 각각 메소드로 만들어 구현하시오.
 * - 각 학생의 정보를 출력하는 부분을 메소드로 만들어 구현하시오.
 * - 메소드명: putCount, inputScore, calcTot, calcAvg, calcMax, calcMin, outputScore 
 * 
 */

public class Method07 {

	// 1. 학생수를 입력하여 배열을 생성하는 메소드
	static int[] putCount(Scanner sc) {
		System.out.print("A반의 학생수 입력: ");
		int numStudents = sc.nextInt();
		
		int[] scores = new int[numStudents];
		
		return scores;
	}
	
	// 2. 각 학생의 점수를 입력하는 메소드
	static void inputScore(Scanner sc, int[] scores) {
		System.out.println("각 학생의 점수 입력");
		
		for (int i=0; i<scores.length; i++) {
			System.out.print((i+1) + "번째 학생의 점수 입력: ");
			scores[i] = sc.nextInt();
		}
	}
	
	// 3. 총점을 계산하는 메소드
	static int calcTot(int[] scores) {
		int totalScore = 0;
		for (int i : scores) {
			totalScore += i;
		}
		return totalScore;
	}
	
	// 4. 평균을 계산하는 메소드
//	static double calcAvg(int totalScore, int numStudents) {
	static double calcAvg(int[] scores) {
		
//		int totalScore = calcTot(scores);
		int totalScore = 0;
		for (int i : scores) {
			totalScore += i;
		}
		int numStudents = scores.length;

		double avgScore = (double) totalScore/numStudents;
		
		return avgScore;
	}
	
	// 5. 최고점수를 구하는 메소드
	static int calcMax(int[] scores) {
		int max = scores[0];
		for (int i : scores) {
			if (max < i) max = i;
		}
		return max;
	}
	
	// 6. 최저점수를 구하는 메소드
	static int calcMin(int[] scores) {
		int min = scores[0];
		for (int i : scores) {
			if (i < min) min = i;
		}
		return min;
	}
	
	// 7. 각 학생의 점수를 출력하는 메소드
	static void outputScore(int[] scores) {
		System.out.println("---------------------");
		System.out.println("A반 학생들의 점수를 출력합니다.");
		for (int i=0; i<scores.length; i++) {
			System.out.printf("%2d번째 학생의 점수: %3d\n", i+1, scores[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 학생수를 입력하여 배열을 생성하는 메소드
		int[] scores = putCount(sc);
//		int[] scores = {55, 77, 83, 92, 65, 78, 96, 88, 52, 75};		
		
		// 2. 각 학생의 점수를 입력하는 메소드
		inputScore(sc, scores);
//		int numStudents = scores.length;

		// 3. 총점을 계산하는 메소드
		int totalScore = calcTot(scores);
		// 4. 평균을 계산하는 메소드
//		double avgScore = calcAvg(totalScore, numStudents);
		double avgScore = calcAvg(scores);
		// 5. 최고점수를 구하는 메소드
		int maxScore = calcMax(scores);
		// 6. 최저점수를 구하는 메소드
		int minScore = calcMin(scores);
		// 7. 각 학생의 점수를 출력하는 메소드
		outputScore(scores);
		
		
		System.out.println("---------------------");
		System.out.printf("A반\n총점: %d\n평균: %.2f\n최고점수: %d\n최저점수: %d\n",
				totalScore, avgScore, maxScore, minScore);
		
		sc.close();
	}
}
