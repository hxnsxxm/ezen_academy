
/*
 * < for�� ���� >
 * 1. �⺻ for��: �迭 �Ǵ� �÷����� �ε����� Ȱ���Ͽ� ����
 * 
 * 2. Enhanced for��(���� for��), Ȯ�� for��, for-in��, for-each��: 
 * - Ư¡: �ε����� ����. Ư�� ������ �ش��ϴ� ���� �ٷ� ���� ����.
 * - ������ ó������ ������, ���� �ٷ�� �ȴ�.
 * - �ε����� �����Ƿ�, Ư�� �ε����� �ش��ϴ� ���� ��ȭ�� �� ���� ����. 
 * 
 */

public class ForIn01 {
	public static void main(String[] args) {
		int[] a = new int[] {10, 20, 30, 40, 50};
		
		// 1�� - �⺻ for��
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 2�� - Ȯ�� for��, for-in��
		for (int i : a) {  // (1) ? : , (2) case : (3) int i : array
		// i �� ���� ����
		// a�� �����͸� ������ �� ����
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
