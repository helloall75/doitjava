package chapter10;

public class Audio implements RemoteControl {
	private int voulme = 0;
	//private boolean mute;
	
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.voulme = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.voulme = RemoteControl.MIN_VOLUME;
		} else {
			this.voulme = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.voulme);
	}
	@Override
	public void setMute(boolean mute) {
		// TODO 자동 생성된 메소드 스텁
		//RemoteControl.super.setMute(mute);
		
		//this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
}
