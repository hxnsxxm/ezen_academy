import java.util.SortedSet;
import java.util.TreeSet;

// ���ڿ��� �ٷ�� �κм�
public class TreeSetTest05 {
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("abc"); set.add("alien"); set.add("bat"); set.add("car"); set.add("Car");
		set.add("disco"); set.add("dance"); set.add("dZZZZ"); set.add("dzzzz"); set.add("elephant");
		set.add("elevator"); set.add("fan"); set.add("flower"); set.add("d"); set.add("a");
		set.add("�ٴ�"); set.add("�ϴ�"); set.add("����"); set.add("��"); set.add("?"); set.add("��");
		
		System.out.println(set);
		
		// 1. a���� d�ձ���(d ������)�� �κм� (a���� c������ �κм�, d�� ������)
		SortedSet<String> set2 = set.subSet("a",  "d");
		System.out.println(set2);
		
		// 2. a���� d����(d ����)�� �κм� - e �ձ���
		SortedSet<String> set3 = set.subSet("a",  "e");
		SortedSet<String> set4 = set.subSet("a", "dzzzzzzzzzzz");
		System.out.println(set3);
		System.out.println(set4);
		
		// 3. a���� d����(d�� ����)�� �κм� - d�� ����
		SortedSet<String> set5 = set.subSet("a", true, "d", true);
		System.out.println(set5);
		
		// 4. �ѱ��� ���� �� ���ڸ� �⺻������ �ν���. 
		// "��"���� "��"���� -> "��"���� "��"�ձ���("��"�� ������)�� ����Ͽ��� ��.
		SortedSet<String> set6 = set.subSet("��", "��"); // -> �ƹ� ����� ������� ����
		System.out.println(set6);
		SortedSet<String> set7 = set.subSet("��", "��");
		System.out.println(set7);
		
		
		
	}
}
