

/*
 * ����) A���� �л� ������ �����ϴ� scores �迭���� �ְ������� ���������� ���Ͻÿ�.
 * �ְ������� ���ϴ� �κ�, ���������� ���ϴ� �κ��� ���� �޼ҵ�� ����� �����Ͻÿ�.
 * �޼ҵ��: calcMax, calcMin
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
		
		 System.out.printf("A�� �ְ�����: %d, ��������: %d\n", maxScore, minScore);
		
	}
}
