package test;

import pet.RobotPet;
import pet.Pet;


public class PetTest02 {
	public static void main(String[] args) {
		// �迭 1��
		Pet[] pets = new Pet[4];
		pets[0] = new Pet("����", "�쿵��");
		pets[1] = new RobotPet("��ũ", "���׶��");
		pets[2] = new Pet("����", "����ȣ");
		pets[3] = new RobotPet("ȣ��", "����");
		// �迭 2��
		Pet[] pets2 = new Pet[] {
				new Pet("����", "�쿵��"),
				new RobotPet("��ũ", "���׶��"),
				new Pet("����", "����ȣ"),
				new RobotPet("ȣ��", "����"),
		};
		/*
		�� ���� for���� ����Ͽ� �������� �����Ͻÿ�. 
		- ������) RobotPet ���� ����޼ҵ带 ����� ���� ����
		- --> instanceof (�񱳿�����) Ȱ��
		*/
		for (int i=0; i<pets.length; i++) {
			pets[i].introduce();
			
			// �ڡڡڡڡ�
			// ������ �ν��Ͻ�, pets[i]�� RobotPet���� �����Ѵٸ� true, �׷��� �ʴٸ� false
			// pets[i]�� RobotPet���� �ν��Ͻ��̸� true, �׷��� �ʴٸ� false
			if (pets[i] instanceof RobotPet) {
				( (RobotPet)pets[i] ).work(1);  // RobotPet������ casting
				
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
		Pet navi = new Pet("����", "�쿵��");
		RobotPet mark = new RobotPet("��ũ", "���׶��");
		
		navi.introduce();
		System.out.println();
		mark.introduce();
		*/
		
		
		
	}
}
