import java.util.Enumeration;
import java.util.Properties;


/*
< Properties 클래스 >
1. 키와 값을 가지는 맵 형태의 구조
2. 키와 값에 대해서 문자열만 사용하는 구조 --> 키와 값에 대한 generic type을 생략함
*/

public class PropertiesTest01 {
	public static void main(String[] args) {
		
		// Properties 생성
		Properties prop = new Properties();
		
		// 데이터 추가 - 데이터의 순서가 없다.
		prop.setProperty("우영우", "외뿔 고래");
		prop.setProperty("한수형", "봄날의 햇살");
		prop.setProperty("정명석", "이혼한 변호사");
		prop.setProperty("권민우", "권모술수");
		prop.setProperty("동그라미",  "외뿔고래 친구");
		System.out.println(prop);
		
		// 데이터 출력
		Enumeration e = prop.propertyNames();
		while (e.hasMoreElements()) {
			String key = (String)e.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("-----------");
		
		prop.list(System.out);
		
		
	}
}
