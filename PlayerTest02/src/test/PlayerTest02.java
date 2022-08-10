package test;

import player.Skinnable;
import player.PortablePlayer;

// ����) PortablePlayer Ŭ���� �ν��Ͻ��� �����Ͽ�, �÷��̾��� ����� Ȯ���Ͻÿ�.
public class PlayerTest02 {
	public static void main(String[] args) {
		
		PortablePlayer[] pp = new PortablePlayer[] {
				new PortablePlayer(),
				new PortablePlayer(),
				new PortablePlayer(),
				new PortablePlayer(),
				new PortablePlayer(),
		};
		
		int cnt = 0;
		for (PortablePlayer i : pp) {
			i.play();
			i.stop();
			i.changeSkin(Skinnable.RED);  // static way, ex) Math.PI
		}
		
	}
}
