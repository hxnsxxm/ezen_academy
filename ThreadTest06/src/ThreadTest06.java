

// ���� ������ 
class SyncWork {
	public int sum = 0;
	
	// �Ӱ� ����(critical section) -> ����ȭ�� ����
	public synchronized void add() {
	//public void add() {
		int n = sum;
		for(int i=0; i<10; i++) {
			Thread.yield();   // �ٸ� �����忡 �纸(��ȸ��)
		}
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
}

// �ϲ� ������
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
		
		WorkerThread t1 = new WorkerThread("ö��", sw);
		WorkerThread t2 = new WorkerThread("����", sw);
		
		t1.start();
		t2.start();
		
	}
}
