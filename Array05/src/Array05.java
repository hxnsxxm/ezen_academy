import java.util.Scanner;

/*
 * ����2) A�� �л����� �Է��ϰ�, 
 * �Է��� �л��� ũ���� scores �迭�� �����ϰ�,
 * �� �л��� ������ �Է��Ͽ�, �� �л��� ������ ����ϰ�, A���� ������ ����� ����Ͻÿ�.
 * 
 * 
 */

public class Array05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // ���� ���� sc
		
		// �Է� ȭ�� 1 : �л��� �Է�
		System.out.print("�л� �� �Է�: ");
		int numStudents = sc.nextInt();
		
		// 1���� �迭 ����
		//int[] scores = new int[numStudents];
		int[] scores; // int scores[];
		scores = new int[numStudents];  // ********* �߿�
		
		int sum = 0; 
		double avg = 0.0;
		
		// �Է� ȭ�� 2 : �� �л��� ���� �Է�
		for (int i=0; i<numStudents; i++) {
			System.out.print("�л�" + (i+1) + "�� ���� �Է�: ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		avg = (double)sum / numStudents;
		
		System.out.println("\n");
		// ��� ȭ�� : �� �л��� ���� ���
		for (int i=0; i<numStudents; i++) {
			System.out.println("�л�" + (i+1) + "�� ���� : " + scores[i]);
		}
		System.out.printf("A�� �л����� ����: %d\nA�� �л����� ���: %.2f\n", sum, avg);
		
		sc.close();
	}
}
