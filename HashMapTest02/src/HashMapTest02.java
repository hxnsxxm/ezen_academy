import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
문제)
1. 한영 사전 역할을 하는 HashMap인 map을 생성하시오.
2. 맵에 아래의 데이터를 추가하고 확인하시오.
키:값 - 사과:apple, 호랑이:tiger, 학생:student, 학교:school, 코끼리:elephant, 수박:watermeron, 비행기:airplane
3. 맵에서 수박의 값을 watermelon으로 수정하시오.
4. 맵에서 코끼리의 데이터를 삭제하시오.
5. 맵의 데이터를 3가지 방법으로 출력하시오.

*/

public class HashMapTest02 {
	public static void main(String[] args) {
		
		// 키: 한글(String), 값:영어(String)
		// 1. 한영 사전 역할을 하는 HashMap인 map 생성
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 2. 데이터 추가
		map.put("사과", "apple");
		map.put("호랑이", "tiger");
		map.put("학생", "student");
		map.put("학교", "school");
		map.put("코끼리", "elephant");
		map.put("수박", "watermeron");
		map.put("비행기", "airplane");
		
		System.out.println(map);
		
		// 3. 데이터 수정 
		//if (map.put("고래", "whale") == null)  {
		if (map.put("수박", "watermelon") == null)  {
			System.out.println("새로운 단어를 입력하였습니다.");
		} else {
			System.out.println("단어를 수정하였습니다.");
		}
		System.out.println(map);
		
		// 4. 데이터 삭제 - 존재하는 데이터 삭제
		if (map.remove("코끼리") == null) {
			System.out.println("입력한 단어는 존재하지 않습니다.");
		} else {
			System.out.println("단어를 삭제하였습니다.");
		}
		System.out.println(map);
		
		// 5. 데이터 삭제 - 존재하지 않는 데이터 삭제
		// 키를 찾지 못하면 값의 타입에 해당하는 null을 리턴 (String -> null)
		// map.remove("사자");
		if (map.remove("사자") == null) {
			System.out.println("입력한 단어는 존재하지 않습니다.");
		} else {
			System.out.println("단어를 삭제하였습니다.");
		}
		System.out.println(map);
		
		// 출력 1번 - Iterator, keySet()
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String kor = it.next();
			String eng = map.get(kor);
			System.out.println(kor + " : " + eng);
		}
		System.out.println("----------");
		
		// 출력 2번 - Iterator, entrySet() 
		Set<Map.Entry<String, String>> set2 = map.entrySet();
		// Set<Entry<String, String>> set2 = map.entrySet(); // 동일함
		Iterator<Entry<String, String>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Entry<String, String> entry = it2.next();
			String kor = entry.getKey();
			String eng = entry.getValue();
			System.out.println(kor + " : " + eng);
		}
		System.out.println("----------");
				
		// 출력 3번 - 확장 for문, entrySet()
		Set<Entry<String, String>> entrys = map.entrySet();
		for (Entry<String, String> e : entrys) {
			String kor = e.getKey();
			String eng = e.getValue();
			System.out.println(kor + " : " + eng);
		}
	
		
	}
}