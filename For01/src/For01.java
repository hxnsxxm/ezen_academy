
/*
< for���� ���� >

for(�ʱⰪ; ���ǽ�; ������){
	���๮;
	...
}
- �ʱⰪ�� for���� �� �� 1���� Ȯ���ϰ�, �������� ���ǽ��� ���� �� �Ǵ� ������ �Ǻ��Ͽ� ����

< for���� ���� >
- �ʱⰪ, ���ǽ�, �������� for���� ��ȣ �ȿ� ��� ��ġ�ϰ� �־, �ݺ�Ƚ���� �ľ��ϱⰡ ����.
- �׷���, 3���� �ݺ��� �߿��� ���� ���� �����.

*/

public class For01 {
	public static void main(String[] args) {
		
		// ����1 - 1���� 10���� 1�� �����ϸ鼭 ���
		/*
		for(int i=1; i<=10; i++) {
			System.out.println(i + " Little Indian.");
		}
		*/
		
		// ����2 - 10���� 1���� 1�� �����ϸ鼭 ���
		/*
		for(int i=10; i>=1; i--) {
			System.out.println(i + " Little Indian.");
		}
		*/
		
		// ����3 - 1���� 10���� 3�� �����ϸ鼭 ���
		for(int i=1; i<=10; i+=3) {
			System.out.println(i + " Little Indian.");
		}
		
	}

}
