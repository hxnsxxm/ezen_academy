
public class Sort02 {
	public static void main(String[] args) {
		int[] a = {50, 70, 20, 10, 30, 55, 88, 44, 33, 77};
		
		System.out.print("���� ���� ��: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		// ���� ����(Bubble Sort)
		for (int i=0; i<a.length-1; i++) {
			boolean flag = false;
			for (int j=0; j<a.length-1-i; j++) {
				if (a[j] > a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
					flag = true;
				}
			}
			// flag ��� : ��ȭ�� ������ �� ��ȭ�� �����Ͽ� �׿� �´� ����� �ϴ� ���
			if(!flag) {  // flag == false
				break;
			}
			
			System.out.print("\n" + (i+1) + "�� ȸ�� �� : ");
			for (int j=0; j<a.length; j++) {
				System.out.print(a[j] + " ");
			}
		}
		
		System.out.println();
		System.out.print("���� ���� ��: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		
	}
}
