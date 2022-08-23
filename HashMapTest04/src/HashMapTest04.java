import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	
	private String sno;    // �л���ȣ
	private String sname;  // �л��̸�
	
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
1. Student�� �ν��Ͻ��� Ű�� ����ϰ�, �л��� ������ ������ ����ϴ� HashMap�� map�� �����Ͻÿ�.
2. �ʿ� �����͸� 5�� �߰��Ͻÿ�.
3. ���� Ű�� ���� �ߺ� ��� ���θ� Ȯ���Ͻÿ�.
4. ���� ���� ���� �ߺ� ��� ���θ� Ȯ���Ͻÿ�.
5. �����͸� 3���� ������� ����Ͻÿ�.
*/

public class HashMapTest04 {
	public static void main(String[] args) {
		
		// 1. Student�� �ν��Ͻ��� Ű�� ����ϰ�, �л��� ������ ������ ����ϴ� HashMap�� map�� �����Ͻÿ�.
		HashMap<Student, Integer> map = new HashMap<Student, Integer>();
		
		// 2. �ʿ� �����͸� 5�� �߰��Ͻÿ�.
		map.put(new Student("123451", "�쿵��"), 93);
		map.put(new Student("123452", "����ȣ"), 87);
		map.put(new Student("123453", "����"), 90);
		map.put(new Student("123454", "�ǹο�"), 78);
		map.put(new Student("123455", "�Ѽ���"), 74);
		System.out.println(map);
		System.out.println("----------");
		
		// 3. ���� Ű�� ���� �ߺ� ��� ���θ� Ȯ���Ͻÿ�.
		map.put(new Student("123451", "�쿵��"), 99);
		System.out.println(map);
		System.out.println("----------");
		
		// 4. ���� ���� ���� �ߺ� ��� ���θ� Ȯ���Ͻÿ�.
		map.put(new Student("123456", "�׶��"), 90);
		System.out.println(map);
		System.out.println("----------");
		
		// 5. ��� 1�� - Iterator, keySet()
		Set<Student> set = map.keySet();
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			int score = map.get(s);
			System.out.println(s.getSno() + "(" + s.getSname() + ", " + score + ")");
		}
		System.out.println("----------");
		
		// 5. ��� 2�� - Iterator, entrySet
		Set<Entry<Student, Integer>> set2 = map.entrySet();
		Iterator<Entry<Student, Integer>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Entry<Student, Integer> entry = it2.next();
			Student s = entry.getKey();
			int score = entry.getValue();
			System.out.println(s.getSno() + "(" + s.getSname() + ", " + score + ")");
		}
		System.out.println("----------");
		
		// 5. ��� 3�� - Ȯ�� for��, entrySet
		Set<Entry<Student, Integer>> entry2 = map.entrySet();
		for (Entry<Student, Integer> e : entry2) {
			Student s = e.getKey();
			int score = e.getValue();
			System.out.println(s.getSno() + "(" + s.getSname() + ", " + score + ")");
		}
		System.out.println("----------");
		
	}
}
