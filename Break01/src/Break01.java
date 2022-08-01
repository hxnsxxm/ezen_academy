
/*
< break문 >
1. 반복문 1개를 강제로 탈출하고자 할 때 사용.
2. switch~case문을 탈출할 때 사용.
주의: if문은 탈출 대상이 아님.

*/
public class Break01 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i == 6) {
				break;
			}
			System.out.println(i);
		}
		
	}

}
