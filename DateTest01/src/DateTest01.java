import java.util.Date;

/*
Date 클래스 - java 1.0 버전부터 사용
Calendar 클래스 - Date 클래스의 기능을 보완하고 개성하여 성능을 향상시킨 클래스, java 1.1 버전부터 사용
*/

public class DateTest01 {
	public static void main(String[] args) {
		
		// 1. Date 활용 1번 - 현재 시스템의 날짜
		Date d1 = new Date();
		
		int year = d1.getYear() + 1900; // 보정해야 함, 1900년도부터 시작
		int month = d1.getMonth() + 1;  // 보정해야 함, 0~11 사이의 값
		int date = d1.getDate();
		
		// 시분초
		int hour = d1.getHours();    // 0 ~ 23
		int minute = d1.getMinutes(); // 0 ~59
		int second = d1.getSeconds();
		
		System.out.print(year + "년 " + month + "월 " + date + "일 ");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		System.out.println(d1.toGMTString());
		System.out.println(d1.toLocaleString());
		System.out.println("-----------");
		
		// 2. Date 인스턴스의 날짜 및 시간 설정
		// 2023년 호주 여자 월드컵 개막일: 2023년 7월 10일
		Date d2 = new Date();
		d2.setYear(123);  // 1900 년도 부터 -> 보정해야 함
		d2.setMonth(6);   // 7 -> 외국에서는 8월의 의미가 됨
		d2.setDate(10);
		
		d2.setHours(19);
		d2.setMinutes(30);
		d2.setSeconds(35);
		
		int y = d2.getYear() + 1900;
		int m = d2.getMonth() + 1;  // 0~11 사이의 값, 보정해야 함
		int d = d2.getDate();
		
		int h = d2.getHours();
		int mi = d2.getMinutes();
		int s = d2.getSeconds();
		
		System.out.print(y + "년 " + m + "월 " + d + "일 ");
		System.out.println(h + "시 " + mi + "분 " + s + "초");
		System.out.println(d2.toGMTString());
		System.out.println(d2.toLocaleString());
		
		
		
		
	}
}
