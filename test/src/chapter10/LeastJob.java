package chapter10;

public class LeastJob implements Scheduler {
	@Override
	public void getNextCall() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}
	@Override
	public void sendCallToAgent() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("���� ��� ������ ���ų� ��Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
	}
}
