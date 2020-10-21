package chapter10;

public class RemoteConEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		RemoteControl rc; 
		rc = new RemoteControl() {
		int volume;
		
			@Override
			public void turnOn() {
				// TODO 자동 생성된 메소드 스텁
				System.out.println("전등을 켭니다.");
			}
			
			@Override
			public void turnOff() {
				// TODO 자동 생성된 메소드 스텁
				System.out.println("전등을 끕니다.");
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO 자동 생성된 메소드 스텁
				if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = volume;
				} else if (volume > RemoteControl.MAX_VOLUME){
					this.volume = volume;
				} else {
					this.volume = volume;
				}
				System.out.println("전등의 현재 밝기는 " + this.volume + "입니다.");
			}
		}; 
			
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
