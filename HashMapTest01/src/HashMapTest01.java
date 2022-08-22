import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
< Map의 특징 >
1. 키ㅣ(key)와 값(value)의 쌍이 하나의 데이터를 이루는 구조
2. 순서가 없다.
키는 중복을 허용하지 않음
4. 값은 중복을 허용함
Hashtable: HashMap의 이전 버전, 쓰레드의 동기화 부분이 있어서 성능 저하.
HashMap: 쓰레드의 동기화 부분을 제거하여 성능 개선

*/

public class HashMapTest01 {
	public static void main(String[] args) {
		
		// HashMap 생성
		// 키: 이름, 값: 정수
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// 데이터 추가
		map.put("우영우", 95);
		map.put("이준호",  87);
		map.put("정명석", 87);
		map.put("권민우",  82);
		map.put("한수형",  88);
		System.out.println(map);
		
		// (추가) 키 확인 - 새로운 키를 삽입
		map.put("배수미", 77);
		
		// (수정) 키 확인 - 중복된 키를 삽입 -> 중복 키를 허용하지 않음.(새로운 값으로 덮어씀)
		map.put("한수현",  93);
		System.out.println(map);
		
		// (추가) 값 확인 - 중복된 값을 삽입 -> 중복 값은 허용함
		map.put("한선영", 95);
		System.out.println(map);
		
		// 데이터를 삭제하는 방법 - 키를 통해서 데이터를 삭제하는 방법
		// 1. 키만으로 데이터를 삭제하는 방법
		map.remove("권민우");
		System.out.println(map);
		
		// 2. 키와 값을 모두 만족할 때 삭제하는 방법 ex) "이준호", 88 이면 삭제 안됨
		map.remove("이준호", 87);
		map.remove("이준호", 88); // 키는 같지만, 값이 다르면 삭제되지 않음
		System.out.println(map);
		
		// 모든 학생에 대한 총점과 평균을 구하시오.
		int tot = 0;
		double avg = 0.0;
		
		// 데이터를 출력하는 방법
		// 출력 1번 - Iterator, keySet()
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();   // key
			int score = map.get(name); // value
			tot += score;
			System.out.println(name + " : " + score);
			
		}
		avg = (double)tot / keys.size();
		System.out.printf("총점: %d, 평균: %.2f\n", tot, avg);
		System.out.println("크기: " + map.size());
		System.out.println("----------");
		
		// 출력 2번 - Iterator, entrySet()
		// Entry : key, value를 한꺼번에 처리할 수 있도록 하는 인터페이스
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = entrySet.iterator();
		while (it2.hasNext()) {
			Entry<String, Integer> entry = it2.next();
			String name = entry.getKey();
			int score = entry.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("크기: " + map.size());
		System.out.println("----------");
		
		
		// 출력 3번 - 확장 for문, entrySet()
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for(Map.Entry<String, Integer> e : entrys) {
			String name = e.getKey();
			int score = e.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("크기: " + map.size());
		System.out.println("----------");
		
		
		// 1번
		
		
	}
}
