import java.util.SortedSet;
import java.util.TreeSet;

// 문자열을 다루는 부분셋
public class TreeSetTest05 {
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("abc"); set.add("alien"); set.add("bat"); set.add("car"); set.add("Car");
		set.add("disco"); set.add("dance"); set.add("dZZZZ"); set.add("dzzzz"); set.add("elephant");
		set.add("elevator"); set.add("fan"); set.add("flower"); set.add("d"); set.add("a");
		set.add("바다"); set.add("하늘"); set.add("나무"); set.add("강"); set.add("?"); set.add("ㄱ");
		
		System.out.println(set);
		
		// 1. a부터 d앞까지(d 미포함)의 부분셋 (a부터 c까지의 부분셋, d는 미포함)
		SortedSet<String> set2 = set.subSet("a",  "d");
		System.out.println(set2);
		
		// 2. a부터 d까지(d 포함)의 부분셋 - e 앞까지
		SortedSet<String> set3 = set.subSet("a",  "e");
		SortedSet<String> set4 = set.subSet("a", "dzzzzzzzzzzz");
		System.out.println(set3);
		System.out.println(set4);
		
		// 3. a부터 d까지(d만 포함)의 부분셋 - d만 포함
		SortedSet<String> set5 = set.subSet("a", true, "d", true);
		System.out.println(set5);
		
		// 4. 한글의 경우는 한 글자를 기본단위로 인식함. 
		// "ㄱ"부터 "ㄹ"까지 -> "가"부터 "라"앞까지("라"는 미포함)로 사용하여야 함.
		SortedSet<String> set6 = set.subSet("ㄱ", "ㄹ"); // -> 아무 결과도 출력하지 않음
		System.out.println(set6);
		SortedSet<String> set7 = set.subSet("가", "라");
		System.out.println(set7);
		
		
		
	}
}
