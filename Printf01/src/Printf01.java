// System.out.println(): �ٹٲ��ؼ� ���
// System.out.print()  : �ٹٲ� ���� ���
// System.out.printf() : ��� ���Ŀ� ���߾� ���, format, ������(formatting)�Ͽ� ����ϴ� ���
// �������� �� ����ϴ� ����: ���� ����, ���� ����
public class Printf01 {
    public static void main(String[] args) {
        // 1. ���� ������
        // ���� ����: %d: ���� ���, decimal
        int a = 34567;
        System.out.printf("%d\n", a);
        System.out.printf("%7d\n", a);
        System.out.printf("%10d\n", a);
        System.out.printf("%-10d\n", a); // ���� ����
        System.out.printf("%-10d*\n", a); // ���� ����
        
        // 2. �Ǽ� ������
        // ���� ����: %f: �Ǽ� ���, float
        // �ݿø�
        double b = 3.141592;
        System.out.printf("%f\n", b);
        System.out.printf("%.2f\n", b); // �� ��° �ڸ����� �ݿø�
        System.out.printf("%.4f\n", b);
        System.out.printf("%7.2f\n", b);
        System.out.printf("-%7.2f*\n", b);
        
        // 3. ���� ������
        // ���� ����: %c: �������, character
        char c = 'A';
        System.out.printf("%c\n", c);
        System.out.printf("%5c\n", c);
        System.out.printf("%-5c*\n", c);
        
        // 4. ���ڿ� ������
        // ���Ĺ���: %s: ���ڿ����, string
        String s = "Hello";
        System.out.printf("%s\n", s);
        System.out.printf("%10s\n", s);
        System.out.printf("%-10s*\n\n", s);
        
        // 5. 10����, 8����, 16���� ���
        int x = 182;
        System.out.printf("%d\n", x);   // 10����, Decimal
        System.out.printf("%o\n", x);   // 8����,  Octal
        System.out.printf("%x\n", x); // 16����, Hexadecimal, h�� hour
        System.out.printf("%X\n\n", x);
        
        // �߰�: 8����, 16����, 2������ ����ϴ� �� �ٸ� ���
        System.out.println(Integer.toOctalString(x)); // 8����
        System.out.println(Integer.toHexString(x));   // 16����
        System.out.println(Integer.toBinaryString(x));// 2����
    }
}
