package test;


// 문제) Wearable 인터페이스를 구현한 클래스 2개의 인스턴스를 각각 2개 생성하고, 다형성을 구현하여 출력하시오.
// WearableRobot의 인스턴스는 자신의 기능을 구현하도록 하시오.

/*
import wearable.Color;
import wearable.Wearable;
import wearable.WearableComputer;
import wearable.WearableRobot;
*/
import wearable.*;

public class WearableTest01 {
	public static void main(String[] args) {
		Wearable[] wearables = new Wearable[] {
			new WearableComputer("폰"),
			new WearableRobot(Color.BLUE), // static way
			new WearableComputer("노이만"),
			new WearableRobot(Color.RED),
		};
		
		for (Wearable w : wearables) {
			w.putOn();
			w.putOff();
			/*
			if (w instanceof WearableRobot) {
				((WearableRobot)w).changeColor(Color.BLACK);
			}
			*/
			if (w instanceof Color) {
				((Color)w).changeColor(Color.BLACK);
			}
			System.out.println();
		}
		/*
		Wearable[] wearables02 = new Wearable[4];
		wearables[0] = new WearableComputer("폰");
		wearables[1] = new WearableRobot(Color.GREEN);
		wearables[2] = new WearableComputer("노이만");
		wearables[3] = new WearableRobot(Color.WHITE);
		
		System.out.println("-----------------");
		for (int i=0; i<wearables.length; i++) {
			Wearable w = wearable[i];
			w.putOn();
			w.putOff();
			
//			if (w instanceof WearableRobot) {
//				((WearableRobot)w).changeColor(Color.BLACK);
//			}
			
			if (w instanceof Color) {
				((Color)w).changeColor(Color.BLACK);
			}
			System.out.println();
		}
		*/
	}
}
