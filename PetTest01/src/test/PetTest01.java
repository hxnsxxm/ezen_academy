package test;

import pet.Pet;
import pet.RobotPet;

public class PetTest01 {
	public static void main(String[] args) {
		Pet happy = new Pet("����", "�쿵��");
		RobotPet mark = new RobotPet("��ũ", "����ȣ");
		
		/*
		happy.introduce();
		System.out.println();
		mark.introduce();  // override
		System.out.println();
		*/
		
		/*
		Pet p1;
		p1 = happy;
		p1 = mark;   // ���� - �θ��� ���������� �ڽ��� �ν��Ͻ��� ������ �� �ִ�. -> ������ ����
		
		RobotPet p2;
		p2 = happy;  // �Ұ��� - �ڽ��� ���������� �θ��� �ν��Ͻ��� ������ �� ����.
		p2 = mark;
		*/
		
		// �ڡڡڡڡ�
		Pet navi = mark;
		navi.introduce();  
		/*
		���� ���ε� - Pet���� introduce�� ����ϴ� ���� �ƴ϶�, 
		    Pet���� navi�� �����ϴ� ��ü�� RobotPet���� introduce()�� �����.
		
		
		
		*/
		
		
	}
}
