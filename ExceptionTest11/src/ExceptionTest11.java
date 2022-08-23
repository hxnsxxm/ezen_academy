
class Member {
	
	private String name;
	private int score;
	
	public Member(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() { return name; }
	public int getScore() { return score; }
	
	public void setName(String name) { this.name = name; }
	public void setScore(int score) { this.score = score; }
	
	public String toString() {
		return name + " : " + score; 
	}
	
}

/*
문제)
1. 이름과 점수를 멤버변수로 갖는 Member 클래스를 생성하시오.
2. names와 scores를 사용하여 members에 저장하시오.
3. members에 저장된 내용을 출력하시오.
4. 출력 중에 발생하는 예외를 확인하고, 예외처리를 하시오.
5. 예외의 발생유무와 관계없이 회원들의 점수의 총점과 평균을 구하시오.
*/

public class ExceptionTest11 {
	public static void main(String[] args) {
		
		String[] names = {"우영우", "이준호", "한수현", "정명석"};
		int[] scores = {95, 87, 78, 92};
		Member[] members = new Member[5];
		int sum = 0, count = 0;
		double avg = 0.0;
		
		
		// 2. names와 scores를 사용하여 members에 저장하시오.
		for (int i=0; i<names.length; i++) {
			members[i] = new Member(names[i], scores[i]);
		}
		// 3. members에 저장된 내용을 출력하시오.
		// 4. 출력 중에 발생하는 예외를 확인하고, 예외처리를 하시오.
		// 5. 예외의 발생유무와 관계없이 회원들의 점수의 총점과 평균을 구하시오.
		try {
			for (int i=0; i<members.length; i++) {
				String name = members[i].getName();
				int score = members[i].getScore();
				sum += score;
				System.out.println(name + " : " + score);
				count++;
			}
			 
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			avg = (double) sum / count;
		}
				
		System.out.println("총점: " + sum + ", 평균: " + avg);
	}
}
