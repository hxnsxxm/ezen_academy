import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
������) ���� ��Ʈ������ ��뷮�� ������ �а� �� �� �ð��� ���� �ɸ�.
�ذ�å) ����¿� ���� ���� ��Ʈ���� ���

*/

public class FileInOutStreamTest02 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// ���� ũ�� : 12MB
			fis = new FileInputStream("C:/tmp/data01.zip");
			fos = new FileOutputStream("C:/tmp/data01_copy.zip");
			
			int data = 0;
			int cnt = 0;
			System.out.println("- ������ ���� �ð��� �����մϴ�. -");
			System.out.println("------------------------");
			long startTime = System.currentTimeMillis();
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			long resultTime = System.currentTimeMillis() - startTime;
			
			System.out.println("------------------------");
			System.out.println("- ������ ���� �ð� ������ �������ϴ�.");
			System.out.println("- ���� �ð� : " + resultTime/1000.0 + "��");
			
			
			fis.close();
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
