import java.util.Scanner;

// ����) ���� 1���� �Է��Ͽ� 3�� ����̰� 4�� ��������� �Ǻ��Ͻÿ�.
public class If03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("���� �Է�: ");
        int n = sc.nextInt();
        
        if( n%3 == 0 && n%4 == 0 ) {
            System.out.println(n + "�� 3�� ����̰� 4�� ����Դϴ�.");
        } else {
            System.out.println(n + "�� 3�� ����̰� 4�� ����� �ƴմϴ�.");
        }
        
        sc.close();
    }
}
