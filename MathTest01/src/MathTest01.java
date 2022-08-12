


/*
< Math 클래스 >
- 수학에 관한 다양한 수식이 정의되어 있는 클래스
- 클래스 메소드와 클래스 상수만으로 구성되어 있는 클래스 (static, final으로 선언)
- public final class Math로 선언되어 있어서, 인스턴스를 생성할 수 없는 클래스
- 모든 클래스 메소드와 클래스 상수는 Math. 으로 사용함 



*/


public class MathTest01 {
	public static void main(String[] args) {
		
		System.out.println(Math.abs(-11));  // 절댓값
		System.out.println(Math.sqrt(9));   // 루트
		System.out.println(Math.PI);        // 원주율
		System.out.println(Math.ceil(10.1));  // 정수로 올림, 11
		System.out.println(Math.floor(10.9)); // 정수로 내림, 10
		System.out.println(Math.round(10.4)); // 정수로 반올림, 10
		System.out.println(Math.round(10.5)); // 정수로 반올림, 11
		System.out.println("-----------");
		
		double n = 34567.56789;
		System.out.println(n);
		double a = Math.round(n*10)/10.;    // 소수점 첫째 자리까지 반올림
		System.out.println(a);
		double b = Math.round(n*100)/100.;  // 소수점 둘째 자리까지 반올림
		System.out.println(b);
		double c = Math.round(n*1000)/1000.; // 소수점 셋째 자리까지 반올림
		System.out.println(c);
		System.out.println("-----------");
		
		System.out.println(Math.max(10, 20));   // 정수 2개 중의 최댓값
		System.out.println(Math.max(2.5, 7.7)); // 실수 2개 중의 최댓값
		System.out.println(Math.max(Math.max(30, 10), 20)); // 정수 3개 중의 최댓값
		
		System.out.println(Math.min(10, 20));   // 정수 2개 중의 최솟값
		System.out.println(Math.min(2.5, 7.7)); // 실수 2개 중의 최솟값
		System.out.println(Math.min(Math.min(30, 10), 20)); // 정수 3개 중읜 최솟값
		System.out.println("-----------");
		
		// rint() : 실수값의 가까운 쪽의 정수값을 출력, 이 때 중간일 때는 짝수 값을 선택
		System.out.println(Math.rint(1.4));
		System.out.println(Math.rint(1.6));
		System.out.println(Math.rint(1.5)); 
		System.out.println(Math.rint(2.5));
		System.out.println(Math.rint(3.5));
		System.out.println(Math.rint(4.5));
		System.out.println(Math.rint(5.5));
		System.out.println(Math.rint(6.5));
		System.out.println(Math.rint(7.5));
		System.out.println("-----------");
		
		System.out.println(Math.pow(2, 3));
		
		
		
	}
}
