
/*
 * 1차원 배열 활용
 * 문제1) A반 5명의 학생 점수 85, 93, 71, 63, 82을 저장하는 int형의 1차원 배열 scores를 생성하고,
 * 각 학생의 점수를 출력하고, 총점과 평균을 계산하시오.
 * 
 */

public class Array04 {
	public static void main(String[] args) {
		
		int[] scores = {85, 93, 71, 63, 82};
	
//		int[] scores; scores = new int[] {85, 93, 71, 63, 82};
	
//		int[] scores; scores = new int[5];		
//		int[] scores = new int[5]; 
		
//		scores[0]=85; scores[1]=93; scores[2]=71; scores[3]=63; scores[4]=82;
		
		int sum = 0;
		double avg = 0.0;
		
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
			System.out.println("학생 " + (i+1) + "의 점수: " + scores[i]);
		}
		avg = (double)sum/scores.length;
		
		System.out.printf("A반 학생들의 총점: %d\nA반 학생들의 평균: %.2f\n", sum, avg);
		
	}
}
