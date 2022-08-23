import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
문제)
1. 키를 학생이름이로, 값을 점수로 하는 TreeMap인 map을 생성하시오.
2. 맵에 데이터 5개를 추가하시오.
3. 맵에서 중복 키의 허용에 대해서 확인하시오.
4. 맵에서 중복 값의 허용에 대해서 확인하시오.
5. 맵을 3가지 방법으로 출력하시오.
*/

public class TreeMapTest02 {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("우영우", 93);
		map.put("이준호", 88);
		map.put("한선영", 90);
		map.put("정명석", 97);
		map.put("권민우", 77);
		System.out.println(map);
		
		map.put("이준호", 99);
		System.out.println(map);
		
		map.put("그라미", 93);
		System.out.println(map);
		
		// 출력 1번 - Iterator, keySet()
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int score = map.get(key);
			System.out.println(key + " : " + score);
		}
		System.out.println("----------");
		
		// 출력 2번 - Iterator, entrySet()
		Set<Map.Entry<String, Integer>> set2 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, Integer> entry = it2.next();
			String name = entry.getKey();
			int score = entry.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("----------");
		
		// 출력 3번 - 확장 for문, entrySet()
		Set<Map.Entry<String, Integer>> set3 = map.entrySet();
		for (Map.Entry<String, Integer> entry : set3) {
			String name = entry.getKey();
			int score = entry.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("----------");
		
		
	}
}
