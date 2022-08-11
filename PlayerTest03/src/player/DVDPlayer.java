package player;

public class DVDPlayer implements ExtendedPlayer {

	
	
	@Override // Player
	public void play() {
		System.out.println("● DVD 플레이어 재생 ~~~");
	}
	
	@Override // Player
	public void stop() {
		System.out.println("● DVD 플레이어 중지 ~~~");
	}
	
	@Override // ExtendedPlayer
	public void showFast() {
		System.out.println("● DVD 2배속으로 빠르게 보기 ~~~");
	}
	
	@Override // ExtendedPlayer
	public void showSlow() {
		System.out.println("● DVD 0.5배속으로 느리게 보기 ~~~");
	}
	
	
	
}
