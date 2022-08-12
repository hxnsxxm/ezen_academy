
import java.util.StringTokenizer;

public class StringTokenizerTest02 {
	public static void main(String[] args) {
		
		String words = "lion,hyena,elephant,cheetah/zeebra/giraffe/monkey";
		System.out.println(words);
		
		// 1번 방법 - String 클래스의 split() 메소드 사용
		words = words.replace('/', ',');
		System.out.println(words);
		String[] animals = words.split(",");
		System.out.println("animals의 수(배열): " + animals.length);
		for (String a : animals) {
			System.out.println(a);
		}
		System.out.println("=======================");
		
		// 2번 방법
		words = "lion,hyena,elephant,cheetah/zeebra/giraffe/monkey";
		System.out.println(words);
		
		//StringTokenizer st1 = new StringTokenizer(words, ",/");     // true, 구분자를 토큰으로 사용함
		StringTokenizer st1 = new StringTokenizer(words, ",/", true); // false, 구분자를 토큰으로 사용하지 않음
		System.out.println("animals의 수(토큰): " + st1.countTokens());
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		
		
		
	}
}
