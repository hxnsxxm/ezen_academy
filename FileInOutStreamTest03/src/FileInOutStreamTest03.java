import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/*
������) ���� ��Ʈ������ ��뷮�� ������ �а� �� �� �ð��� ���� �ɸ�.
�ذ�å) ����¿� ���� ���� ��Ʈ���� ���

< ���� ����� ��Ʈ���� �ӵ��� �����ϴ� ������Ʈ�� >
1. BufferedInputStream  : �Է� �ӵ� ����
2. BufferedOutputStream : ��� �۵� ����
- �⺻ ������ ũ�� : 8KB(8192 Byte)
*/


public class FileInOutStreamTest03 {
	public static void main(String[] args) {
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			// ���� ũ�� : 12MB
			fis = new FileInputStream("C:/tmp/data01.zip");
			fos = new FileOutputStream("C:/tmp/data01_copy.zip");
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int data = 0;
			int cnt = 0;
			System.out.println("- ������ ���� �ð��� �����մϴ�. -");
			System.out.println("------------------------");
			long startTime = System.currentTimeMillis();
			while((data=bis.read()) != -1) {
				bos.write(data);
			}
			long resultTime = System.currentTimeMillis() - startTime;
			
			System.out.println("------------------------");
			System.out.println("- ������ ���� �ð� ������ �������ϴ�.");
			System.out.println("- ���� �ð� : " + resultTime/1000.0 + "��");
			
			
			bis.close();
			bos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
