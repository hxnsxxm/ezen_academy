

/*
< 예외를 처리하는 방법 >
- try 블럭  : 예외가 발생할 수 있는 구문, 필수
- catch 블럭 : 그 예외가 발생했을 때의 처리, 1개는 필수, 그 이상은 선택
- finally 블럭 : catch 블럭 아래에 1번만 사용 가능 ,선택, 예외의 발생 유무와 상관없이 항상 실행함


1. try ~ catch(예외)
2. try ~ catch(예외) ~ catch(예외) ~ 
->catch는 발생하는 예외의 종류만큼 쓸 수 있음. 예외의 종류마다 다른 처리를 하고 싶다면 사용
3. try ~ catch (예외 | 예외 | 예외)
-> catch 안에서 | 로 연결하는 예외는 개수의 제한은 없음.
-> 다양한 종류의 예외에 대해서 처리할 수 있음. 모든 예외에 대해 처리방식이 한 가지일 때 사용.
-> 멀티 catch 블럭, 자바 7버전부터 지원
4. try ~ catch(exception e)        
-> catch 안에 Exception을 사용하면 모든 자식 예외들을 처리할 수 있음
-> 모든 예외를 처리는 할 수 있지만, 정학하게 어떤 예외가 발생하는 지 알 수 없음
5. try ~ catch ~ catch ~... ~ catch(Exception)

6. try ~ catch ~ finally


*/

public class ExceptionTest02 {
	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50};
		int tot = 0;
		
		
		
		try {
			for (int i=0; i<=a.length; i++) {
				tot += a[i];
				System.out.println("a[" + i + "] = " + a[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("합계 : " + tot );
	
		System.out.println("아래에는 학생들의 점수에 대한 처리를 하고 있습니다.");
		// ...
		
		
		
	}
}
