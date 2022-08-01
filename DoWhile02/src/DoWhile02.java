
/*
 * < do-while문의 특징 >
 * - do-while문은 조건을 만족하지 않아도 반드시 한 번은 싱행해야 할 때 사용함
 *   ex) 입력화면 설계...
 */

/*
 * 문제1) 1~4번까지 메뉴를 선택하고, 실행하는 프로그램을 작성
 * - 1~4번까지의 메뉴가 아니라면, 계속 메뉴화면을 보여주는 프로그램
 */

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menu;
        
        do {
            System.out.println("### 메뉴 선택 ###");
            System.out.println("1 - 파일 열기");
            System.out.println("2 - 파일 읽기");
            System.out.println("3 - 파일 쓰기");
            System.out.println("4 - 파일 닫기");
            System.out.print("메뉴 입력(1~4): ");
            menu = sc.nextInt();
        } while(menu<1 || menu>4); 
        // while(!(menu>=1 && menu<=4))
        // 드 모르강의 법칙 : 논리 AND와 논리 OR를 뒤집어서 표현하는 방법
        
        switch(menu) {
        case 1:
            System.out.println("파일 열기를 하였습니다.");
            break;
        case 2:
            System.out.println("파일 읽기를 하였습니다.");
            break;
        case 3:
            System.out.println("파일 쓰기를 하였습니다.");
            break;
        case 4:
            System.out.println("파일 닫기를 하였습니다.");
            break;
        }
        
        sc.close();
    }
}
