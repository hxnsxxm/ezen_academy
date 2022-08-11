package test;


/*
����) 
< Level 1 >
1. �������̽� Plane2D�� �����ϰ�, ������ ����ϴ� �޼ҵ� getArea()�� �߰��Ͻÿ�.
2. Rectangle Ŭ������ Plane2D �������̽��� �����ϵ��� �����Ͻÿ�.
3. Parallelogram Ŭ������ �����ϰ�, Shape�� ����ϰ�, Plane2D�� �����ϵ��� �����Ͻÿ�.
4. main() �޼ҵ忡�� 5���� �ν��Ͻ� �迭�� �����Ͽ� �������� �����ϰ�, ����Ͻÿ�.
5. ������ ���� �� �ִ� �ν��Ͻ��� ����(area)�� �Բ� ����ϵ��� �Ͻÿ�. 
 
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
