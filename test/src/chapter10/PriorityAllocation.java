package chapter10;

public class PriorityAllocation implements Scheduler {
	@Override
	public void getNextCall() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}
	@Override
	public void sendCallToAgent() {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("���� skill ���� ���� �������� �켱������ ����մϴ�.");
	}
}
