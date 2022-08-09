package test;

// error : the type ~ is not visible
// Calc 이 public 으로 선언되어 있지 않으면
import calc.Calc;
// import calc.*;

/*
< 패키지(package)의 역할 >
1. 클래스를 기능별로, 종류별로 나누는 역할
2. 클래스에 대한 접근 권한을 부여하는 역할

# 패키지의 이름을 붙이는 방법 - 권장
1. 정체를 소문자로 작성
2. 패키지명은 인터넷 도메인을 역순으로 사용할 것을 권장 - 유일한 패키지명을 만들 수 있음
3. 패키지명은 도메인명이 아니어도 .(온점)으로 단어를 구분함
ex) www.hxnsxxm.co.kr  -->  kr.co.hxnsxxm


< 클래스를 통한 접근 제어 >
1. public 액세스: 클래스 앞에 public 붙이는 방법
- 어디에서나 사용 가능한 클래스

2. package(default) 액세스: 클래스 앞에 public 붙이지 않는 방법
- 같은 패키지 내에서만 사용 가능한 클래스

< 클래스의 멤버에 대한 접근 권한 >
1. private - 같은 클래스 내에서만 접근 사용
2. default - 같은 패키지 내에서만 접근 사용
3. protected - 같은 패키지 내에서는 물론이고, 다른 패키지라도 상속을 받았다면 접근 사용
4. public - 어디에서나 접근 사용 

# 접근의 범위 (범위: 좁다<-->넓다, 접근 제한: 강하다<-->약하다)
private < (default) < protected < public

*/

public class CalcTest01 {
	public static void main(String[] args) {
		Calc a = new Calc();
		
		System.out.println("덧셈: " + a.add(10,  20));
		System.out.println("뺄셈: " + a.subtract(10,  20));
		System.out.println("곱셈: " + a.multiply(10,  20));
		System.out.println("나눗셈: " + a.divide(10,  20));
		
		
		
	}
}
