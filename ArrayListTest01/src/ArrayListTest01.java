import java.util.ArrayList;
import java.util.Collections;

/*
< ArrayList >
1. Vector 클래스와 기능 및 사용법이 거의 동일함
2. Vector에는 쓰레드의 동기화 기능이 있어서 성능의 저하가 발생함
--> ArrayList에서는 쓰레드의 동기화 기능을 제거하여 성능을 개선함
3. Vector의 capacity() 메소드는 ArrayList에는 없음

문제) 아래의 조건에 해당하는 리스트를 생성하여 활용하시오.
1. 리스트에 학생들의 점수 scores 배열의 값을 저장하고, 확인하시오.
2. 리스트에서 60미만인 학생의 점수는 삭제하고, 확인하시오.
3. 리스트의 총점과 평균을 구하시오.
4. 리스트의 최고점수와 최저점수를 구하시오.
5. 리스트를 2가지 방식으로 출력하시오. (기본 for문, 확장 for문)
*/

public class ArrayListTest01 {
	
	public static final int INIT_MAX = 0;
	public static final int INIT_MIN = 100;
	
	public static void main(String[] args) {
		
		int[] scores = { 95, 88, 75, 63, 52, 77, 47, 48, 93, 91}; // 100명이라고 가정
		int numStudents = 100;
		
		int sum = 0, max = INIT_MAX, min = INIT_MIN;
		double avg = 0.0;
		
		System.out.println("- 1. 리스트 생성 - ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<numStudents; i++) {
			list.add(scores[i%10]);
		}
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
			if (i%10==9) System.out.println();
		}
		System.out.println();
		
		System.out.println("- 2. 60점 미만인 학생 점수 삭제 -");
		/*
		// 문제점 발생 - 인덱스를 앞에서부터 증가하면서 삭제를 하면, 
		// 삭제하고 뒤에 있는 값이 앞으로 당겨지면서 값을 하나 건너 뛰는 문제가 발생됨 
		for (int i=0; i<list.size(); i++) {
			if (list.get(i)<60) {
				list.remove(i);
				--i;
			}
		}
		*/
		// 해결책 - 인덱스를 뒤에서 감소시키면서 삭제
		for (int i=list.size()-1; i>=0; i--) {
			if(list.get(i)<60) {
				list.remove(i);
			}
		}
		
		System.out.println("- 3. 총점, 평균 -");
		System.out.println("- 4. 최고점수, 최저점수 -");
		for (int i=0; i<list.size(); i++) {
			int tmp = list.get(i);
			sum += tmp;
			if (max < tmp) max = tmp;
			if (min > tmp) min = tmp;
		}
		
		avg = (double)sum/list.size();
		
		System.out.printf("총점: %d\n평균: %.2f\n최고: %d\n최저: %d\n\n", sum, avg, max, min);
		
		System.out.println("- 5. 출력 (기본 for문) -");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
			if (i%10==9) System.out.println();
		}

		System.out.println();
		
		System.out.println("- 6. 출력 (확장 for문) -");
		int j = 0;
		for (int i : list) {
			System.out.print(i + " ");
			if (j%10==9) System.out.println();
			j++;
		}
		
		System.out.println("- 7. 최고점수, 최저점수 -");
		Collections.sort(list);   // 오름차순 정렬
		System.out.println(list);
		
	}
}
