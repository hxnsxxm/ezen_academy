package test;


// ����) Wearable �������̽��� ������ Ŭ���� 2���� �ν��Ͻ��� ���� 2�� �����ϰ�, �������� �����Ͽ� ����Ͻÿ�.
// WearableRobot�� �ν��Ͻ��� �ڽ��� ����� �����ϵ��� �Ͻÿ�.

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
			new WearableComputer("��"),
			new WearableRobot(Color.BLUE), // static way
			new WearableComputer("���̸�"),
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
		wearables[0] = new WearableComputer("��");
		wearables[1] = new WearableRobot(Color.GREEN);
		wearables[2] = new WearableComputer("���̸�");
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
