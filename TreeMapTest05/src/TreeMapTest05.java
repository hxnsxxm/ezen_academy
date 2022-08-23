import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest05 {
	public static void main(String[] args) {
		
		// 키: 과일이름, 값: 과일가격
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		// 데이터추가
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
		
		
		// 1. 부분맵 - b부터 g앞까지의 부분맵 (g를 미포함)
		SortedMap<String, Integer> map2 = map.subMap("b", "g");
		System.out.println(map2);
		
		// 2. 부분맵 - b부터 g까지의 부분맵 (g만 포함)
		SortedMap<String, Integer> map3 = map.subMap("b", true, "gzzzzzzzzzzzzzzz", true);
		System.out.println(map3);

		
		
	}
}
