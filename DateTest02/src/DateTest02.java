import java.util.Calendar;
import java.util.Date;

// Date 클래스와 Calendar 클래스의 변환 방법
public class DateTest02 {
	public static void main(String[] args) {
		
		// 1. Calendar --> Date 클래스 변환
		Calendar c = Calendar.getInstance();
		c.set(2022, 8, 10); // 항저우 아시안 게임, 2022-09-10
		Date d = new Date(c.getTimeInMillis());
		int year = d.getYear() + 1900; // 1900 보정
		int month = d.getMonth() + 1;  // 1 보정
		int date = d.getDate();
		System.out.println(year + "년 " + month + "월 " + date + "일");
		System.out.println();
		
		// 2. Date --> Calendar 클래스 변환
		Date d1 = new Date();  // 카타르 월드컵, 2022-11-21
		d1.setYear(2022-1900); // 1900 보정
		d1.setMonth(11-1);      // 1 보정
		d1.setDate(21);
		
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1);
		year = c1.get(Calendar.YEAR);
		month = c1.get(Calendar.MONTH) + 1;
		date = c1.get(Calendar.DATE);
		System.out.println(year + "년 " + month + "월 " + date + "일");
		
	}
}
