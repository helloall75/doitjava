package chapter05;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
