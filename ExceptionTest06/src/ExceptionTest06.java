


// 예외 4)
// NumberFormatException: 숫자의 형식을 올바르지 않게 바꾸려고 할 때 발생하는 예외
public class ExceptionTest06 {
	public static void main(String[] args) {
		
		String[] numbers = {"95", "87", "66", "77", "83", "3.14"};
		int tot = 0;
		
		try {
			for (int i=0; i<numbers.length; i++) {
				tot += Integer.parseInt(numbers[i]);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("합계: " + tot);
		
		
	}
}
