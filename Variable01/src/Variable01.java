/*
 *  변수(variable) - 값을 저장하기 위한 공간  
 *  자바는 문자(' ')와 문자열(" ")을 구분함
 *  초기화: 변수를 선언하고, 최초로 값을 대입하는 것
 *  오버플로우(overflow): 작은 공간에 큰 데이터를 넣어서 흘러 넘치는 것
 * 
 *  < 변수의 명명법 >
 *  -- 반드시 지켜야 할 규칙
 *  1. 영어 대소문자, 숫자, 기호(_, $: 시스템에서 내부적으로 사용하는 기호이므로, 개발자는 사용하지 않음)
 *  2. 영어 대문자와 소문자는 구분해서 사용함, a와 A는 다름
 *  3. 숫자는 첫 글자로는 사용하지 않는다
 *  4. 공백은 사용 불가
 *  
 *  -- 권장사항
 *  1. 변수명은 의미있게 생성
 *  2. 한글명은 사용하지 않는다
 * 
 *  -- 자바에서 변수명을 만드는 방법  ex) 게임의 최고 점수
 *  1. int maxScoreGame;   --> 카멜(camel) 표기법, 자바에서 표준으로 사용
 *  2. int max_score_game; --> 스네이크(snake) 표기법, html에서 많이 사용
 *  3. int iMaxScoreGame;  --> 헝그리안 표기법, c언어 계열에서 많이 사용
 *  
 *  < 변수의 타입(종류) >
 *  - 데이터 타입, data type, 자료형
 *  1. 기본형(primitive type)
 *    (1) 정수형
 *    - byte  : 1Byte (-128~127)
 *    - short : 2Byte (-32768~32767)
 *    - int   : 4Byte (-2147483648~2147483647)
 *    - long  : 8byte
 *    (2) 실수형 - 부동소수점형
 *    - float  : 4Byte, 소수점 이하 7자리까지 정확도를 보장
 *    - double : 8Byte, 소수점 이하 15자리까지 정확도를 보장
 *    (3) 문자형
 *    - char : 2Byte
 *    문자: 홀따옴표로 감쌈, (' '), ex) 'A', 'ABC'->잘못된 표기
 *    문자열: 쌍따옴표로 감쌈, (" "), ex) "A", "ABC"
 *    (4) 논리형 (True/False), 조건문과 반복문에서 사용
 *    - boolean : 1Byte
 *  2. 참조형(reference type)
 *    배열과 모든 클래스는 참조형이다.
 *    객체 지향에서 본격적으로 배움
 */
public class Variable01 {
    public static void main(String[] args) {
        // 4Byte를 저장할 수 있는 공간을 메모리에 마련해두고, 그 공간의 이름을 a라고 붙임
        int a;    // 변수 선언: 메모리에 정수를 저장할 수 있는 4Byte의 공간을 마련하고 이름을 a라고 붙임
        a = 10;   // a라는 변수에 10이라는 값을 대입했다
        
        int b = 11; // 변수를 선언하고, 바로 값을 대입
        
        int c = 12, d = 13;  // 여러 개의 변수를 선언하고, 값을 대입
        
        // + 연산자: 덧셈, 문자열 연결
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        // \n : 줄바꿈
        System.out.println("\na = " + a + "\nb = " + b);
    }

}
