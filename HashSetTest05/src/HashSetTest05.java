import java.util.HashSet;
import java.util.Iterator;

/*
문제) 
1. 학번(sno)과 이름(sname)을 멤버변수로 갖는 Student 클래스를 생성하시오.
- 멤버변수, 생성자, getter/setter, toString() 생성
2. Student의 인스턴스를 저장하는 HashSet인 set을 생성하시오.
3. set에 학생 정보 5개를 입력하고, 확인하시오.
- 123451 ~ 123455, 우영우, 이준호, 한수현, 정명석, 권민우
4. set에 중복 데이터를 입력하여 확인하고 문제점이 있다면 해결하도록 하시오.
5. set에서 데이터를 삭제하여 확인하고, 문제점이 있다면 해결하도록 하시오.
6. set의 모든 내용을 2가지 방법으로 출력하시오. (확장 for문, Iterator)
*/

class Student {
	private String sno;
	private String sname;
	
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
	
	// HashSet에서 Object 클래스의 hashCode(), equals() 메소드를 오버라이딩하여
	// 중복 데이터 삽입의 허용 불가와 데이터의 삭제 문제를 해결함
	@Override
	public int hashCode() {
		return (sno + sname).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student)obj;
			return sno.equals(s.sno) && sname.equals(s.sname); 
		}
		return false;
	}
	
}

public class HashSetTest05 {
	public static void main(String[] args) {
		
		System.out.println("- 2. set 생성 -");
		HashSet<Student> set = new HashSet<Student>();
		
		System.out.println("- 3. 학생 정보 입력 -");
		set.add(new Student("123451", "우영우"));
		set.add(new Student("123452", "이준호"));
		set.add(new Student("123453", "한수현"));
		set.add(new Student("123454", "정명석"));
		set.add(new Student("123455", "권민우"));
		System.out.println(set);
		
		System.out.println("- 4. 중복 데이터 추가 허용 불가 작업 -");
		// 학번만 같은 경우
		set.add(new Student("123455", "배수미"));
		System.out.println(set);
		// 이름만 같은 경우
		set.add(new Student("123457", "이준호"));
		System.out.println(set);
		// 학번과 이름이 모두 같은 경우
		set.add(new Student("123455", "권민우"));
		System.out.println(set);
		
		System.out.println("- 5. 데이터 삭제 -");
		set.remove(new Student("123453", "한수현"));
		System.out.println(set);
		
		System.out.println("- 6. 데이터 출력 1 (확장 for문) -");
		for (Student s : set) {
			System.out.println(s);
		}
		
		System.out.println("- 7. 데이터 출력 2 (Iterator) -");
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}

	}
}
