package test;

// error : the type ~ is not visible
// Calc �� public ���� ����Ǿ� ���� ������
import calc.Calc;
// import calc.*;

/*
< ��Ű��(package)�� ���� >
1. Ŭ������ ��ɺ���, �������� ������ ����
2. Ŭ������ ���� ���� ������ �ο��ϴ� ����

# ��Ű���� �̸��� ���̴� ��� - ����
1. ��ü�� �ҹ��ڷ� �ۼ�
2. ��Ű������ ���ͳ� �������� �������� ����� ���� ���� - ������ ��Ű������ ���� �� ����
3. ��Ű������ �����θ��� �ƴϾ .(����)���� �ܾ ������
ex) www.hxnsxxm.co.kr  -->  kr.co.hxnsxxm


< Ŭ������ ���� ���� ���� >
1. public �׼���: Ŭ���� �տ� public ���̴� ���
- ��𿡼��� ��� ������ Ŭ����

2. package(default) �׼���: Ŭ���� �տ� public ������ �ʴ� ���
- ���� ��Ű�� �������� ��� ������ Ŭ����

< Ŭ������ ����� ���� ���� ���� >
1. private - ���� Ŭ���� �������� ���� ���
2. default - ���� ��Ű�� �������� ���� ���
3. protected - ���� ��Ű�� �������� �����̰�, �ٸ� ��Ű���� ����� �޾Ҵٸ� ���� ���
4. public - ��𿡼��� ���� ��� 

# ������ ���� (����: ����<-->�д�, ���� ����: ���ϴ�<-->���ϴ�)
private < (default) < protected < public

*/

public class CalcTest01 {
	public static void main(String[] args) {
		Calc a = new Calc();
		
		System.out.println("����: " + a.add(10,  20));
		System.out.println("����: " + a.subtract(10,  20));
		System.out.println("����: " + a.multiply(10,  20));
		System.out.println("������: " + a.divide(10,  20));
		
		
		
	}
}
