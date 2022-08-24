import java.io.File;
import java.io.IOException;

public class FileTest02 {
	
	public static final String n = "asd";
	
	public static void main(String[] args) {
		
		File f1 = new File("C:/tmp/woo01.jpg"); // ���� -> ����
		File f2 = new File("C:/tmp/sample");    // ����(���丮) -> ����
		File f3 = new File("C:/tmp");           // ����(���丮) -> ����
		File f4 = new File("C:/tmp/file01.txt");// ���� -> ����
		File f5 = new File("C:/tmp/system.txt");// ���� -> ����
		File f6 = new File("C:/tmp/sample2");   // ����(���丮) -> ���� �� �׽�Ʈ
		File f7 = new File("C:/tmp/alphabet.txt"); // ���� -> ����
		File f8 = new File("C:/tmp/test");      // ����(���丮) -> ���� �� �׽�Ʈ
		
		// 1. ���� ���� Ȯ��
		String result = null;
		if (f1.isFile()) {
			result = "����";
		} else {
			result = "���丮";
		}
		System.out.println(f1.getName() + "�� " + result + "�Դϴ�.");
		
		// 2. ���丮 ���� Ȯ��
		if (f3.isDirectory()) {
			result = "���丮";
		} else {
			result = "����";
		}
		System.out.println(f3.getName() + "�� " + result + "�Դϴ�.");
		
		// 3. ���� �Ǵ� ������ ���� ���� Ȯ��
		if (f2.exists()) {
			System.out.println(f2.getPath() + "��(��) " + "�����ϴ� �����Դϴ�.");
		} else {
			System.out.println(f2.getPath() + "��(��) " + "�������� �ʴ� �����Դϴ�.");
		}
		
		// 4. ���� ���� ���� �Ǵ� ���� ���� Ȯ�� - ����ũ�� , �����ð�
		String[] fileList = f3.list();
		System.out.println("--- File List ---");
		for (String s : fileList) {
			File f = new File(f3, s);
			String fName = f.getName();
			long t = f.lastModified();
			long size = f.length();
			//System.out.println("���ϸ�: " + fName + ", ũ��: " + size + " Byte | �����ð�: " + t);
			System.out.printf("���ϸ�: %s | ũ��: %d Byte | �����ð�: %tb %td�� %ta���� %tT\n", fName, size, t, t, t, t);
		}
		
		// 5. ���� ����
		if(!f2.exists()) {  // f2�� ���ٸ�
			f2.mkdir();
			System.out.println(f2.getName() + " ������ �����Ͽ����ϴ�.");
		} else {            // f2�� �ִٸ�
			System.out.println("���� ������ �����Ͽ����ϴ�.");
			System.out.println(f2.getName() + "��(��) �̹� �����ϴ� �����Դϴ�.");
		}
		
		// 6. ���� ����
		if (!f4.exists()) {  // f4�� ���ٸ� -> ���� ����
			try {
				f4.createNewFile();
				System.out.println(f4.getName() + " ������ �����Ͽ����ϴ�.");
			}  catch(IOException e) {
				//e.printStackTrace();
				System.out.println("������ �����ϴ� �߿� ���ܰ� �߻��Ͽ����ϴ�.");
			}
		} else {
			System.out.println("���� ������ �����Ͽ����ϴ�.");
			System.out.println(f4.getName() + "��(��) �̹� �����ϴ� �����Դϴ�.");
		}
		
		// 7. ���� ���� 
		if (f5.delete()) {
			System.out.println("���� ������ �����Ͽ����ϴ�.");
		} else {
			System.out.println("���� ������ �����Ͽ����ϴ�.\n������ �������� �ʽ��ϴ�.");
		}
		
		// 8. ���� ���� - �� ������ ����, ������ �ִ� ������ ������ ���� ����.
		if(f6.delete()) {
			System.out.println("�� ���� ������ �����Ͽ����ϴ�.");
		} else {
			System.out.println("���� ������ �����Ͽ����ϴ�.\n������ �������� �ʰų� �� ������ �ƴմϴ�.");
		}
		
		// 9. ���� �̸� ����
		if (f7.renameTo(new File("C:/tmp/������.txt"))) {
			System.out.println("���� �̸� ���濡 �����Ͽ����ϴ�.");
		} else {
			System.out.println("���� �̸� ���濡 �����Ͽ����ϴ�.\n������ �������� �ʽ��ϴ�.");
		}
		
		// 10. ���� �̸� ����
		if (f8.renameTo(new File("C:/tmp/�׽�Ʈ"))) {
			System.out.println("���� �̸� ���濡 �����Ͽ����ϴ�.");
		} else {
			System.out.println("���� �̸� ���濡 �����Ͽ����ϴ�.\n������ �������� �ʽ��ϴ�.");
		}		
	}
}
