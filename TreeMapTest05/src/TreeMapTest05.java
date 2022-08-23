import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest05 {
	public static void main(String[] args) {
		
		// Ű: �����̸�, ��: ���ϰ���
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		// �������߰�
		map.put("grape",  12500);
		map.put("pineapple", 11000);
		map.put("cherry", 4500);
		map.put("apple",  3000);
		map.put("blueberry", 6900);
		map.put("melon",  8500);
		map.put("strawberry", 9500);
		map.put("watermelon",  15000);
		map.put("dragon fruit",  13000);
		System.out.println(map);
		
		
		// 1. �κи� - b���� g�ձ����� �κи� (g�� ������)
		SortedMap<String, Integer> map2 = map.subMap("b", "g");
		System.out.println(map2);
		
		// 2. �κи� - b���� g������ �κи� (g�� ����)
		SortedMap<String, Integer> map3 = map.subMap("b", true, "gzzzzzzzzzzzzzzz", true);
		System.out.println(map3);

		
		
	}
}
