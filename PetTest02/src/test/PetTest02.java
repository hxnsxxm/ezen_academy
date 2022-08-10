package test;

import pet.RobotPet;
import pet.Pet;


public class PetTest02 {
	public static void main(String[] args) {
		// 배열 1번
		Pet[] pets = new Pet[4];
		pets[0] = new Pet("나비", "우영우");
		pets[1] = new RobotPet("마크", "동그라미");
		pets[2] = new Pet("별이", "이준호");
		pets[3] = new RobotPet("호이", "정명석");
		// 배열 2번
		Pet[] pets2 = new Pet[] {
				new Pet("나비", "우영우"),
				new RobotPet("마크", "동그라미"),
				new Pet("별이", "이준호"),
				new RobotPet("호이", "정명석"),
		};
		/*
		두 가지 for문을 사용하여 다형성을 구현하시오. 
		- 문제점) RobotPet 형의 멤버메소드를 사용할 수가 없음
		- --> instanceof (비교연산자) 활용
		*/
		for (int i=0; i<pets.length; i++) {
			pets[i].introduce();
			
			// ★★★★★
			// 각각의 인스턴스, pets[i]가 RobotPet형을 팜조한다면 true, 그렇지 않다면 false
			// pets[i]가 RobotPet형의 인스턴스이면 true, 그렇지 않다면 false
			if (pets[i] instanceof RobotPet) {
				( (RobotPet)pets[i] ).work(1);  // RobotPet형으로 casting
				
			}
			
			System.out.println();
		}
		/*
		for (Pet p : pets) {
			p.introduce();
			if (p instanceof RobotPet) {
				( (RobotPet)p ).work(2);  // casting
			}
			System.out.println();
		}
		*/	
		
		
		
		
		/*
		Pet navi = new Pet("나비", "우영우");
		RobotPet mark = new RobotPet("마크", "동그라미");
		
		navi.introduce();
		System.out.println();
		mark.introduce();
		*/
		
		
		
	}
}
