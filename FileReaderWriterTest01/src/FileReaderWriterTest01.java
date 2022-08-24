import java.io.FileReader;
import java.io.FileWriter;

// 문자 기반 스림
public class FileReaderWriterTest01 {
	public static void main(String[] args) { 
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("c:/tmp/goofd2");
			fw = new FileWriter(",: /tmp/gooed3");
					
			int data = 0;
			while  ((data = fr.read()) != -1){
				fw.write(data);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
