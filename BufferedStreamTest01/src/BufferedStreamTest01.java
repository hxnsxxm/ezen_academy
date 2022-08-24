import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest01 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("c:/tmp/alphabet.txt");
			bos = new BufferedOutputStream(fos, 10); // ���� ũ ��: 10B
			
			for (int i='A'; i<='Z'; i++) {
				bos.write(i);
			}
			
			//bos.flush();   // flush : ���ۿ� �����ִ� ��� �����͸� ��� ���ϱ��� ������ �۾�
			System.out.println("--- ������ ���⸦ �Ϸ��Ͽ����ϴ�.");
			bos.close(); // close : ���۸� �ݱ� ���� flush�� ���� �ϰ�, ���۸� �ݴ´�
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
