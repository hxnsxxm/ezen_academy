import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
< ArrayList�� LinkedList�� �� >
1. ArrayList
- ����: ���ټӵ�(�˻�, �б�)�� ����, �������� �������� �߰�, ���� �ӵ��� ����
- ����: ��������� �������� �߰�, ���� �ӵ��� ����
2. LinkedList
- ����: ��������� �������� �߰�, ���� �ӵ��� ����
- ����: ���ټӵ�(�˻�, �б�)�� ����, �������� �������� �߰�, ���� �ӵ��� ����
*/


public class LinkedListTest03 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		System.out.println("- 1. �������� �߰� - ");
		System.out.println(" ArrayList �ð� : " + add1(al) + " ms");
		System.out.println("LinkedList �ð� : " + add1(ll) + " ms");
		System.out.println();
		
		System.out.println("- 2. ��������� �߰�(�߰����� �߰�) - ");
		System.out.println(" ArrayList �ð� : " + add2(al) + " ms");
		System.out.println("LinkedList �ð� : " + add2(ll) + " ms");
		System.out.println();
		
		System.out.println("- 3. ��������� ����(�߰����� ����) - ");
		System.out.println(" ArrayList �ð� : " + remove1(al) + " ms");
		System.out.println("LinkedList �ð� : " + remove1(ll) + " ms");
		System.out.println();
		
		System.out.println("- 4. �������� ���� - ");
		System.out.println(" ArrayList �ð� : " + remove2(al) + " ms");
		System.out.println("LinkedList �ð� : " + remove2(ll) + " ms");
		
	}
	
	// 1. �������� �߰�
	public static long add1(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		
		for (int i=0; i<1000000; i++) {
			list.add(i);
		}
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
	
	// 2. ��������� �߰�(�߰����� �߰�)
	public static long add2(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			list.add(500, i);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	// 3. ��������� ����(�߰����� ����)
	public static long remove1(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			list.remove(500);
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	// 4. �������� ����
	public static long remove2(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		for (int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	
}
