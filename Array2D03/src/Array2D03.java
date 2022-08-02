

/*
 * 2차원 배열 활용
 * 문제) A반 학생 5명의 국어, 영어, 수학 점수를 저장하는 2차원 배열 scores를 사용하여
 * 각 학생의 과목 점수와 총점, 평균을 출력하시오.
 * 
 * - 5행 3열의 데이터
 * - 각 행: 학생, 각 열: 과목
 * 93, 93, 92
 * 85, 85, 86
 * 71, 71, 72
 * 68, 68, 67
 * 83, 83, 82
 * 
 */

public class Array2D03 {
	public static void main(String[] args) {
		int[][] scores = {
				{ 93, 93, 92},
				{ 85, 85, 86},
				{ 71, 71, 72},
				{ 68, 68, 67},
				{ 83, 83, 82},
		};
		/*
		String[] subjects = {"국어", "영어", "수학"};
		
		for (int i=0; i<scores.length; i++) {
			int sum = 0;
			double avg = 0.0;
			System.out.println("***학생" + (i+1) + "의 점수***");
			for (int j=0; j<scores[i].length; j++) {
				System.out.print(subjects[j] + ": " +  scores[i][j] + "  ");
				sum += scores[i][j];
			}
			avg = (double)sum / scores[i].length;
			System.out.println();
			System.out.printf("총점: %d\n평균: %.2f\n\n", sum, avg);
		}
		*/
		System.out.println("번호 | 국어 | 영어 | 수학 | 총점 |  평균     |");
		System.out.println("--------------------------------");
		for (int i=0; i<scores.length; i++) {
			int sum = 0;
			double avg = 0.0;
			System.out.print((i+1) + "번 ");
			for (int j=0; j<scores[i].length; j++) {
				System.out.print("| " + scores[i][j] + " ");
				sum += scores[i][j];
			}
			avg = (double) sum / scores[i].length;
			System.out.printf("| %d | %.2f |\n", sum, avg);
//			System.out.println("| " + sum + " | " + avg + " |");
		}
	}
}
