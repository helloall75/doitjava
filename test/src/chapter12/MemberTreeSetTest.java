package chapter12;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		Member memberHong = new Member(1003, "ȫ�浿");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}
