import java.util.TreeSet;

/*
< TreeSet >
1. 순서가 없음 -> 입력한 순서대로 나오지 않음 -> 오름차순 정렬
2. 중복 데이터를 허용 불가
3. tree 데이터 저장 방법을 사용
4. 데이터를 저장할 때 오름차순으로 저장
5. 장점: 특정 범위의 데이터를 검색할 때 빠르고, 편리함
6. 단점: 데이터를 저장할 때 속도가 아주 느림
*/

public class TreeSetTest01 {
	public static void main(String[] args) {
		// TreeSet 생성
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		// 데이터 추가 - tree의 구조로 저장을 하므로 오름차순 정렬되어 출력
		set.add(82); set.add(63); set.add(58); set.add(97); set.add(76);
		System.out.println(set);
		System.out.println("set 크기 : " + set.size());
		
		// 데이터 추가 - 중복되지 않은 데이터는 허용
		set.add(85);
		System.out.println(set);
		System.out.println("set 크기 : " + set.size());
		
		// 데이터 추가 - 중복된 데이터는 허용 불가 
		set.add(76);
		System.out.println(set);
		System.out.println("set 크기 : " + set.size());
		
		// 데이터 삭제 - 존재하는 데이터 삭제
		set.remove(58);
		System.out.println(set);
		System.out.println("set 크기 : " + set.size());
		
		// 데이터 삭제 - 존재하지 않는 데이터 삭제 -> 에러가 발생하지 않음(예외 처리가 되어 있음)
		set.remove(80);
		System.out.println(set);
		System.out.println("set 크기 : " + set.size());
		
		// 모든 데이터 삭제
		set.clear();
		System.out.println(set);
		System.out.println("set 크기 : " + set.size());
	}
}
