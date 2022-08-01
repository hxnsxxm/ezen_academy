/*
 * < ������(operator) >
 * - �������� ����(���)�� ���� �з�
 * 1. ��� ������: +, -, * (asterisk), /(��), %(������)
 *   - *, /, % �������� �켱������ +, - �������� �켱�������� ���� 
 * 
 * 2. ���� ������: ++, --
 *   - �ڽ��� ���� 1���� �Ǵ� 1�����ϴ� ������
 *   - ++a: ���� ���� ������, a++: ���� ���� ������
 *   - --a: ���� ���� ������, a--: ���� ���� ������
 *   
 * 3. �� ������: >, >=, <, <=, ==, !=, instanceof(������ ������ ���)
 *   - �� ������ ����� true/false �� �߿� �ϳ��� ���� ������
 *   - >, >=, <, <= �����ڰ� ==, != �����ں��� �켱������ ����
 * 
 * 4. �� ������: &&(��AND, ����, ampersand), || (��OR, ����, vertical bar), ! (������)
 *   - �� ������ ����� true/false �� �߿� �ϳ��� ���� ������
 *   - &&�� ||���� �켱������ ����
 *   - &&(��AND): �� ���� ��(operand)�� ��� �� true�� ��, ��ü ����� true. �ϳ��� false��� ��ü ����� false
 *   - ||(��OR): �� ���� �� �߿��� �ϳ��� true��� ��ü ����� true. ��δ� false��� ��ü ����� false
 *   - !(������): 
 */


public class Operator01 {
    public static void main(String[] args) {
        // 1. ��� ������
        System.out.println(10 + 3);
        System.out.println(10 - 3);
        System.out.println(10 * 3);
        System.out.println(10 / 3);
        System.out.println(10 % 3);
        
        // 2. ���� ������
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
        
        // 3. �� ������
        int c = 10, d = 20;
        System.out.println("\n" + (c > d));
        System.out.println(c < d);
        System.out.println(c == d);
        System.out.println(c != d);
        
        // 4. �� ������
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
