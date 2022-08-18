import java.util.Vector;

/*
< List �迭 >
1. ũ�Ⱑ �������� ���� �������� �迭 ����
2. ������ �ְ�, �������� �ߺ��� �����
3. Vector, ArrayList, LickedList, Stack, Queue		
*/


public class VectorTest01 {
	public static void main(String[] args) {
		
		// 1. ���� ����
		// raw Ÿ�� : ���� Ÿ��, �������� ������ �����͸� �־ ����ϴ� ��(�������� ����, ��������� ����) 
		// --> Generic Ÿ�� : ��ü�ֵ� Ÿ��, �� ���� ������ �����͸� �־ ����ϴ� ��(����)
		Vector v1 = new Vector();
		
		// 2. ������ ����
		v1.add("30"); // ���ڿ�
		v1.add(10);   // ����
		v1.add("����");// ���ڿ�
		v1.add(true); // boolean
		v1.add(3.14); // �Ǽ�
		
		// 3. ��� 1�� - �⺻ for��
		double tot = 0.0;
		for (int i=0; i<v1.size(); i++) {
			// tot += v1.get(i);  // ������ Ÿ���� ���ϵǾ� ���� �ʱ� ������ ������ �߻��Ѵ�.
			System.out.println(v1.get(i));
		}
		System.out.println("----------");
		
		// 4. ��� 2�� - Ȯ�� for��
		/*
		for (Object o : v1) {
			System.out.println(o);
		}
		*/
		
		
		// 1. ���� ���� -> generic Ÿ��, wrapper ���
		// Vector<int> v2 = new Vector<int>();  // int�� �⺻���̱� ������ ����� �� ����
		// Vector<Integer> v2 = new Vector<>(); // ���
		Vector<Integer> v2 = new Vector<Integer>();
		
		// 2. ������ ����
		v2.add(new Integer(10)); // �ڽ�(boxing)
		v2.add(20);              // ����ڽ�(auto-boxing)
		v2.add(30);
		v2.add(40);
		// v2.add(3.14);  // ������ �����Ͱ� �ƴϸ� ����(error)
		
		// 3. ��� 1�� - �⺻ for��
		int sum = 0;
		for (int i=0; i<v2.size(); i++) {
			sum += v2.get(i);
			System.out.println(v2.get(i));
		}
		System.out.println("�հ�: " + sum);
		System.out.println("-----------");
		
		// 4. ��� 2�� - Ȯ�� for��
		sum = 0;
		for (int v : v2) { // ���� ��ڽ�. for (Integer v : v2)
			sum += v;
			System.out.println(v);
		}
		System.out.println("�հ�: " + sum);
		System.out.println("-----------");
		
		// 5. ���� Ȯ��
		System.out.println(v2);
	}
}
