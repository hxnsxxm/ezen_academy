

/*
 * 2���� �迭 Ȱ��
 * ����) A�� �л� 5���� ����, ����, ���� ������ �����ϴ� 2���� �迭 scores�� ����Ͽ�
 * �� �л��� ���� ������ ����, ����� ����Ͻÿ�.
 * 
 * - 5�� 3���� ������
 * - �� ��: �л�, �� ��: ����
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
		String[] subjects = {"����", "����", "����"};
		
		for (int i=0; i<scores.length; i++) {
			int sum = 0;
			double avg = 0.0;
			System.out.println("***�л�" + (i+1) + "�� ����***");
			for (int j=0; j<scores[i].length; j++) {
				System.out.print(subjects[j] + ": " +  scores[i][j] + "  ");
				sum += scores[i][j];
			}
			avg = (double)sum / scores[i].length;
			System.out.println();
			System.out.printf("����: %d\n���: %.2f\n\n", sum, avg);
		}
		*/
		System.out.println("��ȣ | ���� | ���� | ���� | ���� |  ���     |");
		System.out.println("--------------------------------");
		for (int i=0; i<scores.length; i++) {
			int sum = 0;
			double avg = 0.0;
			System.out.print((i+1) + "�� ");
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
