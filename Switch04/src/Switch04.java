
/*
 * ����) ����, ����, ���� ������ �Է��ϰ�, ����, ���, ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. switch��
 * ������ ����� �������� 90�� �̻��̸� A, 80�� �̻��̸� B, 70�� �̻��̸� C, 60�� �̻��̸� D, �� �̸��̸� F
 * 
 * < �Է� ȭ�� ���� >
 * ���� ���� �Է�: 93
 * ���� ���� �Է�: 93
 * ���� ���� �Է�: 92
 * 
 * < ��� ȭ�� ���� >
 * ����: 278
 * ���: 92.67
 * ����: A
 */

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("���� ���� �Է�: ");
        int scoreKor = sc.nextInt();
        System.out.print("���� ���� �Է�: ");
        int scoreEng = sc.nextInt();
        System.out.print("���� ���� �Է�: ");
        int scoreMat = sc.nextInt();
        
        int scoreSum = scoreKor + scoreEng + scoreMat;
        double scoreAvg = (double)scoreSum / 3;
        char grade = 'F';
        
        int n =  (int)scoreAvg/10;
       
        switch(n) { // switch((int)scoreAvg/10)
        case 10:    // �� ���� ��� 100���� ���� ���
        case 9:
            grade = 'A';
            break;
        case 8:
            grade = 'B';
            break;
        case 7:
            grade = 'C';
            break;
        case 6:
            grade = 'D';
            break;
        default:
            grade = 'F';
            break;
        }
        
        /*
        if (scoreAvg>=90) {
            grade = 'A';
        } else if (scoreAvg>=80) {
            grade = 'B';
        } else if (scoreAvg>=70) {
            grade = 'C';
        } else if (scoreAvg>=60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        */
        System.out.printf("\n����: %d\n", scoreSum);
        System.out.printf("���: %.2f\n", scoreAvg);
        System.out.printf("����: %c\n", grade);
        
        sc.close();
    }
}
