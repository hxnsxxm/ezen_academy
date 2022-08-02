import java.util.Random;

/*
 * < 난수를 생성하는 2가지 방법 >
 * 1. Math.random() 메소드 사용
 * 
 * 2. Random 클래스 사용
 * 
 */

public class RandomNumber03 {
	public static void main(String[] args) {
		Random r = new Random();

		// 1. 0 ~ 9 사이의 난수
		int rn1 = r.nextInt(10);
		
		// 2. 1 ~ 10 사이의 난수
		int rn2 = r.nextInt(10) + 1;
		
		System.out.println(rn2);
		
	}
}
