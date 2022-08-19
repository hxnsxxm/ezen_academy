import java.util.HashSet;
import java.util.Iterator;

/*
����) 
1. �й�(sno)�� �̸�(sname)�� ��������� ���� Student Ŭ������ �����Ͻÿ�.
- �������, ������, getter/setter, toString() ����
2. Student�� �ν��Ͻ��� �����ϴ� HashSet�� set�� �����Ͻÿ�.
3. set�� �л� ���� 5���� �Է��ϰ�, Ȯ���Ͻÿ�.
- 123451 ~ 123455, �쿵��, ����ȣ, �Ѽ���, ����, �ǹο�
4. set�� �ߺ� �����͸� �Է��Ͽ� Ȯ���ϰ� �������� �ִٸ� �ذ��ϵ��� �Ͻÿ�.
5. set���� �����͸� �����Ͽ� Ȯ���ϰ�, �������� �ִٸ� �ذ��ϵ��� �Ͻÿ�.
6. set�� ��� ������ 2���� ������� ����Ͻÿ�. (Ȯ�� for��, Iterator)
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
	
	// HashSet���� Object Ŭ������ hashCode(), equals() �޼ҵ带 �������̵��Ͽ�
	// �ߺ� ������ ������ ��� �Ұ��� �������� ���� ������ �ذ���
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
		
		System.out.println("- 2. set ���� -");
		HashSet<Student> set = new HashSet<Student>();
		
		System.out.println("- 3. �л� ���� �Է� -");
		set.add(new Student("123451", "�쿵��"));
		set.add(new Student("123452", "����ȣ"));
		set.add(new Student("123453", "�Ѽ���"));
		set.add(new Student("123454", "����"));
		set.add(new Student("123455", "�ǹο�"));
		System.out.println(set);
		
		System.out.println("- 4. �ߺ� ������ �߰� ��� �Ұ� �۾� -");
		// �й��� ���� ���
		set.add(new Student("123455", "�����"));
		System.out.println(set);
		// �̸��� ���� ���
		set.add(new Student("123457", "����ȣ"));
		System.out.println(set);
		// �й��� �̸��� ��� ���� ���
		set.add(new Student("123455", "�ǹο�"));
		System.out.println(set);
		
		System.out.println("- 5. ������ ���� -");
		set.remove(new Student("123453", "�Ѽ���"));
		System.out.println(set);
		
		System.out.println("- 6. ������ ��� 1 (Ȯ�� for��) -");
		for (Student s : set) {
			System.out.println(s);
		}
		
		System.out.println("- 7. ������ ��� 2 (Iterator) -");
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}

	}
}
