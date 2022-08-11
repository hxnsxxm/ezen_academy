
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// 8. length(): 문자열의 길이를 리턴.
		System.out.println("길이: " + s1.length());
		
		// 9. replace(): 문자열에서 특정 문자열을 새로운 문자열로 모두다 변결함.
		s1 = s1.replace("!", "?");
		System.out.println(s1);
		s1 = s1.replace("Java", "Python");
		System.out.println(s1);
		s1 = s1.replace("l", "L");
		System.out.println(s1);
		
		// 10. replaceFirst(): 문자열에서 특정 문자열을 첫번째로 나오는 문자열만 변경함
		s1 = s1.replaceFirst("o", "O");
		System.out.println(s1);
		
		// 11. toUpperCase(): 문자열의 모든 문자를 대문자로 변경함
		System.out.println(s1.toUpperCase());
		
		// 12. toLowerCase(): 문자열의 모든 문자를 소문자로 변경함
		System.out.println(s1.toLowerCase());
		
		// 13. trim(): 문자열의 앞뒤의 공백을 제거함
		String t2 = "       Hello    Java      World!!     ";
		System.out.println(t2 + "@");
		System.out.println(t2.trim() + "@");
		
		// 14. equals(): 문자열의 값을 비교하여 같은지의 여부를 알려줌
		String s3 = new String("ABC");
		String s4 = new String("XYZ");
		String s5 = new String("ABC");
		
		System.out.println(s3 == s5);
		System.out.println(s3.equals(s5));
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals("ABC"));
		
		// 15. equalsIgnoreCase(): 문자열의 값을 대소문자 구분없이 비교
		String s6 = "abc";
		System.out.println(s3.equals(s6));
		System.out.println(s3.equalsIgnoreCase(s6));
	}
}
