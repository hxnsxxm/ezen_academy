import java.util.Calendar;


// �� ���� ��¥ ������ ����
public class CalendarTest03 {
	public static void main(String[] args) {
		
		Calendar c1 = Calendar.getInstance();  // �ý����� ��¥, ���� ��¥(2022-08-17)
		Calendar c2 = Calendar.getInstance();  // Ŀ���� ��¥, ���� ������ ������(2023-7-10)
		
		c2.set(2023, 6, 10); // 2023�� 7�� 10��, ���� 1�� ���� ����
		
		long difference = Math.abs(c1.getTimeInMillis() - c2.getTimeInMillis());
		
		System.out.println("�� ��¥�� ����: " + difference + " �и���(ms)");  // 28252800013 ms
		System.out.println("�� ��¥�� ����: " + difference/1000 + " ��(s)"); // 28252800 s
		System.out.println("�� ��¥�� ����: " + difference/1000/60 + " ��(min)"); // 470880 min
		System.out.println("�� ��¥�� ����: " + difference/1000/60/60 + " �ð�(hour)");   // 7848 hour
		System.out.println("�� ��¥�� ����: " + difference/1000/60/60/24 + " ��(days)"); // 327 days
		
		
	}
}
