

// ������ ���� ��� 1�� - Thread Ŭ������ ����ϴ� ���
class MyThread1  extends Thread {
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(this.getName());
		}
	}
}

// ������ ���� ��� 2�� - Runnable �������̽��� �����ϴ� ���
class MyThread2 implements Runnable {
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}


public class ThreadTest01 {
	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		
		//t1.run(); // ������ ���� ��� 2������ ���� ������� ������ ��
		
		t1.start();
		
		Thread t2 = new Thread(new MyThread2());
		//t2.run(); // �߸��� ����� ����Ѵ�(main). start() Ȱ���ؾ� ��
		t2.start();
		
	}
}
