
import java.util.Scanner;

/* 
* ����) ���� �Է��Ͽ�, ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. if�� 
* 
* < �Է� ȭ�� ���� >
* �� �Է�(1~12): 7
* 
* < ��� ȭ�� ���� >
* 7���� �����Դϴ�.
* 
* 3��, 4��, 5�� : ��
* 6��, 7��, 8�� : ����
* 9��, 10��, 11�� : ����
* 12��, 1��, 2�� : �ܿ�
* 
*/

public class If07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("�� �Է�(1~12): ");
        int month = sc.nextInt();
        String season = "";
        
        if(month==3 || month==4 || month==5) {  // if (month>=3 && month<=5)
            season = "��";
        } else if (month==6 || month==7 || month==8) {
            season = "����";
        } else if (month==9 || month==10 || month==11) {
            season = "����";
        } else if (month==12 || month==1 || month ==2) {
            season = "�ܿ�";
        } else {
            season = "�߸� �Էµ� ��";
        }
        
        System.out.println(month + "���� " + season + "�Դϴ�.");
        
        
        sc.close();
    }
}