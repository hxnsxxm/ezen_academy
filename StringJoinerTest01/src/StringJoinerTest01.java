import java.util.StringJoiner;

public class StringJoinerTest01 {
	public static void main(String[] args) {
		
		String words = "lion,hyena,elephant,cheetah,zeebra,giraffe,monkey";
		System.out.println(words);
		System.out.println("----------------");
		
		String[] animals = words.split(",");
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("----------------");
		
		
		// 1. String Ŭ������ join() �޼ҵ� ���
		String str = String.join("-", animals);
		System.out.println(str);
		System.out.println("----------------");
		
		// 2. StringJoiner Ŭ���� ��� 1
		StringJoiner sj1 = new StringJoiner("-");
		for (String a : animals) {
			System.out.println(a);
			sj1.add(a);
		}
		System.out.println(sj1);
		System.out.println("----------------");
		
		// 3. StringJoiner Ŭ���� ��� 2
		StringJoiner sj2 = new StringJoiner("~", "[", "]");
//		StringJoiner sj2 = new StringJoiner("]~[", "[", "]");
		for (String a : animals) {
			sj2.add(a);
		}
		System.out.println(sj2);
		System.out.println("----------------");
		
	}
}
