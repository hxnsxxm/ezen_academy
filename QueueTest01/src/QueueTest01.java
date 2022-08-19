import java.util.LinkedList;
import java.util.Queue;

/*
< Queue (큐) >
- 한 방향으로 데이터가 이동하는 파이프처럼 생긴 저장 구조.
- 선입선출, FIFO (First In, First Out)
- offer : 데이터 넣기
- poll  : 데이터 꺼내기

*/

public class QueueTest01 {
	public static void main(String[] args) {
		
		// 큐 생성
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		// 데이터 넣기 - offer
		q1.offer(10); q1.offer(20); q1.offer(30); q1.offer(40); q1.offer(50);
		System.out.println(q1);
		
		// 데이터 꺼내기 - poll
		while (!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
		
		System.out.println(q1);
		
	}
}
