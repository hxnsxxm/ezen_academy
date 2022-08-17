
/*
< Wrapper 클래스 >
1. Byte, Short, Integer, Long, Character, Float, Double, Boolean의 8개 클래스를 통칭하여 사용하는 이름
2. 자바에서 기본형을 참조형으로 변환하여 사용하기 위해 만든 8가지 기본형에 대한 클래스임
3. 목적 1) 기본형을 참조형(클래스형)으로 만들기 위한 목적
4. 목적 2) 문자열을 기본형으로 변환하기 위한 목적
5. 8가지 Wrapper 클래스 중에서 기본형으로 가장 많이 사용하는 Integer, Double을 가장 많이 사용함
6. Collection(컬렉션)에서는 반드시 Wrapper 클래스를 사용해야 함

# 박싱(Boxing)    - 기본형을 참조형으로 만드는 것 
# 언박싱(Unboxing) - 참조형을 기본형으로 만드는 것
# 오토박싱(Auto-Boxing)    - 기본형을 참조형으로 자동으로 생성하는 것
# 오토언박싱(Auto-Unboxing) - 참조형에서 자동으로 기본형을 생성하는 것   
*/


public class WrapperTest01 {
	public static void main(String[] args) {

		// 1번 목적
		int i = 10;                  // 기본형
		Integer ii = new Integer(i); // 참조형, 박싱  
		int i2 = ii.intValue();  // 언박싱
		i2 += 20;
		System.out.println(ii);
		System.out.println(i2);
		System.out.println("-----------");
		
		int j = 10;     // 기본형
		Integer jj = j; // 참조형, 오토박싱, String 과 Wrapper 클래스만 이렇게 사용할 수 있음
		jj += 30;       // 오토언박싱
		System.out.println(jj);
		System.out.println("-----------");
		
		// 2번 목적
		String s1 = "10";
		System.out.println(s1 + 20); // 문자열 1020
		
		int a = Integer.parseInt(s1) + 20;
		System.out.println(a);
		
		String s2 = "3.14";
		double radius = 5.5;
		// System.out.println( s2 * radius * radius); // error : 문자열은 곱하기를 할 수 없음
		
		double area = Double.parseDouble(s2) * radius * radius;
		System.out.println(area);
		
		
		
		
	}

}
