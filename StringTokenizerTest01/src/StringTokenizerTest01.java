import java.util.StringTokenizer;

public class StringTokenizerTest01 {
	public static void main(String[] args) {
		
		String words = "lion,hyena,elephant,cheetah,zeebra,giraffe,monkey";
		String words02 = "lion hyena elephant cheetah zeebra giraffe monkey";
		
		// 1. String Ŭ������ split() �޼ҵ带 ����Ͽ� ���ڿ��� �и��Ͽ�  ���ڿ��� �迭�� ����
		String[] animals = words.split(", ");
		String[] animals02 = words02.split(" ");

		for (String a : animals) {
			System.out.println(a);
		}
		System.out.println("----------------");
		for (String a : animals02) {
			System.out.println(a);
		}
		System.out.println("================");
		
		
		// 2. StringTokenizer Ŭ������ ����Ͽ� ���ڿ��� ��ū���� �и�
		StringTokenizer st1 = new StringTokenizer(words, " , ");
		System.out.println("��ū�� ��: " + st1.countTokens());
		while(st1.hasMoreTokens()) {
			String s = st1.nextToken();
			System.out.println(s);
		}
		System.out.println("��ū�� ��: " + st1.countTokens());
		System.out.println("----------------");
		StringTokenizer st2 = new StringTokenizer(words02, " ");
		while(st2.hasMoreTokens()) {
			String s = st2.nextToken();
			System.out.println(s);
		}
		
		
		
		
		
		
	}
}
