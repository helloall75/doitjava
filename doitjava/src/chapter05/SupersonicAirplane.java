package chapter05;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		// TODO �ڵ� ������ �޼ҵ� ����
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			super.fly();	//�θ�Ŭ������ fly() �޼ҵ� ����
		}
	}
}
