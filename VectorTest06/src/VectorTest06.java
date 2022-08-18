import java.util.Vector;

/*
문제) 아래의 조건에 해당하는 벡터를 생성하고, 활용하시오.
1. 벡터 v에 문자열 배열 names를 담고 확인하시오.
2. 벡터 v에서 이승엽 다음에 우상혁을 추가하고 확인하시오.
3. 벡터 v에서 박찬호를 삭제하고 확인하시오.
4. 벡터 v에서 김연경을 문지윤으로 변경하고 확인하시오.
5. 벡터 v의 내용을 2가지 방법으로 출력하시오. (기본 for문, 확장 for문)
*/

public class VectorTest06 {
	public static void main(String[] args) {
		
		String[] names = {"김연아", "박찬호", "이승엽", "김연경", "손흥민"};
		
		
		System.out.println("--- 1. 벡터 v에 문자열 배열 names를 담고 확인하시오. ---");
		Vector<String> v = new Vector<String>();
		
		for (int i=0; i<names.length; i++) {
			v.add(names[i]);
		}
		System.out.println("v: " + v);
		
		System.out.println("--- 2. 벡터 v에서 이승엽 다음에 우상혁을 추가하고 확인하시오. ---");
		v.add(v.indexOf("이승엽")+1, "우상혁");
		System.out.println("v: " + v);		
		
		System.out.println("--- 3. 벡터 v에서 박찬호를 삭제하고 확인하시오. ---");
		v.remove("박찬호");
		System.out.println("v: " + v);
		
		System.out.println("--- 4. 벡터 v에서 김연경을 문지윤으로 변경하고 확인하시오. ---");
		v.set(v.indexOf("김연경"), "문지윤");
		System.out.println("v: " + v);
		
		System.out.println("--- 5. 벡터 v의 내용을 2가지 방법으로 출력하시오. (기본 for문, 확장 for문) ---");
		for (int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("----------");
		
		for (String s : v) {
			System.out.println(s);
		}
		
		
		
	}
}
