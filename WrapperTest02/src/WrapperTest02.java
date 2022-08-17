import java.util.StringTokenizer;

// ����) �л����� ������ ����ִ� str ���ڿ��� ����Ͽ� �л����� ����, ���, �ְ�����, ���������� ���Ͻÿ�.
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
		
		// 1�� ��� - String�� split() �޼ҵ� ���
		
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
		
		// 2�� ��� - StringTokenizer Ŭ���� ���
		StringTokenizer st = new StringTokenizer(str, ",");
		int count = st.countTokens();
		
		while (st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			sum += n;
			if (max < n) max = n;
			if (min > n) min = n;
		}
		avg = (double)sum / count;
		
		
		System.out.println("--- �л����� ����");
		System.out.println("�ְ�����: " + max);
		System.out.println("��������: " + min);
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
		
		
	}
}
