package player;


public class CDPlayer implements Player {

	@Override
	public void play() {
		System.out.println("�� CD Player ��� ~~");
	}
	
	@Override
	public void stop() {
		System.out.println("�� CD Player ���� ~~");
	}
	
	public void clean() {
		System.out.println("�� CD Player �� ��� û���մϴ�.");
	}
}
