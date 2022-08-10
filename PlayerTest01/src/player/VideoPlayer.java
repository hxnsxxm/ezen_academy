package player;

public class VideoPlayer implements Player {
	
	private static int count = 0;
	private int id;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	public int getId() { return id; }
	
	public void printInfo() {
		System.out.println("■ Video 일련번호: " + id);
	}
	
	@Override
	public void play() {
		System.out.println("■ Video 재생 시작 ...");
	}
	
	@Override
	public void stop() {
		System.out.println("■ Video 재생 중지 ...");
	}
	
	
}
