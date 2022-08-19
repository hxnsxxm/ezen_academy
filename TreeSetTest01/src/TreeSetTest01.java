import java.util.TreeSet;

/*
< TreeSet >
1. ������ ���� -> �Է��� ������� ������ ���� -> �������� ����
2. �ߺ� �����͸� ��� �Ұ�
3. tree ������ ���� ����� ���
4. �����͸� ������ �� ������������ ����
5. ����: Ư�� ������ �����͸� �˻��� �� ������, ����
6. ����: �����͸� ������ �� �ӵ��� ���� ����
*/

public class TreeSetTest01 {
	public static void main(String[] args) {
		// TreeSet ����
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		// ������ �߰� - tree�� ������ ������ �ϹǷ� �������� ���ĵǾ� ���
		set.add(82); set.add(63); set.add(58); set.add(97); set.add(76);
		System.out.println(set);
		System.out.println("set ũ�� : " + set.size());
		
		// ������ �߰� - �ߺ����� ���� �����ʹ� ���
		set.add(85);
		System.out.println(set);
		System.out.println("set ũ�� : " + set.size());
		
		// ������ �߰� - �ߺ��� �����ʹ� ��� �Ұ� 
		set.add(76);
		System.out.println(set);
		System.out.println("set ũ�� : " + set.size());
		
		// ������ ���� - �����ϴ� ������ ����
		set.remove(58);
		System.out.println(set);
		System.out.println("set ũ�� : " + set.size());
		
		// ������ ���� - �������� �ʴ� ������ ���� -> ������ �߻����� ����(���� ó���� �Ǿ� ����)
		set.remove(80);
		System.out.println(set);
		System.out.println("set ũ�� : " + set.size());
		
		// ��� ������ ����
		set.clear();
		System.out.println(set);
		System.out.println("set ũ�� : " + set.size());
	}
}
