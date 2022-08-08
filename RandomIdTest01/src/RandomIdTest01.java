

class RandomId {
	//private static boolean flag = true;
	private static int count = 0;
	private int id;
	
	// Ŭ���� �ʱ�ȭ ��, Ŭ���� �ʱ���
	// ���� �ʱ�ȭ ��, ���� �ʱ���
	// Ŭ������ ���Ǳ� �ٷ� ������ �� �� ���� ȣ��ȴ�.
	static {
		count = (int)(Math.random() * 10) * 100;
	}
	{
		id = ++count;
	}
	/*
	{
		if(flag) {
			flag = false;
			count = (int)(Math.random() * 10) * 100;
		}
		id = ++count;
	}
	*/

	public RandomId() { }
	
	public String toString() {
		return String.format("Id. %3d", id);
	}
	
}

// ����) �� �� ������ ������ 0���� 900���� 100������ ������ �����Ͽ� ��� �ν��Ͻ����� �ڵ����� 1�� �����ϴ� id�� �����ϵ��� �Ͻÿ�.
// count�� ������ ���� 300�� ��, 3���� �ν��Ͻ��� id�� 301, 302, 303���� �����ϵ��� �Ͻÿ�.
// id ���� ����: 0, 100, 200, 300, 400, 500, 600, 700, 800, 900
public class RandomIdTest01 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) * 100;
		
		RandomId id1 = new RandomId();
		RandomId id2 = new RandomId();
		RandomId id3 = new RandomId();
		RandomId id4 = new RandomId();
		RandomId id5 = new RandomId();
		
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id3);
		System.out.println(id4);
		System.out.println(id5);
		
		
		//System.out.println(num);
	}
}
