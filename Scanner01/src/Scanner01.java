import java.util.Scanner;
// java�ȿ� util ��Ű���� scanner Ŭ������ import��
// Scanner Ŭ����: �ܼ�(Ű����)�κ��� ���� �Է¹޴� Ŭ����
// Scanner Ŭ������ ��������ν� "��ȭ�� ���α׷�"�� �ۼ��� �� ����
// System.in  : �Է½�Ʈ��(�帧, ���), �ַܼκ��� �����͸� �Է¹޾� �޸𸮷� �����ϴ� ��ü ������ �ʿ���
// System.out : ��½�Ʈ��
// console : ������� �ƿ츣�� ��ġ

// Ctrl + Shift + o : �ش� Ŭ������ �ʿ��� Ŭ������ �ڵ����� import���ش�.

// ����) �������� �Է��Ͽ� ���� ������ ���� �ѷ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class Scanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner Ŭ������ �޼ҵ带 ����� �� �ֵ��� ����� �⺻���� ����
        
        
        System.out.print("������ �Է�: ");
        double radius = sc.nextDouble();
        final double PI = 3.141592;
        
        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;
        
        System.out.println("���� ����: " + area);
        System.out.println("���� �ѷ�: " + perimeter);
        
        sc.close();
        // ������� �޸� ������ �ֱ� ������ �׸� �����ؾ� �Ѵ�. �޸� ���� ����
    }
}
