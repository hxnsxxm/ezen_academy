



// 예외 3)
// NullPointerException : null 값인데 멤버접근 연산자를 사용하려고 할때 발행하는 예외
// 웹에서 가장 많이 발생하는 예외, 발견하기도 까다롭고, 처리하기도 까자로운 예외
public class ExceptionTest05 {
	public static void main(String[] args) {
		
		String data = null;
		
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			e.printStackTrace();
		} 
		
		System.out.println("아래에는 처리해야 하는 데이터가 앖ㅇ이 일ㅇㅁ");
	}
}
