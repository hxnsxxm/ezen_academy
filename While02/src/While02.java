
/*
 * < while문과 do-while문의 비교 >
 * - while문은 조건을 만족하지 않으면, 한 번도 실행되지 않을 수 있지만
 * - do-while문은 조건을 만족하지 않아도 반드시 한 번은 실행함
 * - do-while문은 조건을 만족하지 않아도 반드시 한 번은 싱행해야 할 때 사용함
 *   ex) 입력화면 설계...
 */


public class While02 {
    public static void main(String[] args) {
        
        // while문
        int i = 20;
        while(i<=10) {
            System.out.println("i" + i);
            i++;
        }
        
        // do-while문
        int k = 20;
        do {
            System.out.println("k" + k);
            k++;
        } while(k<=10);
       
        
        
        
    }
}
