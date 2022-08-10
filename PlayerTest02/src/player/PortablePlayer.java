package player;

public class PortablePlayer implements Player, Skinnable{
	
	@Override
	public void play() {
		System.out.println("◈ 포터블 플레이어 재생 ~~~");
	}
	
	@Override
	public void stop() {
		System.out.println("◈ 포터블 플레이어 정지 ~~~");
	}
	
	// PortablePlayer 클래스는 Skinnable 인터페이스를 구현하고 있기 때문
	// Skinnable.RED -> RED 로 사용 가능
	@Override
	public void changeSkin(int skin) {
		System.out.print("플레이어의 스킬을 ");
		switch (skin) {
		case Skinnable.RED:
			System.out.print("빨강");
			break;
		case GREEN:
			System.out.print("초록");
			break;
		case BLUE:
			System.out.print("파랑");
			break;
		case BLACK:
			System.out.print("검정");
			break;
		case LEOPARD:
			System.out.print("표범무늬");
			break;
		default:
			System.out.print("흰색");
			break;
		}
		System.out.println("으로 변경하였습니다.");
	}
	
}
