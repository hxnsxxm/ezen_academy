package test;

/*
����) Shape Ŭ�����κ��� ��ӹ��� �ڽ� Ŭ���� 4���� �ν��Ͻ��� �����ϰ�, �������� �����Ͽ� ����Ͻÿ�. 

*/

/*
import shape.Shape;
import shape.Point;
import shape.Rectangle;
import shape.AbstractLine;
import shape.HorizontalLine;
import shape.VerticalLine;
*/
import shape.*;

public class ShapeTest01 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[] {
				new Point(),
				new Rectangle(4, 3),
				new HorizontalLine(5),
				new VerticalLine(4),
		};
		/*
		Shape[] shapes02 = new Shape[4];
		shapes02[0] = new Point();
		shapes02[1] = new Rectangle(4,3);
		shapes02[2] = new HorizontalLine(5);
		shapes02[3] = new VerticalLine(4);
		
		for (int i=0; i<shapes.length; i++) {
			shapes[i].print();
			//System.out.println(shapes[i]);
			//shapes[i].draw();
		}
		*/
		for (Shape s : shapes) {
			s.print();
			/*
			System.out.println(s);
			s.draw();
			*/
		}
	}
}
