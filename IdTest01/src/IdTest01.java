
/*
 문제) main 메소드에 Id 클래스의 인스턴스를 3개 만들고, id의 값은 인스턴스를 생성할 때 자동으로 1씩 증가하도록 하시오.
 각 인스턴스의 id값을 출력하고, 지금까지 생성된 인스턴스의 수를 출력하도록 하시오.
  
*/
class Id {
	private static int count = 0; // 클래스 변수
	private int id;  // 인스턴스 변수
	
	// 생성자
	public Id() {
		id = ++count;
	}
	
	// 클래스 메소드
	public static int getCount() { return count; }
	
	// 인스턴스 메소드
	public int getId() { return id; }
	
	public void setId(int id) { this.id = id; }
	
	public String toString() {
		return "ID : " + id;
	}
	
}

public class IdTest01 {
	public static void main(String[] args) {
		Id id01 = new Id();
		Id id02 = new Id();
		Id id03 = new Id();
		
		System.out.println(id01);
		System.out.println(id02);
		System.out.println(id03);
		
		// System.out.println("총 생성된 인스턴스의 개수: " + a.getCount()); // 지양해야 하는 방법
		// (1) 클래스 메소드 임에도 a만의 메소드처럼 보인다.
		// (2) 인스턴스 a가 사리지면 에러가 발생해 프로그램이 동작하지 않는다.
		System.out.println("총 생성된 인스턴스의 개수: " + Id.getCount());   // 권장하는 방법
	}
}
