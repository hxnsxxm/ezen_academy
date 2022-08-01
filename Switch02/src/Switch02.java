
import java.util.Scanner;

/* 문제) 월을 입력하여, 월별 탄생화를 출력하는 프로그램을 작성하시오.
 * 
 * < 입력 화면 설계 >
 * 탄생월 입력(1~12): 6
 * 
 * < 출력 화면 설계 >
 * 6월의 탄생화는 백합입니다.
 * 
 * 1월: 카네이션, 2월: 제비꽃, 3월: 수선화, 4월: 스위트피, 5월: 은방울꽃, 6월: 백합, 
 * 7월: 미나이라재비, 8월: 클라디올러스, 9월: 물망초, 10월: 금잔화, 11월: 국화, 12월: 포인세티아
 * 
 */
public class Switch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("탄생월 입력(1~12): ");
        int month = sc.nextInt();
        String monthFlo = "";
        
        switch(month) {
        case 1:
            monthFlo = "카네이션";
            break;
        case 2:
            monthFlo = "제비꽃";
            break;
        case 3:
            monthFlo = "수선화";
            break;
        case 4:
            monthFlo = "스위트피";
            break;
        case 5:
            monthFlo = "은방울꽃";
            break;
        case 6:
            monthFlo = "백합";
            break;
        case 7:
            monthFlo = "미나리아재비";
            break;
        case 8:
            monthFlo = "글라디올러스";
            break;
        case 9:
            monthFlo = "물망초";
            break;
        case 10:
            monthFlo = "금잔화";
            break;
        case 11:
            monthFlo = "국화";
            break;
        case 12:
            monthFlo = "포인세티아";
            break;
        }
        
        System.out.printf("%d월의 탄생화는 %s입니다.\n", month, monthFlo);
        
        sc.close();
    }
}
