import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
< ���� ����� ��Ʈ���� ���� >
1. ����Ʈ ��� ��Ʈ�� - FileInputStream, FileOutputStream 
- jpg, mp3, avi, mp4, exe, ...

2. ���� ��� ��Ʈ�� - FileReader, FileWriter
- txt

*/

public class FileInputStreamTest01 {
	public static void main(String[] args) {
		
		FileInputStream fis = null; // ���� ������ ���� �̷�� ���� ��. { } �ȿ��� �����Ǹ� �� ��� �ȿ����� ����� �� ����
		
		try {
			fis = new FileInputStream("C:/tmp/test01.txt"); // Exception 1) FileNotDoundException
			int data = 0;  // text file�� �����͸� int������ �޾ƾ� ��, ASCII code
			while ((data = fis.read()) != -1) {             // Exception 2) IOException  
			// -1: ������ ��, EOF (End Of File)  
				char c = (char)data;  // int������ �о�� data�� char�� ĳ�����Ͽ� ���
				System.out.print(c);
			}
			fis.close();
		} catch(FileNotFoundException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		} catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
