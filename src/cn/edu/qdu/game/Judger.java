package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int tatol;
	private Person person = new Person();
	private Computer computer = new Computer();

	// String compName=null;
	// String yourName=null;
	// int playTimes=0;
	// int yourScore=0,compScore=0;
	public int getTatol() {
		return tatol;
	}

	public void setTatol(int tatol) {
		this.tatol = tatol;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public void startGame() {
		System.out.println("******************");
		System.out.println("****猜拳，开始****");
		System.out.println("******************");
	}

	public void askName() {

		System.out.println("出拳规则：1.剪刀2.石头3.布");
		// System.out.println("请选择对方角色（1.刘备2.孙权3.曹操）：");
		// Scanner input=new Scanner(System.in);
		// int select=input.nextInt();
		// switch (select) {
		// case 1:
		// compName="刘备";
		// break;
		// case 2:
		// compName="孙权";
		// break;
		// case 3:
		// compName="曹操";
		// break;
		//
		// default:
		// System.out.println("你的输入不对！");
		// break;
		// }
		// System.out.println("请输入你的姓名：");
		// yourName=input.next();

		System.out.println(person.inputName() + "  VS  " + computer.inputName() + "  对战");
	}

	public void playGame() {
		Scanner input = new Scanner(System.in);
		String nextGame = "";
		int yourtime = 0, comptime = 0;
		int count = 0;
		do {

			System.out.println("要开始吗？（y/n）");
			String ynStart = input.next();
			if (ynStart.equals("y")) {
				System.out.println("出拳规则：1.剪刀2.石头3.布（输入相应数字）：");
				// int yourSelect=input.nextInt();
				//
				//
				//
				int perfist = person.myFist();
				switch (perfist) {
				case 1:
					System.out.println("你出拳：剪刀");
					break;
				case 2:
					System.out.println("你出拳：石头");
					break;
				case 3:
					System.out.println("你出拳：布");
					break;

				default:
					System.out.println("你的输入不对！");
					break;
				}
				// int compSelect=(int)(Math.random()*3)+1;
				//
				int compfist = computer.myFist();
				switch (compfist) {
				case 1:
					System.out.println(computer.getPlayName() + "出拳：剪刀");
					break;
				case 2:
					System.out.println(computer.getPlayName() + "出拳：石头");
					break;
				case 3:
					System.out.println(computer.getPlayName() + "出拳：布");
					break;

				default:

					break;

				}

				if (perfist == 1 && compfist == 2 || perfist == 2 && compfist == 3 || perfist == 3 && compfist == 1) {
					System.out.println("你输了，真笨！");
					comptime++;
					computer.setWinTimes(comptime);
					computer.getWinTimes();
				} else if (perfist == 1 && compfist == 1 || perfist == 2 && compfist == 2
						|| perfist == 3 && compfist == 3) {
					System.out.println("平局");
					count++;
				} else {
					System.out.println("哈哈，你赢了！");

					yourtime++;
					person.setWinTimes(yourtime);
					person.getWinTimes();

				}
			}
			tatol = person.getWinTimes() + computer.getWinTimes() + count;
			System.out.println("是否开始下一轮（y/n）");
			nextGame = input.next();

		} while (nextGame.equals("y"));

	}

	public void finalResult() {
		System.out.println("------------------------------------");
		System.out.println(computer.getPlayName() + "  VS  " + person.getPlayName());
		System.out.println("对战次数：" + tatol);
		System.out.println("姓名" + "\t" + "得分");
		System.out.println(computer.getPlayName() + "\t" + person.getWinTimes());
		System.out.println(person.getPlayName() + "\t" + computer.getWinTimes());
		if (person.getWinTimes() > computer.getWinTimes()) {
			System.out.println("你赢了，真棒！");
		} else if (person.getWinTimes() == computer.getWinTimes()) {
			System.out.println("你们平局！");
		} else {
			System.out.println("呵呵，笨笨，下次加油啊！");
		}
		System.out.println("------------------------------------");
	}

	public static void main(String[] args) {
		Judger jd = new Judger();
		jd.startGame();
		jd.askName();
		jd.playGame();
		jd.finalResult();
	}

}