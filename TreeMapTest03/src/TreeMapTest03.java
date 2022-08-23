import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest03 {
	public static void main(String[] args) {
		
		// 키: 점수, 값: 학생이름
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// 데이터 추가
		map.put(87, "우영우");
		map.put(98,  "이준호");
		map.put(75, "한수현");
		map.put(95,  "정명석");
		map.put(80, "권민우");
		System.out.println(map);
		
		Map.Entry<Integer, String> entry = map.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		System.out.println("가장 낮은 점수: " + map.firstKey());
		System.out.println("가장 높은 점수: " + map.lastKey());
		
		entry = map.lowerEntry(95);
		System.out.println("95점 바로 아래 점수: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.higherEntry(95);
		System.out.println("95점 바로 위의 점수: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		System.out.println("95점 바로 아래 점수: " + map.lowerKey(95));
		System.out.println("95점 바로 위의 점수: " + map.higherKey(95));
		
		
		// 3. 
		entry = map.floorEntry(95);
		System.out.println("95점이거나 바로 아래 점수: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		entry = map.ceilingEntry(95);
		System.out.println("95점이거나 바로 위의 점수: " + entry.getKey() + "(" + entry.getValue() + ")");
		
		System.out.println("95점 바로 아래 점수: " + map.floorKey(95));
		System.out.println("95점 바로 위의 점수: " + map.ceilingKey(95));
		
		// 출력하면서 데이터를 삭제하는 방법
		// 1. pollFirstEntry() - 첫번째 데이터부터 꺼내고 삭제함
		// 2. pollLastEntry() - 마지막 데이터부터 꺼내고 삭제함
		while (!map.isEmpty()) {
			//entry = map.pollFirstEntry();
			entry = map.pollLastEntry();
			System.out.println(entry.getKey() + "(" + entry.getValue() + ")");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
