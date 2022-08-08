import java.util.Scanner;

// 날짜 클래스
// 멤버변수 - 년, 월, 일
// 생성자, getter/setter, 출력 메소드
class Day {
	// 멤버변수
	private int year;
	private int month;
	private int date;
	
	// 생성자
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 복사 생성자
	public Day(Day d) {
		this.year = d.year;
		this.month = d.month;
		this.date = d.date;
	}
	
	// getter
	public int getYear() { return year; }
	public int getMonth() { return month; }
	public int getDate() { return date; }
	
	// setter
	public void setYear(int year) { this.year = year; }
	public void setMonth(int month) { this.month = month; }
	public void setDate(int date) { this.date = date; }
	
	// 년, 월, 일을 한꺼번에 설정하는 메소드
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	
	
	// 요일을 계산하는 메소드
	// 제라의 공식 - 0~6 사이의 값을 리턴
	// 0: 일요일, 1: 월요일, 2:화요일, 3: 수요일, 4:목요일, 5:금요일, 6: 토요일
	public int dayOfWeek() {
		int y = year;
		int m = month;
		int d = date;
		
		if (m==1 || m==2) {
			y--;
			m += 12;
		}
		
		return(y + y/4 - y/100 + y/400 + (13*m + 8)/5 + d) % 7;
	}
	
}

public class DayTest01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("생년월일을 입력하시오.");
		System.out.print("년 입력: ");
		int year = sc.nextInt();
		System.out.print("월 입력: ");
		int month = sc.nextInt();
		System.out.print("일 입력: ");
		int date = sc.nextInt();
		
		Day birthday = new Day(year, month, date);
		
		// ★★★★★ 참조변수
		// Day xDay = birthday;       // 1번 - 참조를 복사: xDay를 통해서 birthday의 값을 변경하게 됨
		Day xDay = new Day(birthday); // 2번 - 복사 생성자를 통해 인스턴스를 생성하고 값을 복사: xDay의 값을 변경할 뿐, birthday를 건드리지 않음
		xDay.set(2022, 11, 21);
		
		
		System.out.println("birthday: " + birthday.getYear() + "년 " + birthday.getMonth() + "월 " 
				+ birthday.getDate() + "일 (" + weekDay[birthday.dayOfWeek()]+ "요일)"); 
		System.out.println("birthday: " + xDay.getYear() + "년 " + xDay.getMonth() + "월 " 
				+ xDay.getDate() + "일 (" + weekDay[xDay.dayOfWeek()]+ "요일)");
		
		sc.close();
	}
}
