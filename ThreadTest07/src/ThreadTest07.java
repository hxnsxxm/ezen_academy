


// ���� ������
class SharePrinter {
	
	// �Ӱ� ����
	/*
	// ��� 1) �޼ҵ� ��ü�� ����ȭ�� �������� ����(synchronized section
	public synchronized void print(String text) {
		for (int i=0; i<text.length(); i++) {
			System.out.println(text.charAt(i));
			Thread.yield(); // �����ڿ��� �纸
		}
		System.out.println();
	}
	*/
	// ��� 2) �޼ҵ忡�� ����ȭ�� �ʿ��� �������� ����ȭ �������� ����
	public void print(String text) {
		synchronized(this) {
			for (int i=0; i<text.length(); i++) {
				System.out.print(text.charAt(i));
				Thread.yield(); // �����ڿ��� �纸
			}
			System.out.println();
		}
	}
}

// ȸ�� ��� ������
class WorkerThread extends Thread {
	private SharePrinter p;
	private String[] text;
	
	public WorkerThread(SharePrinter p, String[] text) {
		this.p = p;
		this.text = text;
	}
	
	@Override
	public void run() {
		for (int i=0; i<text.length; i++) {
			p.print(text[i]);
		}
	}
	
}

public class ThreadTest07 {
	public static void main(String[] args) {
		
		SharePrinter p = new SharePrinter();
		
		String[] eng = {
				"aaaaaaaaaaaaaaaaaaaaa",
				"bbbbbbbbbbbbbbbbbbbbb",
				"ccccccccccccccccccccc",
				"ddddddddddddddddddddd",
				"eeeeeeeeeeeeeeeeeeeee"
		};
		
		String[] kor = {
			"���ع��� ��λ��� ������ �⵵��",
			"�ϴ����� �����ϻ� �츮 ���� ����",
			"����ȭ ��õ�� ȭ������",
			"���� ��� �������� ���� �����ϼ�",
			"���� ���� �� �ҳ��� ö���� �θ���",
			"�ٶ����� �Һ����� �츮 ����ϼ�",
			"����ȭ ��õ�� ȭ������",
			"���� �ö� �������� �⸵ �����ϼ�",
		};
		
		WorkerThread worker1 = new WorkerThread(p, eng);
		WorkerThread worker2 = new WorkerThread(p, kor);
		
		worker1.start();
		worker2.start();
		
	}
}
