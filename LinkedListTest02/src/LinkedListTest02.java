import java.util.Iterator;
import java.util.LinkedList;

/*
����) 
1. Point Ŭ������ ��� LinkedList�� list�� �����Ͻÿ�.
2. ����Ʈ�� Point Ŭ������ �ν��Ͻ� 10���� �����ϰ� Ȯ���Ͻÿ�.
- 10���� 10�� �����Ͽ� 100������ ���� ���� x, y ��ǥ������ �����Ͻÿ�.
3. ����Ʈ�� (10, 10) ������ �ڿ� (11, 11)�� �߰��ϰ� Ȯ���Ͻÿ�.
4. ����Ʈ���� (40, 40) �����͸� �����ϰ� Ȯ���Ͻÿ�.
5. ����Ʈ���� (50, 50) �����͸� (55, 55)�� �����ϰ� Ȯ���Ͻÿ�.
6. ����Ʈ�� �� �տ� (1, 1) �����͸� �߰��ϰ� Ȯ���Ͻÿ�.
7. ����Ʈ�� ��� �����͸� 3���� ������� ����Ͻÿ�. (�⺻ for��, Ȯ�� for��, Iterator)
*/

class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	// Point �ν��Ͻ��� ���� ���ϴ� �޼ҵ�
	public boolean compare(Point p) {
		/*
		if (this.x==p.x && this.y==p.y) return true;
		else return false;
		*/
		return this.x==p.x && this.y==p.y;
	}
}

public class LinkedListTest02 {
	public static void main(String[] args) {
		
		System.out.println("- 1. ��ũ�帮��Ʈ ���� -");
		LinkedList<Point> list = new LinkedList<Point>();
		System.out.println();
		
		System.out.println("- 2. �ν��Ͻ� 10�� ����(������) -");
		for (int i=10; i<=100; i+=10) {
			list.add(new Point(i, i));
		}
		System.out.println(list);
		System.out.println();
		
		System.out.println("- 3. (10,10) �ڿ� (11,11) ����(�������, �߰�) -");
		for (int i=0; i<list.size(); i++) {
			Point tp = list.get(i);
			if (tp.getX()==10 && tp.getY()==10) {
				list.add(i+1, new Point(11,11));
				//break;
			}
		}
		System.out.println(list);
		System.out.println();
		
		System.out.println("- 4. (40,40) ���� �� Ȯ�� -");
		for (int i=list.size()-1; i>=0; i--) {
			Point tp = list.get(i);
			/* 1��
			if (tp.getX()==40 && tp.getY()==40) {
				list.remove(i);
			}
			*/
			// 2�� - compare() �޼ҵ� Ȱ��
			if (tp.compare(new Point(40, 40))) {
				list.remove(i);
			}
		}
		System.out.println(list);
		System.out.println();
		
		System.out.println("- 5. (50,50)�� (55,55)�� ���� �� Ȯ�� -");
		for (int i=0; i<list.size(); i++) {
			Point tp = list.get(i);
			if (tp.getX()==50 && tp.getY()==50) {
				//tp.setX(55);
				//tp.setY(55);
				list.set(i, new Point(55, 55));
			}
		}
		System.out.println(list);
		System.out.println();
		
		System.out.println("- 6. �� �տ� (1,1) �߰�(�������) -");
		list.addFirst(new Point(1, 1));
		System.out.println(list);
		System.out.println();
		
		System.out.println("- 7. ��� 1��: �⺻ for�� ��� -");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		System.out.println("- 8. ��� 2��: Ȯ�� for�� ��� -");
		for (Point p : list) {
			System.out.println(p);
		}
		System.out.println();
		
		System.out.println("- 9. ��� 3��: Iterator ��� -");
		Iterator<Point> it = list.iterator();
		while(it.hasNext()) {
			Point p = it.next();
			System.out.println(p);
		}
	}
}
