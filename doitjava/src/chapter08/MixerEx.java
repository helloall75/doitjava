package chapter08;

public class MixerEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Mixer m = new Mixer();
		Fruit f = new Fruit();
		
		m.mixing(f);
		
		m.mixing(new Apple());
		m.mixing(new Melon());
		//m.mixing(new Meat());
		
		Mixer2 m2 = new Mixer2();
		m2.mixing(new Apple());
		//m2.mixing(new Melon());
	}

}
