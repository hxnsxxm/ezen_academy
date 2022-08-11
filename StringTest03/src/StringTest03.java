import java.util.Scanner;

public class StringTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열1 입력: ");
		String s1 = sc.next();
		System.out.print("문자열2 입력: ");
		String s2 = sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("-------");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("-------");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("-------");
		
		// < 문자열을 비교하는 여러 가지 방법 >
		// 1. == 연산자: 문자열의 참조를 비교함. 콘솔에 입력하면 항상 다른 인스턴스가 되고, 항상 다르다는 결과를 출력함
		// -> 문제점) 일반적으로 문자열의 값을 비교하게 됨
		if (s1 == s2) {
			System.out.println("두 개의 문자열의 참조가 같습니다.");
		} else {
			System.out.println("두 개의 문자열의 참조가 다릅니다.");
		}
		
		// 2. equals() 메소드: 두 문자열의 내용을 비교함. 영어 대소문자를 비교함
		// -> 1번의 해결책) 문자열 메소드를 통해서 값을 비교하도록 함
		if (s1.equals(s2)) {
			System.out.println("두 문자열의 내용이 같습니다.");
		} else {
			System.out.println("두 문자열의 내용이 다릅니다.");
		}
		
		// 3. equalsIgnoreCase() 메소드: 두 문자열의 내용을 대소문자를 구별하지 않고 비교함
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("두 문자열의 내용이 대소문자 구분없이 같습니다.");
		} else {
			System.out.println("두 문자열의 내용이 대소문자 구분없이 다릅니다.");
		}
		
		
		
		sc.close();
	}
}
