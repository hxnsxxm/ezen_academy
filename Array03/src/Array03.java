
public class Array03 {
	public static void main(String[] args) {
		// 3�� ���  - �迭�� �����ϰ� �ٷ� �ʱ�ȭ
		// �迭�� �����ϰ� �ٷ� �ʱ�ȭ�� ���� new int[]�� ������ �� ����
		//int[] a = {10, 20, 30, 40, 50}; // new int[] ������
		//int[] a = new int[] {10, 20, 30, 40, 50};
		
		// 4�� ���
		// �迭�� ����� �ʱ�ȭ�� �и��� ���� �ݵ�� new int[]�� ��� ��
		int[] a;
		a = new int[] {10, 20, 30, 40, 50}; // initializer - new
		
		for (int i=0; i<a.length; i++) {
			System.out.println("a[" + i +"] = " + a[i]);
		}
	}
}

