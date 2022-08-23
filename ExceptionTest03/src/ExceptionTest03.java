

// try ~ catch ~ finally
public class ExceptionTest03 {
	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50};
		int tot = 0;
		double avg = 0.0;
		
		// try - 예외가 발생할 수 있는 구문을 적는다. 필수
		try {
			for (int i=0; i<=a.length; i++) {
				tot += a[i];
				System.out.println("a[" + i + "] = " + a[i]);
			}
			//avg = (double)tot/a.length; -> 평균을 처리하지 못함
		
		// catch - 발생할 수 있는 예외에 대한 처리를 적는다. 1개는 필수, 2개부터는 선택
		} catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage() + "번 인덱스는 존재하지 않습니다.");
			
		// finally - 예외의 발생유무와 상관없이 항상 실행해야하는 구문을 적는다.
		} finally {
			// 평균 처리 부분을 finally 구문으로 옮겨서 예외의 발생유무와 상관없이 실행되도록 함
			avg = (double)tot/a.length;   
		}
		
		System.out.println("합계 : " + tot );
		System.out.println("평균: " + avg);
	
		System.out.println("아래에는 학생들의 점수에 대한 처리를 하고 있습니다.");
		// ...
		
		
		
	}
}
