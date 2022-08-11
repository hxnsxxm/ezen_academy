package shape;

public class HorizontalLine extends AbstractLine {

	public HorizontalLine(int length) {
		super(length);
	}
	
	@Override
	public void draw() {
		for (int i=0; i<getLength(); i++) { // public �̱� ������ super �� �ٿ��� ��
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
