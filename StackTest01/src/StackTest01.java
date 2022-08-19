
import java.util.Stack;

/*
< Stack (스택) >
- 밑이 막혀 있는 통처럼 생긴 데이터 구조
- 선입후출 구조, FILO (First In, Last Out)
- push: 데이터 삽입
- pop : 데이터 꺼내기
*/

public class StackTest01 {
	public static void main(String[] args) {
		
		// 스택 생성
		Stack<Integer> st1 = new Stack<Integer>();
		System.out.println(st1);
		
		// 데이터 넣기 - push
		st1.push(10); st1.push(20); st1.push(30); st1.push(40); st1.push(50);
		System.out.println(st1);
		
		// 데이터 꺼내기 - pop
		while (!st1.isEmpty()) {
			System.out.println(st1.pop());
		}
		System.out.println(st1);
		System.out.println("----------");
		
		Stack<String> st2 = new Stack<String>();
		System.out.println(st2);
		st2.push("우영우"); st2.push("한수현"); st2.push("정명석"); st2.push("이준호"); st2.push("권민우");
		System.out.println(st2);
		
		while (!st2.isEmpty()) {
			System.out.println(st2.pop());
		}
		System.out.println(st2);
				
	}
}
