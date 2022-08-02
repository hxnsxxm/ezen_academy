

/*
 * 난수 - Random Number, 임의의 수, 무작위 수
 * 
 * Math.random() : 0 ~ 1 미만의 값을 난수로 생성, 0 ~ 0.99999.... 사이의 값을 난수로 발생
 */
public class RandomNumber01 {
	public static void main(String[] args) {
		
		// 1. 0 ~ 9 사이의 난수 생성
		int rn1 = (int)(Math.random() * 10);
		
		// 2. 1 ~ 10 사이의 난수 생성
		int rn2 = (int)(Math.random() * 10) + 1;
		
		// 3. 1~45 사이의 난수 생성
		int rn3 = (int)(Math.random() * 45) + 1;
		
		System.out.print(rn3);
	}
}
