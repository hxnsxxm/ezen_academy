package test;

/*
1. Member 클래스 
- SpecialMember의 부모 클래스
- 멤버변수: 회원이름(name), 회원번호(no), 회원나이(age)
- 생성자
- getter/setter
- 출력 메소드 2가지, showInfo(), toString()

2. SpecialMember 클래스
- Member 클래스의 자식 클래스
- 멤버변수: 특별 혜택(privilege)
- 생성자
- getter/setter
- 출력 메소드 2가지 - 오버라이딩해서 생성

3. main() 메소드
- Member 인스턴스 2개, SpecialMember 인스턴스 2개를 만들어서 출력하시오.

*/

import member.Member;
import member.SpecialMember;

public class MemberTest02 {
	public static void main(String[] args) {
		Member mem01 = new Member("John", "123456", 32);
		Member mem02 = new Member("Mary", "123457", 30);
		
		SpecialMember sm01 = new SpecialMember("Tomy", "912345", 36, "혜택");
		SpecialMember sm02 = new SpecialMember("Sam", "912346", 28, "혜택");
		
		Member[] mem = new Member[] {
				new Member("John", "123456", 32),
				new Member("Mary", "123457", 30),
				new SpecialMember("Tomy", "912345", 36, "혜택"),
				new SpecialMember("Sam", "912346", 28, "혜택"),
		};
		
		for (Member i : mem) {
			System.out.println(i);
			System.out.println();
		}
		
		/*
		System.out.println(mem01);
		System.out.println();
		System.out.println(mem02);
		System.out.println();
		System.out.println(sm01);
		System.out.println();
		System.out.println(sm02);
		*/
	}
}
