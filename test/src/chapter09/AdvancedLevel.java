package chapter09;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("���� Jump�մϴ�.");
	}

	@Override
	public void turn() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("Turn�� �� ������.");
	}

	@Override
	public void showLevelMessage() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("***** �߱��� �����Դϴ�. *****");
	}

}
