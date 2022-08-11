
public class StringTest06 {
	public static void main(String[] args) {
		// 길이: 20, 인덱스: 0~19
		String s1 = "Hello_Java_World.hwp";
		
		// 4. endsWith() : 문자열이 특정 문자열로 끝나는가의 여부
		System.out.println(s1.endsWith(".hwp"));
		System.out.println(s1.endsWith(".txt"));
		
		// 파일을 업로드하여 검증하는 방법
		if (s1.endsWith(".hwp")) {
			System.out.println("업로드 되었습니다.");
		} else {
			System.out.println("업로드 되지 않았습니다.\n파일을 hwp형식으로 변환하여 제출하시오.");
		}
		
		// 5. startsWith(s): 문자열리 특정 문자열로 시작하는가의 여부
		System.out.println(s1.startsWith("Hello"));
		
		// 6. indexOf(s): 인덱스에서 특정 문자열의 인덱스를 앞(왼쪽)에서 찾아서 알려줌
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.indexOf("JAVA")); // -1, 찾지 못함, 문자열의 인덱스로 존재하지 않는 값
		
		// 7. lastIndexOf(s): 문자열에서 특정 문자열의 인덱스를 끝(오른쪽)에서 찾아서 알려줌 
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.lastIndexOf("Java"));
		System.out.println(s1.lastIndexOf("."));
		
		
	}
}
