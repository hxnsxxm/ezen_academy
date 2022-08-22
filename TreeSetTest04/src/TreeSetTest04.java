import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

// int���� ���� �κм�
public class TreeSetTest04 {
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(87); set.add(98); set.add(75); set.add(95); set.add(80);
		System.out.println("��������: " + set);
		
		// TreeSet�� ����Ͽ� ������������ ���ĵ� NavigableSet�� ����
		NavigableSet<Integer> set2 = set.descendingSet();
		System.out.println("�������� ����: " + set2);
		
		// TreeSet�� ����Ͽ� �κм��� ���� ���� SortedSet�� ����Ͽ� ����
		// headSet(): false�� �⺻��, �ش簪�� �������� �ʴ� ���� �⺻
		// headSet(): 87������ ���� ���� ���� �κм��� ����
		SortedSet<Integer> set3 = set.headSet(87);
		System.out.println("87��(������)���� ���� ���� ���� �κм�: " + set3);
		
		SortedSet<Integer> set4 = set.headSet(87, true);
		System.out.println("87��(����)���� ���� ���� ���� �κм�: " + set4);
		
		// tailSet(): true�� �⺻��, �ش簪�� �����ϴ� ���� �⺻��
		// tailSet(): 87������ ū ���� ���� �ּ��� ����
		SortedSet<Integer> set5 = set.tailSet(87);
		System.out.println("87��(����)���� ū ���� ���� �κм�" + set5);
		
		SortedSet<Integer> set6 = set.tailSet(87, false);
		System.out.println("87��(������)���� ū ���� ���� �κм�" + set6);
		
		
	}
}
