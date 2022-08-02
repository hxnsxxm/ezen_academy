
// Homework01

public class For2D05 {
	public static void main(String[] args) {
		
		System.out.println("구구단을 출력합니다.");
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d * %d = %2d\t", j, i, i*j);
			}
			System.out.println();
		}
	}
}
