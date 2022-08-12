

// String 클래스와 StringBuffer 클래스의 차이점2
public class StringBufferTest02 {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC");
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		System.out.println("-----------------------");
		
		// < StringBuffer 안의 문자열을 비교 >
		// 1. == 연산자 : 두 문자열의 참조를 비교
		if (sb1 == sb2) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("두 문자열이 다릅니다.");
		}
		
		// ★★★★★
		// 2. equals(): StringBuffer의 equals() 메소드는 값이 아니라 , 참조를 비교함.
		// - 문제점: 주의해야 함.
		if (sb1.equals(sb2)) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("두 문자열이 다릅니다.");
		}
		
		// ★★★★★★★★★★
		// 3. 2번 문제의 해결책: 값을 비교하도록 하는 방법
		// - String 클래스의 equals() 메소드는 Object 클래스의 equals() 메소드를 오버라이딩하여 문자열의 값을 비교함
		// - StringBuffer를 통해 생성한 문자열을 비교할 때는 String 클래스로 바꿔서 비교해야 함
		// StringBuffer 클래스를 toString() 메소드를 이용해서 String 클래스로 변환한 다음에 비교한다.
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		if (s1.equals(s2)) {
			System.out.println("두 문자열이 같습니다.");
		} else {
			System.out.println("두 문자열이 다릅니다.");
		}
		
		
		
	}
}
