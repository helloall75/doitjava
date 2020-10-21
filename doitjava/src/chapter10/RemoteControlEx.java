package chapter10;

public class RemoteControlEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		RemoteControl.changeBattery();
	}
	
}
