import java.util.List;
import java.util.Vector;

public class VectorTest05 {
	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> v3 = new Vector<Integer>();
		
		v1.add(10); v1.add(20); v1.add(30); v1.add(40);
		v2.add(30); v2.add(40); v2.add(50); v2.add(60);
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		
		System.out.println("--- 벡터 사이에서 같은 데이터만 남기고 다른 데이터는 삭제---");
		v1.retainAll(v2);
		System.out.println("v1: " + v1);
		
		System.out.println("--- v3에 10부터 10씩 증가하는 값을 100까지 삽입 ---");
		for (int i=10; i<=100; i+=10) {
			v3.add(i);
		}
		System.out.println("v3: " + v3);
		
		System.out.println("--- 벡터의 부분집합을 가진 다른 벡터를 생성 ---");
		List<Integer> v4 = (List<Integer>)v3.subList(2, 7); // 2번부터 7번 앞까지, 끝번호는 포함하지 않음
		System.out.println(v4);
		
		
		
		
		
	}
}
