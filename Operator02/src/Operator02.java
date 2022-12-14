/*
 * 5. 비트 연산자: &(비트 AND), |(비트 OR), ^(Exclusive OR, XOR, 배타적 OR), ~(비트 NOT)
 *   - 비트 연산(2진수 연산)을 하는 연산자
 *   - &, ^, | 순으로 우선순위가 높음
 *   - &: 두 개의 비트가 모두 1일 때, 결과가 1이 됨
 *   - |: 두 개의 비트 중에서 하나라도 1이면, 결과가 1이 됨
 *   - ^: 두 개의 비트 중에서 단 하나만 1일 때, 결과가 1이 됨
 *   - ~: 1은 0, 0은 1로 변환함
 *   
 * 6. 쉬프트 연산자: <<(left shift), >>(right shift)
 *   - 비트 연산(2진수 연산)을 하는 연산자
 *   - <<: 2진수의 곱셈
 *   - >>: 2진수의 나눗셈
 *   
 * 7. 조건 선택 연산자(삼항 연산자)
 *   - 조건식 ? A(true) : B(false)
 *   - 조건식의 결과가 참이면 true(A), 거짓이면 false(B)의 값을 취하는 연산자
 *   - 조건문(if~else)의 대용으로 많이 사용됨
 *   
 * 8. 대입 연산자, 복합 대입 연산자(결합 연산자)
 *   - =: 대입 연산자, 모든 연산이 끝난 다음에 오른쪽 값을 왼쪽 변수에 대입
 *   - +=, -=, *=, /=, %=, &=, |=, ^= : 복합 대입 연산자
 *   
 * < 연산자의 항의 개수에 따른 분류 >
 * 1. 단항 연산자: 항이 1개만 필요한 연산자, 연산자 우선순위가 가장 높음
 * ex) ++(증가), --(감소), !(논리 NOT), ~(비트 NOT), +(부호), -(부호)
 * 2. 이항 연산자: 항이 2개 필요한 연산자
 * ex) 단항과 삼항을 제외한 거의 모든 연산자, 산술, 비교, 논리, 비트, 쉬프트 연산자 
 * 3. 삼항 연산자: 항이 3개 필요한 연산자
 * ex) ? : -> 조건 선택 연산자 1개 뿐
 * 
 * < ★ 연산자 우선순위 >
 * 1. 단항 연산자: +(부호), -(부호), ++(증가), --(감소), !(논리NOT), ~(비트NOT)
 * 2. 산술 연산자
 *   - *, /, %
 *   - +, -
 * 3. 쉬프트 연산자: <<, >>
 * 4. 비교 연산자
 *   - >, >=, <, <=
 *   - ==, !=
 * 5. 비트 연산자
 *   - &
 *   - ^
 *   - |
 * 6. 논리 연산자
 *   - &&
 *   - ||
 * 7. 조건 선택 연산자
 * 8. 대입 연산자, 복합 대입 연산자
 * 
 * < ★ 주로 사용하는 연산자의 우선순위 >
 * 증감 > 산술 > 비교 > 논리 > 대입 
 * 
 */
public class Operator02 {
    public static void main(String[] args) {
        
        // 5. 비트 연산자
        int a = 57, b = 83;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        
        // 6. 쉬프트 연산자
        int c = 4, d = 64;
        System.out.println("\n" + (c << 3)); // 2를 3번 곱합, 32
        System.out.println(d >> 4); // 2를 4번 나눔, 4
        
        // 7. 조건 선택 연산자
        int e = 10, f = 5, g, h;
        
        g = e>f ? e : f;
        System.out.println("\n" + g);
        
        h = e<f ? e : f;
        System.out.println(h);
        
        // 문제1) i에 j의 값을 더해서 i에 대입하시오.
        int i = 10, j = 20;
        i += j; // i = i + j;
        System.out.println("\n" + i);
        
        // 문제2) x의 값을 1증가하여 저장하고 x의 값을 출력하시오.
        int x = 10;
        x += 1; // ++x; x++; x = x + 1;
        System.out.println("\n" + x);
        // 3 증가
        x += 3; // x = x + 3;
        
        // 전위와 후위의 차이
        x = 10;
        System.out.println("\n" + ++x);
        System.out.println(x);
        x = 10;
        System.out.println(x++);
        System.out.println(x);
        
    }
}
