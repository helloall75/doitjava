package chapter12;

import java.util.LinkedList;
import java.util.Queue;

public class MessageTest {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Queue<Message> message = new LinkedList<Message>();
		message.offer("sendMail", "ȫ�浿");
		message.offer("sendSMS", "�ŵ���");
		message.offer("sendKakaoTalk", "ȫ�β�");
		
		if(!message.isEmpty()) {
			Message message = new Message();
			
			switch(message.getCommand()) {
			case "sendMail": System.out.println("ȫ�浿�Կ��� senMail�Ͽ����ϴ�.");
				break;
			case "sendSMS": System.out.println("�ŵ����Կ��� sendSMS�Ͽ����ϴ�.");
				break;
			case "sendKakaoTalk": System.out.println("ȫ�β��Կ��� sendKakaoTalk�Ͽ����ϴ�.");
				break;
			}
		}
	}

}
