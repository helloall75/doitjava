package chapter11;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO �ڵ� ������ �޼ҵ� ����
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("chapter11.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}

}
