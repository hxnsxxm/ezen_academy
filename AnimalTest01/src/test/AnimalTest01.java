package test;

import animal.Animal;
import animal.Cat;
import animal.Dog;

/*
문제) Cat과 Dog의 인스턴스를 각 2개씩 생성하여, 다형성을 구현하여 출력하시오.
*/

public class AnimalTest01 {
	public static void main(String[] args) {
		// 추상 클래스의 배열은 가능함 --> 자식 클래스의 인스턴스를 담아 다형성을 구현할 목적
		
		Animal[] animals = new Animal[] {
				new Cat("나비", 10),
				new Cat("치즈", 2),
				new Dog("창식", "말티즈"),
				new Dog("철수", "래브라도 리트리버"),
		};
		
		/*
		Cat c1 = new Cat("나비", 10);
		Cat c2 = new Cat("치즈", 2);
		Dog d1 = new Dog("창식", "말티즈");
		Dog d2 = new Dog("철수", "래브라도 리트리버");
		
		Animal[] animals = new Animal[4];
		animals[0] = c1;
		animals[1] = c2;
		animals[2] = d1;
		animals[3] = d2;
		*/    
		for (Animal a : animals) {
			/*
			if (a instanceof Cat) {
				((Cat)a).bark();
				System.out.println(a);
			} else if (a instanceof Dog) {
				((Dog)a).bark();
			}
			*/
			//a.bark();
			//System.out.println(a);
			a.introduce();
			System.out.println();
		} 
		/*
		for (int i=0; i<animals.length; i++) {
			animals[i].introduce();
			System.out.println();
		}
		*/
	}
}
