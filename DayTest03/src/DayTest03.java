

class Day {
	// �������
	private int year;
	private int month;
	private int date;
	
	// ������ �����ε�
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
	
	// ���� ������
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
	
	// ��, ��, ���� �Ѳ����� �����ϴ� �޼ҵ�
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// ������ ����ϴ� �޼ҵ�
	// ������ ���� - 0~6 ������ ���� ����
	// 0: �Ͽ���, 1: ������, 2:ȭ����, 3: ������, 4:�����, 5:�ݿ���, 6: �����
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
	
	// �� ���� ��¥�� ���ϴ� ��� �޼ҵ�
	public boolean equalDay(Day d) {
		return this.year==d.year && this.month==d.month && this.date==d.date;
	}
	
	// ��¥�� ����ϴ� �޼ҵ�
	public String toString() {
		String[] weekDay = {"��", "��", "ȭ", "��", "��", "��", "��"};
		return String.format("%4d�� %2d�� %2d�� (%s����)", year, month, date, weekDay[dayOfWeek()]);
	}
	
}


// ��¥�� �����ϴ� �پ��� ���
public class DayTest03 {
	
	public static void main(String[] args) {
		
		Day day1 = new Day(2022, 8, 8);
		Day day2 = new Day(day1);
		Day day3 = new Day();
		Day day4 = new Day(2023);
		Day day5 = new Day(2022, 8);
		
		// ��¥ ��� 2�� ��� - ��¥�� ����ϴ� ��� �޼ҵ�
		System.out.println(day1);  // day1.toString()
		
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		System.out.println(day5);
		
		
		// ��¥ ��� 1�� ���
		/*
		String[] weekDay = {"��", "��", "ȭ", "��", "��", "��", "��"	};
		System.out.println("day1: " + day1.getYear() + "�� " + day1.getMonth() + "�� " 
					+ day1.getDate() + "�� (" + weekDay[day1.dayOfWeek()] + "����)");
		*/

		
	}

}
