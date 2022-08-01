
/*
 *  < while문의 형식 >
 *  초기값;
 *  
 *  while(조선식) {
 *      실행문;
 *      ...
 *      증감식;
 *  }
 * 
 * 
 * 문제1) 1부터 10까지 1씩 증가하면서 출력
 * 문제2) 10부터 1까지 1씩 감소하면서 출력
 * 문제3) 1부터 10까지 2씩 증가하면서 출력
 */
public class While01 {
    public static void main(String[] args) {
        
        // 1번
        /*
        int i = 1;  // 초기값
        
        while(i <= 10) {  // 조건식
            System.out.println(i + " Little Indian.");
            
            i++;  // 증감값, 후위 연산자
        }
        */
        
        // 2번
        /*
        int i = 10;
        
        while(i>0) {
            System.out.println(i + " Little Indian.");
            i--;
        }
        */
        
        // 3번
        int i = 1;
        while(i<=10) {
            System.out.println(i + "Little Indian.");
            
            i += 2;
        }
    }
}
