
import java.util.Scanner;

public class If08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("�� �Է�: ");
        int month = sc.nextInt();
        int day = 0;
        /*
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
            day = 31;
        } else if (month==2) {
            day = 28;
        } else if (month==4 || month==6 || month==9 || month==11) {
            day = 30;
        } else {
            day = 0;
        }
        */
        switch(month) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            day = 31;
            break;
        case 2:
            day = 28;
            break;
        case 4: case 6: case 9: case 11:
            day = 30;
            break;
        default:
            day = 0;
            break;
        }
        
        if(day==0) {
            System.out.println(month + "���� �������� �ʴ� ���Դϴ�.");
        } else {
            System.out.println(month + "���� �ϼ��� " + day + "�� �Դϴ�.");
        }
        
        sc.close();
    }
}
