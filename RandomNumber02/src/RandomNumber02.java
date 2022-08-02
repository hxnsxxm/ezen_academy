
/*
 * 6개의 난수를 중복되지 않게 생성하여, 
 * 로또 번호를 담는 int형 1차원 배열 lotto에 저장하고 ,
 * 오름차순으로 정렬하여 출력하시오.
 */

public class RandomNumber02 {
	public static void main(String[] args) {
		
		// 배열 생성
		int[] lotto = new int[6];
		
		// 배열에 중복되지 않은 난수 6개를 저장
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1; // 1 ~ 45까지의 난수
			for (int j=0; j<i; j++) {
				if (lotto[i] == lotto[j]) {
//					System.out.println("중복 발생");
					--i;
					break;
				}
			}
		}
		
		// 선택 정렬
		for (int i=0; i<lotto.length-1; i++) {
			for (int j=i+1; j<lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		
		// 출력
		for (int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}
}
