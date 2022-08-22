import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
< Map�� Ư¡ >
1. Ű��(key)�� ��(value)�� ���� �ϳ��� �����͸� �̷�� ����
2. ������ ����.
Ű�� �ߺ��� ������� ����
4. ���� �ߺ��� �����
Hashtable: HashMap�� ���� ����, �������� ����ȭ �κ��� �־ ���� ����.
HashMap: �������� ����ȭ �κ��� �����Ͽ� ���� ����

*/

public class HashMapTest01 {
	public static void main(String[] args) {
		
		// HashMap ����
		// Ű: �̸�, ��: ����
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// ������ �߰�
		map.put("�쿵��", 95);
		map.put("����ȣ",  87);
		map.put("����", 87);
		map.put("�ǹο�",  82);
		map.put("�Ѽ���",  88);
		System.out.println(map);
		
		// (�߰�) Ű Ȯ�� - ���ο� Ű�� ����
		map.put("�����", 77);
		
		// (����) Ű Ȯ�� - �ߺ��� Ű�� ���� -> �ߺ� Ű�� ������� ����.(���ο� ������ ���)
		map.put("�Ѽ���",  93);
		System.out.println(map);
		
		// (�߰�) �� Ȯ�� - �ߺ��� ���� ���� -> �ߺ� ���� �����
		map.put("�Ѽ���", 95);
		System.out.println(map);
		
		// �����͸� �����ϴ� ��� - Ű�� ���ؼ� �����͸� �����ϴ� ���
		// 1. Ű������ �����͸� �����ϴ� ���
		map.remove("�ǹο�");
		System.out.println(map);
		
		// 2. Ű�� ���� ��� ������ �� �����ϴ� ��� ex) "����ȣ", 88 �̸� ���� �ȵ�
		map.remove("����ȣ", 87);
		map.remove("����ȣ", 88); // Ű�� ������, ���� �ٸ��� �������� ����
		System.out.println(map);
		
		// ��� �л��� ���� ������ ����� ���Ͻÿ�.
		int tot = 0;
		double avg = 0.0;
		
		// �����͸� ����ϴ� ���
		// ��� 1�� - Iterator, keySet()
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();   // key
			int score = map.get(name); // value
			tot += score;
			System.out.println(name + " : " + score);
			
		}
		avg = (double)tot / keys.size();
		System.out.printf("����: %d, ���: %.2f\n", tot, avg);
		System.out.println("ũ��: " + map.size());
		System.out.println("----------");
		
		// ��� 2�� - Iterator, entrySet()
		// Entry : key, value�� �Ѳ����� ó���� �� �ֵ��� �ϴ� �������̽�
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = entrySet.iterator();
		while (it2.hasNext()) {
			Entry<String, Integer> entry = it2.next();
			String name = entry.getKey();
			int score = entry.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("ũ��: " + map.size());
		System.out.println("----------");
		
		
		// ��� 3�� - Ȯ�� for��, entrySet()
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for(Map.Entry<String, Integer> e : entrys) {
			String name = e.getKey();
			int score = e.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("ũ��: " + map.size());
		System.out.println("----------");
		
		
		// 1��
		
		
	}
}
