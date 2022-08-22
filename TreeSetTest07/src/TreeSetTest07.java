import java.util.TreeSet;

//class Fruit {
class Fruit implements Comparable<Fruit> {
	
	private String name; // 과일 이름
	private int price;   // 과일 가격
	private int volume;  // 과일 수량
	
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
		System.out.println(name + ", 가격: " + price + ", 수량: " + volume);
	}

	// 1번 - 가격 순으로 오름차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) {
		if (this.price > f.price) return 1;
		else if(this.price < f.price) return -1;
		else return 0;
	}
	*/
	// 2번 - 가격 순으로 내림차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) {
		if (this.price > f.price) return -1;
		else if(this.price < f.price) return 1;
		else return 0;
	}
	*/
	// 3번 - 가격 순으로 오름차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) {
		if (this.volume > f.volume) return 1;
		else if(this.volume < f.volume) return -1;
		else return 0;
	}
	*/
	// 4번 - 수량 순으로 내림차순 정렬
	/*
	@Override
	public int compareTo(Fruit f) {
		if (this.volume > f.volume) return -1;
		else if(this.volume < f.volume) return 1;
		else return 0;
	}
	*/
	// 5번 - 과일 이름 순으로 오름차순 정렬
	
	@Override
	public int compareTo(Fruit f) {
		if (name.compareTo(f.name) > 0) return 1;
		else if(name.compareTo(f.name) < 0 ) return -1;
		else return 0;
	}
	
	// 6번 - 과일 이름 순으로 내림차순 정렬
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
		
		// TreeSet 생성
		// TreeSet을 사용할 때는 Comparable 인터페이스를 구현하지 않으면 에러 발생
		TreeSet<Fruit> set = new TreeSet<Fruit>();
		//HashSet<Fruit> set = new HashSet<Fruit>();
		
		// 데이터 추가
		set.add(new Fruit("사과", 2000, 35));
		set.add(new Fruit("포도", 9000, 27));
		set.add(new Fruit("망고", 8800, 22));
		set.add(new Fruit("자두", 5500, 43));
		set.add(new Fruit("참외", 7700, 32));
		
		// System.out.println(set);
		for (Fruit f : set) {
			System.out.println(f);
		}
		
		// < 중복 데이터 추가에 대한 확인 >
		// compareTo() 메소드에서 사용한 멤버변수를 기준으로 중복 데이터의 활용 여부를 확인함 
		// 1. compareTo()에서 과일 이름을 사용 -> 동일한 과일 이름의 중복을 허용하지 않음
		set.add(new Fruit("사과", 8500, 12));
		System.out.println(set);
		
		// 2. compareTo()에서 가격을 사용 -> 동일한 가격에 대한 중복을 허용하지 않음
		set.add(new Fruit("바나나", 7700, 51));
		System.out.println(set);
		
		// 3. compareTo()에서 수령을 사용 -> 동일한 수량에 대한 중복을 허용하지 않음
		set.add(new Fruit("복숭아", 6600, 35));
		System.out.println(set);
		
		// < 데이터 삭제에 대한 확인 >
		// compareTo() 메소드에서 사용한 멤버변수를 기준으로 삭제 여부를 확인
		// 1. compareTo()에서 과일 이름을 사용 -> 동일한 과일 이름의 데이터를 삭제
		set.remove(new Fruit("사과", 3000, 20));
		System.out.println(set);
		
		// 2. compareTo()에서 가격을 사용 -> 동일한 가격의 데이터를 삭제
		set.remove(new Fruit("멜론", 5500, 30));
		System.out.println(set);
		
		// 3. compareTo()에서 수량을 사용 -> 동일한 수량의 데이터를 삭제
		set.remove(new Fruit("멜론", 3500, 38));
		
		
		
	}
	
}
