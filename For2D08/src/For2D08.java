import java.util.Scanner;


/*
 * 2차원 반복문 활용 - 소수 판별
 * 소수(Prime Number) - 1과 자신으로만 나누어 떨어지는 수
 * 문제) 정수 1개를 입력하여, 
 * 입력한 정수 범위에서의 모든 소수를 출력하고, 소수의 개수와 합계를 구하시오.
 * 
 * < 입력 화면 설계 >
 * 정수 범위 입력: 10
 * 
 * < 출력 화면 설계 >
 * 2 3 5 7
 * 2부터 10까지 범위의 소수 개수: 4
 * 2부터 10까지 범위의 소수 합계: 17
 * 
 */
public class For2D08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력한 수의 범위 안의 소수를 구합니다.");
		System.out.print("정수 범위 입력: ");
		int n = sc.nextInt();
		
		int cnt = 0;
		int sum = 0;
		/*
		for (int i=2; i<=n; i++) {
			int count = 0;
			
			for (int j=1; j<=i/2; j++) {
				if(i%j==0) count++;
			}
			
			if(count==1) {
				System.out.print(i + " ");
				sum += i;
				cnt++;
			}
		}
		*/
		
		for (int i=2; i<=n; i++) {
			for (int j=2; j<=i; j++) {
				if (i==j) {     // break 문에 의해서 빠져나가지 않고, 끝까지 왔다면, 그 수는 소수
					System.out.print(i + " ");
					++cnt;
					sum += i;
				}
				
				if (i%j == 0) { // 자신이 되기 전에 나누어 떨어지면 소수가 아님
					break;
				}
			}
		}
		
		System.out.println();
		System.out.printf("2부터 %d까지 범위의 소수 개수: %d\n", n, cnt);
		System.out.printf("2부터 %d까지 범위의 소수 합계: %d\n", n, sum);
		
		
		sc.close();
		
	}
}
