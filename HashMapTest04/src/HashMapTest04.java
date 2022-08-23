import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	
	private String sno;    // 학생번호
	private String sname;  // 학생이름
	
	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
	
	public String getSno() { return sno; }
	public String getSname() { return sname; }
	
	public void setSno(String sno) { this.sno = sno; }
	public void setSname(String sname) { this.sname = sname; }
	
	@Override
	public String toString() {
		return sno + "(" + sname + ")";
	}
	
	@Override
	public int hashCode() {
		return (sno + sname).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student)obj;
			return sno.equals(s.sno) && sname.equals(s.sname);
		} else {
			return false;
		}
		
	}
}

/*
1. Student의 인스턴스를 키로 사용하고, 학생의 점수를 값으로 사용하는 HashMap인 map을 생성하시오.
2. 맵에 데이터를 5개 추가하시오.
3. 맵의 키에 대한 중복 허용 여부를 확인하시오.
4. 맵의 값에 대한 중복 허용 여부를 확인하시오.
5. 데이터를 3가지 방법으로 출력하시오.
*/

public class HashMapTest04 {
	public static void main(String[] args) {
		
		// 1. Student의 인스턴스를 키로 사용하고, 학생의 점수를 값으로 사용하는 HashMap인 map을 생성하시오.
		HashMap<Student, Integer> map = new HashMap<Student, Integer>();
		
		// 2. 맵에 데이터를 5개 추가하시오.
		map.put(new Student("123451", "우영우"), 93);
		map.put(new Student("123452", "이준호"), 87);
		map.put(new Student("123453", "정명석"), 90);
		map.put(new Student("123454", "권민우"), 78);
		map.put(new Student("123455", "한수현"), 74);
		System.out.println(map);
		System.out.println("----------");
		
		// 3. 맵의 키에 대한 중복 허용 여부를 확인하시오.
		map.put(new Student("123451", "우영우"), 99);
		System.out.println(map);
		System.out.println("----------");
		
		// 4. 맵의 값에 대한 중복 허용 여부를 확인하시오.
		map.put(new Student("123456", "그라미"), 90);
		System.out.println(map);
		System.out.println("----------");
		
		// 5. 출력 1번 - Iterator, keySet()
		Set<Student> set = map.keySet();
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			int score = map.get(s);
			System.out.println(s.getSno() + "(" + s.getSname() + ", " + score + ")");
		}
		System.out.println("----------");
		
		// 5. 출력 2번 - Iterator, entrySet
		Set<Entry<Student, Integer>> set2 = map.entrySet();
		Iterator<Entry<Student, Integer>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Entry<Student, Integer> entry = it2.next();
			Student s = entry.getKey();
			int score = entry.getValue();
			System.out.println(s.getSno() + "(" + s.getSname() + ", " + score + ")");
		}
		System.out.println("----------");
		
		// 5. 출력 3번 - 확장 for문, entrySet
		Set<Entry<Student, Integer>> entry2 = map.entrySet();
		for (Entry<Student, Integer> e : entry2) {
			Student s = e.getKey();
			int score = e.getValue();
			System.out.println(s.getSno() + "(" + s.getSname() + ", " + score + ")");
		}
		System.out.println("----------");
		
	}
}
