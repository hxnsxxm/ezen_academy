/*
����) ����, ����, ���� ������ �Է��Ͽ�, ������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
< �Է� ȭ�� ���� >
���� ���� �Է�: 93
���� ���� �Է�: 93
���� ���� �Է�: 92

< ��� ȭ�� ���� >
����: 278
���: 92.6666666666667
*/

/*  �ڡڡڡ�
 * Casting (ĳ����): ������ ������ Ÿ���� �����ϴ� ��
 */

import java.util.Scanner;

public class Casting01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int scoreKor, scoreEng, scoreMat;
        System.out.print("���� ���� �Է�: ");
        scoreKor = sc.nextInt();  // int scoreKor = sc.nextInt();
        System.out.print("���� ���� �Է�: ");
        scoreEng = sc.nextInt();
        System.out.print("���� ���� �Է�: ");
        scoreMat = sc.nextInt();
        
        int scoreSum;
        double scoreAvg;
        scoreSum = scoreKor + scoreEng + scoreMat;  // int scoreSum = scoreKor + scoreEng + scoreMath;
        // ���� ��ġ �°�: ���� �ٸ� ũ���� �׵��� ��������� �����Ѵٸ�, �� ū ũ�⸦ ���� �׿� ���缭 ���� ����� ����
        // (1) double�� ���    3.0 == 3.      
        scoreAvg = scoreSum / 3.;  
        // (2) Casting (ĳ����), �����ϴ� ���(�����)
        scoreAvg = (double)scoreSum / 3;
        
        System.out.println("���: " + scoreAvg); // System.out.prinf("%6.2f", avg);
        System.out.println("����: " + scoreSum); // System.out.prinf("%d", sum);
        //System.out.printf("%d \n%6.2f", sum, avg);
        
        sc.close();
    }
}
