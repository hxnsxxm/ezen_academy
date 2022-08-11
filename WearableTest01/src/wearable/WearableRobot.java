package wearable;

public class WearableRobot implements Wearable, Color{

	private int color;
	
	public WearableRobot(int color) {
		this.color = color;
	}
	
	@Override
	public void putOn() {
		System.out.println(toString() + " ÀåÂø!!!");
	}
	 
	@Override 
	public void putOff() {
		System.out.println(toString() + " Å»Âø!!!");
	}
	
	@Override 
	public void changeColor(int color) {
		this.color = color;
		System.out.println(toString() + "À¸·Î º¯½Å");
	}
	
	// switch ~ case ¸¦ È°¿ëÇÑ return
	@Override
	public String toString() {
		switch (color) {
		case Color.RED: return "»¡°­ ·Îº¿";
		case GREEN: return "ÃÊ·Ï ·Îº¿";
		case BLUE: return "ÆÄ¶û ·Îº¿";
		case BLACK: return "°ËÁ¤ ·Îº¿";
		case WHITE: return "ÇÏ¾ç ·Îº¿";
		default: return "±øÅë ·Îº¿";
			
		}
	}
	
	
	
}
