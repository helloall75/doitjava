package chapter10;

public class Television implements RemoteControl {
	private int voulme = 0;
	
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.voulme = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.voulme = RemoteControl.MIN_VOLUME;
		} else {
			this.voulme = volume;
		}
		System.out.println("ÇöÀç TV º¼·ý: " + this.voulme);
	}
}
