/*
 * 변수(variable)와 상수(constant)
 * 1. 변수 - 값을 변경할 수 있다
 * 2. 상수 - 값을 변경할 수 없다
 *   final 상수 - 변수를 상수로 만드는 방법, 변경불가한 값으로 설정, 상수명은 전체를 대문자로 표기
 *   선언하고 최초로 넣은 값을 변경하지 못함
 */

public class Variable02 {
    public static void main(String[] args) {
        double radius = 5.5;
        //final double pi = 3.14;
        //final double PI = 3.14;
        final double PI;
        
        PI = 3.14;
        
        
        System.out.println("반지름: " + radius);
        System.out.println("원주율: " + PI);
        
        
    }
}
