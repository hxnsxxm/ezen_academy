package player;

/*
< �������̽� ��Ģ >
1. �������̽��� �޼ҵ�� public abstract �޼ҵ常 ������ �� �ִ�.
2. �������̽��� �޼ҵ忡�� public abstract�� ������ �� �ִ�.
3. �������̽��� ������ public static final ����� ������ �� �ִ�.
4. �������̽��� ����� public static final�� ������ �� �ֵ�.

< �������̽��� �̸��� ����� ��� >
1. Ŭ���� �̸��� ����� ����� ���Ѵ�. - ���� ���´�
2. Ŭ������ �ٸ��ִ� �ǹ̸� ������ ���� ~able�� �ٿ��� �����. ex) Runnable, Clonnable, ... 

*/
public interface Skinnable {

	public static final int RED = 1;
	int   GREEN = 2;
	int    BLUE = 3;
	int   BLACK = 4;
	int LEOPARD = 5;
	
	void changeSkin(int skin);

}
