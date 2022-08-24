import java.io.File;
import java.io.IOException;

public class FileTest02 {
	
	public static final String n = "asd";
	
	public static void main(String[] args) {
		
		File f1 = new File("C:/tmp/woo01.jpg"); // 파일 -> 있음
		File f2 = new File("C:/tmp/sample");    // 폴더(디렉토리) -> 없음
		File f3 = new File("C:/tmp");           // 폴더(디렉토리) -> 있음
		File f4 = new File("C:/tmp/file01.txt");// 파일 -> 없음
		File f5 = new File("C:/tmp/system.txt");// 파일 -> 있음
		File f6 = new File("C:/tmp/sample2");   // 폴더(디렉토리) -> 생성 후 테스트
		File f7 = new File("C:/tmp/alphabet.txt"); // 파일 -> 있음
		File f8 = new File("C:/tmp/test");      // 폴더(디렉토리) -> 생성 후 테스트
		
		// 1. 파일 여부 확인
		String result = null;
		if (f1.isFile()) {
			result = "파일";
		} else {
			result = "디렉토리";
		}
		System.out.println(f1.getName() + "은 " + result + "입니다.");
		
		// 2. 디렉토리 여부 확인
		if (f3.isDirectory()) {
			result = "디렉토리";
		} else {
			result = "파일";
		}
		System.out.println(f3.getName() + "은 " + result + "입니다.");
		
		// 3. 파일 또는 폴더의 존재 여부 확인
		if (f2.exists()) {
			System.out.println(f2.getPath() + "은(는) " + "존재하는 폴더입니다.");
		} else {
			System.out.println(f2.getPath() + "은(는) " + "존재하지 않는 폴더입니다.");
		}
		
		// 4. 폴더 안의 파일 또는 폴더 정보 확인 - 파일크기 , 수정시간
		String[] fileList = f3.list();
		System.out.println("--- File List ---");
		for (String s : fileList) {
			File f = new File(f3, s);
			String fName = f.getName();
			long t = f.lastModified();
			long size = f.length();
			//System.out.println("파일명: " + fName + ", 크기: " + size + " Byte | 수정시간: " + t);
			System.out.printf("파일명: %s | 크기: %d Byte | 수정시간: %tb %td일 %ta요일 %tT\n", fName, size, t, t, t, t);
		}
		
		// 5. 폴더 생성
		if(!f2.exists()) {  // f2가 없다면
			f2.mkdir();
			System.out.println(f2.getName() + " 폴더를 생성하였습니다.");
		} else {            // f2가 있다면
			System.out.println("폴더 생성에 실패하였습니다.");
			System.out.println(f2.getName() + "은(는) 이미 존재하는 폴더입니다.");
		}
		
		// 6. 파일 생성
		if (!f4.exists()) {  // f4가 없다면 -> 파일 생성
			try {
				f4.createNewFile();
				System.out.println(f4.getName() + " 파일을 생성하였습니다.");
			}  catch(IOException e) {
				//e.printStackTrace();
				System.out.println("파일을 생성하는 중에 예외가 발생하였습니다.");
			}
		} else {
			System.out.println("파일 생성에 실패하였습니다.");
			System.out.println(f4.getName() + "은(는) 이미 존재하는 파일입니다.");
		}
		
		// 7. 파일 삭제 
		if (f5.delete()) {
			System.out.println("파일 삭제에 성공하였습니다.");
		} else {
			System.out.println("파일 삭제에 실패하였습니다.\n파일이 존재하지 않습니다.");
		}
		
		// 8. 폴더 삭제 - 빈 폴더를 삭제, 내용이 있는 폴더는 삭제가 되지 않음.
		if(f6.delete()) {
			System.out.println("빈 폴더 삭제에 성공하였습니다.");
		} else {
			System.out.println("폴더 삭제에 실패하였습니다.\n폴더가 존재하지 않거나 빈 폴더가 아닙니다.");
		}
		
		// 9. 파일 이름 변경
		if (f7.renameTo(new File("C:/tmp/가나다.txt"))) {
			System.out.println("파일 이름 변경에 성공하였습니다.");
		} else {
			System.out.println("파일 이름 변경에 실패하였습니다.\n파일이 존재하지 않습니다.");
		}
		
		// 10. 폴더 이름 변경
		if (f8.renameTo(new File("C:/tmp/테스트"))) {
			System.out.println("폴더 이름 변경에 성공하였습니다.");
		} else {
			System.out.println("폴더 이름 변경에 실패하였습니다.\n폴더가 존재하지 않습니다.");
		}		
	}
}
