package chapter08;

public class AnimalEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------------");
		//������ �ڵ� Ÿ�Ժ�ȯ
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("---------------");
		//�޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
