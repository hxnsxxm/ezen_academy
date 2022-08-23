import java.util.TreeMap;

public class TreeMapTest01 {
	public static void main(String[] args) {
		
		// 사원 정보앱
		// 키: 사번(String), 값: 직원이름(String)
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		// 데이터 추가
		map.put("555555", "우영우");
		map.put("333333", "이준호");
		map.put("111111", "한수현");
		map.put("444444", "정명석");
		map.put("222222", "권민우");
		System.out.println(map);
		
		// 데이터 추가 - 중복 키 입력 : 중복 키 허용하지 않음, 나중에 넣은 데이터로 덮어 씀(수정)
		map.put("444444", "한선영");
		System.out.println(map);
		
		// 데이터 추가 - 중복 값 입력 : 중복 값은 허용함 
		map.put("666666", "이준호");
		System.out.println(map);
	}
}
