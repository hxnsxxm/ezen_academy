/*
 * < 연산자(operator) >
 * - 연산자의 역할(기능)에 따른 분류
 * 1. 산술 연산자: +, -, * (asterisk), /(몫), %(나머지)
 *   - *, /, % 연산자의 우선순위가 +, - 연산자의 우선순위보다 높다 
 * 
 * 2. 증감 연산자: ++, --
 *   - 자신의 값을 1증가 또는 1감소하는 연산자
 *   - ++a: 전위 증가 연산자, a++: 후위 증가 연산자
 *   - --a: 전위 감소 연산자, a--: 후위 감소 연산자
 *   
 * 3. 비교 연산자: >, >=, <, <=, ==, !=, instanceof(다형성 구현에 사용)
 *   - 비교 연산의 결과는 true/false 둘 중에 하나의 값을 가진다
 *   - >, >=, <, <= 연산자가 ==, != 연산자보다 우선순위가 높다
 * 
 * 4. 논리 연산자: &&(논리AND, 논리곱, ampersand), || (논리OR, 논리합, vertical bar), ! (논리부정)
 *   - 논리 연산의 결과는 true/false 둘 중에 하나의 값을 가진다
 *   - &&가 ||보다 우선순위가 높다
 *   - &&(논리AND): 두 개의 항(operand)이 모두 다 true일 때, 전체 결과가 true. 하나라도 false라면 전체 결과는 false
 *   - ||(논리OR): 두 개의 항 중에서 하나라도 true라면 전체 결과가 true. 모두다 false라면 전체 결과는 false
 *   - !(논리부정): 
 */


public class Operator01 {
    public static void main(String[] args) {
        // 1. 산술 연산자
        System.out.println(10 + 3);
        System.out.println(10 - 3);
        System.out.println(10 * 3);
        System.out.println(10 / 3);
        System.out.println(10 % 3);
        
        // 2. 증감 연산자
        int a = 10;
        int b;
        
        //b = ++a;
        b = --a;
        System.out.println("\na = " + a);
        System.out.println("b = " + b);
        
        //b = a++;
        b = a--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // 3. 비교 연산자
        int c = 10, d = 20;
        System.out.println("\n" + (c > d));
        System.out.println(c < d);
        System.out.println(c == d);
        System.out.println(c != d);
        
        // 4. 논리 연산자
        int e = 10, f = 5;
        System.out.println("\n" + (e>5 && f<10));
        System.out.println(e>5 && f>10);
        System.out.println(e<5 && f>10);
        System.out.println(e<5 && f<10);
        
        System.out.println("\n" + (e>5 || f<10));
        System.out.println(e>5 || f>10);
        System.out.println(e<5 || f>10);
        System.out.println(e<5 || f<10);
        
        System.out.println("\n" + (e>5));
        System.out.println(!(e>5));
        
        
        
    }
}
