import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest03 {
	public static void main(String[] args) {
		
		// Ű: ����, ��: �л��̸�
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// ������ �߰�
		map.put(87, "�쿵��");
		map.put(98,  "����ȣ");
		map.put(75, "�Ѽ���");
		map.put(95,  "����");
		map.put(80, "�ǹο�");
		System.out.println(map);
		
		Map.Entry<Integer, String> entry = map.firstEntry();
		System.out.println("���� ���� ����: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.lastEntry();
		System.out.println("���� ���� ����: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		System.out.println("���� ���� ����: " + map.firstKey());
		System.out.println("���� ���� ����: " + map.lastKey());
		
		entry = map.lowerEntry(95);
		System.out.println("95�� �ٷ� �Ʒ� ����: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.higherEntry(95);
		System.out.println("95�� �ٷ� ���� ����: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		System.out.println("95�� �ٷ� �Ʒ� ����: " + map.lowerKey(95));
		System.out.println("95�� �ٷ� ���� ����: " + map.higherKey(95));
		
		
		// 3. 
		entry = map.floorEntry(95);
		System.out.println("95���̰ų� �ٷ� �Ʒ� ����: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.ceilingEntry(95);
		System.out.println("95���̰ų� �ٷ� ���� ����: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		System.out.println("95�� �ٷ� �Ʒ� ����: " + map.floorKey(95));
		System.out.println("95�� �ٷ� ���� ����: " + map.ceilingKey(95));
		
		// ����ϸ鼭 �����͸� �����ϴ� ���
		// 1. pollFirstEntry() - ù��° �����ͺ��� ������ ������
		// 2. pollLastEntry() - ������ �����ͺ��� ������ ������
		while (!map.isEmpty()) {
			//entry = map.pollFirstEntry();
			entry = map.pollLastEntry();
			System.out.println(entry.getKey() + "(" + entry.getValue() + ")");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
