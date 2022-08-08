
class XY {
	private static int count = 0;
	private int id;
	private int x = 0;
	private int y = 0;

	// �ν��Ͻ� �ʱ�ȭ ��, �ν��Ͻ� �ʱ���
	// ������ �ʱ�ȭ ��, ������ �ʱ���
	// ȣ�� ���� : ��� �����ڰ� ȣ��Ǳ� �ٷ� ������ ȣ��Ǵ� �ʱ���
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
		return String.format("id: %d / x��ǥ, y��ǥ = (%2d, %2d)\n", id, x, y);
	}
}

// ����) �ν��Ͻ��� �°� �����ڸ� �����ϰ�, �� �ν��Ͻ��� id�� x��ǥ y��ǥ�� ����Ͻÿ�
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
