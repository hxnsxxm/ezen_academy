
/*
 * 1���� �迭 Ȱ��
 * ����1) A�� 5���� �л� ���� 85, 93, 71, 63, 82�� �����ϴ� int���� 1���� �迭 scores�� �����ϰ�,
 * �� �л��� ������ ����ϰ�, ������ ����� ����Ͻÿ�.
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
			System.out.println("�л� " + (i+1) + "�� ����: " + scores[i]);
		}
		avg = (double)sum/scores.length;
		
		System.out.printf("A�� �л����� ����: %d\nA�� �л����� ���: %.2f\n", sum, avg);
		
	}
}
