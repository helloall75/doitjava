package Example;

public class Continue01 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		for(int i=0; i<10; i++) {
			if (i % 2 != 0) {
				//System.out.print("�������� ����: ");
				//break;	//�ݺ����� �μ��� ���߰� �ϴ� ����
				continue;	//���� ����Ǵ� ���� ���߰� ���� ���ǹ����� �Ѿ
			}
			System.out.println(i);
		}
	}

}
