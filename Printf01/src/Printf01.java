// System.out.println(): 줄바꿈해서 출력
// System.out.print()  : 줄바꿈 없이 출력
// System.out.printf() : 출력 형식에 맞추어 출력, format, 포매팅(formatting)하여 출력하는 방법
// 포매팅할 때 사용하는 문자: 형식 문자, 서식 문자
public class Printf01 {
    public static void main(String[] args) {
        // 1. 정수 포매팅
        // 형식 문자: %d: 정수 출력, decimal
        int a = 34567;
        System.out.printf("%d\n", a);
        System.out.printf("%7d\n", a);
        System.out.printf("%10d\n", a);
        System.out.printf("%-10d\n", a); // 왼쪽 맞춤
        System.out.printf("%-10d*\n", a); // 왼쪽 맞춤
        
        // 2. 실수 포매팅
        // 형식 문자: %f: 실수 출력, float
        // 반올림
        double b = 3.141592;
        System.out.printf("%f\n", b);
        System.out.printf("%.2f\n", b); // 세 번째 자리에서 반올림
        System.out.printf("%.4f\n", b);
        System.out.printf("%7.2f\n", b);
        System.out.printf("-%7.2f*\n", b);
        
        // 3. 문자 포매팅
        // 형식 문자: %c: 문자출력, character
        char c = 'A';
        System.out.printf("%c\n", c);
        System.out.printf("%5c\n", c);
        System.out.printf("%-5c*\n", c);
        
        // 4. 문자열 포매팅
        // 형식문자: %s: 문자열출력, string
        String s = "Hello";
        System.out.printf("%s\n", s);
        System.out.printf("%10s\n", s);
        System.out.printf("%-10s*\n\n", s);
        
        // 5. 10진수, 8진수, 16진수 출력
        int x = 182;
        System.out.printf("%d\n", x);   // 10진수, Decimal
        System.out.printf("%o\n", x);   // 8진수,  Octal
        System.out.printf("%x\n", x); // 16진수, Hexadecimal, h는 hour
        System.out.printf("%X\n\n", x);
        
        // 추가: 8진수, 16진수, 2진수를 출력하는 또 다른 방법
        System.out.println(Integer.toOctalString(x)); // 8진수
        System.out.println(Integer.toHexString(x));   // 16진수
        System.out.println(Integer.toBinaryString(x));// 2진수
    }
}
