import java.text.DecimalFormat;

// DecimalFormat 클래스 - 숫자를 다양한 형식으로 출력할 수 있도록 하는 클래스
public class DecimalFormatTest01 {
	public static void main(String[] args) {
		
		double number = 1234567.4567;
		
		// 1의 자리 이상에서 쉼표(,)는 천단위 구분 기호, 소수점 이하에서는 표현할 자리수를 지정하는 역할(반올림하여 표시) 
		// # : 소수점 이하에서 사용하지 않는 자리는 표시하지 않음, 1의 자리 이상에서 사용하지 않는 자리는 표시하지 않음 
		// 0 : 소수점 이하에서 사용하지 않는 자리도 표시함,     1의 자리 이상에서 사용하지 않는 자리도 표시함
		DecimalFormat df1 = new DecimalFormat("#,###.#####");
		DecimalFormat df2 = new DecimalFormat("#,###.##");   // 많이 사용
		DecimalFormat df3 = new DecimalFormat("0,000.00000");
		DecimalFormat df4 = new DecimalFormat("0,000.00");
		DecimalFormat df5 = new DecimalFormat("#,###,####,###.#####");
		DecimalFormat df6 = new DecimalFormat("0,000,0000,000.00000");
		DecimalFormat df7 = new DecimalFormat("#.#E0"); // 지수승, 1.2E6, 1.2*10의6제곱, 아주 큰 숫자를 표현할 때 사용
		DecimalFormat df8 = new DecimalFormat("0.0E0"); // 지수승, 1.2E6
		DecimalFormat df9 = new DecimalFormat("#E0");   // 지수승, .1E7, 0.1*10의7제곱  
		DecimalFormat df10 = new DecimalFormat("0E0");  // 지수승, 1E6, 1*10의6제곱
		
		
		System.out.println(df1.format(number));
		System.out.println(df2.format(number));
		System.out.println(df3.format(number));
		System.out.println(df4.format(number));
		System.out.println(df5.format(number));
		System.out.println(df6.format(number));
		System.out.println(df7.format(number));
		System.out.println(df8.format(number));
		System.out.println(df9.format(number));
		System.out.println(df10.format(number));
		
		
	}
}
