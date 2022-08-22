import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
����)
1. �ѿ� ���� ������ �ϴ� HashMap�� map�� �����Ͻÿ�.
2. �ʿ� �Ʒ��� �����͸� �߰��ϰ� Ȯ���Ͻÿ�.
Ű:�� - ���:apple, ȣ����:tiger, �л�:student, �б�:school, �ڳ���:elephant, ����:watermeron, �����:airplane
3. �ʿ��� ������ ���� watermelon���� �����Ͻÿ�.
4. �ʿ��� �ڳ����� �����͸� �����Ͻÿ�.
5. ���� �����͸� 3���� ������� ����Ͻÿ�.

*/

public class HashMapTest02 {
	public static void main(String[] args) {
		
		// Ű: �ѱ�(String), ��:����(String)
		// 1. �ѿ� ���� ������ �ϴ� HashMap�� map ����
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 2. ������ �߰�
		map.put("���", "apple");
		map.put("ȣ����", "tiger");
		map.put("�л�", "student");
		map.put("�б�", "school");
		map.put("�ڳ���", "elephant");
		map.put("����", "watermeron");
		map.put("�����", "airplane");
		
		System.out.println(map);
		
		// 3. ������ ���� 
		//if (map.put("��", "whale") == null)  {
		if (map.put("����", "watermelon") == null)  {
			System.out.println("���ο� �ܾ �Է��Ͽ����ϴ�.");
		} else {
			System.out.println("�ܾ �����Ͽ����ϴ�.");
		}
		System.out.println(map);
		
		// 4. ������ ���� - �����ϴ� ������ ����
		if (map.remove("�ڳ���") == null) {
			System.out.println("�Է��� �ܾ�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�ܾ �����Ͽ����ϴ�.");
		}
		System.out.println(map);
		
		// 5. ������ ���� - �������� �ʴ� ������ ����
		// Ű�� ã�� ���ϸ� ���� Ÿ�Կ� �ش��ϴ� null�� ���� (String -> null)
		// map.remove("����");
		if (map.remove("����") == null) {
			System.out.println("�Է��� �ܾ�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�ܾ �����Ͽ����ϴ�.");
		}
		System.out.println(map);
		
		// ��� 1�� - Iterator, keySet()
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String kor = it.next();
			String eng = map.get(kor);
			System.out.println(kor + " : " + eng);
		}
		System.out.println("----------");
		
		// ��� 2�� - Iterator, entrySet() 
		Set<Map.Entry<String, String>> set2 = map.entrySet();
		// Set<Entry<String, String>> set2 = map.entrySet(); // ������
		Iterator<Entry<String, String>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Entry<String, String> entry = it2.next();
			String kor = entry.getKey();
			String eng = entry.getValue();
			System.out.println(kor + " : " + eng);
		}
		System.out.println("----------");
				
		// ��� 3�� - Ȯ�� for��, entrySet()
		Set<Entry<String, String>> entrys = map.entrySet();
		for (Entry<String, String> e : entrys) {
			String kor = e.getKey();
			String eng = e.getValue();
			System.out.println(kor + " : " + eng);
		}
	
		
	}
}