import java.util.Vector;

/*
< List 계열 >
1. 크기가 고정되지 않은 가변적인 배열 구조
2. 순서가 있고, 데이터의 중복을 허용함
3. Vector, ArrayList, LickedList, Stack, Queue		
*/


public class VectorTest01 {
	public static void main(String[] args) {
		
		// 1. 벡터 생성
		// raw 타입 : 원시 타입, 여러가지 종류의 데이터를 넣어서 사용하는 것(권장하지 않음, 사용하지도 않음) 
		// --> Generic 타입 : 구체롸된 타입, 한 가지 종류의 데이터만 넣어서 사용하는 것(권장)
		Vector v1 = new Vector();
		
		// 2. 데이터 삽입
		v1.add("30"); // 문자열
		v1.add(10);   // 정수
		v1.add("오백");// 문자열
		v1.add(true); // boolean
		v1.add(3.14); // 실수
		
		// 3. 출력 1번 - 기본 for문
		double tot = 0.0;
		for (int i=0; i<v1.size(); i++) {
			// tot += v1.get(i);  // 데이터 타입이 통일되어 있지 않기 때문에 문제가 발생한다.
			System.out.println(v1.get(i));
		}
		System.out.println("----------");
		
		// 4. 출력 2번 - 확장 for문
		/*
		for (Object o : v1) {
			System.out.println(o);
		}
		*/
		
		
		// 1. 벡터 생성 -> generic 타입, wrapper 사용
		// Vector<int> v2 = new Vector<int>();  // int는 기본형이기 때문에 사용할 수 없음
		// Vector<Integer> v2 = new Vector<>(); // 허용
		Vector<Integer> v2 = new Vector<Integer>();
		
		// 2. 데이터 삽입
		v2.add(new Integer(10)); // 박싱(boxing)
		v2.add(20);              // 오토박싱(auto-boxing)
		v2.add(30);
		v2.add(40);
		// v2.add(3.14);  // 정수형 데이터가 아니면 에러(error)
		
		// 3. 출력 1번 - 기본 for문
		int sum = 0;
		for (int i=0; i<v2.size(); i++) {
			sum += v2.get(i);
			System.out.println(v2.get(i));
		}
		System.out.println("합계: " + sum);
		System.out.println("-----------");
		
		// 4. 출력 2번 - 확장 for문
		sum = 0;
		for (int v : v2) { // 오토 언박싱. for (Integer v : v2)
			sum += v;
			System.out.println(v);
		}
		System.out.println("합계: " + sum);
		System.out.println("-----------");
		
		// 5. 벡터 확인
		System.out.println(v2);
	}
}
