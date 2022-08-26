

// 공유 집계판 
class SyncWork {
	public int sum = 0;
	
	// 임계 영역(critical section) -> 동기화된 영영
	public synchronized void add() {
	//public void add() {
		int n = sum;
		for(int i=0; i<10; i++) {
			Thread.yield();   // 다른 쓰레드에 양보(공회전)
		}
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
}

// 일꾼 쓰레드
class WorkerThread extends Thread {
	private SyncWork sw;
	
	public WorkerThread(String name, SyncWork sw) {
		super(name);
		this.sw = sw;
	}
	
	@Override
	public void run() {
		int i=0;
		while(i < 10) {
			sw.add();
			i++;
		}
	}
}

public class ThreadTest06 {
	public static void main(String[] args) {
		
		SyncWork sw = new SyncWork();
		
		WorkerThread t1 = new WorkerThread("철수", sw);
		WorkerThread t2 = new WorkerThread("영희", sw);
		
		t1.start();
		t2.start();
		
	}
}
