import java.util.Calendar;

/*
< 날짜를 보정하는 2개 메소드 차이점 >
1.  add() : 일을 변경할 경우, 월과 년까지 함께 보정. 월을 변경할 경우, 년까지 함께 보정한다.
2. roll() : 일을 변경할 경우 일만 변경. 월을 변경할 경우에는 월만 변경. 변경하는 년, 월, 일만 변경할 뿐 다른 것은 보정하지 않는다. 


*/


public class CalendarTest04 {
	
	public static void printDate(Calendar c) {
		System.out.println(c.get(Calendar.YEAR) + "년 " + 
				(c.get(Calendar.MONTH)+1) + "월 " + c.get(Calendar.DATE) + "일"  );
	}
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		// 날짜 설정
		c.set(2022,  8 , 10); // 항저우 아시안 게임 개막일(2022-09-10)
		// 날짜에 대한 모든 정보 확인
		System.out.println(c.toString());
		// 간단한 날짜 정보 확인(외국 방식)
		System.out.println(c.getTime());
		
		// < 날짜를 보정하는 다양한 방법 >
		System.out.println("--- 최초 설정 날짜 ---");
		printDate(c);
		System.out.println("--- 1일 후 ---");
		c.add(Calendar.DATE,  1);
		printDate(c);
		System.out.println("--- 1일 전 ---");
		c.add(Calendar.DATE, -1);
		printDate(c);
		System.out.println("--- 1주 후 ---");
		c.add(Calendar.DATE, 7);
		printDate(c);
		System.out.println("--- 3주 후 ---");
		c.add(Calendar.DATE, 21);
		printDate(c);
		System.out.println("--- 5개월 후 ---");
		c.add(Calendar.MONTH, 5);
		printDate(c);
		System.out.println("--- 3개월 전 ---");
		c.add(Calendar.MONTH, -3);
		printDate(c);
		System.out.println();
		System.out.println("--- 40일 후 ---");
		c.roll(Calendar.DATE, 40);
		printDate(c);
		System.out.println("--- 6개월 후(roll) ---");
		c.roll(Calendar.MONTH,  6);
		printDate(c);
		
		
		
	}
}
