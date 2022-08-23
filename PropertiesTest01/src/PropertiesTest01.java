import java.util.Enumeration;
import java.util.Properties;


/*
< Properties Ŭ���� >
1. Ű�� ���� ������ �� ������ ����
2. Ű�� ���� ���ؼ� ���ڿ��� ����ϴ� ���� --> Ű�� ���� ���� generic type�� ������
*/

public class PropertiesTest01 {
	public static void main(String[] args) {
		
		// Properties ����
		Properties prop = new Properties();
		
		// ������ �߰� - �������� ������ ����.
		prop.setProperty("�쿵��", "�ܻ� ��");
		prop.setProperty("�Ѽ���", "������ �޻�");
		prop.setProperty("����", "��ȥ�� ��ȣ��");
		prop.setProperty("�ǹο�", "�Ǹ����");
		prop.setProperty("���׶��",  "�ܻ԰� ģ��");
		System.out.println(prop);
		
		// ������ ���
		Enumeration e = prop.propertyNames();
		while (e.hasMoreElements()) {
			String key = (String)e.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("-----------");
		
		prop.list(System.out);
		
		
	}
}
