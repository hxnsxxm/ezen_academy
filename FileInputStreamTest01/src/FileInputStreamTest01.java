import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
< 파일 입출력 스트림의 종류 >
1. 바이트 기반 스트림 - FileInputStream, FileOutputStream 
- jpg, mp3, avi, mp4, exe, ...

2. 문자 기바 스트림 - FileReader, FileWriter
- txt

*/

public class FileInputStreamTest01 {
	public static void main(String[] args) {
		
		FileInputStream fis = null; // 변수 선언이 먼저 이루어 져야 함. { } 안에서 생성되면 그 블록 안에서만 사용할 수 있음
		
		try {
			fis = new FileInputStream("C:/tmp/test01.txt"); // Exception 1) FileNotDoundException
			int data = 0;  // text file의 데이터를 int형으로 받아야 함, ASCII code
			while ((data = fis.read()) != -1) {             // Exception 2) IOException  
			// -1: 파일의 끝, EOF (End Of File)  
				char c = (char)data;  // int형으로 읽어온 data를 char로 캐스팅하여 출력
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
