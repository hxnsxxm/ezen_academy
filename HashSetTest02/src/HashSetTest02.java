import java.util.HashSet;
import java.util.Iterator;

/*
문제) 
1. 문자열을 저장하는 헤시셋인 set을 생성하고 확인하시오.
2. 셋에 우영우, 이준호, 한수현, 정명석, 권민우를 추가하고 확인하시오.
3. 셋에 중복 데이터를 추가하고 확인하시오.
4. 셋에서 정명석 데이터를 삭제하고 확인하시오.
5. 셋의 모든 데이터를 출력하시오. (확장 for문, Iterator)
*/

public class HashSetTest02 {
	public static void main(String[] args) {
		
		System.out.println("- 1. 해시셋 생성 -");
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs);
		System.out.println("크기: " + hs.size());
		
		System.out.println("- 2. 데이터 추가 -");
		hs.add("우영우"); hs.add("이준호"); hs.add("한수현"); hs.add("정명석"); hs.add("권민우");
		System.out.println(hs);
		System.out.println("크기: " + hs.size());
		
		System.out.println("- 3. 중복 데이터 추가(우영우) -");
		hs.add("우영우");
		System.out.println(hs);
		System.out.println("크기: " + hs.size());
		
		System.out.println("- 4. 데이터 삭제(정명석) -");
		hs.remove("정명석");
		System.out.println(hs);
		System.out.println("크기: " + hs.size());
		
		System.out.println("- 5. 출력 1번(확장 for문) -");
		for (String s : hs) {
			System.out.println(s);
		}
		
		System.out.println("- 6. 출력 2번(Iterator) -");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
