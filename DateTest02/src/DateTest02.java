import java.util.Calendar;
import java.util.Date;

// Date Ŭ������ Calendar Ŭ������ ��ȯ ���
public class DateTest02 {
	public static void main(String[] args) {
		
		// 1. Calendar --> Date Ŭ���� ��ȯ
		Calendar c = Calendar.getInstance();
		c.set(2022, 8, 10); // ������ �ƽþ� ����, 2022-09-10
		Date d = new Date(c.getTimeInMillis());
		int year = d.getYear() + 1900; // 1900 ����
		int month = d.getMonth() + 1;  // 1 ����
		int date = d.getDate();
		System.out.println(year + "�� " + month + "�� " + date + "��");
		System.out.println();
		
		// 2. Date --> Calendar Ŭ���� ��ȯ
		Date d1 = new Date();  // īŸ�� ������, 2022-11-21
		d1.setYear(2022-1900); // 1900 ����
		d1.setMonth(11-1);      // 1 ����
		d1.setDate(21);
		
		Calendar c1 = Calendar.getInstance();
		c1.setTime(d1);
		year = c1.get(Calendar.YEAR);
		month = c1.get(Calendar.MONTH) + 1;
		date = c1.get(Calendar.DATE);
		System.out.println(year + "�� " + month + "�� " + date + "��");
		
	}
}
