import java.io.File;

public class FileTest01 {
	public static void main(String[] args) {
		
		File file = new File("C:/tmp/data01.zip");
		
		String fileName = file.getName();
		
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("��θ� ������ ���� �̸�: " + fileName);
		System.out.println("Ȯ���ڸ� ������ ���� �̸�: " + fileName.substring(0, pos));
		System.out.println("������ ����(Ȯ����): " + fileName.substring(pos+1));
		System.out.println("��θ� ������ ���� �̸�: " + file.getPath());
		System.out.println("������ �ִ� ���丮 �̸�: " + file.getParent());
	}
}
