import java.util.Calendar;

// ex) 영수증 의 일련번호 할당
class DateId {
	// overflow : int의 범위를 넘을 수 있음
	//private static int count;
	//private int id;
	private static long count;
	private long id;
	
	// 클래스 초기화 블럭, 클래스 초기자
	static {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);       // 년도
		int month = c.get(Calendar.MONTH) + 1; // 월, 0 ~ 11
		int date = c.get(Calendar.DATE);       // 일
		
		count = (long)year*10000000 + month*100000 + date*1000;
	}
	
	public DateId() {
		id = ++count;
	}
	
	public long getId() { return id; }
}

public class DateIdTest01 {
	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		
		System.out.println("a : " + a.getId());
		System.out.println("b : " + b.getId());
		System.out.println("c : " + c.getId());
	}
}
