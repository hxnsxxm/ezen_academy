import java.util.Iterator;
import java.util.TreeSet;

/*
����)
1. �й�(sno), �̸�(sname), ����(score)�� ��������� ������ Student Ŭ������ �����Ͻÿ�.
2. Student�� �ν��Ͻ� 5���� �����ϴ� TreeSet�� set�� �����Ͻÿ�.
3. ���� ���� ��ɸ� �����ǵ��� ������ �����Ͻÿ�.
4. �¿��� �ߺ� �������� ��� ���ο� �������� ���� ���θ� Ȯ���Ͻÿ�.
5. ���� ������ 3���� ������� ����Ͻÿ�. (Ȯ�� for��, Iterator, isEmpty())
*/

class Student implements Comparable<Student> {
	
	private String sno;
	private String sname;
	private int score;
	
	public Student(String sno, String sname, int score) {
		this.sno = sno;
		this.sname = sname;
		this.score = score;
	}
	
	public String getSno() { return sno; }
	public String getSname() { return sname; }
	public int getScore() { return score; }
	
	public void setSno(String sno) { this.sno = sno; }
	public void setSname(String sname) { this.sname = sname; }
	public void setScore(int score) { this.score = score; }
	
	@Override
	public String toString() {
		return sno + "(" + sname + ", " + score + ")";
	}
	
	/*// �й������� ������ ����                                                                                                                                                              
	@Override
	public int compareTo(Student s) {
		if (sno.compareTo(s.sno) > 0) return 1;
		else if(sno.compareTo(sno) < 0) return -1;
		else return 0;
	}
	*/
	/*
	@Override
	public int compareTo(Student s) {
		if (sname.compareTo(s.sname) > 0) return 1;
		else if(sname.compareTo(sname) < 0) return -1;
		else return 0;
	}
	*/
	@Override
	public int compareTo(Student s) {
		if (score > s.score) return 1;
		else if(score < s.score) return -1;
		else return 0;
	}
}

public class TreeSetTest08 {
	public static void main(String[] args) {
		
		TreeSet<Student> set = new TreeSet<Student>();
	
		set.add(new Student("123451", "�쿵��", 87));
		set.add(new Student("123452", "����ȣ", 93));
		set.add(new Student("123453", "�ǹο�", 79));
		set.add(new Student("123454", "������", 60));
		set.add(new Student("123455", "�Ǹ�", 99));
		
		System.out.println(set);
		
		// < �ߺ� ������ �߰� Ȯ�� > 
		// 1. ������ �߰� - �й� �ߺ�
		set.add(new Student("123451", "�����", 66));
		System.out.println(set);
		
		// 2. ������ �߰� - �̸� �ߺ�
		set.add(new Student("123456", "�쿵��", 77));
		System.out.println(set);
		
		// 3. ������ �߰� - ���� �ߺ�
		set.add(new Student("123457", "�̱Ɽ", 99));
		System.out.println(set);
		
		
		// < ������ ���� Ȯ�� >
		// 
		
		
		for (Student s : set) {
			System.out.println(s);
		}
		System.out.println("-----");
		
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----");
		
		while (!set.isEmpty()) {
			System.out.println(set.pollFirst());
		}
		
		
	}
}
