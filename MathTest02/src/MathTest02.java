import java.util.Random;

public class MathTest02 {
	public static void main(String[] args) {
		
		// Math.random() : 0 ~ 1미만(0.99999999...)
		System.out.println(Math.random());
		System.out.println("----------");
		
		// 1. 0 ~ 9 사이의 난수  --> 배열의 인덱스와 연결되어서 많이 쓰인다.
		int a = (int)(Math.random()*10);
		System.out.println(a);
		System.out.println("----------");
		
		// 2. 1 ~ 10 사이의 난수
		int b = (int)(Math.random()*10) + 1;
		System.out.println(b);
		System.out.println("----------");
		
		// 3. 1 ~ 45 사이의 난수
		int c = (int)(Math.random()*45) + 1;
		System.out.println(c);
		System.out.println("----------");
		
		// ★
		// 4. -30 ~ 30 사이의 난수
		int d = (int)(Math.random()*61) - 30;
		System.out.println(d);
		System.out.println("----------");
		
		// Random 클래스 활용
		Random r = new Random();
		int n = r.nextInt();     // int 범위의 난수
		System.out.println(n);
		System.out.println("----------");

		// 1-1. 0 ~ 9 사이의 난수
		int n1 = r.nextInt(10);
		System.out.println(n1);
		System.out.println("----------");
		
		// 2-1. 1 ~ 10 사이의 난수
		int n2 = r.nextInt(10) + 1;
		System.out.println(n2);
		System.out.println("----------");
		
		// 2-2. 1 ~ 45 사이의 난수
		int n3 = r.nextInt(45) + 1;
		System.out.println(n3);
		System.out.println("----------");
		
		// 2-3 -30 ~ 30 사이늬 난수
		int n4 = r.nextInt(61) - 30;
		System.out.println(n4);
		System.out.println("----------");
		
	}
}
