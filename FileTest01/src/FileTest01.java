import java.io.File;

public class FileTest01 {
	public static void main(String[] args) {
		
		File file = new File("C:/tmp/data01.zip");
		
		String fileName = file.getName();
		
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("경로를 제외한 파일 이름: " + fileName);
		System.out.println("확장자를 제외한 파일 이름: " + fileName.substring(0, pos));
		System.out.println("파일의 종류(확장자): " + fileName.substring(pos+1));
		System.out.println("경로를 포함한 파일 이름: " + file.getPath());
		System.out.println("파일이 있는 디렌토리 이름: " + file.getParent());
	}
}
