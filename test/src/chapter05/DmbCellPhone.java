package chapter05;

public class DmbCellPhone extends CellPhone {
	int channel = 0;
	
	public DmbCellPhone(String model, String color, int channel) {
		// TODO 자동 생성된 생성자 스텁
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 변경합니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
}
