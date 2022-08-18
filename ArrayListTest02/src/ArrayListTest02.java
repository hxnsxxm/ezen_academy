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
		
		// 1. ����Ʈ ����
		ArrayList<Member> list = new ArrayList<Member>();
		
		// 2. ������ ����
		Member m1 = new Member("123451", "�쿵��", 27);
		list.add(m1);
		
		list.add(new Member("123452", "�Ѽ���", 27));
		list.add(new Member("123453", "����", 43));
		list.add(new Member("123454", "����ȣ", 30));
		list.add(new Member("123455", "�ǹο�", 30));
		
		System.out.println(list);
		System.out.println("----------");
		
		// 3. ��� (�⺻ for��)
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); // list.get(i).toString()
		}
		System.out.println("----------");
		
		// 3. ��� (Ȯ�� for��)
		for (Member m : list) {
			System.out.println(m); // m.toString()
		}
		System.out.println("----------");
		
		// 4. ������ ���� (������ ����)
		// �� �ڿ� �׸��� ������ ����
		list.add(new Member("123456", "�׶��", 27));
		for (Member m : list) {
			System.out.println(m); // m.toString()
		}
		System.out.println("----------");
		
		// 5. ������ ���� (������� ����, �߰�)
		// ���� ������ �Ѽ��� ������ ����
		// ?
		// list.add(3, new Member("123457", "�Ѽ���", 48));
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("����")) {
				list.add(i+1, new Member("123457", "�Ѽ���", 48));
				break;
			}
		}
		for (Member m : list) {
			System.out.println(m); // m.toString()
		}
		System.out.println("----------");
		
		// 6. ������ ����
		// �Ѽ��� ������ ���̸� 29�� ����
		// ?
		System.out.println("- 6. ������ ����(�Ѽ��� ���� ����) -");
		for (Member m : list) {
			//if ( m.getName() == "�Ѽ���" ) {  // ������ ���ϴ� �Ŷ� ����ϸ� �ȵ�
			if (m.getName().equals("�Ѽ���")) {
				m.setAge(29);
				break;
			}
		}
		
		
		//list.get(1).setAge(29);
		for (Member m : list) {
			System.out.println(m); // m.toString()
		}
		System.out.println("----------");
		
		// 7. ������ ����
		// �ǹο� ������ ����
		// ?
		//list.remove(5);
		System.out.println("- 7. ������ ����(�ǹο� ����) -");
		for (int i=list.size()-1; i>=0; i--) {
			if (list.get(i).getName().equals("�ǹο�")) {
				list.remove(i);
				break;
			}
		}
		for (Member m : list) {
			System.out.println(m); // m.toString()
		}
		System.out.println("----------");
		
		// 8. ��� 3��
		System.out.println("- 8. ��� 3�� -");
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
			Member m = it.next();
			System.out.println(m);
		}
		
		
		
	}
}
