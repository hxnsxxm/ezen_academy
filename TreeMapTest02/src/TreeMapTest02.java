import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
����)
1. Ű�� �л��̸��̷�, ���� ������ �ϴ� TreeMap�� map�� �����Ͻÿ�.
2. �ʿ� ������ 5���� �߰��Ͻÿ�.
3. �ʿ��� �ߺ� Ű�� ��뿡 ���ؼ� Ȯ���Ͻÿ�.
4. �ʿ��� �ߺ� ���� ��뿡 ���ؼ� Ȯ���Ͻÿ�.
5. ���� 3���� ������� ����Ͻÿ�.
*/

public class TreeMapTest02 {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("�쿵��", 93);
		map.put("����ȣ", 88);
		map.put("�Ѽ���", 90);
		map.put("����", 97);
		map.put("�ǹο�", 77);
		System.out.println(map);
		
		map.put("����ȣ", 99);
		System.out.println(map);
		
		map.put("�׶��", 93);
		System.out.println(map);
		
		// ��� 1�� - Iterator, keySet()
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int score = map.get(key);
			System.out.println(key + " : " + score);
		}
		System.out.println("----------");
		
		// ��� 2�� - Iterator, entrySet()
		Set<Map.Entry<String, Integer>> set2 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, Integer> entry = it2.next();
			String name = entry.getKey();
			int score = entry.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("----------");
		
		// ��� 3�� - Ȯ�� for��, entrySet()
		Set<Map.Entry<String, Integer>> set3 = map.entrySet();
		for (Map.Entry<String, Integer> entry : set3) {
			String name = entry.getKey();
			int score = entry.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("----------");
		
		
	}
}
