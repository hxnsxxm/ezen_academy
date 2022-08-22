import java.util.HashSet;
import java.util.TreeSet;

/*
- Set�� Ư¡ : ������ ����, �ߺ� �����Ͱ� ����.
- HashSet�� Ư¡ : �������� �߰�/������ ����. �����Ͱ� ���ĵǾ� ���� ����. 
- TreeSetƯ¡ : �����Ͱ� ������������ ���ĵǾ� �־ �������� �˻��� ����. �������� �߰�/������ ����.
*/

public class TreeSetTest06 {
	public static void main(String[] args) {
		
		// Set�� �ζǹ�ȣ 6���� ���� - �ߺ����� �ʾƾ� ��. 1 ~ 45(����) ������ ��
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		
		// ������: �ζǹ�ȣ 6���� �������� ���� �� ����. -> �ߺ��� �����͸� ����ϵ� �ʱ� ����
		for (int i=0; i<6; i++) {
			int n = (int)(Math.random() * 45) + 1;
			set1.add(n);
		}
		System.out.println(set1);
		
		set1.clear();
		System.out.println(set1);
		
		// �ذ�å: set�� ũ�⸦ ����Ͽ� 6���� �ζǹ�ȣ�� ������ ��
		while (set1.size() < 6) {
			int n = (int)(Math.random() * 45) + 1;
			set1.add(n);
		}
		System.out.println("HashSet set1: " + set1);
		
		while (set2.size() < 6) {
			int n = (int)(Math.random() * 45) + 1;
			set2.add(n);
		}
		System.out.println("TreeSet set2: " + set2);
		
		
	}
}
