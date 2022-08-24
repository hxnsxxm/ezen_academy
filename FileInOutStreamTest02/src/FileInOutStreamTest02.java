import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
문제정) 파일 스트림으로 대용량의 파일을 읽고 쓸 때 시간이 오래 걸림.
해결책) 입출력에 대한 보조 스트림을 사용

*/

public class FileInOutStreamTest02 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// 파일 크기 : 12MB
			fis = new FileInputStream("C:/tmp/data01.zip");
			fos = new FileOutputStream("C:/tmp/data01_copy.zip");
			
			int data = 0;
			int cnt = 0;
			System.out.println("- 데이터 복사 시간을 측정합니다. -");
			System.out.println("------------------------");
			long startTime = System.currentTimeMillis();
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			long resultTime = System.currentTimeMillis() - startTime;
			
			System.out.println("------------------------");
			System.out.println("- 데이터 복사 시간 측정이 끝났습니다.");
			System.out.println("- 복사 시간 : " + resultTime/1000.0 + "초");
			
			
			fis.close();
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
