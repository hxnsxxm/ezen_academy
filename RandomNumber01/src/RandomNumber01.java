

/*
 * ���� - Random Number, ������ ��, ������ ��
 * 
 * Math.random() : 0 ~ 1 �̸��� ���� ������ ����, 0 ~ 0.99999.... ������ ���� ������ �߻�
 */
public class RandomNumber01 {
	public static void main(String[] args) {
		
		// 1. 0 ~ 9 ������ ���� ����
		int rn1 = (int)(Math.random() * 10);
		
		// 2. 1 ~ 10 ������ ���� ����
		int rn2 = (int)(Math.random() * 10) + 1;
		
		// 3. 1~45 ������ ���� ����
		int rn3 = (int)(Math.random() * 45) + 1;
		
		System.out.print(rn3);
	}
}
