import java.util.LinkedList;

public class LinkedListTest01 {
	public static void main(String[] args) {
		
		// 1. ���ڿ��� �����ϴ� ��ũ�帮��Ʈ ����
		LinkedList<String> list = new LinkedList<String>();
		
		// 2. ������ �߰� (������ �߰�)
		list.add("�쿵��");
		list.add("����ȣ");
		list.add("�Ѽ���");
		list.add("����");
		list.add("�Ѽ���");
		System.out.println(list);
		
		// 3. ������ �߰� (������� �߰�, �߰�) - �Ѽ��� ������ �ǹο� ������ �߰�
		list.add(3, "�ǹο�");
		System.out.println(list);
		
		// 4. ������ ���� - �Ѽ����� ���׶�̷� ����
		list.set(5, "���׶��");
		System.out.println(list);
		
		// 5. ������ ���� - ���� ����
		list.remove(4);
		System.out.println(list);
		System.out.println("----------");
		
		// 6. ��ũ�帮��Ʈ���� �ִ� ���(�޼ҵ�)
		System.out.println("- 1. �� �տ� ������ �߰� -");
		list.addFirst("�¼���");
		System.out.println(list);
		
		System.out.println("- 2. �� �ڿ� ������ �߰� -");
		list.addLast("�汸��");
		System.out.println(list);
		
		System.out.println("- 3. �� ���� ������ ���� -");
		list.removeFirst();
		System.out.println(list);
		
		System.out.println("- 4. �� ���� ������ ���� -");
		list.removeLast();
		System.out.println(list);
		
		System.out.println("- 5. �� ���� ������ Ȯ�� -");
		System.out.println(list.getFirst());
	
		System.out.println("- 6. �� ���� ������ Ȯ�� -");
		System.out.println(list.getLast());
		
	}
}
