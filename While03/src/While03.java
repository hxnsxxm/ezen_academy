
/*
 * < while문의 특징 >
 * - 반복횟수를 파악하기 어렵고, 조건이 중심이 될때 사용하면 효율적임
 */

/*
 * 문제) 1부터 1식 누적하여 더해서 그 합이 100이 되기 전까지를 출력하는 프로그램을 작성하시오.
 */

public class While03 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        
        while(sum+i<100) { // ★★★★★★★★★★★★★★★★★★★★★★★★ 중요, if(sum<100) break;
            sum += i;   // sum = sum + i;
            
            System.out.println("1부터 " + i + "까지 더한 합: " + sum);
            i++;
        }
        System.out.println("sum: " + sum);
    }
}
