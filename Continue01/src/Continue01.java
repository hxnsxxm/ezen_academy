
/*
< continue 문 >
1. 반복문 안에서 continue문을 만나면, 반복문의 끝으로 이동함.
2. continue문과 반복문의 끝 사이에 있는 실행문이 실행되지 않는다.
3. continue문과 반복문의 끝 사이에 있는 내용이 제거, 생략됨.
*/

// 문제) 1부터 10 사이의 정수 중에서 3의 배수만 제외하고 출력하시오.
public class Continue01 {
	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
