package shape;

public class Rectangle extends AbstractPolygon {
	
	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw() {
		for (int i=0; i<getHeight(); i++) {
			for (int j=0; j<getWidth(); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	@Override
	public double getArea() {
		return getWidth()*getHeight();
	}
	
	@Override
	public String toString() {
		return "Rectangle (width: " + getWidth() + ", height: " + getHeight() + ")";
		
	}
}
