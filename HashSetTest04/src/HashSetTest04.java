import java.util.HashSet;

class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
	
	public void setName(String name) { this.name = name; }
	public void setAge(int age) { this.age = age; }
	
	public String toString() {
		return name + "(" + age + ")";
	}
	
	// - HashSet에서 사용자가 직접 만든 클래스의 인스턴스 중복을 허용하지 않도록 하려면
	// Object 클래스의 2개 클래스를 오버라이딩 해야 함
	// 1. hashCode() 오버라이딩(equals() 메소드가 사용 중)
	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}
	
	// 2. equals() 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m = (Member)obj;
			return this.name.equals(m.name) && this.age==m.age;
		}
		return false;
	}
	
}



public class HashSetTest04 {
	public static void main(String[] args) {
		
		// 해시셋 생성
		HashSet<Member> set = new HashSet<Member>();
		
		// 데이터 추가 - 순서가 없다.
		set.add(new Member("우영우", 27));
		set.add(new Member("이준호", 30));
		set.add(new Member("한수현", 28));
		set.add(new Member("정명석", 43));
		set.add(new Member("권민우", 31));
		System.out.println(set);
		
		// 중복 데이터 추가 1 - 이름만 같은 경우 : 허용
		set.add(new Member("권민우", 37));
		System.out.println(set);
		
		// 중복 데이터 추가 2 - 나이만 같은 경우 : 허용
		set.add(new Member("동그라미", 27));
		System.out.println(set);
		
		// 중복 데이터 추가 3 - 이름과 나이가 모두 같은 경우 : 허용
		// 문제점 : 이름과 나이가 모두 같은 경우는 중복 데이터이므로 set에서는 허용하면 안됨
		// 해결책 : 셋에서 사용하는 클래스에 Object 클래스의 hashCode(), equals() 메소드를 오버라이딩하여
		//      실제의 값을 비교함으로써 중복 데이터를 허용하지 않도록 함
		set.add(new Member("한수현", 28));
		System.out.println(set);
		
		// 삭제 1 - 이름만 같은 경우 -> 삭제되지 않음
		set.remove(new Member("이준호", 33));
		System.out.println(set);
		
		// 삭제 2 - 나이만 같은 경우 -> 삭제되지 않음
		set.remove(new Member("배수미", 43));
		System.out.println(set);
		
		// 삭제 3 - 이름과 나이가 모두 같은 경우 -> 삭제되지 않음
		// 문제점 : 이름과 나이가 모두 같다면 삭제가 되어야 함
		// 해결책 : Object 클래스의 hashCode(), equals() 메소드를 오버라이딩함으로써 이 문제를 해결함
		set.remove(new Member("이준호", 30));
		System.out.println(set);
		
	}
}
