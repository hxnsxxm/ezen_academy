package player;

public class VideoPlayer implements Player {
	
	private static int count = 0;
	private int id;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	public int getId() { return id; }
	
	public void printInfo() {
		System.out.println("�� Video �Ϸù�ȣ: " + id);
	}
	
	@Override
	public void play() {
		System.out.println("�� Video ��� ���� ...");
	}
	
	@Override
	public void stop() {
		System.out.println("�� Video ��� ���� ...");
	}
	
	
}
