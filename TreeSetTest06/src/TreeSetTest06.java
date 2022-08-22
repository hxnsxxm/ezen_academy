import java.util.HashSet;
import java.util.TreeSet;

/*
- Set의 특징 : 순서가 없고, 중복 데이터가 없음.
- HashSet의 특징 : 데이터의 추가/삭제가 빠름. 데이터가 정렬되어 있지 않음. 
- TreeSet특징 : 데이터가 오름차순으로 정렬되어 있어서 데이터의 검생이 빠름. 데이터의 추가/삭제가 느림.
*/

public class TreeSetTest06 {
	public static void main(String[] args) {
		
		// Set에 로또번호 6개를 생성 - 중복되지 않아야 함. 1 ~ 45(포함) 사이의 값
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		
		// 문제점: 로또번호 6개가 생성되지 않을 수 있음. -> 중복된 데이터를 허용하디 않기 때문
		for (int i=0; i<6; i++) {
			int n = (int)(Math.random() * 45) + 1;
			set1.add(n);
		}
		System.out.println(set1);
		
		set1.clear();
		System.out.println(set1);
		
		// 해결책: set의 크기를 사용하여 6개의 로또번호를 갖도록 함
		while (set1.size() < 6) {
			int n = (int)(Math.random() * 45) + 1;
			set1.add(n);
		}
		System.out.println("HashSet set1: " + set1);
		
		while (set2.size() < 6) {
			int n = (int)(Math.random() * 45) + 1;
			set2.add(n);
		}
		System.out.println("TreeSet set2: " + set2);
		
		
	}
}
