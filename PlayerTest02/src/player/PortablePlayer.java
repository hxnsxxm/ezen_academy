package player;

public class PortablePlayer implements Player, Skinnable{
	
	@Override
	public void play() {
		System.out.println("�� ���ͺ� �÷��̾� ��� ~~~");
	}
	
	@Override
	public void stop() {
		System.out.println("�� ���ͺ� �÷��̾� ���� ~~~");
	}
	
	// PortablePlayer Ŭ������ Skinnable �������̽��� �����ϰ� �ֱ� ����
	// Skinnable.RED -> RED �� ��� ����
	@Override
	public void changeSkin(int skin) {
		System.out.print("�÷��̾��� ��ų�� ");
		switch (skin) {
		case Skinnable.RED:
			System.out.print("����");
			break;
		case GREEN:
			System.out.print("�ʷ�");
			break;
		case BLUE:
			System.out.print("�Ķ�");
			break;
		case BLACK:
			System.out.print("����");
			break;
		case LEOPARD:
			System.out.print("ǥ������");
			break;
		default:
			System.out.print("���");
			break;
		}
		System.out.println("���� �����Ͽ����ϴ�.");
	}
	
}
