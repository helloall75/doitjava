package chapter10;

public class RoundRobin implements Scheduler {
	@Override
	public void getNextCall() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}
	@Override
	public void sendCallToAgent() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("���� ���� �������� ����մϴ�.");
	}
}
