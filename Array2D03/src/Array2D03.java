

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
		// 학생들의 점수 저장, int형 2차원 배열 선언, 초기화
		int[][] scores = {
				{ 93, 93, 92, 0, 1},
				{ 85, 85, 86, 0, 1},
				{ 71, 71, 72, 0, 1},
				{ 68, 68, 67, 0, 1},
				{ 83, 83, 82, 0, 1},
		};
		// 학생들의 평균을 저장, double형의 1차원 배열 선언
		double[] avgs = new double[5];
		
		// 학생들의 학점을 저장, char형 1차원 배열 선언
		char[] grades = new char[5];
		
		// 학생들의 석차를 저장, int형의 1차원 배열 선언
		// 석차는 1로 초기화하여 사용, 총점을 이용하여 석차 계산 ***************************

		
		// 총점 계산 및 저장, 평균 계산 및 저장, 학점 계산 및 저장 
		for (int i=0; i<scores.length ;i++) {
			for (int j=0; j<scores[i].length-2; j++) {
				scores[i][3] += scores[i][j];    // 1. 각 학생의 총점
			}
			avgs[i] = (double) scores[i][3] / 3; // 2. 각 학생의 평균
			
			switch((int)avgs[i]/10) {            // 3. 각 학생의 학점
			case 10: case 9: grades[i] = 'A'; break;
			case 8: grades[i] = 'B'; break;
			case 7: grades[i] = 'C'; break;
			case 6: grades[i] = 'D'; break;
			default: grades[i] = 'F'; break;
			}
		}
		
		// 석차 계산 및 저장 
		for (int i=0; i<scores.length; i++) {
			for (int j=0; j<scores.length; j++) { // 4. 각 학생의 석차, i: 나, j: 상대방
				if (scores[i][3] < scores[j][3]) {
					++scores[i][4];
				}
			}
		}

		// 출력
		System.out.println("번호 | 국어 | 영어 | 수학 | 총점 |  평균     |학점 |석차 |");
		System.out.println("------------------------------------");
		for (int i=0; i<scores.length; i++) {
			System.out.print((i+1) + "번 ");
			for (int j=0; j<scores[i].length-2; j++) {
				System.out.print("| " + scores[i][j] + " ");
			}
			System.out.printf("| %d | %.2f | %c | %d |\n", scores[i][3], avgs[i], grades[i], scores[i][4]);
		}
		
	}
}
