
/*
< StringBuffer와 StringBuilder 클래스의 비교 >
- StringBuffer와 StringBuilder 클래스의 사용법의 거의 동일
- 차이점: StringBuilder는 쓰레드(thread)의 기능을 포함하고 있어서 성능의 저하가 발생함
- StringBuffer는 StringBuilder에서 쓰레드의 기능을 제외하여 성능을 향상시킨 클래스

*/

// StringBuffer 클래스의 다양한 메소드
public class StringBufferTest04 {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		
		// 1. append() : 문자열 끝에 해당 문자열을 추가
		sb1.append("Hello Java World!");
		System.out.println(sb1);
		System.out.println("---------");
		
		// 2. charAt() : 문자열에서 해당 인덱스의 문자 확인
		System.out.println(sb1.charAt(6));
		System.out.println(sb1.charAt(11));
		System.out.println(sb1.capacity());
		//System.out.println(sb1.charAt(15)); // 예외 발생 : StringIndexOutOfBoundsException
		System.out.println("---------");
		
		// 3. deleteCharAt() : 문자열에서 해당 인덱스의 한 문자를 삭제 
		sb1.deleteCharAt(11);
		System.out.println(sb1);
		System.out.println("---------");
		
		// 4. delete() : 문자열에서 해당 인덱스의 범위의 값을 삭제
		sb1.delete(6, 10);  // 시작값, 끝값 - 시작값부터 끝값 이전까지 삭제
		System.out.println(sb1);
		System.out.println("---------");
		
		// 5. insert() : 문자열의 중간(특정) 위치에 값을 추가
		sb1.insert(6, "Python");
		System.out.println(sb1);
		sb1.insert(13, "W");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println("---------");
		
		// 6. replace() : 문자열의 해당 인덱스의 범위의 값을 새로운 문자열로 변경
		sb1.replace(6, 12, "Android");
		System.out.println(sb1.capacity());
		System.out.println(sb1);
		sb1.replace(0,5, "Hi");
		System.out.println("---------");
		
		StringBuffer sb = new StringBuffer("ABCDEF");
		System.out.println(sb);
		sb.replace(2, 4, "hello world");
		System.out.println(sb);
		
		
		// 7. reverse() : 문자열을 거꾸로 생성함
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		System.out.println("---------");
		
		// 8. setCharAt() : 인덱스에 해당하는 한 문자를 변경
		sb1.setCharAt(16, '*');
		System.out.println(sb1);
		System.out.println("문자열 길이: " + sb1.length());
		System.out.println("---------");
		
		// 9. setLength() : 문자열의 길이를 변경
		sb1.setLength(10);
		System.out.println(sb1);
		System.out.println("문자열 길이: " + sb1.length());
		System.out.println("---------");
		
		// 10. substring() : 문자열에서 해당 범위의 특정 문자열을 추출
		sb1.append(" World!");
		System.out.println(sb1);
		String s1 = sb1.substring(3,10); // 3번부터 10번 앞까지 추출
		System.out.println(s1);
		System.out.println(sb1);
		String s2 = sb1.substring(11,17); // 11번부터 17번 앞까지 추출
		System.out.println(s2);
		String s3 = sb1.substring(11); // 11번부터 끝까지 추출
		System.out.println(s3);
		System.out.println("---------");
		
		// 11. trimToSize() : 문자열의 크기만큼으로 용량을 줄임
		System.out.println("용량: " + sb1.capacity());
		System.out.println("크기: " + sb1.length());
		sb1.trimToSize();
		System.out.println("용량: " + sb1.capacity());
		
		
	}
}
