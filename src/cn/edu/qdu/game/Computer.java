package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player{


	public String inputName() {
		
		 System.out.println("��ѡ��Է���ɫ��1.����2.��Ȩ3.�ܲ٣���");
		 Scanner input=new Scanner(System.in);
		 int select=input.nextInt();
		 switch (select) {
		case 1:
			//compName="����";
			setPlayName("����");
			break;
		case 2:
			setPlayName("��Ȩ");
			break;
		case 3:
			setPlayName("�ܲ�");
			break;

		default:
			System.out.println("������벻�ԣ�");
			break;
		}
		 return getPlayName();
	}

	
	public int  myFist() {

		return (int)(Math.random()*3)+1;
//		 
//	     switch (compSelect) {
//			case 1:
//				System.out.println("��ȭ������");
//				break;
//			case 2:
//				System.out.println("��ȭ��ʯͷ");
//				break;
//			case 3:
//				System.out.println("��ȭ����");
//				break;
//
//			default:
//				
//				break;
//	    
//	     
//	     }
//	     
}


}
