


/*
JVM (Java Virtual Machine), 자바 가상 기계
- 자바를 실행하면 자동으로 가돌되는 자바 관리 시스템

Garbage Collector의 역할 - 참조되지 않는(버려지는) 메모리 공간을 회수하여 재활용하도록 하는 도구
Garbage Collection - 버려지는 메모리 공간을 회수하여 재활용하도록 하는 것.

*/

public class StringTest01 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC";
		String s4 = "DEF";
		
		s4 = s1; 
		// s4는 s1이 참조하느 곳을 함꼐 참조하게 된다. 
		// s4가 참조하던 "DEF" 데이터는 버려지게 됨.
		// 이때 JVM 시스템이 가동함
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("---------");
		
		// 해시코드(hashcode) - 각 인스턴스가 가지는 고유한 아이디
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println("---------");
		
		// 진짜 해시코드
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		
	}
}
