import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
< ArrayList와 LinkedList의 비교 >
1. ArrayList
- 장점: 접근속도(검색, 읽기)가 빠름, 순차적인 데이터의 추가, 삭제 속도가 빠름
- 단점: 비순차적인 데이터의 추가, 삭제 속도가 느림
2. LinkedList
- 장점: 비순차적인 데이터의 추가, 삭제 속도가 빠름
- 단점: 접근속도(검색, 읽기)가 느림, 순차적인 데이터의 추가, 삭제 속도가 느림
*/


public class LinkedListTest03 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		System.out.println("- 1. 순차적인 추가 - ");
		System.out.println(" ArrayList 시간 : " + add1(al) + " ms");
		System.out.println("LinkedList 시간 : " + add1(ll) + " ms");
		System.out.println();
		
		System.out.println("- 2. 비순차적인 추가(중간에서 추가) - ");
		System.out.println(" ArrayList 시간 : " + add2(al) + " ms");
		System.out.println("LinkedList 시간 : " + add2(ll) + " ms");
		System.out.println();
		
		System.out.println("- 3. 비순차적인 삭제(중간에서 삭제) - ");
		System.out.println(" ArrayList 시간 : " + remove1(al) + " ms");
		System.out.println("LinkedList 시간 : " + remove1(ll) + " ms");
		System.out.println();
		
		System.out.println("- 4. 순차적인 삭제 - ");
		System.out.println(" ArrayList 시간 : " + remove2(al) + " ms");
		System.out.println("LinkedList 시간 : " + remove2(ll) + " ms");
		
	}
	
	// 1. 순차적인 추가
	public static long add1(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		
		for (int i=0; i<1000000; i++) {
			list.add(i);
		}
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
	
	// 2. 비순차적인 추가(중간에서 추가)
	public static long add2(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		
		for (int i=0; i<10000; i++) {
			list.add(500, i);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	// 3. 비순차적인 삭제(중간에서 삭제)
	public static long remove1(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			list.remove(500);
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	// 4. 순차적인 삭제
	public static long remove2(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		for (int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	
}
