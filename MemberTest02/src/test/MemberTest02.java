package test;

/*
1. Member Ŭ���� 
- SpecialMember�� �θ� Ŭ����
- �������: ȸ���̸�(name), ȸ����ȣ(no), ȸ������(age)
- ������
- getter/setter
- ��� �޼ҵ� 2����, showInfo(), toString()

2. SpecialMember Ŭ����
- Member Ŭ������ �ڽ� Ŭ����
- �������: Ư�� ����(privilege)
- ������
- getter/setter
- ��� �޼ҵ� 2���� - �������̵��ؼ� ����

3. main() �޼ҵ�
- Member �ν��Ͻ� 2��, SpecialMember �ν��Ͻ� 2���� ���� ����Ͻÿ�.

*/

import member.Member;
import member.SpecialMember;

public class MemberTest02 {
	public static void main(String[] args) {
		Member mem01 = new Member("John", "123456", 32);
		Member mem02 = new Member("Mary", "123457", 30);
		
		SpecialMember sm01 = new SpecialMember("Tomy", "912345", 36, "����");
		SpecialMember sm02 = new SpecialMember("Sam", "912346", 28, "����");
		
		Member[] mem = new Member[] {
				new Member("John", "123456", 32),
				new Member("Mary", "123457", 30),
				new SpecialMember("Tomy", "912345", 36, "����"),
				new SpecialMember("Sam", "912346", 28, "����"),
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
