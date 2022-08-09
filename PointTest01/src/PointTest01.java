
/*
< ����� ���迡�� Ŭ������ �̸� >
1. ����� �ϴ� Ŭ���� - �θ�, �⺻(���, ����), ����, ����
2. ����� �޴� Ŭ���� - �ڽ�, �Ļ�                     , ����, ����

< super�� ����ϴ� ��� >
1. super() : �ڽ� Ŭ������ ������ ������ �θ� Ŭ������ �����ڸ� ȣ���Ͽ� ��������� ���� Ȯ���ϰ� �ʱ�ȭ�ϴ� ���
2. super.  : �ڽ� Ŭ�������� �θ� Ŭ������ ����� �����ϴ� ���, private ������� �Ұ���. public, protected�� ����

< ��������� ���� ������ >
1. private   : �ڽ��� Ŭ���� �������� ����  ����
2. (default) : ���� ��Ű�� �������� ���� ����
3. protected : ���� ��Ű�� �������� �����̰�, ����� �޾Ҵٸ� �ٸ� ��Ű�������� ���� ����
4. public    : ��𿡼��� ��� ����

# ���� ����
private < (default) < protected < public

//�ڡڡڡڡ�
< �������̵�(Overriding) >
1. �޼ҵ��� ������
2. ����� ���迡�� �θ� Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� ������ �Ȱ��� �����ϴ� ��
- �޼ҵ��, �Ű������� ������ Ÿ��, ���� Ÿ�Ա��� �����ϰ� ��ġ�ؾ� ��
3. ���������ڴ� �θ��� ���������ں��� ���ϰų� ������ ���������ڸ� ����ؾ� �Ѵ�.

*/

// �θ� Ŭ����
class Point2D {
	// 1�� ���
//	protected int x; // �ڽĿ��� ���ٰ����� ù��° ���
//	protected int y;
	// 2�� ��� - super()�� ����
	private int x;
	private int y;
	
	public Point2D() { }
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	
	public String toString() {
		return String.format("x=%d, y=%d", x, y);
	}
}


// error : implicit super constructor Point2D is undefined for default constructor. Must define an explicit constructor
// �θ� Ŭ������ default ������ �����ϸ� �ذ��

// Point3D Ŭ������ Point2D Ŭ������ Ȯ���Ѵ�.
// Point3D Ŭ������ Point2D Ŭ�����κ��� ��� ���� ��ӹ޴´�. (���ܵ� ���� - ������, �ʱ���-�ʱ�ȭ��)
// �ڽ� Ŭ����
class Point3D extends Point2D {
	private int z;
	
	// super(): �ڽ��� �����ڿ��� �θ� Ŭ������ �����ڸ� ȣ���ϴ� ���
	// - ��� ���� �θ��� private ������ ���� �ʱ�ȭ�ϴ� ����
	public Point3D(int x, int y, int z) {
		// �Ұ��� ���
		//this.x = x; --> ������� ���� �� �� ����
		//this.y = y; private ����� ���� �Ұ�

		// 1�� ��� - �θ��� ��������� ���� ������ protected�� ��ȭ�ϴ� ���
		// - ĸ��ȭ�� ���� ����
		// - �Ϲ������� �������� �ʴ� ���
		//this.x = x;
		//this.y = y;
		
		// 2�� ���
		super(x, y);
		
		this.z = z;
	}
	
	// getter 
	public int getZ() { return z; }
	
	// setter
	public void setZ(int z) { this.z = z; }
	
	// super. : �θ��� ����� �����ϴ� ���, public ���� ����� ��� �޼ҵ�
	// �������̵�(Overriding)
	@Override
	public String toString() {
		return super.toString() + ", z=" +z;
		//return "x=" + this.getX() +", y=" + this.getY() + ", z=" + z;
	}
}

public class PointTest01 {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(10, 20);
		Point3D p2 = new Point3D(50, 60, 70);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
