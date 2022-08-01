
import java.util.Scanner;

public class If09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("���� 1�� �Է�: ");
        int n1 = sc.nextInt();
        System.out.print("���� 2�� �Է�: ");
        int n2 = sc.nextInt();
        System.out.print("������ �Է�: ");
        //String o = sc.next(); // ���ڿ��� Ŭ�������̱� ������ �ٷ�� ����� �ٸ�
        char c = sc.next().charAt(0);  // ���ڿ��� 0�� �ε����� ������ ��
        
        int result = 0;
        
        switch(c) {
        case '+':
            result = n1 + n2;
            break;
        case '-':
            result = n1 - n2;
            break;
        case '*':
            result = n1 * n2;
            break;
        case '/':
            result = n1/n2;
            break;
        case '%':
            result = n1%n2;
            break;
        default:
            c = 'e';
            break;
        }
        
        /*
        if(c=='+') {
            result = n1 + n2;
            System.out.print("Check\n");
        } else if(c=='-') {
            result = n1 - n2;
        } else if(c=='*') {
            result = n1 * n2;
        } else if(c=='/') {
            result = n1 / n2;
        } else if(c=='%') {
            result = n1%n2;
        } else {
            c = 'e';
        }
        */
        
        if(c=='e') {
            System.out.println("�߸��� �����ڸ� �Է��Ͽ����ϴ�.");
        } else {
            System.out.printf("%d %c %d = %d\n", n1, c, n2, result);
        }
        
        
        sc.close();
    }
}
