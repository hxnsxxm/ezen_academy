package player;

public class DVDPlayer implements ExtendedPlayer {

	
	
	@Override // Player
	public void play() {
		System.out.println("�� DVD �÷��̾� ��� ~~~");
	}
	
	@Override // Player
	public void stop() {
		System.out.println("�� DVD �÷��̾� ���� ~~~");
	}
	
	@Override // ExtendedPlayer
	public void showFast() {
		System.out.println("�� DVD 2������� ������ ���� ~~~");
	}
	
	@Override // ExtendedPlayer
	public void showSlow() {
		System.out.println("�� DVD 0.5������� ������ ���� ~~~");
	}
	
	
	
}
