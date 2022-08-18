import java.util.ArrayList;
import java.util.Iterator;

class Member {
	private String no;
	private String name;
	private int age;
	
	public Member(String no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public String getNo() { return no; }
	public String getName() { return name; }
	public int getAge() { return age; }
	
	public void setNo(String no) { this.no = no; }
	public void setName(String name) { this.name = name; }
	public void setAge(int age) { this.age = age; }
	
	public String toString() {
		return no + " (" + name+ ") : " + age ;
	}
	
	
}

public class ArrayListTest02 {
	public static void main(String[] args) {
		
		// 1. 리스트 생성
		ArrayList<Member> list = new ArrayList<Member>();
		
		// 2. 데이터 삽입
		Member m1 = new Member("123451", "우영우", 27);
		list.add(m1);
		
		list.add(new Member("123452", "한수현", 27));
		list.add(new Member("123453", "정명석", 43));
		list.add(new Member("123454", "이준호", 30));
		list.add(new Member("123455", "권민우", 30));
		
		System.out.println(list);
		System.out.println("----------");
		
		// 3. 출력 (기본 for문)
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); // list.get(i).toString()
		}
		System.out.println("----------");
		
		// 3. 출력 (확장 for문)
		for (Member m : list) {
			System.out.println(m); // m.toString()
		}
		System.out.println("----------");
		
		// 4. 데이터 삽입 (순차적 삽입)
		// 맨 뒤에 그마리 데이터 삽입
		list.add(new Member("123456", "그라미", 27));
		for (Member m : list) {
			System.out.println(m); // m.toString()
		}
		System.out.println("----------");
		
		// 5. 데이터 삽입 (비순차적 삽입, 중간)
		// 정명석 다음에 한선영 데이터 삽입
		// ?
		// list.add(3, new Member("123457", "한선영", 48));
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("정명석")) {
				list.add(i+1, new Member("123457", "한선영", 48));
				break;
			}
		}
		for (Member m : list) {
			System.out.println(m); // m.toString()
		}
		System.out.println("----------");
		
		// 6. 데이터 수정
		// 한수현 데이터 나이를 29로 수정
		// ?
		System.out.println("- 6. 데이터 수정(한수현 나이 수정) -");
		for (Member m : list) {
			//if ( m.getName() == "한수현" ) {  // 참조를 비교하는 거라서 사용하면 안됨
			if (m.getName().equals("한수현")) {
				m.setAge(29);
				break;
			}
		}
		
		
		//list.get(1).setAge(29);
		for (Member m : list) {
			System.out.println(m); // m.toString()
		}
		System.out.println("----------");
		
		// 7. 데이터 삭제
		// 권민우 데이터 삭제
		// ?
		//list.remove(5);
		System.out.println("- 7. 데이터 삭제(권민우 삭제) -");
		for (int i=list.size()-1; i>=0; i--) {
			if (list.get(i).getName().equals("권민우")) {
				list.remove(i);
				break;
			}
		}
		for (Member m : list) {
			System.out.println(m); // m.toString()
		}
		System.out.println("----------");
		
		// 8. 출력 3번
		System.out.println("- 8. 출력 3번 -");
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
			Member m = it.next();
			System.out.println(m);
		}
		
		
		
	}
}
