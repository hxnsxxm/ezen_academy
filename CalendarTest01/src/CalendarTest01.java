import java.util.Calendar;

public class CalendarTest01 {
	public static void main(String[] args) {
		
		// 1. Calendar 클래스의 인스턴스 생성 - 시스템의 날짜를 가져와서 사용하는 방법
		// - 추상 클래스이므로 new가 아니라, getInstance() 메소드를 통해서 인스턴스를 생성 
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);   // 1970년 부터, 보정은 필요없음
		int month = c.get(Calendar.MONTH) + 1; // 0 ~ 11
		int date = c.get(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월 " + date + "일");
		
		//int hour = c.get(Calendar.HOUR);       // 12시간제
		int hour = c.get(Calendar.HOUR_OF_DAY);  // 24시간제
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millisecond = c.get(Calendar.MILLISECOND); // 1000분의 1초
		
		System.out.println(hour + ":" + minute + ":" + second + ":"+ millisecond);
		
		
		System.out.println("--- Calendat 클래스에 추가된 기능 ---");
		System.out.println("올해의 몇 번째 주: " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달의 몇 번째 주: " + c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달의 몇 번째 일: " + c.get(Calendar.DATE));
		System.out.println("이달의 몇 번째 일: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("이달의 몇 번째 일: " + c.get(Calendar.DAY_OF_YEAR));
		// DAY_OF_WEEK - 1:일요일, 2:월요일, 3:화요일, 4:수요일, 5:목요일, 6:금요일, 7:토요일
		System.out.println("이 주의 몇 번째 일: " + c.get(Calendar.DAY_OF_WEEK));
		
		// 1. 요일을 만드는 방법
		String[] dayOfWeek = { "", "일", "월", "화", "수", "목", "금", "토" };
		System.out.println("오늘의 요일: " + dayOfWeek[c.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		// 2. 요일을 만드는 방법
		switch(c.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY: System.out.println("일요일"); break;
		case Calendar.MONDAY: System.out.println("월요일"); break;
		case Calendar.TUESDAY: System.out.println("화요일"); break;
		case Calendar.WEDNESDAY: System.out.println("수요일"); break;
		case Calendar.THURSDAY: System.out.println("화요일"); break;
		case Calendar.FRIDAY: System.out.println("금요일"); break;
		case Calendar.SATURDAY: System.out.println("토요일"); break;
		}
		
		
		
		
	}
}
