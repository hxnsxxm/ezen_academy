import java.util.StringTokenizer;

// 문제) 학생들의 점수가 들어있는 str 문자열을 사용하여 학생들의 총점, 평균, 최고점수, 최저점수를 구하시오.
public class WrapperTest02 {
	
	static int maxScore(int[] a) {
		int max = a[0];
		for (int i=1; i<a.length; i++) {
			if (max < a[i]) max = a[i];
		}
		return max;
	}
	
	static int minScore(int[] a) {
		int min = a[0];
		for (int i=1; i<a.length; i++) {
			if (min > a[i]) min = a[i];
		}
		return min;
	}
	
	static int sumScore(int[] a) {
		int sum = 0;
		for (int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static double avgScore(int[] a) {
		double avg = 0.0;
		double sum = sumScore(a);
		avg = (double)sum/a.length;
		return avg;
	}
	
	public static void main(String[] args) {
		
		String str = "85,88,72,91,56,73,66,87,68,95";
		
		int sum = 0, max = 0, min = 100;
		double avg = 0.0;
		
		// 1번 방법 - String의 split() 메소드 사용
		
		String[] s = str.split(",");
		
		int[] scores = new int[s.length];
		for (int i=0; i<s.length; i++) {
			scores[i] = Integer.parseInt(s[i]);
		}
		/*
		sum = sumScore(scores);
		max = maxScore(scores);
		min = minScore(scores);
		avg = avgScore(scores);
		*/
		
		// 2번 방법 - StringTokenizer 클래스 사용
		StringTokenizer st = new StringTokenizer(str, ",");
		int count = st.countTokens();
		
		while (st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			sum += n;
			if (max < n) max = n;
			if (min > n) min = n;
		}
		avg = (double)sum / count;
		
		
		System.out.println("--- 학생들의 점수");
		System.out.println("최고점수: " + max);
		System.out.println("최저점수: " + min);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		
	}
}
