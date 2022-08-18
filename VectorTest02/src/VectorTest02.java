import java.util.Vector;

public class VectorTest02 {
	public static void main(String[] args) {
		
		 // ���� ����
		 Vector<Integer> v = new Vector<Integer>();
		
		 int[] a = { 10, 20, 30, 40, 50 };
		 
		 System.out.println("--- ������ �߰�(������) ---");
		 for (int i=0; i<a.length; i++) {
			 v.add(a[i]);
		 }
		 System.out.println(v);
		 
		 System.out.println("--- ������ ����(1��) ---");
		 v.remove(2); // 2�� �ε��� ����
		 System.out.println(v);
		 
		 System.out.println("--- ������ �߰�(�������, �߰�) ---");
		 v.add(2, 60);
		 System.out.println(v);
		 
		 System.out.println("--- ������ ���� ---");
		 v.set(3, 80);
		 System.out.println(v);
		 
		 System.out.println("--- ũ��(����) ��� ---");
		 System.out.println("ũ��: " + v.size());
		 
		 System.out.println("--- ������ ���(ù��° ��) ---");
		 System.out.println(v.firstElement());
		 System.out.println(v.get(0));
		 
		 System.out.println("--- ������ ���(������ ��) ---");
		 System.out.println(v.lastElement());
		 System.out.println(v.get(v.size()-1));
		 
		 System.out.println("--- ������ ���(�ε����� �ش��ϴ� ��) ---");
		 System.out.println(v.get(3));
		 System.out.println(v.elementAt(3));
		 
		 System.out.println("--- ���� �ִ� �ε��� ��� ---");
		 System.out.println(v.indexOf(80));
		 
		 System.out.println("--- �ߺ� ������ ����(���) ---");
		 v.add(60);
		 System.out.println(v);
		 
		 System.out.println("--- ���� �ִ� �ε��� ���(�տ������� ã��) ---");
		 System.out.println(v.indexOf(60));
		 
		 System.out.println("--- ���� �ִ� �ε��� ���(�ڿ������� ã��) ---");
		 System.out.println(v.lastIndexOf(60));
		 
		 System.out.println("--- ���� �ִ� �ε��� ���(ã�� �����ϴ� ��ġ ����) ---");
		 System.out.println(v.indexOf(60));    // ù ��°�� ������ 60�� �ε���
		 System.out.println(v.indexOf(60, 0)); // 0�� �ε������� ã�Ƽ� ������ 60�� �ε���
		 System.out.println(v.indexOf(60, 3)); // 3�� �ε������� ã�Ƽ� ������ 60�� �ε���
		 
		 System.out.println("--- ���� �ִ� �ε��� ���(ã�� ���� ���� ���� -1�� ���) ---");
		 System.out.println(v.indexOf(30));
		 
		 System.out.println("--- ������ �߰�(�������, �߰�) 2�� ---");
		 // v.add(�ε���, ��), v.insertElementAt(��, �ε���)
		 // v.add(4, 70); 
		 v.insertElementAt(70, 4); // add() �޼ҵ带 ����ϴ� ���� ����
		 System.out.println(v);
		 
		 System.out.println("ũ��: "  + v.size());
		 
		 System.out.println("--- ������ ����� ���� ---");
		 v.setSize(5);   // ����� �����ϸ� ������ �����͸� ����
		 System.out.println("ũ��: "  + v.size());
		 System.out.println(v);
		 
		 System.out.println("--- ������ ��� �����͸� ���� ---");
		 //v.removeAllElements();
		 v.clear();
		 System.out.println(v);
		 
		 
		
	}
}
