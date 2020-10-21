package chapter10;

public class Audio implements RemoteControl {
	private int voulme = 0;
	//private boolean mute;
	
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.voulme = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.voulme = RemoteControl.MIN_VOLUME;
		} else {
			this.voulme = volume;
		}
		System.out.println("���� Audio ����: " + this.voulme);
	}
	@Override
	public void setMute(boolean mute) {
		// TODO �ڵ� ������ �޼ҵ� ����
		//RemoteControl.super.setMute(mute);
		
		//this.mute = mute;
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		} else {
			System.out.println("Audio ���� �����մϴ�.");
		}
	}
}
