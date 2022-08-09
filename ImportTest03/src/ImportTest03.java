// java.lang ��Ű�� - �ڹٸ� ����ϴµ� �ʼ����� Ŭ�������� �ִ� ��Ű��
// - ���� import ���� �ʾƵ� �ڵ����� import �Ѵ�.
// - System, String, Math, Object, Exception, ...

// ��Ű�� �̸� ���� - ������ �ҹ��ڷ� �ۼ�

import java.util.Scanner;
// import java.lang.Math;

// < static import ��� >
// - Ŭ���� �޼ҵ�, Ŭ���� ����� ���ؼ� Ŭ�������� ������� �ʰ�, �޼ҵ��, ��������� ����� �� �ֵ��� �ϴ� ���
// 1. ������ static import ���
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
// 2. �ֹ��� static import ���
import static java.lang.Math.*;

// �������� ����� �ϴ� ���α׷�
public class ImportTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // �ν��Ͻ��� ���� �� ��� --> �ν��Ͻ� �޼ҵ�, �ν��Ͻ� ����

		System.out.print("������ �Է�: ");
		double radius = sc.nextDouble();
		System.out.print("x��ǥ�� �Է�: ");
		double x = sc.nextDouble();
		System.out.print("y��ǥ�� �Է�: ");
		double y = sc.nextDouble();
		System.out.print("�������� �Է�: ");
		int n = sc.nextInt();
		
		/*
		double area = Math.PI * radius * radius;   // ���� ����
		double perimeter = 2 * Math.PI * radius;   // ���� �ѷ�
		double distance = Math.sqrt(x*x + y*y);    // �Ÿ�
		n = Math.abs(n);                           // ���밪 --> Math Ŭ������ ��� ���, static way
		*/
		// static import ���
		double area = PI * radius * radius;   // ���� ����
		double perimeter = 2 * PI * radius;   // ���� �ѷ�
		double distance = sqrt(x*x + y*y);    // �Ÿ�
		n = abs(n); 
		
		System.out.println("���� ����: " + area);
		System.out.println("���� �ѷ�: " + perimeter);
		System.out.println("�Ÿ�: " + distance);
		System.out.println("���밪: " + n);
		
		
		
		sc.close();
	}
}
