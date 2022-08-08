

class Day {
	// 멤버변수
	private int year;
	private int month;
	private int date;
	
	// 생성자 오버로딩
	public Day() {
		this.year = 2022;
		this.month = 1;
		this.date = 1;
	}
	
	public Day(int year) {
		this.year = year;
		this.month = 1;
		this.date = 1;
	}
	
	public Day(int year, int month) {
		this.year = year;
		this.month = month;
		this.date = 1;
	}
	
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
	
	// 두 개의 날짜를 비교하는 멤버 메소드
	public boolean equalDay(Day d) {
		return this.year==d.year && this.month==d.month && this.date==d.date;
	}
	
	// 날짜를 출력하는 메소드
	public String toString() {
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"};
		return String.format("%4d년 %2d월 %2d일 (%s요일)", year, month, date, weekDay[dayOfWeek()]);
	}
	
}


// 날짜를 생성하는 다양한 방법
public class DayTest03 {
	
	public static void main(String[] args) {
		
		Day day1 = new Day(2022, 8, 8);
		Day day2 = new Day(day1);
		Day day3 = new Day();
		Day day4 = new Day(2023);
		Day day5 = new Day(2022, 8);
		
		// 날짜 출력 2번 방법 - 날짜를 출력하는 멤버 메소드
		System.out.println(day1);  // day1.toString()
		
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		System.out.println(day5);
		
		
		// 날짜 출력 1번 방법
		/*
		String[] weekDay = {"일", "월", "화", "수", "목", "금", "토"	};
		System.out.println("day1: " + day1.getYear() + "년 " + day1.getMonth() + "월 " 
					+ day1.getDate() + "일 (" + weekDay[day1.dayOfWeek()] + "요일)");
		*/

		
	}

}
