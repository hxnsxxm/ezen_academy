import java.util.Scanner;
// ����) a�� b�� ���� ������ �Է��Ͽ�, �׻� a���� ���� ����, b�� ū ���� ����ǵ��� ���α׷��� �ۼ��Ͻÿ�.
public class If04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("�� ���� ������ �Է��Ͻÿ�.");
        System.out.print("���� a �Է�: ");
        int a = sc.nextInt();
        System.out.print("���� b �Է�: ");
        int b = sc.nextInt();
        
        // swapping (������): �� ���� ������ ���� �ٲٴ� �⺻���̰�, �߿��� ���
        if (a>b) {
            int t = a;
            a = b;
            b = t;
        }
        
        System.out.printf("a�� %d, b�� %d\n", a, b);
        
        sc.close();
    }
}
