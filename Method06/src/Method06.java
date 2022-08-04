

/*
 * 문제) A반의 학생 점수를 저장하는 scores 배열에서 최고점수와 최저점수를 구하시오.
 * 최고점수를 구하는 부분, 최저점수를 구하는 부분을 각각 메소드로 만들어 구현하시오.
 * 메소드명: calcMax, calcMin
 */

public class Method06 {
	
	static int calcMax(int[] scores) {
		int max = scores[0];
		
		for (int i : scores) {
			if (max < i) max = i;
		}
		
		return max;
	}
	
	static int calcMin(int[] scores) {
		int min = scores[0];
		
		for (int i : scores) {
			if (i < min) min = i;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		int[] scores = new int[] {55, 77, 83, 92, 65, 78, 96, 88, 52, 75};
		
		int maxScore = calcMax(scores);
		int minScore = calcMin(scores);
		
		 System.out.printf("A반 최고점수: %d, 최저점수: %d\n", maxScore, minScore);
		
	}
}
