package chapter10;

public class LeastJob implements Scheduler {
	@Override
	public void getNextCall() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	@Override
	public void sendCallToAgent() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
	}
}
