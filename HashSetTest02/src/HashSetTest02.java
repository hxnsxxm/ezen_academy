import java.util.HashSet;
import java.util.Iterator;

/*
����) 
1. ���ڿ��� �����ϴ� ��ü��� set�� �����ϰ� Ȯ���Ͻÿ�.
2. �¿� �쿵��, ����ȣ, �Ѽ���, ����, �ǹο츦 �߰��ϰ� Ȯ���Ͻÿ�.
3. �¿� �ߺ� �����͸� �߰��ϰ� Ȯ���Ͻÿ�.
4. �¿��� ���� �����͸� �����ϰ� Ȯ���Ͻÿ�.
5. ���� ��� �����͸� ����Ͻÿ�. (Ȯ�� for��, Iterator)
*/

public class HashSetTest02 {
	public static void main(String[] args) {
		
		System.out.println("- 1. �ؽü� ���� -");
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs);
		System.out.println("ũ��: " + hs.size());
		
		System.out.println("- 2. ������ �߰� -");
		hs.add("�쿵��"); hs.add("����ȣ"); hs.add("�Ѽ���"); hs.add("����"); hs.add("�ǹο�");
		System.out.println(hs);
		System.out.println("ũ��: " + hs.size());
		
		System.out.println("- 3. �ߺ� ������ �߰�(�쿵��) -");
		hs.add("�쿵��");
		System.out.println(hs);
		System.out.println("ũ��: " + hs.size());
		
		System.out.println("- 4. ������ ����(����) -");
		hs.remove("����");
		System.out.println(hs);
		System.out.println("ũ��: " + hs.size());
		
		System.out.println("- 5. ��� 1��(Ȯ�� for��) -");
		for (String s : hs) {
			System.out.println(s);
		}
		
		System.out.println("- 6. ��� 2��(Iterator) -");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
