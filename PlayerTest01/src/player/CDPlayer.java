package player;


public class CDPlayer implements Player {

	@Override
	public void play() {
		System.out.println("◎ CD Player 재생 ~~");
	}
	
	@Override
	public void stop() {
		System.out.println("◎ CD Player 중지 ~~");
	}
	
	public void clean() {
		System.out.println("◎ CD Player 의 렌즈를 청소합니다.");
	}
}
