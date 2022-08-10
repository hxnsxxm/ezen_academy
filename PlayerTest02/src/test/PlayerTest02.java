package test;

import player.Skinnable;
import player.PortablePlayer;

// 문제) PortablePlayer 클래스 인스턴스를 생성하여, 플레이어의 기능을 확인하시오.
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
