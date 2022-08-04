import java.util.Scanner;

/*
 * < �޼ҵ�� 1���� �迭�� Ȱ�� >
 * ����) A�� �л����� �Է��Ͽ� int�� �迭 scores�� �����ϰ�,
 * ����, ���, �ְ�����, ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * - �л����� �Է��Ͽ� �迭�� �����ϴ� �κ��� �޼ҵ�� ����� �����Ͻÿ�.
 * - �� �л��� ������ �Է��ϴ� �κ��� �޼ҵ�� ����� �����Ͻÿ�.
 * - ����, ���, �ְ�����, ���������� ���ϴ� �κ��� ���� �޼ҵ�� ����� �����Ͻÿ�.
 * - �� �л��� ������ ����ϴ� �κ��� �޼ҵ�� ����� �����Ͻÿ�.
 * - �޼ҵ��: putCount, inputScore, calcTot, calcAvg, calcMax, calcMin, outputScore 
 * 
 */

public class Method07 {

	// 1. �л����� �Է��Ͽ� �迭�� �����ϴ� �޼ҵ�
	static int[] putCount(Scanner sc) {
		System.out.print("A���� �л��� �Է�: ");
		int numStudents = sc.nextInt();
		
		int[] scores = new int[numStudents];
		
		return scores;
	}
	
	// 2. �� �л��� ������ �Է��ϴ� �޼ҵ�
	static void inputScore(Scanner sc, int[] scores) {
		System.out.println("�� �л��� ���� �Է�");
		
		for (int i=0; i<scores.length; i++) {
			System.out.print((i+1) + "��° �л��� ���� �Է�: ");
			scores[i] = sc.nextInt();
		}
	}
	
	// 3. ������ ����ϴ� �޼ҵ�
	static int calcTot(int[] scores) {
		int totalScore = 0;
		for (int i : scores) {
			totalScore += i;
		}
		return totalScore;
	}
	
	// 4. ����� ����ϴ� �޼ҵ�
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
	
	// 5. �ְ������� ���ϴ� �޼ҵ�
	static int calcMax(int[] scores) {
		int max = scores[0];
		for (int i : scores) {
			if (max < i) max = i;
		}
		return max;
	}
	
	// 6. ���������� ���ϴ� �޼ҵ�
	static int calcMin(int[] scores) {
		int min = scores[0];
		for (int i : scores) {
			if (i < min) min = i;
		}
		return min;
	}
	
	// 7. �� �л��� ������ ����ϴ� �޼ҵ�
	static void outputScore(int[] scores) {
		System.out.println("---------------------");
		System.out.println("A�� �л����� ������ ����մϴ�.");
		for (int i=0; i<scores.length; i++) {
			System.out.printf("%2d��° �л��� ����: %3d\n", i+1, scores[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. �л����� �Է��Ͽ� �迭�� �����ϴ� �޼ҵ�
		int[] scores = putCount(sc);
//		int[] scores = {55, 77, 83, 92, 65, 78, 96, 88, 52, 75};		
		
		// 2. �� �л��� ������ �Է��ϴ� �޼ҵ�
		inputScore(sc, scores);
//		int numStudents = scores.length;

		// 3. ������ ����ϴ� �޼ҵ�
		int totalScore = calcTot(scores);
		// 4. ����� ����ϴ� �޼ҵ�
//		double avgScore = calcAvg(totalScore, numStudents);
		double avgScore = calcAvg(scores);
		// 5. �ְ������� ���ϴ� �޼ҵ�
		int maxScore = calcMax(scores);
		// 6. ���������� ���ϴ� �޼ҵ�
		int minScore = calcMin(scores);
		// 7. �� �л��� ������ ����ϴ� �޼ҵ�
		outputScore(scores);
		
		
		System.out.println("---------------------");
		System.out.printf("A��\n����: %d\n���: %.2f\n�ְ�����: %d\n��������: %d\n",
				totalScore, avgScore, maxScore, minScore);
		
		sc.close();
	}
}
