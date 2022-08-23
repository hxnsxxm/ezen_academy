import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest04 {
	public static void main(String[] args) {
		
		// Ű: ����, ��: �л��̸�
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// ������ �߰�
		map.put(87, "�쿵��");
		map.put(98,  "����ȣ");
		map.put(75, "�Ѽ���");
		map.put(95,  "����");
		map.put(80, "�ǹο�");
		System.out.println("�������� ���� : " + map);
		
		NavigableMap<Integer, String> map2 = map.descendingMap();
		System.out.println("�������� ���� : " + map2);
		
		// 95������ ���� ���� ���� �κи�(�ش� ���� ������) - �⺻��
		SortedMap<Integer, String> map3 = map.headMap(95);
		System.out.println("headMap(������) : " + map3);
		
		// 95������ ū ���� ���� �κи�(�ش� ���� ����) - �⺻��
		SortedMap<Integer, String> map4 = map.tailMap(95);
		System.out.println("tailMap : " + map4);
		
		// 95������ ���� ���� ���� �κи� (�ش� ���� ����)
		SortedMap<Integer, String> map5 = map.headMap(95, true);
		System.out.println("headMap : " + map5);
		
		// 95������ ū ���� ���� �κи�(�ش� ���� ������)
		SortedMap<Integer, String> map6 = map.tailMap(95, false);
		System.out.println("tailMap(������) : " + map6);
		
		
	}
}
