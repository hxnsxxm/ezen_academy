package player;

/*
< 인터페이스 규칙 >
1. 인터페이스의 메소드는 public abstract 메소드만 존재할 수 있다.
2. 인터페이스의 메소드에서 public abstract는 생략할 수 있다.
3. 인터페이스의 변수는 public static final 상수만 존재할 수 있다.
4. 인터페이스의 상수는 public static final을 생략할 수 있따.

< 인터페이스의 이름을 만드는 방법 >
1. 클래스 이름을 만드는 방법에 준한다. - 명사로 짓는다
2. 클래스를 꾸며주는 의미를 강조할 떄는 ~able을 붙여서 만든다. ex) Runnable, Clonnable, ... 

*/
public interface Skinnable {

	public static final int RED = 1;
	int   GREEN = 2;
	int    BLUE = 3;
	int   BLACK = 4;
	int LEOPARD = 5;
	
	void changeSkin(int skin);

}
