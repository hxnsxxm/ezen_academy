package test;

import player.Player;
import player.CDPlayer;
import player.VideoPlayer;

// ����) Player �������̽��� ������ Ŭ���� 2���� �ν��Ͻ��� ���� 2���� �����ϰ�, �������� �����Ͽ� ����Ͻÿ�.
// �� Ŭ�������� ��ɵ� ����ϵ��� �Ͻÿ�.
public class PlayerTest01 {
	public static void main(String[] args) {
		
		Player[] players = new Player[] {
				new CDPlayer(),
				new VideoPlayer(),
				new VideoPlayer(),
				new VideoPlayer(),
				new VideoPlayer(),
				new VideoPlayer(),
		};
		
		for (Player p : players) {
			p.play();
			p.stop();
			
			if (p instanceof CDPlayer) {
				((CDPlayer)p).clean();
			} else if (p instanceof VideoPlayer) {
				((VideoPlayer)p).printInfo();
			}
						
			System.out.println();
		}
		/*
		Player[] players02 = new Player[2];
		players02[0] = new CDPlayer();
		players02[1] = new VideoPlayer(); 
		
		System.out.println("---------------------");
		for (int i=0; i<players.length; i++) {
			players[i].play();
			players[i].stop();
			if (players[i] instanceof CDPlayer) {
				((CDPlayer)players[i]).clean();
			} else if (players[i] instanceof VideoPlayer) {
				((VideoPlayer)players[i]).printInfo();
			}
			System.out.println();
		}
		*/
		
		
	}
}
