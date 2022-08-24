import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest01 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("c:/tmp/alphabet.txt");
			bos = new BufferedOutputStream(fos, 10); // 버퍼 크 기: 10B
			
			for (int i='A'; i<='Z'; i++) {
				bos.write(i);
			}
			
			//bos.flush();   // flush : 버퍼에 남아있는 모든 데이터를 출력 파일까지 보내는 작업
			System.out.println("--- 데이터 쓰기를 완료하였습니다.");
			bos.close(); // close : 버퍼를 닫기 전에 flush를 먼저 하고, 버퍼를 닫는다
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
