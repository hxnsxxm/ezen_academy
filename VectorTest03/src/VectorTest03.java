import java.util.Vector;

public class VectorTest03 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> v3 = new Vector<Integer>();
		
		v1.add(10); v1.add(20); v1.add(30);
		v2.add(40); v2.add(50); v2.add(60);
		v3.add(30); v3.add(40); v3.add(50);
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		
		System.out.println("--- 벡터에 다른 벡터의 모든 내용을 추가 ---");
		// v1.addAll(v2); // 순차적
		v1.addAll(1, v2); // 비순차적(중간)
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		
		System.out.println("--- 벡터에서 데이터의 존재 유무 확인(1개) ---");
		System.out.println(v1.contains(10));
		System.out.println(v1.contains(70));
		
		System.out.println("--- 벡터에서 데이터의 존재 유무 확인(다른 벡터의 모든 내용) ---");
		System.out.println(v1.containsAll(v2));
		System.out.println(v3.containsAll(v2));
		
		System.out.println("--- 벡터의 복제 ---");
		@SuppressWarnings("unchecked")  // 타입 체크를 하지 않는 것에 대한 경고를 하지 말라는 애노테이션
		Vector<Integer> v4 = (Vector<Integer>)v1.clone();
		System.out.println(v4);
		
		
		
		
	}
}
