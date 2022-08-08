

class RandomId {
	//private static boolean flag = true;
	private static int count = 0;
	private int id;
	
	// 클래스 초기화 블럭, 클래스 초기자
	// 정적 초기화 블럭, 정적 초기자
	// 클래스가 사용되기 바로 직전에 딱 한 번만 호출된다.
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

// 문제) 매 번 실행할 때마다 0에서 900까지 100단위의 난수를 생성하여 모든 인스턴스에서 자동으로 1씩 증가하는 id를 생성하도록 하시오.
// count에 생선된 값이 300일 때, 3개의 인스턴스의 id는 301, 302, 303으로 생성하도록 하시오.
// id 값의 범위: 0, 100, 200, 300, 400, 500, 600, 700, 800, 900
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
