import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest05 {
	public static void main(String[] args) {
		
		// 회원정보를 저장하는 HashMap -> 로그인하는 화면을 구현
		// 키: 아이디, 값: 비밀번호
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		// 데이터 추가
		map.put("aaa1111", "1111");
		map.put("bbb2222", "2222");
		map.put("ccc3333", "3333");
		map.put("ddd4444", "4444");
		map.put("eee5555", "5555");
		System.out.println(map);
		
		// 문제) 로그인할 때, 아이디와 비밀번호를 확인하도록 구현하시오.
		int count = 1;
		while(true) {
			if (count >= 2) System.out.print(count + "번째 ");
			System.out.println("로그인을 진행합니다.");
			System.out.print("아이디를 입력하세요. 아이디: ");
			String userId = sc.next();
			if (map.get(userId) == null) {
				System.out.println("아이디가 존재하지 않습니다.");
			} else {
				System.out.print("비밀번호를 입력하세요. 비밀번호: ");
				String userPassword = sc.next();
				if (map.get(userId).equals(userPassword)) {
					System.out.println("로그인되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}
			count++;
			System.out.println("-------------");
		}
		
		// 2번 방법
		/*
		String id = sc.next();
		String pwd = sc.next();
		
		if(map.containsKey(id)) {
			if(pwd.equals(map.get(id))) {
				System.out.println("로그인");
				//break;
			} else {
				
			}
		}
		*/
		sc.close();
	}
}
