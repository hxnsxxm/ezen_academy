import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 문자 기반 스트림, 보조 스트림 사용
public class FileReaderWriterTest02 {
	public static void main(String[] args) {

		// 3번 방법 - try ~ with ~ resource문 사용, 7버전부터 사용 가능
		// -> 파일 스트림을 사용할 때 close()를 호출하지 않아도, 자동으로 close()를 함.
		try (BufferedReader br = new BufferedReader(new FileReader("C:/Windows/system.ini")); 
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:/tmp/system3.txt")); ) {
		
			int data = 0;
			while ((data = br.read()) != -1) {
				bw.write(data);
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		/*
		// 2번
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader("C:/Windows/system.ini"));
			bw = new BufferedWriter(new FileWriter("C:/tmp/system2.txt"));
			
			int data = 0;
			while((data=br.read()) != -1) {
				bw.write(data);
			}
			
			// 보조 스트림을 닫으면 파일 스트림을 함께 닫는다.
			// 보조 스트림을 닫지 않으면, 파일이 제대로 쓰이지 않는다.
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		// 1번
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("C:/Windows/system.ini");
			fw = new FileWriter("C:/tmp/system.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			int data = 0;
			while((data = br.read()) != -1) {
				bw.write(data);
			}
			
			br.close();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
	}
}
