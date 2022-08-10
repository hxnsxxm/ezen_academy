package test;

import player.Player;
import player.CDPlayer;
import player.VideoPlayer;

// 문제) Player 인터페이스를 구현한 클래스 2개의 인스턴스를 각각 2개씩 생성하고, 다형성을 구현하여 출력하시오.
// 각 클래스만의 기능도 출력하도록 하시오.
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
