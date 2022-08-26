import javax.swing.JOptionPane;

class MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i=10; i>=0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}
}

public class ThreadTest04 {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.start();
		
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
		System.out.println("����� �̸��� " + name + "�Դϴ�." );
		
		
		
	}
}
