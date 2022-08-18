import java.util.ArrayList;
import java.util.Collections;

/*
< ArrayList >
1. Vector Ŭ������ ��� �� ������ ���� ������
2. Vector���� �������� ����ȭ ����� �־ ������ ���ϰ� �߻���
--> ArrayList������ �������� ����ȭ ����� �����Ͽ� ������ ������
3. Vector�� capacity() �޼ҵ�� ArrayList���� ����

����) �Ʒ��� ���ǿ� �ش��ϴ� ����Ʈ�� �����Ͽ� Ȱ���Ͻÿ�.
1. ����Ʈ�� �л����� ���� scores �迭�� ���� �����ϰ�, Ȯ���Ͻÿ�.
2. ����Ʈ���� 60�̸��� �л��� ������ �����ϰ�, Ȯ���Ͻÿ�.
3. ����Ʈ�� ������ ����� ���Ͻÿ�.
4. ����Ʈ�� �ְ������� ���������� ���Ͻÿ�.
5. ����Ʈ�� 2���� ������� ����Ͻÿ�. (�⺻ for��, Ȯ�� for��)
*/

public class ArrayListTest01 {
	
	public static final int INIT_MAX = 0;
	public static final int INIT_MIN = 100;
	
	public static void main(String[] args) {
		
		int[] scores = { 95, 88, 75, 63, 52, 77, 47, 48, 93, 91}; // 100���̶�� ����
		int numStudents = 100;
		
		int sum = 0, max = INIT_MAX, min = INIT_MIN;
		double avg = 0.0;
		
		System.out.println("- 1. ����Ʈ ���� - ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<numStudents; i++) {
			list.add(scores[i%10]);
		}
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
			if (i%10==9) System.out.println();
		}
		System.out.println();
		
		System.out.println("- 2. 60�� �̸��� �л� ���� ���� -");
		/*
		// ������ �߻� - �ε����� �տ������� �����ϸ鼭 ������ �ϸ�, 
		// �����ϰ� �ڿ� �ִ� ���� ������ ������鼭 ���� �ϳ� �ǳ� �ٴ� ������ �߻��� 
		for (int i=0; i<list.size(); i++) {
			if (list.get(i)<60) {
				list.remove(i);
				--i;
			}
		}
		*/
		// �ذ�å - �ε����� �ڿ��� ���ҽ�Ű�鼭 ����
		for (int i=list.size()-1; i>=0; i--) {
			if(list.get(i)<60) {
				list.remove(i);
			}
		}
		
		System.out.println("- 3. ����, ��� -");
		System.out.println("- 4. �ְ�����, �������� -");
		for (int i=0; i<list.size(); i++) {
			int tmp = list.get(i);
			sum += tmp;
			if (max < tmp) max = tmp;
			if (min > tmp) min = tmp;
		}
		
		avg = (double)sum/list.size();
		
		System.out.printf("����: %d\n���: %.2f\n�ְ�: %d\n����: %d\n\n", sum, avg, max, min);
		
		System.out.println("- 5. ��� (�⺻ for��) -");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
			if (i%10==9) System.out.println();
		}

		System.out.println();
		
		System.out.println("- 6. ��� (Ȯ�� for��) -");
		int j = 0;
		for (int i : list) {
			System.out.print(i + " ");
			if (j%10==9) System.out.println();
			j++;
		}
		
		System.out.println("- 7. �ְ�����, �������� -");
		Collections.sort(list);   // �������� ����
		System.out.println(list);
		
	}
}
