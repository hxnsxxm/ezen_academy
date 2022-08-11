
public class StringTest04 {
	public static void main(String[] args) {
		String s1 = null; // s1은 아무 곳도 참조하고 있지 않은 상태, null 참조
		String s2 = "";   // 빈 문자열
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("--------");
		
		//System.out.println(s1.hashCode()); // 예외: NullPointerException
		System.out.println(s2.hashCode());
		System.out.println("--------");
		
		char[] c = new char[] {
				'H','E','L','L','O',
		};
		String s3 = new String(c);
		System.out.println(c);
		System.out.println(s3);
		
		
		
	}
}
