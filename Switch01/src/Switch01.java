import java.util.Scanner;

/*
 * < switch~case ���� ���� >
 * - switch���� ������ �ݵ�� "����"�� "���ڿ�"�� ��� ����. �Ǽ��� ��� �Ұ�
 * - switch������  :(semicolon)�� label�� �ǹ�, label�� ���ؼ� �� ���� �б��� �� �ְ� ��(if~elseif�ʹ� �ٸ�)
 * - switch������ ���� �� �ִ� ��� ���� if������ ���� �� ������, if������ ���� �� �ִ� ��� ���� switch������ ���� ���� ����
 * - switch���� ������ ���� ��������, �������� ���������� ���������� ��쿡 ����ϸ� ��Ȯ�ϰ� ȿ������ �ڵ带 ���� �� ����
 * 
 * switch(���ǽ�) {
 * case ����:
 *     ���๮;
 *     ...
 *     break;
 * case ����:
 *     ���๮;
 *     ...
 *     break;
 * case ����:
 *     ���๮;
 *     ...
 *     break;
 * .
 * .
 * .
 * default:
 *     ���๮;
 *     ...
 *     break;
 * }
 */


public class Switch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("�޴� ����(1-4): ");
        int menu = sc.nextInt();
        
        switch(menu) {
        case 1:
            System.out.println("���� ����");
            break;
        case 2:
            System.out.println("���� �б�");
            break;
        case 3:
            System.out.println("���� ����");
            break;
        case 4:
            System.out.println("���� ����");
            break;
        default:
            System.out.println("�ٽ� �Է�");
            break;
        }
        
        sc.close();
    }
}
