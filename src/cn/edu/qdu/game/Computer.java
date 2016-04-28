package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player{


	public String inputName() {
		
		 System.out.println("请选择对方角色（1.刘备2.孙权3.曹操）：");
		 Scanner input=new Scanner(System.in);
		 int select=input.nextInt();
		 switch (select) {
		case 1:
			//compName="刘备";
			setPlayName("刘备");
			break;
		case 2:
			setPlayName("孙权");
			break;
		case 3:
			setPlayName("曹操");
			break;

		default:
			System.out.println("你的输入不对！");
			break;
		}
		 return getPlayName();
	}

	
	public int  myFist() {

		return (int)(Math.random()*3)+1;
//		 
//	     switch (compSelect) {
//			case 1:
//				System.out.println("出拳：剪刀");
//				break;
//			case 2:
//				System.out.println("出拳：石头");
//				break;
//			case 3:
//				System.out.println("出拳：布");
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
