import java.util.Scanner;

/*
 * ����) ���� 3���� �Է��Ͽ�,
 * �� �߿��� �ִ񰪰� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �ִ��� ���ϴ� �κ�, �ּڰ��� ���ϴ� �κ��� ���� �޼ҵ�� ����� �����Ͻÿ�.
 * - �޼ҵ��: calcMax, calcMin
 * 
 */

public class Method05 {

	static int calcMax(int  n1, int n2, int n3) {
		/*
		if (n1 < n2) {
			if (n2 < n3) return n3;
			else return n2;
		} else {
			if (n3 < n1) return n1;
			else return n3;
		}
		*/
		
		int max = n1;
		if (max < n2) max = n2;
		if (max < n3) max = n3;
		return max;
		
	} 
	
	static int calcMin(int  n1, int n2, int n3) {
		/*
		if (n1 < n2) {
			if (n3 < n1) return n3;
			else return n1;
		} else {
			if (n3 < n2) return n3;
			else return n2;
		}
		*/
		
		int min = n1;
		if (min > n2) min = n2;
		if (min > n3) min = n3;
		return min;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ִ񰪰� �ּڰ��� ���մϴ�.");
		System.out.print("ù ��° ���� �Է�: ");
		int n1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է�: ");
		int n2 = sc.nextInt();
		System.out.print("�� ��° ���� �Է�: ");
		int n3 = sc.nextInt();
		
		int numMax = calcMax(n1, n2, n3);
		int numMin = calcMin(n1, n2, n3);
		
		System.out.printf("\n�� ���� %d, %d, %d �߿��� �ִ�: %d, �ּڰ�: %d\n", n1, n2, n3, numMax, numMin);
		
		sc.close();
	}
}
