import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

// int형에 대한 부분셋
public class TreeSetTest04 {
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(87); set.add(98); set.add(75); set.add(95); set.add(80);
		System.out.println("오름차순: " + set);
		
		// TreeSet을 사용하여 내림차순으로 정렬된 NavigableSet을 생성
		NavigableSet<Integer> set2 = set.descendingSet();
		System.out.println("내림차순 정렬: " + set2);
		
		// TreeSet을 사용하여 부분셋을 만들 때는 SortedSet을 사용하여 생성
		// headSet(): false가 기본값, 해당값을 포함하지 않는 것이 기본
		// headSet(): 87점보다 작은 값을 가진 부분셋을 생성
		SortedSet<Integer> set3 = set.headSet(87);
		System.out.println("87점(미포함)보다 작은 값을 가진 부분셋: " + set3);
		
		SortedSet<Integer> set4 = set.headSet(87, true);
		System.out.println("87점(포함)보다 작은 값을 가진 부분셋: " + set4);
		
		// tailSet(): true가 기본값, 해당값을 포함하는 것이 기본값
		// tailSet(): 87점보다 큰 값을 가진 붑셋을 생성
		SortedSet<Integer> set5 = set.tailSet(87);
		System.out.println("87점(포함)보다 큰 값을 가진 부분셋" + set5);
		
		SortedSet<Integer> set6 = set.tailSet(87, false);
		System.out.println("87점(미포함)보다 큰 값을 가진 부분셋" + set6);
		
		
	}
}
