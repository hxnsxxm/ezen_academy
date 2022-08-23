import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Member {

	private String sno;
	private String sname;
	private int age;
	
	public Member(String sno, String sname, int age) {
		this.sno = sno;
		this.sname = sname;
		this.age = age;
	}
	
	public String getSno() { return sno; }
	public String getSname() { return sname; }
	public int getAge() { return age; }
	
	public void setSno(String sno) { this.sno = sno; }
	public void setSname(String sname) { this.sname = sname; }
	public void setAge(int age) { this.age = age;}
	
	@Override
	public String toString() {
		return sno + "(" + sname + ", " + age +")";
	}
}

/*
문제)
1. 키는 전화번호, 값은 Member 의 인스턴스를 갖는 HashMap인 map을 생성하시오.
2. 맵에 데이터를 5개 입력하시오.
키: "010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555"
값: ("123451", "우영우", 27), ("123452", "이준호", 30), ("123453", "한수현", 29)
   ("123454", "정명석", 43), ("123455", "권민우", 32) 
...
3. 맵에서 전화번호가 "010-2222-2222"인 회원의 정보를 삭제하시오.
4. 맵에서 전화번호가 "010-3333-3333"인 회원의 이름을 한선영으로 수정하시오.
5. 맵에서 전화번호가 "010-4444-4444"인 회원의 나이를 32로 수정하시오.
6. 맵의 데이터를 3가지 방법으로 출력하시오.
*/

public class HashMapTest03 {
	public static void main(String[] args) {
		
		HashMap<String, Member> map = new HashMap<String, Member>();
		
		map.put("010-1111-1111", new Member("123451", "우영우", 27));
		map.put("010-2222-2222", new Member("123452", "이준호", 30));
		map.put("010-3333-3333", new Member("123453", "한수현", 29));
		map.put("010-4444-4444", new Member("123454", "정명석", 43));
		map.put("010-5555-5555", new Member("123455", "권민우", 32));
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("전화번호: " + tel + ", 회원정보 : " + m);
		}
		System.out.println("----------------");
				
		// 3. 맵에서 전화번호가 "010-2222-2222"인 회원의 정보를 삭제하시오.
		if (map.remove("010-2222-2222") == null) {
			System.out.println("회원의 정보가 성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제하고자 하는 회원의 정보가 없습니다.");
		}
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("전화번호: " + tel + ", 회원정보 : " + m);
		}
		System.out.println("----------------");
		
		// 4. 맵에서 전화번호가 "010-3333-3333"인 회원의 이름을 한선영으로 수정하시오.
		/*
		if (map.put("010-3333-3333", new Member("123453", "한선영", 29)) == null) {
			System.out.println("새로운 회원의 정보가 추가됩니다.");
		} else {
			System.out.println("회원의 정보를 수정하였습니다.");
		}
		*/
		//map.get("010-3333-3333").setSname("한선영");
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			if (tel.equals("010-3333-3333")) {
				Member m = map.get(tel);
				m.setSname("한선영");
				map.put(tel, m);
			}
			
		}
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("전화번호: " + tel + ", 회원정보 : " + m);
		}
		System.out.println("----------------");
		
		// 5. 맵에서 전화번호가 "010-4444-4444"인 회원의 나이를 32로 수정하시오.
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			if (tel.equals("010-4444-4444")) {
				map.get(tel).setAge(32);
			}
		}
		//map.get("010-4444-4444").setAge(32);
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("전화번호: " + tel + ", 회원정보 : " + m);
		}
		System.out.println("----------------");
		
		// 출력 1번 : keySet()
		keys = map.keySet();
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("전화번호: " + tel + ", 회원정보 : " + m);
		}
		System.out.println("----------------");
		
		// 출력 2번 - Iterator, entrySet()
		Set<Map.Entry<String, Member>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Member>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Map.Entry<String, Member> entry = it2.next();
			String tel = entry.getKey();
			Member m = entry.getValue();
			System.out.println("전화번호: " + tel + ", 회원정보 : " + m);
		}
		System.out.println("----------------");
		
		// 출력 3번 - 확장 for문, entrySet()
		Set<Map.Entry<String, Member>> entrys = map.entrySet();
		for (Map.Entry<String, Member> e : entrys) {
			String tel = e.getKey();
			Member m = e.getValue();
			System.out.println("전화번호: " + tel + ", 회원정보 : " + m);
		}
		System.out.println("----------------");
		
	}
}
