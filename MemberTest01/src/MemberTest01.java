
/*
 * ����) �Ʒ��� ���ǿ� �����ϵ��� �ϴ� ȸ�� Ŭ������ �����ϰ�, Ȱ���Ͻÿ�.
 *   1. Ŭ������: Member
 *   2. �������: ȸ����ȣ(no), ȸ���̸�(name), ȸ������(age), private�� ����
 *   3. ������   : �ν��Ͻ��� ���鶧 ��������� �ʱ�ȭ, public���� ����
 *   4. ����޼ҵ� : getter / setter �޼ҵ� ����, public���� ����
 *   5. main �޼ҵ忡�� Member Ŭ������ �ν��Ͻ��� 5�� �����Ͻÿ�. 3������ ������ �����ڸ� Ȱ���Ͻÿ�.
 *   6. getter �޼ҵ带 ����Ͽ� �ν��Ͻ��� ������ ����Ͻÿ�.  
 * 
 * < �ν��Ͻ� ���� ������ >
 * 123456, �쿵��, 27
 * 123457, ����ȣ, 29
 * 123458, ����, 43
 * 123459, ���׶��, 27
 * 123460, �ּ���, 27
 * 
 */

class Member {
	private int no;  // ȸ����ȣ�� String���� �����ϴ� �� �Ϲ�����
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
	
	// ��� �޼ҵ� 1��
	public void printInfo() {
		System.out.println("ȸ����ȣ: " + no);
		System.out.println("ȸ���̸�: " + name);
		System.out.println("ȸ������: " + age);
	}
	
	// ��� �޼ҵ� 2��
	@Override
	public String toString() {
		return "ȸ����ȣ: " + no + ", �̸�: " + name + ", ����: " + age;
	}
}

public class MemberTest01 {
	public static void main(String[] args) {
/*		
		Member member01 = new Member(123456, "�쿵��", 27);
		Member member02 = new Member(123457, "����ȣ", 29);
		Member member03 = new Member(123458, "����", 43);
		Member member04 = new Member(123459, "���׶��", 27);
		Member member05 = new Member(123460, "�ּ���", 27);
*/
		
/*		�迭 ���� 1�� ���		
		Member[] members = new Member[5];
		members[0] = new Member(123456, "�쿵��", 27);
		members[1] = new Member(123457, "����ȣ", 29);
		members[2] = new Member(123458, "����", 43);
		members[3] = new Member(123459, "���׶��", 27);
		members[4] = new Member(123460, "�ּ���", 27);
*/	
/*		�迭 ���� 2-1�� ���
		Member[] members = {
				new Member(123456, "�쿵��", 27), 
				new Member(123457, "����ȣ", 29), 
				new Member(123458, "����", 43), 
				new Member(123459, "���׶��", 27),
				new Member(123460, "�ּ���", 27),
		};
*/	
		Member[] members;
		members = new Member[] {
				new Member(123456, "�쿵��", 27), 
				new Member(123457, "����ȣ", 29), 
				new Member(123458, "����", 43), 
				new Member(123459, "���׶��", 27),
				new Member(123460, "�ּ���", 27),
		};
		
		System.out.println("�� ȸ�� ���� ��� ��");
		// ��� 2�� - Ȯ�� for��, for-in��
		for (Member m : members) {
			System.out.println(m);
//			System.out.println(m.toString());
		}
		
/*		��� 1�� - �⺻ for�� Ȱ��		
		for (int i=0; i<members.length; i++) {
			System.out.println(members[i]);
//			System.out.println(members[i].toString());
		}
*/
		
/*		3�� ��� ��� - ��� �޼ҵ� 2�� ��� - toString() �޼ҵ� Ȱ��
		System.out.println("�� ȸ�� ���� ��� ��");
		System.out.println(member01);
		System.out.println(member02);
		System.out.println(member03);
		System.out.println(member04);
		System.out.println(member05.toString());
*/
	
/*		2�� ��� ��� - ��� �޼ҵ� 1�� ���
		System.out.println("�� ȸ�� ���� ��� ��");
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
		
/*		1�� ��� ��� - getter ���		
		System.out.println(" ȸ����ȣ | ȸ���̸�  | ȸ������ |");
		System.out.println("-----------------------");
		System.out.printf("%d| %4s   |   %d  |\n",member01.getNo(), member01.getName(), member01.getAge() );
		System.out.printf("%d| %4s   |   %d  |\n",member02.getNo(), member02.getName(), member02.getAge() );
		System.out.printf("%d| %4s   |   %d  |\n",member03.getNo(), member03.getName(), member03.getAge() );
		System.out.printf("%d| %4s  |   %d  |\n",member04.getNo(), member04.getName(), member04.getAge() );
		System.out.printf("%d| %4s   |   %d  |\n",member05.getNo(), member05.getName(), member05.getAge() );
*/
	}
}
