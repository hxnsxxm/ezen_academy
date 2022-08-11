package shape;

public class HorizontalLine extends AbstractLine {

	public HorizontalLine(int length) {
		super(length);
	}
	
	@Override
	public void draw() {
		for (int i=0; i<getLength(); i++) { // public 이기 떄문에 super 안 붙여도 됨
			System.out.print("*");
		}
		System.out.println();
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "HorizontalLine (length: " + getLength() + ")";
	}
}
