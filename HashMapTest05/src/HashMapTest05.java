import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest05 {
	public static void main(String[] args) {
		
		// ȸ�������� �����ϴ� HashMap -> �α����ϴ� ȭ���� ����
		// Ű: ���̵�, ��: ��й�ȣ
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		// ������ �߰�
		map.put("aaa1111", "1111");
		map.put("bbb2222", "2222");
		map.put("ccc3333", "3333");
		map.put("ddd4444", "4444");
		map.put("eee5555", "5555");
		System.out.println(map);
		
		// ����) �α����� ��, ���̵�� ��й�ȣ�� Ȯ���ϵ��� �����Ͻÿ�.
		int count = 1;
		while(true) {
			if (count >= 2) System.out.print(count + "��° ");
			System.out.println("�α����� �����մϴ�.");
			System.out.print("���̵� �Է��ϼ���. ���̵�: ");
			String userId = sc.next();
			if (map.get(userId) == null) {
				System.out.println("���̵� �������� �ʽ��ϴ�.");
			} else {
				System.out.print("��й�ȣ�� �Է��ϼ���. ��й�ȣ: ");
				String userPassword = sc.next();
				if (map.get(userId).equals(userPassword)) {
					System.out.println("�α��εǾ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}
			count++;
			System.out.println("-------------");
		}
		
		// 2�� ���
		/*
		String id = sc.next();
		String pwd = sc.next();
		
		if(map.containsKey(id)) {
			if(pwd.equals(map.get(id))) {
				System.out.println("�α���");
				//break;
			} else {
				
			}
		}
		*/
		sc.close();
	}
}
