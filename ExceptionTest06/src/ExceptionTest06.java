


// ���� 4)
// NumberFormatException: ������ ������ �ùٸ��� �ʰ� �ٲٷ��� �� �� �߻��ϴ� ����
public class ExceptionTest06 {
	public static void main(String[] args) {
		
		String[] numbers = {"95", "87", "66", "77", "83", "3.14"};
		int tot = 0;
		
		try {
			for (int i=0; i<numbers.length; i++) {
				tot += Integer.parseInt(numbers[i]);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("�հ�: " + tot);
		
		
	}
}
