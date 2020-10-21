package chapter09;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("아주 높이 Jump합니다.");
	}

	@Override
	public void turn() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("한 바퀴 돕니다.");
	}

	@Override
	public void showLevelMessage() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("***** 고급자 레벨입니다. *****");
	}

}
