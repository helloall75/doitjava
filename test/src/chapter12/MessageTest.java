package chapter12;

import java.util.LinkedList;
import java.util.Queue;

public class MessageTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Queue<Message> message = new LinkedList<Message>();
		message.offer("sendMail", "홍길동");
		message.offer("sendSMS", "신동현");
		message.offer("sendKakaoTalk", "홍두께");
		
		if(!message.isEmpty()) {
			Message message = new Message();
			
			switch(message.getCommand()) {
			case "sendMail": System.out.println("홍길동님에게 senMail하였습니다.");
				break;
			case "sendSMS": System.out.println("신동현님에게 sendSMS하였습니다.");
				break;
			case "sendKakaoTalk": System.out.println("홍두께님에게 sendKakaoTalk하였습니다.");
				break;
			}
		}
	}

}
