import java.util.HashSet;
import java.util.Iterator;

/*
< Set �迭 >
1. ������ ����. (�ε����� ����)
2. �ߺ� �����͸� ������� �����´�.
3. HashSet, TreeSet, ...
*/

public class HashSetTest01 {
	public static void main(String[] args) {
		
		// 1. �ؽü� ����
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println(set);
		System.out.println("ũ��: " + set.size());
		
		// 2. ������ �߰� - �����͸� ���� ������� ������ ����
		set.add(66); set.add(75); set.add(57); set.add(96); set.add(45);
		System.out.println(set);
		System.out.println("ũ��: " + set.size());
		
		// 3. ������ �߰� - �ߺ� �����ʹ� ��� �Ұ�
		set.add(57);
		System.out.println(set);
		System.out.println("ũ��: " + set.size());
		
		// 4. ������ �߰� - �ߺ����� ���� ������ �߰�
		set.add(83);
		System.out.println(set);
		System.out.println("ũ��: " + set.size());
		
		// 5. ������ ���� - �����ϴ� ������ ����
		set.remove(96); 
		System.out.println(set);
		System.out.println("ũ��: " + set.size());
		
		// 6. ������ ���� - �������� �ʴ� ������ ���� -> ������ �߻����� ����(����ó���� �Ǿ� ����)
		set.remove(30);
		System.out.println(set);
		System.out.println("ũ��: " + set.size());
		
		// 7. ��� 1 - Ȯ�� for��
		int tot = 0;
		for (int i : set) { // �����ڽ�
			tot += i;
			System.out.println(i);
		}
		System.out.println("����: " + tot);
		
		// 8. ��� 2 - Iterator ���
		tot = 0;
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int h = it.next();
			tot += h;
			System.out.println(h);
		}
		System.out.println("����: " + tot);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
