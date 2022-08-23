import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest04 {
	public static void main(String[] args) {
		
		// 키: 점수, 값: 학생이름
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// 데이터 추가
		map.put(87, "우영우");
		map.put(98,  "이준호");
		map.put(75, "한수현");
		map.put(95,  "정명석");
		map.put(80, "권민우");
		System.out.println("오름차순 정렬 : " + map);
		
		NavigableMap<Integer, String> map2 = map.descendingMap();
		System.out.println("내림차순 정렬 : " + map2);
		
		// 95점보다 작은 값을 가진 부분맵(해당 점수 미포함) - 기본값
		SortedMap<Integer, String> map3 = map.headMap(95);
		System.out.println("headMap(미포함) : " + map3);
		
		// 95점보다 큰 값을 가진 부분맵(해당 점수 포함) - 기본값
		SortedMap<Integer, String> map4 = map.tailMap(95);
		System.out.println("tailMap : " + map4);
		
		// 95점보다 작은 값을 가진 부분맵 (해당 점수 포함)
		SortedMap<Integer, String> map5 = map.headMap(95, true);
		System.out.println("headMap : " + map5);
		
		// 95점보다 큰 값을 가진 부분맵(해당 점수 미포함)
		SortedMap<Integer, String> map6 = map.tailMap(95, false);
		System.out.println("tailMap(미포함) : " + map6);
		
		
	}
}
