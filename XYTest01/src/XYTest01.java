
class XY {
	private static int count = 0;
	private int id;
	private int x = 0;
	private int y = 0;

	// 인스턴스 초기화 블럭, 인스턴스 초기자
	// 비정적 초기화 블럭, 비정적 초기자
	// 호출 시점 : 모든 생성자가 호출되기 바로 직전에 호출되는 초기자
	{
		id = ++count;
	}
	
	public XY() { }//id = ++count; }
	
	public XY(int x) {
		//id = ++count;
		this.x = x;
	}
	
	public XY(int x, int y) {
		this(x);
		//id = ++count;
		this.y = y;
	}
	
	public XY(XY xy) {
		this(xy.x, xy.y);
		//id = ++count;
	}
	
	public static int getCount() { return count; }
	
	public int getId() { return id; }
	public int getX() { return x; }
	public int getY() { return y; }
	
	public void setId(int id) { this.id = id; }
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	
	@Override
	public String toString() {
		return String.format("id: %d / x좌표, y좌표 = (%2d, %2d)\n", id, x, y);
	}
}

// 문제) 인스턴스에 맞게 생성자를 생선하고, 각 인스턴스의 id와 x좌표 y좌표를 출력하시오
public class XYTest01 {
	public static void main(String[] args) {
		XY p1 = new XY();
		XY p2 = new XY(10);
		XY p3 = new XY(30, 40);
		XY p4 = new XY(p3);
		
		System.out.print(p1);
		System.out.print(p2);
		System.out.print(p3);
		System.out.print(p4);
		
	}
}
