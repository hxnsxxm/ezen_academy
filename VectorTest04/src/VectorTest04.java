import java.util.Vector;

public class VectorTest04 {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("용량: " + v.capacity()); // 초기 용량  : 10
		System.out.println("크기: " + v.size());     // 초기 크기 : 0
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("--- 5개의 데이터 추가 ---");
		System.out.println("용량: " + v.capacity()); // 10
		System.out.println("크기: " + v.size());     // 5
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("--- 5개의 데이터 추가 ---");
		System.out.println("용량: " + v.capacity()); // 10
		System.out.println("크기: " + v.size());     // 10
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("--- 5개의 데이터 추가 ---");
		System.out.println("용량: " + v.capacity()); // 10
		System.out.println("크기: " + v.size());     // 15
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("--- 5개의 데이터 추가 ---");  
		System.out.println("용량: " + v.capacity()); // 20
		System.out.println("크기: " + v.size());     // 20
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("--- 5개의 데이터 추가 ---");
		System.out.println("용량: " + v.capacity()); // 40 -> 용량이 20개 추가, 용량의 배수로 자동으로 증가함
		System.out.println("크기: " + v.size());     // 25
		
		System.out.println("--- 용량을 크기와 같게 맞춤 ---");
		v.trimToSize();
		System.out.println("용량: " + v.capacity()); // 20, -> 용량을 크기와 동일하게 맞춤
		System.out.println("크기: " + v.size());     // 20
		
		
		
		
		
		
		
		
		
		
	}
}
