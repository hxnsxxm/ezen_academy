
// String 클래스와 StringBuffer 클래스의 차이점
public class StringBufferTest01 {
	public static void main(String[] args) {
		
		// 1. String의 문제점
		// - String 클래스에서 값의 추가, 삭제, 변경을 하게 되면 인스턴스를 변경하게 됨
		// - 변경 전의 해시코드와 변경 후의 해시코드가 다름.
		// - String 클래스의 특징: immutable한 특성
		
		String s1 = "ABC";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println("------------------");
		
		//s1 = s1 + "DEF";  // s1 += "DEF";
		s1 = s1.concat("DEF");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println("==================");
		
		// 2. StringBuffer
		// - String 클래스의 immutable한 특성의 문제정을 보완함
		// - 값을 추가, 삭제 시에 자신의 인스턴스를 그대로 증가, 감소시켜서 사용함
		// - 값의 추가, 삭제를 하기 전과 후에 인스턴스의 해시코드가 같음
		// - StringBuffer의 특성: mutable한 특성
		
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println("------------------");
		
		sb1.append("DEF");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		
		
		
	}
}
