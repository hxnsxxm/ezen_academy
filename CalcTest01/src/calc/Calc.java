package calc;



// class Calc {
// CalcTest01 ���� error : the type ~ is not visible

// public �׼��� Ŭ����
public class Calc {
	
	// public ���� ����
	public int add(int x, int y) {
		return x + y;
	}
	
	// int subtract(int x, int y) {
	// CalcTest01 ���� �ν��Ͻ� ���������� ������ ������
	// subtract �޼ҵ带 ����Ϸ��� error : the method from the type ~ is not visible
	
	// default ���� ����
	public int subtract(int x, int y) {
		return x - y;
	}
	
	// 
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		return x / y;
	}
	
}
