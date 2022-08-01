
/*
 * < 2차원 반복문 >
 * - 중첩 반복문, 2중 반복문
 * - 반복문 안에  반복문이 들어가 있는 형태의 반복문
 * - 2차원 형태의 데이터를 다룰 수 있게 됨
 * 
 */

public class For2D01 {
    public static void main(String[] args) {
        
        // 1번 - 2차원 for문
        /*
        for(int i = 2;i<=9;i++) {
            for(int j = 1; j<=9; j++) {
                System.out.printf("%d * %d = %2d\n", i, j, i*j);
            }
            System.out.println();
        }
        */
        
        // 2번 - 2차원 while문
        /*
        int i=2, j=1;
        while(i<=9) {
            j=1;
            while(j<=9) {
                System.out.printf("%d * %d = %2d\n", i, j, i*j);
                j++;
            }
            System.out.println();
            i++;
        }
        */
        
        // 3번 - 2차원 do~while문
        /*
        int i=2, j=1;
        do {
            j=1;
            do {
                System.out.printf("%d * %d = %2d\n", i, j, i*j);
                j++;
            } while(j<=9);
            System.out.println();
            i++;
        } while(i<=9);
        */
        
    }
}
