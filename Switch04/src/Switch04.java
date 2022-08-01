
/*
 * 문제) 국어, 영어, 수학 점수를 입력하고, 총점, 평균, 학점을 계산하는 프로그램을 작성하시오. switch문
 * 학점을 평균을 기준으로 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 그 미만이면 F
 * 
 * < 입력 화면 설계 >
 * 국어 점수 입력: 93
 * 영어 점수 입력: 93
 * 수학 점수 입력: 92
 * 
 * < 출력 화면 설계 >
 * 총점: 278
 * 평균: 92.67
 * 학점: A
 */

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("국어 점수 입력: ");
        int scoreKor = sc.nextInt();
        System.out.print("영어 점수 입력: ");
        int scoreEng = sc.nextInt();
        System.out.print("수학 점수 입력: ");
        int scoreMat = sc.nextInt();
        
        int scoreSum = scoreKor + scoreEng + scoreMat;
        double scoreAvg = (double)scoreSum / 3;
        char grade = 'F';
        
        int n =  (int)scoreAvg/10;
       
        switch(n) { // switch((int)scoreAvg/10)
        case 10:    // 세 과목 모두 100점을 맞은 경우
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
        System.out.printf("\n총점: %d\n", scoreSum);
        System.out.printf("평균: %.2f\n", scoreAvg);
        System.out.printf("학점: %c\n", grade);
        
        sc.close();
    }
}
