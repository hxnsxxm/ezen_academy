/*
 * < do ~ while문의 형식 >
 * 
 * 초기값;
 * 
 * do  {
 *     실행문;
 *     ...
 *     증감값;
 * } while(조건식);
 */

public class DoWhile01 {
    public static void main(String[] args) {
        
        int i =1;
        
        do {
            System.out.println(i + " Little Indian.");
            
            i++;
        } while(i<=10);
    }
}
