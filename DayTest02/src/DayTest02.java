import java.util.Scanner;


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
	
	// 두 개의 날짜를 비교하는 멤버 메소드
	public boolean equalDay(Day d) {
		return this.year==d.year && this.month==d.month && this.date==d.date;
	}
	
}

// 문제) 두 개의 날짜 인스턴스를 비교하는 방법

public class DayTest02 {

	// 두 개의 날짜를 비교하는 메소드 - static 메소드 생성
	static boolean compareDay(Day d1, Day d2) {
		return d1.getYear()==d2.getYear() && d1.getMonth()==d2.getMonth() && d1.getDate()==d2.getDate();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.println("날짜 1을 입력하시오.");
		System.out.print("년 입력: ");
		y = sc.nextInt();
		System.out.print("월 입력: ");
		m = sc.nextInt();
		System.out.print("일 입력: ");
		d = sc.nextInt();
		Day day1 = new Day(y, m, d);
		
		System.out.println("날짜 2를 입력하시오.");
		System.out.print("년 입력: ");
		y = sc.nextInt();
		System.out.print("월 입력: ");
		m = sc.nextInt();
		System.out.print("일 입력: ");
		d = sc.nextInt();
		Day day2 = new Day(y, m, d);
		
		// 잘못된 방법 - 참조를 비교
		/*
		if (day1 == day2) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		*/
		
		// 1. 올바른 방법 1번 - 값(내용)을 비교
		/*
		if (day1.getYear() == day2.getYear() && 
				day1.getMonth() == day2.getMonth() && 
				day1.getDate() == day2.getDate()) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		*/
		
		// 2. 올바른 방법 2번 - static 메소드를 사용, 값을 비교
		/*
		if(compareDay(day1, day2)) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		*/
		
		// 3. 올바른 방법 3번 - 멤버 메소드를 사용, 값을 비교 -> 권장
		// 두 개의 날짜를 비교하는 것도 날짜 클래스의 기능이므로 날짜 클래스의 멤버 메소드로 만들어 사용하는 것이 더 좋은 방법임
		if(day1.equalDay(day2)) {
			System.out.println("두 날짜는 같습니다.");
		} else {
			System.out.println("두 날짜는 다릅니다.");
		}
		
		sc.close();
		
	}
}
