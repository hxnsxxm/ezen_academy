import java.util.Scanner;


class Day {
	// �������
	private int year;
	private int month;
	private int date;
	
	// ������
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
	
}

// ����) �� ���� ��¥ �ν��Ͻ��� ���ϴ� ���

public class DayTest02 {

	// �� ���� ��¥�� ���ϴ� �޼ҵ� - static �޼ҵ� ����
	static boolean compareDay(Day d1, Day d2) {
		return d1.getYear()==d2.getYear() && d1.getMonth()==d2.getMonth() && d1.getDate()==d2.getDate();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		
		System.out.println("��¥ 1�� �Է��Ͻÿ�.");
		System.out.print("�� �Է�: ");
		y = sc.nextInt();
		System.out.print("�� �Է�: ");
		m = sc.nextInt();
		System.out.print("�� �Է�: ");
		d = sc.nextInt();
		Day day1 = new Day(y, m, d);
		
		System.out.println("��¥ 2�� �Է��Ͻÿ�.");
		System.out.print("�� �Է�: ");
		y = sc.nextInt();
		System.out.print("�� �Է�: ");
		m = sc.nextInt();
		System.out.print("�� �Է�: ");
		d = sc.nextInt();
		Day day2 = new Day(y, m, d);
		
		// �߸��� ��� - ������ ��
		/*
		if (day1 == day2) {
			System.out.println("�� ��¥�� �����ϴ�.");
		} else {
			System.out.println("�� ��¥�� �ٸ��ϴ�.");
		}
		*/
		
		// 1. �ùٸ� ��� 1�� - ��(����)�� ��
		/*
		if (day1.getYear() == day2.getYear() && 
				day1.getMonth() == day2.getMonth() && 
				day1.getDate() == day2.getDate()) {
			System.out.println("�� ��¥�� �����ϴ�.");
		} else {
			System.out.println("�� ��¥�� �ٸ��ϴ�.");
		}
		*/
		
		// 2. �ùٸ� ��� 2�� - static �޼ҵ带 ���, ���� ��
		/*
		if(compareDay(day1, day2)) {
			System.out.println("�� ��¥�� �����ϴ�.");
		} else {
			System.out.println("�� ��¥�� �ٸ��ϴ�.");
		}
		*/
		
		// 3. �ùٸ� ��� 3�� - ��� �޼ҵ带 ���, ���� �� -> ����
		// �� ���� ��¥�� ���ϴ� �͵� ��¥ Ŭ������ ����̹Ƿ� ��¥ Ŭ������ ��� �޼ҵ�� ����� ����ϴ� ���� �� ���� �����
		if(day1.equalDay(day2)) {
			System.out.println("�� ��¥�� �����ϴ�.");
		} else {
			System.out.println("�� ��¥�� �ٸ��ϴ�.");
		}
		
		sc.close();
		
	}
}
