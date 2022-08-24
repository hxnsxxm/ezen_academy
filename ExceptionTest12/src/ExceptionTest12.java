

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
	public void setAge(int age) { this.age = age; }
	
	public String toString() {
		return sno + "(" + sname + ", " + age + ")";
	}
}

class SpecialMember extends Member {
	private String privilege;
	
	public SpecialMember(String sno, String sname, int age, String privilege) {
		super(sno, sname, age);
		this.privilege = privilege;
	}
	
	public String getPrivilege() { return privilege; }
	
	public void setPrivilege(String privilege) { this.privilege = privilege; }
	
	public String toString() {
		return super.toString() + " | " + privilege + "혜택";
	}
}

class AdditionalMember extends Member {
	private int bonus;
	
	public AdditionalMember(String sno, String sname, int age, int bonus) {
		super(sno, sname, age);
		this.bonus = bonus;
	}
	
	public int getBonus() { return bonus; }
	
	public void setBonus(int bonus) { this.bonus = bonus; }
	
	public String toString() {
		return super.toString() + " | " + bonus + "점";
	}
}

public class ExceptionTest12 {
	public static void main(String[] args) {
		
		Member m1 = new Member("123451", "우영우", 27);
		SpecialMember m2 = new SpecialMember("123452", "이준호", 30, "30% 할인");
		AdditionalMember m3 = new AdditionalMember("123453", "정명석", 43, 100);
		SpecialMember m4 = null;
		
		//m4 = m1;                // Error) 자식에게 부모의 참조를 대입할 수는 없다.
		//m4 = (SpecialMember)m1; // Exception 1) ClassCastException, 캐스팅을 잘못 사용하고 있다.
		//System.out.println(m4.toString()); // Exception 2) NullPointerException,  

		/*
		// 1번 방법 - 각각의 예외를 처리하고, 각각의 예외를 모두 명세하고 있음
		try {
			m4 = (SpecialMember)m1;
		} catch(ClassCastException e) {  // Exception e, 부모클래스로 뭉ㄸ
			//e.printStackTrace();
			System.err.println("다운 캐스팅을 할 수는 없습니다.");
		}

		try {
			System.out.println(m4.toString()); 
		} catch(NullPointerException e) {
			System.err.println("Null을 참조할 수는 없습니다.");
		}
		*/
		
		/*
		// 2번 방법 - 모든 예외를 처리는 하였지만, 모든 예외 상황을 면세하지는 못함
		// 다중 catch 사용
		try {
			m4 = (SpecialMember)m1;             // Exception 1) 
			System.out.println(m4.toString());  // Exception 2) 
		} catch(ClassCastException e) {
			System.err.println("다운 캐스팅을 할 수는 없습니다.");
		} catch(NullPointerException e) {
			System.err.println("Null을 참조할 수는 없습니다.");
		}
		*/
		
		/*
		// 3번 방법 -> 모든 예외를 처리는 하였지만, 모든 예외 상황을 명세하지는 못함
		// 멀티 catch
		try {
			m4 = (SpecialMember)m1;             // Exception 1) 
			System.out.println(m4.toString());  // Exception 2)
		} catch (ClassCastException | NullPointerException e) {
			System.err.println("다운 캐스팅 또는 Null 참조에 대한 예외가 발생하였습니다.");
		}
		*/
		
		// 4번 방법 -> 모든 예외를 하나의 방법으로 처리, 모든 예외 상황을 명세하지 못함
		try {
			m4 = (SpecialMember)m1;             // Exception 1) 
			System.out.println(m4.toString());  // Exception 2)
		} catch(Exception e) {
			System.err.println("예외가 발생하였습니다.");
		}
		
		System.out.println("--- 아래에는 실행해야 하는 내용이 더 있습니다. ---");
		
		
	}
}
