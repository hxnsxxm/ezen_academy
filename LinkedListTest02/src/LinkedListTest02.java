import java.util.Iterator;
import java.util.LinkedList;

/*
문제) 
1. Point 클래스를 담는 LinkedList인 list를 생성하시오.
2. 리스트에 Point 클래스의 인스턴스 10개를 저장하고 확인하시오.
- 10부터 10씩 증가하여 100까지의 값을 갖는 x, y 좌표값으로 저장하시오.
3. 리스트의 (10, 10) 데이터 뒤에 (11, 11)을 추가하고 확인하시오.
4. 리스트에서 (40, 40) 데이터를 삭제하고 확인하시오.
5. 리스트에서 (50, 50) 데이터를 (55, 55)로 수정하고 확인하시오.
6. 리스트의 맨 앞에 (1, 1) 데이터를 추가하고 확인하시오.
7. 리스트의 모든 데이터를 3가지 방법으로 출력하시오. (기본 for문, 확장 for문, Iterator)
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
	
	// Point 인스턴스의 값을 비교하는 메소드
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
		
		System.out.println("- 1. 링크드리스트 생성 -");
		LinkedList<Point> list = new LinkedList<Point>();
		System.out.println();
		
		System.out.println("- 2. 인스턴스 10개 생성(순차적) -");
		for (int i=10; i<=100; i+=10) {
			list.add(new Point(i, i));
		}
		System.out.println(list);
		System.out.println();
		
		System.out.println("- 3. (10,10) 뒤에 (11,11) 생성(비순차적, 중간) -");
		for (int i=0; i<list.size(); i++) {
			Point tp = list.get(i);
			if (tp.getX()==10 && tp.getY()==10) {
				list.add(i+1, new Point(11,11));
				//break;
			}
		}
		System.out.println(list);
		System.out.println();
		
		System.out.println("- 4. (40,40) 삭제 후 확인 -");
		for (int i=list.size()-1; i>=0; i--) {
			Point tp = list.get(i);
			/* 1번
			if (tp.getX()==40 && tp.getY()==40) {
				list.remove(i);
			}
			*/
			// 2번 - compare() 메소드 활용
			if (tp.compare(new Point(40, 40))) {
				list.remove(i);
			}
		}
		System.out.println(list);
		System.out.println();
		
		System.out.println("- 5. (50,50)을 (55,55)로 수정 후 확인 -");
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
		
		System.out.println("- 6. 맨 앞에 (1,1) 추가(비순차적) -");
		list.addFirst(new Point(1, 1));
		System.out.println(list);
		System.out.println();
		
		System.out.println("- 7. 출력 1번: 기본 for문 사용 -");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		System.out.println("- 8. 출력 2번: 확장 for문 사용 -");
		for (Point p : list) {
			System.out.println(p);
		}
		System.out.println();
		
		System.out.println("- 9. 출력 3번: Iterator 사용 -");
		Iterator<Point> it = list.iterator();
		while(it.hasNext()) {
			Point p = it.next();
			System.out.println(p);
		}
	}
}
