

class Animal { }

class Dog extends Animal { }
class Cat extends Animal { }


// ���� 5)
// ClassCastException: Ŭ������ ĳ������ �ùٸ��� ���� �ʾ��� �� �߻��ϴ� ����
public class ExceptionTest07 {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		change(cat);
		
	}
	
	public static void change(Animal a) {
		Dog dog = (Dog)a;
	}
}
