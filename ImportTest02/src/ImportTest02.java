
// 1. ������ import - ������ Ŭ������ ��� import �ϴ� ���
//import java.util.Random;
//import java.util.Scanner;

// 2. �ֹ��� import - *�� ���ؼ�
// ���� �� ��Ű�� �ȿ��� ���Ǵ� ��� Ŭ������ import �ϴ� ���. util ���� ��� Ŭ������ �ƴ϶�.
import java.util.*;

public class ImportTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("���� �Է�(0~9) : ");
		int x = sc.nextInt();
		
		int rn = r.nextInt(10);  // 0~9 ������ ����
		
		if (x == rn) {
			System.out.println("������ ����� �ִ� ���̴�");
		} else {
			System.out.println("����� ��");
		}
		
		sc.close();
	}
}
