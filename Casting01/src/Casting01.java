/*
문제) 국어, 영어, 수학 점수를 입력하여, 총점과 평균을 계산하는 프로그램을 작성하시오.
< 입력 화면 설계 >
국어 점수 입력: 93
영어 점수 입력: 93
수학 점수 입력: 92

< 출력 화면 설계 >
총점: 278
평균: 92.6666666666667
*/

/*  ★★★★
 * Casting (캐스팅): 강제로 데이터 타입을 변경하는 것
 */

import java.util.Scanner;

public class Casting01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int scoreKor, scoreEng, scoreMat;
        System.out.print("국어 점수 입력: ");
        scoreKor = sc.nextInt();  // int scoreKor = sc.nextInt();
        System.out.print("영어 점수 입력: ");
        scoreEng = sc.nextInt();
        System.out.print("수학 점수 입력: ");
        scoreMat = sc.nextInt();
        
        int scoreSum;
        double scoreAvg;
        scoreSum = scoreKor + scoreEng + scoreMat;  // int scoreSum = scoreKor + scoreEng + scoreMath;
        // 이항 수치 승격: 서로 다른 크기의 항들이 산술연산을 진행한다면, 더 큰 크기를 가진 항에 맞춰서 연산 결과가 나옴
        // (1) double형 상수    3.0 == 3.      
        scoreAvg = scoreSum / 3.;  
        // (2) Casting (캐스팅), 권장하는 방법(명시적)
        scoreAvg = (double)scoreSum / 3;
        
        System.out.println("평균: " + scoreAvg); // System.out.prinf("%6.2f", avg);
        System.out.println("총점: " + scoreSum); // System.out.prinf("%d", sum);
        //System.out.printf("%d \n%6.2f", sum, avg);
        
        sc.close();
    }
}
