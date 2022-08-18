import java.util.Vector;

/*
����) �Ʒ��� ���ǿ� �ش��ϴ� ���͸� �����ϰ�, Ȱ���Ͻÿ�.
1. ���� v�� ���ڿ� �迭 names�� ��� Ȯ���Ͻÿ�.
2. ���� v���� �̽¿� ������ ������� �߰��ϰ� Ȯ���Ͻÿ�.
3. ���� v���� ����ȣ�� �����ϰ� Ȯ���Ͻÿ�.
4. ���� v���� �迬���� ���������� �����ϰ� Ȯ���Ͻÿ�.
5. ���� v�� ������ 2���� ������� ����Ͻÿ�. (�⺻ for��, Ȯ�� for��)
*/

public class VectorTest06 {
	public static void main(String[] args) {
		
		String[] names = {"�迬��", "����ȣ", "�̽¿�", "�迬��", "�����"};
		
		
		System.out.println("--- 1. ���� v�� ���ڿ� �迭 names�� ��� Ȯ���Ͻÿ�. ---");
		Vector<String> v = new Vector<String>();
		
		for (int i=0; i<names.length; i++) {
			v.add(names[i]);
		}
		System.out.println("v: " + v);
		
		System.out.println("--- 2. ���� v���� �̽¿� ������ ������� �߰��ϰ� Ȯ���Ͻÿ�. ---");
		v.add(v.indexOf("�̽¿�")+1, "�����");
		System.out.println("v: " + v);		
		
		System.out.println("--- 3. ���� v���� ����ȣ�� �����ϰ� Ȯ���Ͻÿ�. ---");
		v.remove("����ȣ");
		System.out.println("v: " + v);
		
		System.out.println("--- 4. ���� v���� �迬���� ���������� �����ϰ� Ȯ���Ͻÿ�. ---");
		v.set(v.indexOf("�迬��"), "������");
		System.out.println("v: " + v);
		
		System.out.println("--- 5. ���� v�� ������ 2���� ������� ����Ͻÿ�. (�⺻ for��, Ȯ�� for��) ---");
		for (int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("----------");
		
		for (String s : v) {
			System.out.println(s);
		}
		
		
		
	}
}
