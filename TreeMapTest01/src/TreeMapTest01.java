import java.util.TreeMap;

public class TreeMapTest01 {
	public static void main(String[] args) {
		
		// ��� ������
		// Ű: ���(String), ��: �����̸�(String)
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		// ������ �߰�
		map.put("555555", "�쿵��");
		map.put("333333", "����ȣ");
		map.put("111111", "�Ѽ���");
		map.put("444444", "����");
		map.put("222222", "�ǹο�");
		System.out.println(map);
		
		// ������ �߰� - �ߺ� Ű �Է� : �ߺ� Ű ������� ����, ���߿� ���� �����ͷ� ���� ��(����)
		map.put("444444", "�Ѽ���");
		System.out.println(map);
		
		// ������ �߰� - �ߺ� �� �Է� : �ߺ� ���� ����� 
		map.put("666666", "����ȣ");
		System.out.println(map);
	}
}
