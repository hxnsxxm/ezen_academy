import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// ���� ��� ��Ʈ��, ���� ��Ʈ�� ���
public class FileReaderWriterTest02 {
	public static void main(String[] args) {

		// 3�� ��� - try ~ with ~ resource�� ���, 7�������� ��� ����
		// -> ���� ��Ʈ���� ����� �� close()�� ȣ������ �ʾƵ�, �ڵ����� close()�� ��.
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
		// 2��
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader("C:/Windows/system.ini"));
			bw = new BufferedWriter(new FileWriter("C:/tmp/system2.txt"));
			
			int data = 0;
			while((data=br.read()) != -1) {
				bw.write(data);
			}
			
			// ���� ��Ʈ���� ������ ���� ��Ʈ���� �Բ� �ݴ´�.
			// ���� ��Ʈ���� ���� ������, ������ ����� ������ �ʴ´�.
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		// 1��
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
