import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamTest01 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			/*
			// 1�� - ���� ����(�뷮�� ���� ����)
			fis = new FileInputStream("C:/tmp/goods01.txt");
			fos = new FileOutputStream("C:/tmp/goods01_copy.txt");
			*/
			
			/*
			// 2�� - �̹��� ���� (�뷮 261KB)
			fis = new FileInputStream("C:/tmp/woo01.jpg");
			fos = new FileOutputStream("C:/tmp/woo01_copy.jpg");
			*/
			
			// 3�� - ���� ���� (�뷮 27MB)
			fis = new FileInputStream("C:/tmp/python.zip");
			fos = new FileOutputStream("C:/tmp/python_copy.zip");
			
			int data = 0;
			while((data = fis.read()) != -1) {
				char c = (char)data;
				fos.write(c);
			}
			
			System.out.println("������ �а�, ����ϴ�...");
			fis.close();
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
