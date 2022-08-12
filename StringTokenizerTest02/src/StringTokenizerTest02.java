
import java.util.StringTokenizer;

public class StringTokenizerTest02 {
	public static void main(String[] args) {
		
		String words = "lion,hyena,elephant,cheetah/zeebra/giraffe/monkey";
		System.out.println(words);
		
		// 1�� ��� - String Ŭ������ split() �޼ҵ� ���
		words = words.replace('/', ',');
		System.out.println(words);
		String[] animals = words.split(",");
		System.out.println("animals�� ��(�迭): " + animals.length);
		for (String a : animals) {
			System.out.println(a);
		}
		System.out.println("=======================");
		
		// 2�� ���
		words = "lion,hyena,elephant,cheetah/zeebra/giraffe/monkey";
		System.out.println(words);
		
		//StringTokenizer st1 = new StringTokenizer(words, ",/");     // true, �����ڸ� ��ū���� �����
		StringTokenizer st1 = new StringTokenizer(words, ",/", true); // false, �����ڸ� ��ū���� ������� ����
		System.out.println("animals�� ��(��ū): " + st1.countTokens());
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		
		
		
	}
}
