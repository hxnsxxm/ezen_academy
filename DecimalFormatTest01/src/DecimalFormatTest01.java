import java.text.DecimalFormat;

// DecimalFormat Ŭ���� - ���ڸ� �پ��� �������� ����� �� �ֵ��� �ϴ� Ŭ����
public class DecimalFormatTest01 {
	public static void main(String[] args) {
		
		double number = 1234567.4567;
		
		// 1�� �ڸ� �̻󿡼� ��ǥ(,)�� õ���� ���� ��ȣ, �Ҽ��� ���Ͽ����� ǥ���� �ڸ����� �����ϴ� ����(�ݿø��Ͽ� ǥ��) 
		// # : �Ҽ��� ���Ͽ��� ������� �ʴ� �ڸ��� ǥ������ ����, 1�� �ڸ� �̻󿡼� ������� �ʴ� �ڸ��� ǥ������ ���� 
		// 0 : �Ҽ��� ���Ͽ��� ������� �ʴ� �ڸ��� ǥ����,     1�� �ڸ� �̻󿡼� ������� �ʴ� �ڸ��� ǥ����
		DecimalFormat df1 = new DecimalFormat("#,###.#####");
		DecimalFormat df2 = new DecimalFormat("#,###.##");   // ���� ���
		DecimalFormat df3 = new DecimalFormat("0,000.00000");
		DecimalFormat df4 = new DecimalFormat("0,000.00");
		DecimalFormat df5 = new DecimalFormat("#,###,####,###.#####");
		DecimalFormat df6 = new DecimalFormat("0,000,0000,000.00000");
		DecimalFormat df7 = new DecimalFormat("#.#E0"); // ������, 1.2E6, 1.2*10��6����, ���� ū ���ڸ� ǥ���� �� ���
		DecimalFormat df8 = new DecimalFormat("0.0E0"); // ������, 1.2E6
		DecimalFormat df9 = new DecimalFormat("#E0");   // ������, .1E7, 0.1*10��7����  
		DecimalFormat df10 = new DecimalFormat("0E0");  // ������, 1E6, 1*10��6����
		
		
		System.out.println(df1.format(number));
		System.out.println(df2.format(number));
		System.out.println(df3.format(number));
		System.out.println(df4.format(number));
		System.out.println(df5.format(number));
		System.out.println(df6.format(number));
		System.out.println(df7.format(number));
		System.out.println(df8.format(number));
		System.out.println(df9.format(number));
		System.out.println(df10.format(number));
		
		
	}
}
