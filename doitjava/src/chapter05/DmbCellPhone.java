package chapter05;

public class DmbCellPhone extends CellPhone {
	int channel = 0;
	
	public DmbCellPhone(String model, String color, int channel) {
		// TODO �ڵ� ������ ������ ����
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �����մϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ����� �����մϴ�.");
	}
}
