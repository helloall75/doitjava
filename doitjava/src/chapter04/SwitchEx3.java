package chapter04;

public class SwitchEx3 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int thismon = 8;
		int day = 0;
		
		System.out.println(thismon + "���� ������ ���ڴ� �� �� �ΰ���?");
		switch(thismon) {
		case 1: day = 31;
			break;
		case 2: day = 28;
			break;
		case 3: day = 31;
			break;
		case 4: day = 30;
			break;
		case 5: day = 31;
			break;
		case 6: day = 30;
			break;
		case 7: day = 31;
			break;
		case 8: day = 31;
			break;
		case 9: day = 30;
			break;
		case 10: day = 31;
			break;
		case 11: day = 30;
			break;
		default: day = 31;
		}
		System.out.println(thismon + "���� " + day +"�ϱ��� �Դϴ�.");
		
		switch(thismon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(thismon + "���� 31�ϱ����Դϴ�.");
			break;
		case 2:
			System.out.println(thismon + "���� 28�ϱ����Դϴ�.");
			break;
		default:
			System.out.println(thismon + "���� 30�ϱ����Դϴ�.");
		}
	}

}
