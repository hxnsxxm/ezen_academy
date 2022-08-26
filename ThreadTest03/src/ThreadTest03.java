import javax.swing.JOptionPane;

public class ThreadTest03 {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		for (int i=10; i>=0; i--) {
			System.out.println();
			try {
				Thread.sleep(1000);   // 1초 지연
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
