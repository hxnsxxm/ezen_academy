

// 쓰레드 생성 방법 1번 - Thread 클래스를 상속하는 방법
class MyThread1  extends Thread {
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(this.getName());
		}
	}
}

// 쓰레드 생성 방법 2번 - Runnable 인터페이스를 구현하는 방법
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
		
		//t1.run(); // 쓰레드 생성 방법 2번으로 인해 사용하지 않으려 함
		
		t1.start();
		
		Thread t2 = new Thread(new MyThread2());
		//t2.run(); // 잘못된 결과를 출력한다(main). start() 활용해야 함
		t2.start();
		
	}
}
