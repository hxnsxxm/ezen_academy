
/*
 * 문제) 아래의 조건에 부합하도록 하는 회원 클래스를 생성하고, 활용하시오.
 *   1. 클래스명: Member
 *   2. 멤버변수: 회원번호(no), 회원이름(name), 회원나이(age), private로 선언
 *   3. 생성자   : 인스턴스를 만들때 멤버변수를 초기화, public으로 선언
 *   4. 멤버메소드 : getter / setter 메소드 생성, public으로 선언
 *   5. main 메소드에서 Member 클래스의 인스턴스를 5명 생성하시오. 3번에서 생성한 생성자를 활용하시오.
 *   6. getter 메소드를 사용하여 인스턴스의 정보를 출력하시오.  
 * 
 * < 인스턴스 생성 데이터 >
 * 123456, 우영우, 27
 * 123457, 이준호, 29
 * 123458, 정명석, 43
 * 123459, 동그라미, 27
 * 123460, 최수연, 27
 * 
 */

class Member {
	private int no;  // 회원번호는 String으로 선언하는 게 일반적임
	private String name;
	private int age;
	
	public Member(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public int getNo() { return no; }
	public String getName() { return name; }
	public int getAge() { return age; }
	
	public void setNo(int no) { this.no = no; }
	public void setName(String name) { this.name = name; }
	public void setAge(int age) { this.age = age; }
	
	// 출력 메소드 1번
	public void printInfo() {
		System.out.println("회원번호: " + no);
		System.out.println("회원이름: " + name);
		System.out.println("회원나이: " + age);
	}
	
	// 출력 메소드 2번
	@Override
	public String toString() {
		return "회원번호: " + no + ", 이름: " + name + ", 나이: " + age;
	}
}

public class MemberTest01 {
	public static void main(String[] args) {
/*		
		Member member01 = new Member(123456, "우영우", 27);
		Member member02 = new Member(123457, "이준호", 29);
		Member member03 = new Member(123458, "정명석", 43);
		Member member04 = new Member(123459, "동그라미", 27);
		Member member05 = new Member(123460, "최수연", 27);
*/
		
/*		배열 생성 1번 방법		
		Member[] members = new Member[5];
		members[0] = new Member(123456, "우영우", 27);
		members[1] = new Member(123457, "이준호", 29);
		members[2] = new Member(123458, "정명석", 43);
		members[3] = new Member(123459, "동그라미", 27);
		members[4] = new Member(123460, "최수연", 27);
*/	
/*		배열 생성 2-1번 방법
		Member[] members = {
				new Member(123456, "우영우", 27), 
				new Member(123457, "이준호", 29), 
				new Member(123458, "정명석", 43), 
				new Member(123459, "동그라미", 27),
				new Member(123460, "최수연", 27),
		};
*/	
		Member[] members;
		members = new Member[] {
				new Member(123456, "우영우", 27), 
				new Member(123457, "이준호", 29), 
				new Member(123458, "정명석", 43), 
				new Member(123459, "동그라미", 27),
				new Member(123460, "최수연", 27),
		};
		
		System.out.println("◎ 회원 정보 출력 ◎");
		// 출력 2번 - 확장 for문, for-in문
		for (Member m : members) {
			System.out.println(m);
//			System.out.println(m.toString());
		}
		
/*		출력 1번 - 기본 for문 활용		
		for (int i=0; i<members.length; i++) {
			System.out.println(members[i]);
//			System.out.println(members[i].toString());
		}
*/
		
/*		3번 출력 방법 - 출력 메소드 2번 사용 - toString() 메소드 활용
		System.out.println("◎ 회원 정보 출력 ◎");
		System.out.println(member01);
		System.out.println(member02);
		System.out.println(member03);
		System.out.println(member04);
		System.out.println(member05.toString());
*/
	
/*		2번 출력 방법 - 출력 메소드 1번 사용
		System.out.println("◎ 회원 정보 출력 ◎");
		member01.printInfo();
		System.out.println();
		member02.printInfo();
		System.out.println();
		member03.printInfo();
		System.out.println();
		member04.printInfo();
		System.out.println();
		member05.printInfo();
		System.out.println();
*/
		
/*		1번 출력 방법 - getter 사용		
		System.out.println(" 회원번호 | 회원이름  | 회원나이 |");
		System.out.println("-----------------------");
		System.out.printf("%d| %4s   |   %d  |\n",member01.getNo(), member01.getName(), member01.getAge() );
		System.out.printf("%d| %4s   |   %d  |\n",member02.getNo(), member02.getName(), member02.getAge() );
		System.out.printf("%d| %4s   |   %d  |\n",member03.getNo(), member03.getName(), member03.getAge() );
		System.out.printf("%d| %4s  |   %d  |\n",member04.getNo(), member04.getName(), member04.getAge() );
		System.out.printf("%d| %4s   |   %d  |\n",member05.getNo(), member05.getName(), member05.getAge() );
*/
	}
}
