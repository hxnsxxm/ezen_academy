
import java.util.Scanner;
 
/* 
 * 문제) 월을 입력하여, 계절을 출력하는 프로그램을 작성하시오. switch문 
 * 
 * < 입력 화면 설계 >
 * 월 입력(1~12): 7
 * 
 * < 출력 화면 설계 >
 * 7월은 여름입니다.
 * 
 * 3월, 4월, 5월 : 봄
 * 6월, 7월, 8월 : 여름
 * 9월, 10월, 11월 : 가을
 * 12월, 1월, 2월 : 겨울
 * 
 */

public class Switch03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("월 입력(1~12): ");
        int month = sc.nextInt();
        String season = "";
        
        switch(month) {
        case 3: case 4: case 5:
            season = "봄";
            break;
        case 6: case 7: case 8:
            season = "여름";
            break;
        case 9: case 10: case 11:
            season = "가을";
            break;
        case 12: case 1: case 2:
            season = "겨울";
            break;
        default:
            season = "잘못 입력한 달";
            break;    
        }
        
        System.out.println(month + "월은 " + season + "입니다.");
        
        sc.close();
    }
}
