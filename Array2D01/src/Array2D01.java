
public class Array2D01 {
	public static void main(String[] args) {
	// 1�� ��� - �� �࿡ ���� ���� ������ �������� ���� ��� ����
		/*
		int[][] a;          // int���� 2���� �迭�� �����ϴ� �������� a ����
		a = new int[3][];   // int���� 1���� �迭�� �����ϴ� �������� a[0], a[1], a[2]�� ���� -> ���� ���� 3��
		a[0] = new int[4];  // 0�� ���� ���� ���� : 4��
		a[1] = new int[4];
		a[2] = new int[4];
		// a.length : ���� ����, a[0].length : 0�� ���� ���� ����
		*/
		
	// 2�� ��� - �� �࿡ ���� ���� ������ ������ ���� ���
		int[][] a = new int[3][4];
		// 2���� �迭�� ���� ����
		a[0][1] = 10;
		a[1][2] = 20;
		a[2][3] = 30;
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
			
		}
	}
}
