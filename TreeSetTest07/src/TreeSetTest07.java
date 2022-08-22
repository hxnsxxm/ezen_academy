import java.util.TreeSet;

//class Fruit {
class Fruit implements Comparable<Fruit> {
	
	private String name; // ���� �̸�
	private int price;   // ���� ����
	private int volume;  // ���� ����
	
	public Fruit(String name, int price, int volume) {
		this.name = name;
		this.price = price;
		this.volume = volume;
	}
	
	public String getName() { return name; }
	public int getPrice() { return price; }
	public int getvolume() { return volume; }
	
	public void setName(String name) { this.name = name; }
	public void setPrice(int price) { this.price = price; }
	public void setVolume(int volume) { this.volume = volume; }
	
	public String toString() {
		return name + "(" + price + "): " + volume;
	}
	
	public void print() {
		System.out.println(name + ", ����: " + price + ", ����: " + volume);
	}

	// 1�� - ���� ������ �������� ����
	/*
	@Override
	public int compareTo(Fruit f) {
		if (this.price > f.price) return 1;
		else if(this.price < f.price) return -1;
		else return 0;
	}
	*/
	// 2�� - ���� ������ �������� ����
	/*
	@Override
	public int compareTo(Fruit f) {
		if (this.price > f.price) return -1;
		else if(this.price < f.price) return 1;
		else return 0;
	}
	*/
	// 3�� - ���� ������ �������� ����
	/*
	@Override
	public int compareTo(Fruit f) {
		if (this.volume > f.volume) return 1;
		else if(this.volume < f.volume) return -1;
		else return 0;
	}
	*/
	// 4�� - ���� ������ �������� ����
	/*
	@Override
	public int compareTo(Fruit f) {
		if (this.volume > f.volume) return -1;
		else if(this.volume < f.volume) return 1;
		else return 0;
	}
	*/
	// 5�� - ���� �̸� ������ �������� ����
	
	@Override
	public int compareTo(Fruit f) {
		if (name.compareTo(f.name) > 0) return 1;
		else if(name.compareTo(f.name) < 0 ) return -1;
		else return 0;
	}
	
	// 6�� - ���� �̸� ������ �������� ����
	/*
	@Override
	public int compareTo(Fruit f) {
		if (name.compareTo(f.name) > 0) return -1;
		else if(name.compareTo(f.name) < 0 ) return 1;
		else return 0;
	}
	*/
}


public class TreeSetTest07 {
	public static void main(String[] args) {
		
		// TreeSet ����
		// TreeSet�� ����� ���� Comparable �������̽��� �������� ������ ���� �߻�
		TreeSet<Fruit> set = new TreeSet<Fruit>();
		//HashSet<Fruit> set = new HashSet<Fruit>();
		
		// ������ �߰�
		set.add(new Fruit("���", 2000, 35));
		set.add(new Fruit("����", 9000, 27));
		set.add(new Fruit("����", 8800, 22));
		set.add(new Fruit("�ڵ�", 5500, 43));
		set.add(new Fruit("����", 7700, 32));
		
		// System.out.println(set);
		for (Fruit f : set) {
			System.out.println(f);
		}
		
		// < �ߺ� ������ �߰��� ���� Ȯ�� >
		// compareTo() �޼ҵ忡�� ����� ��������� �������� �ߺ� �������� Ȱ�� ���θ� Ȯ���� 
		// 1. compareTo()���� ���� �̸��� ��� -> ������ ���� �̸��� �ߺ��� ������� ����
		set.add(new Fruit("���", 8500, 12));
		System.out.println(set);
		
		// 2. compareTo()���� ������ ��� -> ������ ���ݿ� ���� �ߺ��� ������� ����
		set.add(new Fruit("�ٳ���", 7700, 51));
		System.out.println(set);
		
		// 3. compareTo()���� ������ ��� -> ������ ������ ���� �ߺ��� ������� ����
		set.add(new Fruit("������", 6600, 35));
		System.out.println(set);
		
		// < ������ ������ ���� Ȯ�� >
		// compareTo() �޼ҵ忡�� ����� ��������� �������� ���� ���θ� Ȯ��
		// 1. compareTo()���� ���� �̸��� ��� -> ������ ���� �̸��� �����͸� ����
		set.remove(new Fruit("���", 3000, 20));
		System.out.println(set);
		
		// 2. compareTo()���� ������ ��� -> ������ ������ �����͸� ����
		set.remove(new Fruit("���", 5500, 30));
		System.out.println(set);
		
		// 3. compareTo()���� ������ ��� -> ������ ������ �����͸� ����
		set.remove(new Fruit("���", 3500, 38));
		
		
		
	}
	
}
