package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player{
	 
	public String inputName(){
		Scanner input=new Scanner(System.in);
		 System.out.println("���������������");
		  String yourName=input.next();
		  setPlayName(yourName);
		  return getPlayName();
		
	}
   public int  myFist(){
	   Scanner input=new Scanner(System.in);
	   return input.nextInt();
	   

	  			 
//	   switch (yourSelect) {
//	  	case 1:
//	  		System.out.println("���ȭ������");
//	  		break;
//	  	case 2:
//	  		System.out.println("���ȭ��ʯͷ");
//	  		break;
//	  	case 3:
//	  		System.out.println("���ȭ����");
//	  		break;
//
//	  	default:
//	  		System.out.println("������벻�ԣ�");
//	  		break;
//	  	} 
	   
   }
}
