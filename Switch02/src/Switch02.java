
import java.util.Scanner;

/* ����) ���� �Է��Ͽ�, ���� ź��ȭ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * < �Է� ȭ�� ���� >
 * ź���� �Է�(1~12): 6
 * 
 * < ��� ȭ�� ���� >
 * 6���� ź��ȭ�� �����Դϴ�.
 * 
 * 1��: ī���̼�, 2��: �����, 3��: ����ȭ, 4��: ����Ʈ��, 5��: ������, 6��: ����, 
 * 7��: �̳��̶����, 8��: Ŭ���÷���, 9��: ������, 10��: ����ȭ, 11��: ��ȭ, 12��: ���μ�Ƽ��
 * 
 */
public class Switch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ź���� �Է�(1~12): ");
        int month = sc.nextInt();
        String monthFlo = "";
        
        switch(month) {
        case 1:
            monthFlo = "ī���̼�";
            break;
        case 2:
            monthFlo = "�����";
            break;
        case 3:
            monthFlo = "����ȭ";
            break;
        case 4:
            monthFlo = "����Ʈ��";
            break;
        case 5:
            monthFlo = "������";
            break;
        case 6:
            monthFlo = "����";
            break;
        case 7:
            monthFlo = "�̳��������";
            break;
        case 8:
            monthFlo = "�۶��÷���";
            break;
        case 9:
            monthFlo = "������";
            break;
        case 10:
            monthFlo = "����ȭ";
            break;
        case 11:
            monthFlo = "��ȭ";
            break;
        case 12:
            monthFlo = "���μ�Ƽ��";
            break;
        }
        
        System.out.printf("%d���� ź��ȭ�� %s�Դϴ�.\n", month, monthFlo);
        
        sc.close();
    }
}
