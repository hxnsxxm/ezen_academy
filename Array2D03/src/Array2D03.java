

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
		// �л����� ���� ����, int�� 2���� �迭 ����, �ʱ�ȭ
		int[][] scores = {
				{ 93, 93, 92, 0, 1},
				{ 85, 85, 86, 0, 1},
				{ 71, 71, 72, 0, 1},
				{ 68, 68, 67, 0, 1},
				{ 83, 83, 82, 0, 1},
		};
		// �л����� ����� ����, double���� 1���� �迭 ����
		double[] avgs = new double[5];
		
		// �л����� ������ ����, char�� 1���� �迭 ����
		char[] grades = new char[5];
		
		// �л����� ������ ����, int���� 1���� �迭 ����
		// ������ 1�� �ʱ�ȭ�Ͽ� ���, ������ �̿��Ͽ� ���� ��� ***************************

		
		// ���� ��� �� ����, ��� ��� �� ����, ���� ��� �� ���� 
		for (int i=0; i<scores.length ;i++) {
			for (int j=0; j<scores[i].length-2; j++) {
				scores[i][3] += scores[i][j];    // 1. �� �л��� ����
			}
			avgs[i] = (double) scores[i][3] / 3; // 2. �� �л��� ���
			
			switch((int)avgs[i]/10) {            // 3. �� �л��� ����
			case 10: case 9: grades[i] = 'A'; break;
			case 8: grades[i] = 'B'; break;
			case 7: grades[i] = 'C'; break;
			case 6: grades[i] = 'D'; break;
			default: grades[i] = 'F'; break;
			}
		}
		
		// ���� ��� �� ���� 
		for (int i=0; i<scores.length; i++) {
			for (int j=0; j<scores.length; j++) { // 4. �� �л��� ����, i: ��, j: ����
				if (scores[i][3] < scores[j][3]) {
					++scores[i][4];
				}
			}
		}

		// ���
		System.out.println("��ȣ | ���� | ���� | ���� | ���� |  ���     |���� |���� |");
		System.out.println("------------------------------------");
		for (int i=0; i<scores.length; i++) {
			System.out.print((i+1) + "�� ");
			for (int j=0; j<scores[i].length-2; j++) {
				System.out.print("| " + scores[i][j] + " ");
			}
			System.out.printf("| %d | %.2f | %c | %d |\n", scores[i][3], avgs[i], grades[i], scores[i][4]);
		}
		
	}
}
