import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Member {

	private String sno;
	private String sname;
	private int age;
	
	public Member(String sno, String sname, int age) {
		this.sno = sno;
		this.sname = sname;
		this.age = age;
	}
	
	public String getSno() { return sno; }
	public String getSname() { return sname; }
	public int getAge() { return age; }
	
	public void setSno(String sno) { this.sno = sno; }
	public void setSname(String sname) { this.sname = sname; }
	public void setAge(int age) { this.age = age;}
	
	@Override
	public String toString() {
		return sno + "(" + sname + ", " + age +")";
	}
}

/*
����)
1. Ű�� ��ȭ��ȣ, ���� Member �� �ν��Ͻ��� ���� HashMap�� map�� �����Ͻÿ�.
2. �ʿ� �����͸� 5�� �Է��Ͻÿ�.
Ű: "010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555"
��: ("123451", "�쿵��", 27), ("123452", "����ȣ", 30), ("123453", "�Ѽ���", 29)
   ("123454", "����", 43), ("123455", "�ǹο�", 32) 
...
3. �ʿ��� ��ȭ��ȣ�� "010-2222-2222"�� ȸ���� ������ �����Ͻÿ�.
4. �ʿ��� ��ȭ��ȣ�� "010-3333-3333"�� ȸ���� �̸��� �Ѽ������� �����Ͻÿ�.
5. �ʿ��� ��ȭ��ȣ�� "010-4444-4444"�� ȸ���� ���̸� 32�� �����Ͻÿ�.
6. ���� �����͸� 3���� ������� ����Ͻÿ�.
*/

public class HashMapTest03 {
	public static void main(String[] args) {
		
		HashMap<String, Member> map = new HashMap<String, Member>();
		
		map.put("010-1111-1111", new Member("123451", "�쿵��", 27));
		map.put("010-2222-2222", new Member("123452", "����ȣ", 30));
		map.put("010-3333-3333", new Member("123453", "�Ѽ���", 29));
		map.put("010-4444-4444", new Member("123454", "����", 43));
		map.put("010-5555-5555", new Member("123455", "�ǹο�", 32));
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("��ȭ��ȣ: " + tel + ", ȸ������ : " + m);
		}
		System.out.println("----------------");
				
		// 3. �ʿ��� ��ȭ��ȣ�� "010-2222-2222"�� ȸ���� ������ �����Ͻÿ�.
		if (map.remove("010-2222-2222") == null) {
			System.out.println("ȸ���� ������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("�����ϰ��� �ϴ� ȸ���� ������ �����ϴ�.");
		}
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("��ȭ��ȣ: " + tel + ", ȸ������ : " + m);
		}
		System.out.println("----------------");
		
		// 4. �ʿ��� ��ȭ��ȣ�� "010-3333-3333"�� ȸ���� �̸��� �Ѽ������� �����Ͻÿ�.
		/*
		if (map.put("010-3333-3333", new Member("123453", "�Ѽ���", 29)) == null) {
			System.out.println("���ο� ȸ���� ������ �߰��˴ϴ�.");
		} else {
			System.out.println("ȸ���� ������ �����Ͽ����ϴ�.");
		}
		*/
		//map.get("010-3333-3333").setSname("�Ѽ���");
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			if (tel.equals("010-3333-3333")) {
				Member m = map.get(tel);
				m.setSname("�Ѽ���");
				map.put(tel, m);
			}
			
		}
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("��ȭ��ȣ: " + tel + ", ȸ������ : " + m);
		}
		System.out.println("----------------");
		
		// 5. �ʿ��� ��ȭ��ȣ�� "010-4444-4444"�� ȸ���� ���̸� 32�� �����Ͻÿ�.
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			if (tel.equals("010-4444-4444")) {
				map.get(tel).setAge(32);
			}
		}
		//map.get("010-4444-4444").setAge(32);
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("��ȭ��ȣ: " + tel + ", ȸ������ : " + m);
		}
		System.out.println("----------------");
		
		// ��� 1�� : keySet()
		keys = map.keySet();
		it = keys.iterator();
		while (it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("��ȭ��ȣ: " + tel + ", ȸ������ : " + m);
		}
		System.out.println("----------------");
		
		// ��� 2�� - Iterator, entrySet()
		Set<Map.Entry<String, Member>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Member>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Map.Entry<String, Member> entry = it2.next();
			String tel = entry.getKey();
			Member m = entry.getValue();
			System.out.println("��ȭ��ȣ: " + tel + ", ȸ������ : " + m);
		}
		System.out.println("----------------");
		
		// ��� 3�� - Ȯ�� for��, entrySet()
		Set<Map.Entry<String, Member>> entrys = map.entrySet();
		for (Map.Entry<String, Member> e : entrys) {
			String tel = e.getKey();
			Member m = e.getValue();
			System.out.println("��ȭ��ȣ: " + tel + ", ȸ������ : " + m);
		}
		System.out.println("----------------");
		
	}
}
