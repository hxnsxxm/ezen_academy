
/*
< for문의 형식 >

for(초기값; 조건식; 증감값){
	실행문;
	...
}
- 초기값은 for문에 들어갈 때 1번만 확인하고, 증감값과 조건식을 통해 참 또는 거짓을 판별하여 실행

< for문의 장점 >
- 초기값, 조건식, 증감값이 for문의 괄호 안에 모두 위치하고 있어서, 반복횟수를 파악하기가 쉬움.
- 그래서, 3가지 반복문 중에서 가장 많이 사용함.

*/

public class For01 {
	public static void main(String[] args) {
		
		// 문제1 - 1부터 10까지 1씩 증가하면서 출력
		/*
		for(int i=1; i<=10; i++) {
			System.out.println(i + " Little Indian.");
		}
		*/
		
		// 문제2 - 10부터 1까지 1씩 감소하면서 출력
		/*
		for(int i=10; i>=1; i--) {
			System.out.println(i + " Little Indian.");
		}
		*/
		
		// 문제3 - 1부터 10까지 3씩 증가하면서 출력
		for(int i=1; i<=10; i+=3) {
			System.out.println(i + " Little Indian.");
		}
		
	}

}
