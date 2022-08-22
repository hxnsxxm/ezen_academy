import java.util.Iterator;
import java.util.TreeSet;

/*
문제)
1. 학번(sno), 이름(sname), 점수(score)를 멤버변수로 가지는 Student 클래스를 생성하시오.
2. Student의 인스턴스 5개를 저장하는 TreeSet인 set을 생성하시오.
3. 셋이 정렬 기능리 구현되도록 에러를 수정하시오.
4. 셋에서 중복 데이터의 허용 여부와 데이터의 삭제 여부를 확인하시오.
5. 셋의 내룔을 3가지 방법으로 출력하시오. (확장 for문, Iterator, isEmpty())
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
	
	/*// 학번순으로 데이터 정렬                                                                                                                                                              
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
	
		set.add(new Student("123451", "우영우", 87));
		set.add(new Student("123452", "이준호", 93));
		set.add(new Student("123453", "권민우", 79));
		set.add(new Student("123454", "한혜인", 60));
		set.add(new Student("123455", "권명석", 99));
		
		System.out.println(set);
		
		// < 중복 데이터 추가 확인 > 
		// 1. 데이터 추가 - 학번 중복
		set.add(new Student("123451", "배수미", 66));
		System.out.println(set);
		
		// 2. 데이터 추가 - 이름 중복
		set.add(new Student("123456", "우영우", 77));
		System.out.println(set);
		
		// 3. 데이터 추가 - 점수 중복
		set.add(new Student("123457", "이기광", 99));
		System.out.println(set);
		
		
		// < 데이터 삭제 확인 >
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
