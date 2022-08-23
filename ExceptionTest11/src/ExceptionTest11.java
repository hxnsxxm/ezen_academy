
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
����)
1. �̸��� ������ ��������� ���� Member Ŭ������ �����Ͻÿ�.
2. names�� scores�� ����Ͽ� members�� �����Ͻÿ�.
3. members�� ����� ������ ����Ͻÿ�.
4. ��� �߿� �߻��ϴ� ���ܸ� Ȯ���ϰ�, ����ó���� �Ͻÿ�.
5. ������ �߻������� ������� ȸ������ ������ ������ ����� ���Ͻÿ�.
*/

public class ExceptionTest11 {
	public static void main(String[] args) {
		
		String[] names = {"�쿵��", "����ȣ", "�Ѽ���", "����"};
		int[] scores = {95, 87, 78, 92};
		Member[] members = new Member[5];
		int sum = 0, count = 0;
		double avg = 0.0;
		
		
		// 2. names�� scores�� ����Ͽ� members�� �����Ͻÿ�.
		for (int i=0; i<names.length; i++) {
			members[i] = new Member(names[i], scores[i]);
		}
		// 3. members�� ����� ������ ����Ͻÿ�.
		// 4. ��� �߿� �߻��ϴ� ���ܸ� Ȯ���ϰ�, ����ó���� �Ͻÿ�.
		// 5. ������ �߻������� ������� ȸ������ ������ ������ ����� ���Ͻÿ�.
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
				
		System.out.println("����: " + sum + ", ���: " + avg);
	}
}
