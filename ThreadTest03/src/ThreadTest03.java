import javax.swing.JOptionPane;

public class ThreadTest03 {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		
		for (int i=10; i>=0; i--) {
			System.out.println();
			try {
				Thread.sleep(1000);   // 1�� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
