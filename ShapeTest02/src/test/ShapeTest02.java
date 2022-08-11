package test;


/*
문제) 
< Level 1 >
1. 인터페이스 Plane2D를 생성하고, 면적을 계산하는 메소드 getArea()를 추가하시오.
2. Rectangle 클래스는 Plane2D 인터페이스를 구현하도록 설정하시오.
3. Parallelogram 클래스를 생성하고, Shape를 상속하고, Plane2D를 구현하도록 설정하시오.
4. main() 메소드에서 5개의 인스턴스 배열을 생성하여 다형성을 구현하고, 출력하시오.
5. 면적을 구할 수 있는 인스턴스는 면적(area)을 함께 출력하도록 하시오. 
 
< Level 2 >
1. 

*/

import shape.*;

public class ShapeTest02 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[] {
				new Point(),
				new Rectangle(5,5),
				new HorizontalLine(6),
				new VerticalLine(7),
				new Parallelogram(10,8),
		};
		
		
		
		for (int i=0; i<shapes.length; i++) {
			Shape s = shapes[i];
			s.print();
			if (s instanceof Plane2D) {   
				System.out.println("Area: " + ((Plane2D)s).getArea());
			}
			System.out.println("-------------------------");
		}
		/*
		System.out.println("==========================");
		Shape[] shapes02 = new Shape[5];
		shapes02[0] = new Point();
		shapes02[1] = new Rectangle(6,6);
		shapes02[2] = new HorizontalLine(7);
		shapes02[3] = new VerticalLine(8);
		shapes02[4] = new Parallelogram(11,5);
		
		for (Shape s : shapes02) {
			s.print();
			if (s instanceof Plane2D) {
				((Plane2D)s).getArea();
			}
			System.out.println("-------------------------");
		}
		*/
	}
}
