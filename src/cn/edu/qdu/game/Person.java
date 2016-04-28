package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player{
	 
	public String inputName(){
		Scanner input=new Scanner(System.in);
		 System.out.println("请输入你的姓名：");
		  String yourName=input.next();
		  setPlayName(yourName);
		  return getPlayName();
		
	}
   public int  myFist(){
	   Scanner input=new Scanner(System.in);
	   return input.nextInt();
	   

	  			 
//	   switch (yourSelect) {
//	  	case 1:
//	  		System.out.println("你出拳：剪刀");
//	  		break;
//	  	case 2:
//	  		System.out.println("你出拳：石头");
//	  		break;
//	  	case 3:
//	  		System.out.println("你出拳：布");
//	  		break;
//
//	  	default:
//	  		System.out.println("你的输入不对！");
//	  		break;
//	  	} 
	   
   }
}
