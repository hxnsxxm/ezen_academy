import java.util.Scanner;

// ���� 1) ���� 1���� �Է��Ͽ� Ȧ������, ¦�������� �Ǻ��Ͻÿ�
public class If02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("���� �Է�: ");
        int n = sc.nextInt();
        
        
        if(n%2 == 1) {
            System.out.println("Ȧ���Դϴ�.");
        } else {
            System.out.println("¦���Դϴ�.");
        }
        
        sc.close();
    }
}
