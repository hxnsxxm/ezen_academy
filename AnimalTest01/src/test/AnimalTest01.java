package test;

import animal.Animal;
import animal.Cat;
import animal.Dog;

/*
����) Cat�� Dog�� �ν��Ͻ��� �� 2���� �����Ͽ�, �������� �����Ͽ� ����Ͻÿ�.
*/

public class AnimalTest01 {
	public static void main(String[] args) {
		// �߻� Ŭ������ �迭�� ������ --> �ڽ� Ŭ������ �ν��Ͻ��� ��� �������� ������ ����
		
		Animal[] animals = new Animal[] {
				new Cat("����", 10),
				new Cat("ġ��", 2),
				new Dog("â��", "��Ƽ��"),
				new Dog("ö��", "����� ��Ʈ����"),
		};
		
		/*
		Cat c1 = new Cat("����", 10);
		Cat c2 = new Cat("ġ��", 2);
		Dog d1 = new Dog("â��", "��Ƽ��");
		Dog d2 = new Dog("ö��", "����� ��Ʈ����");
		
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
