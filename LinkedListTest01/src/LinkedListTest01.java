import java.util.LinkedList;

public class LinkedListTest01 {
	public static void main(String[] args) {
		
		// 1. 문자열을 저장하는 링크드리스트 생성
		LinkedList<String> list = new LinkedList<String>();
		
		// 2. 데이터 추가 (순차적 추가)
		list.add("우영우");
		list.add("이준호");
		list.add("한수현");
		list.add("정명석");
		list.add("한선영");
		System.out.println(list);
		
		// 3. 데이터 추가 (비순차적 추가, 중간) - 한수현 다음에 권민우 데이터 추가
		list.add(3, "권민우");
		System.out.println(list);
		
		// 4. 데이터 변경 - 한선영을 동그라미로 변경
		list.set(5, "동그라미");
		System.out.println(list);
		
		// 5. 데이터 삭제 - 정명석 삭제
		list.remove(4);
		System.out.println(list);
		System.out.println("----------");
		
		// 6. 링크드리스트에만 있는 기능(메소드)
		System.out.println("- 1. 맨 앞에 데이터 추가 -");
		list.addFirst("태수미");
		System.out.println(list);
		
		System.out.println("- 2. 맨 뒤에 데이터 추가 -");
		list.addLast("방구뽕");
		System.out.println(list);
		
		System.out.println("- 3. 맨 앞의 데이터 삭제 -");
		list.removeFirst();
		System.out.println(list);
		
		System.out.println("- 4. 맨 뒤의 데이터 삭제 -");
		list.removeLast();
		System.out.println(list);
		
		System.out.println("- 5. 맨 앞의 데이터 확인 -");
		System.out.println(list.getFirst());
	
		System.out.println("- 6. 맨 뒤의 데이터 확인 -");
		System.out.println(list.getLast());
		
	}
}
