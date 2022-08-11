package shape;

public abstract class AbstractPolygon extends Shape implements Plane2D{
	
	private int width;
	private int height;
	
	public AbstractPolygon(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() { return width; }
	
	public int getHeight() { return height; }
	
	public void setWidth(int width) { this.width = width; }
	
	public void setHeight(int height) { this.height = height; }
}