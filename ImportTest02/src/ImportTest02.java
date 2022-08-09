
// 1. 단일형 import - 각각의 클래스를 모두 import 하는 방법
//import java.util.Random;
//import java.util.Scanner;

// 2. 주문형 import - *를 통해서
// 현재 이 패키지 안에서 사용되는 모든 클래스를 import 하는 방법. util 내의 모든 클래스가 아니라.
import java.util.*;

public class ImportTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("정수 입력(0~9) : ");
		int x = sc.nextInt();
		
		int rn = r.nextInt(10);  // 0~9 사이의 정수
		
		if (x == rn) {
			System.out.println("오늘을 행운이 있는 날이다");
		} else {
			System.out.println("평범한 날");
		}
		
		sc.close();
	}
}
