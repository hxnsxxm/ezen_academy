
public class InfiniteLoop01 {
	public static void main(String[] args) {
		
		// ���ѷ��� 1 - �������� �����ϴ� ���
		/*
		int i=1;
		
		while(i <= 10) {
			System.out.println(i);
			//i++;
		}
		*/
		
		// ���ѷ��� 2 - ���ǽ��� �߸� �ۼ��� ���
		/*
		int i=11;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		*/
		
		// �ǵ������� ���ѷ����� ����� ���
		// 1�� - while�� : ���� ���
		/*
		while(true) {
			System.out.println("*");
		}
		*/
		
		// 2�� - for��
		/*
		for(;true;) {
			System.out.println("#");
		}
		*/
		
		for(;;) {
			System.out.println("#");
		}
		
	}

}
