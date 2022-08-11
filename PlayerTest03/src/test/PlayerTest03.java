package test;


import player.*;


public class PlayerTest03 {
	public static void main(String[] args) {
		DVDPlayer dvd = new DVDPlayer();
		
		dvd.play();
		dvd.showFast();
		dvd.showSlow();
		dvd.stop();
	}
}
