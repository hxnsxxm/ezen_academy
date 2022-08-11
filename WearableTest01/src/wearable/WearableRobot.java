package wearable;

public class WearableRobot implements Wearable, Color{

	private int color;
	
	public WearableRobot(int color) {
		this.color = color;
	}
	
	@Override
	public void putOn() {
		System.out.println(toString() + " ����!!!");
	}
	 
	@Override 
	public void putOff() {
		System.out.println(toString() + " Ż��!!!");
	}
	
	@Override 
	public void changeColor(int color) {
		this.color = color;
		System.out.println(toString() + "���� ����");
	}
	
	// switch ~ case �� Ȱ���� return
	@Override
	public String toString() {
		switch (color) {
		case Color.RED: return "���� �κ�";
		case GREEN: return "�ʷ� �κ�";
		case BLUE: return "�Ķ� �κ�";
		case BLACK: return "���� �κ�";
		case WHITE: return "�Ͼ� �κ�";
		default: return "���� �κ�";
			
		}
	}
	
	
	
}
