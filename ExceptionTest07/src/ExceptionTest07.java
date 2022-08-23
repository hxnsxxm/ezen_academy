

class Animal { }

class Dog extends Animal { }
class Cat extends Animal { }


// 예외 5)
// ClassCastException: 클래스의 캐스팅을 올바르게 하지 않았을 때 발생하는 예외
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
