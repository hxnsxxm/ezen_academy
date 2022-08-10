package shape;

public class Rectangle extends Shape{
	
	private int width;  // 가로 길이
	private int height; // 세로 길이
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		for (int i=0; i<height; i++) {
			for (int j=0; j<width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Rectangle (width: " + width + ", height: " + height + ")";
	}
}
