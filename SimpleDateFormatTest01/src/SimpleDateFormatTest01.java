import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDateFormet - 날짜 데이터를 다양한 형식으로 출력할 수 있도록 하는 클래스
public class SimpleDateFormatTest01 {
	public static void main(String[] args) {
		
		// 2022년 3월 9일, 2022-03-09 13:05:09
		Date d = new Date(2022-1900, 3-1, 9, 13, 5, 9);
		
		System.out.println(d.toGMTString());
		System.out.println(d.toLocaleString());
		System.out.println();
		
		// SimpleDateFormat 클래스를 사용하여 날짜 포매팅
		// 날짜는 주로 - 또는 / 로 연결하여 사용, 시간은 :으로 연결하여 사용
		// yyyy: 년도 4자리(ex, 2022), yy: 년도 2자리(ex, 22)
		// MM: 월 2자리(ex, 09), M: 월 1자리(ex, 9) 
		// dd: 일 2자리(ex, 07), d: 일 1자리(ex, 7)
		// HH: 24시간 2자리, hh: 12시간 2자리, h: 12시간 1자리
		// mm: 분 2자리, m: 분 1자리
		// ss: 초 2자리, s: 초 1자리
		// a: 오전 오후 표시
		// E: 요일 표시
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 M월 d일");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf5 = new SimpleDateFormat("HH시 mm분 ss초");
		SimpleDateFormat sdf6 = new SimpleDateFormat("hh시 m분 s초");
		SimpleDateFormat sdf7 = new SimpleDateFormat("h시 m분 s초");
		SimpleDateFormat sdf8 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf9 = new SimpleDateFormat("yyyy-MM-dd(E) a hh:mm:ss");
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		System.out.println(sdf5.format(d));
		System.out.println(sdf6.format(d));
		System.out.println(sdf7.format(d));
		System.out.println(sdf8.format(d));
		System.out.println(sdf9.format(d));
		
	}
}
