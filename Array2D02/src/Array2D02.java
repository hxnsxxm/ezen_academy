
public class Array2D02 {
	public static void main(String[] args) {
		
	// 3�� ��� - 2���� �迭�� �����ϰ�, �ٷ� �ʱ�ȭ
		// 2���� �迭�� �����ϰ�, �ٷ� �ʱ�ȭ�� �� ���� new int[][]�� ������ �� ����
		int[][] a = {    // int[][] a = new int[][] { ����
				{10, 20, 30, 40},    // 0�� ��
				{50, 60, 70, 80},    // 1�� ��
				{90, 100, 110, 120}, // 2�� ��
		};
		
		
	// 4�� ���
		// 2���� �迭�� ���� ���� ����� �ʱ�ȭ�� �и��� ���� �ݵ�� new int[][]�� ��� ��
		/*
		int[][] a;
		a = new int[][] {
				{10, 20, 30, 40},    // 0�� ��
				{50, 60, 70, 80},    // 1�� ��
				{90, 100, 110, 120}, // 2�� ��
		};
		*/
		
		// 2���� �迭�� ���
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}
}