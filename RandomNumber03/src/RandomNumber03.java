import java.util.Random;

/*
 * < ������ �����ϴ� 2���� ��� >
 * 1. Math.random() �޼ҵ� ���
 * 
 * 2. Random Ŭ���� ���
 * 
 */

public class RandomNumber03 {
	public static void main(String[] args) {
		Random r = new Random();

		// 1. 0 ~ 9 ������ ����
		int rn1 = r.nextInt(10);
		
		// 2. 1 ~ 10 ������ ����
		int rn2 = r.nextInt(10) + 1;
		
		System.out.println(rn2);
		
	}
}
