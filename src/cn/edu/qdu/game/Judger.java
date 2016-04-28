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
		System.out.println("****��ȭ����ʼ****");
		System.out.println("******************");
	}

	public void askName() {

		System.out.println("��ȭ����1.����2.ʯͷ3.��");
		// System.out.println("��ѡ��Է���ɫ��1.����2.��Ȩ3.�ܲ٣���");
		// Scanner input=new Scanner(System.in);
		// int select=input.nextInt();
		// switch (select) {
		// case 1:
		// compName="����";
		// break;
		// case 2:
		// compName="��Ȩ";
		// break;
		// case 3:
		// compName="�ܲ�";
		// break;
		//
		// default:
		// System.out.println("������벻�ԣ�");
		// break;
		// }
		// System.out.println("���������������");
		// yourName=input.next();

		System.out.println(person.inputName() + "  VS  " + computer.inputName() + "  ��ս");
	}

	public void playGame() {
		Scanner input = new Scanner(System.in);
		String nextGame = "";
		int yourtime = 0, comptime = 0;
		int count = 0;
		do {

			System.out.println("Ҫ��ʼ�𣿣�y/n��");
			String ynStart = input.next();
			if (ynStart.equals("y")) {
				System.out.println("��ȭ����1.����2.ʯͷ3.����������Ӧ���֣���");
				// int yourSelect=input.nextInt();
				//
				//
				//
				int perfist = person.myFist();
				switch (perfist) {
				case 1:
					System.out.println("���ȭ������");
					break;
				case 2:
					System.out.println("���ȭ��ʯͷ");
					break;
				case 3:
					System.out.println("���ȭ����");
					break;

				default:
					System.out.println("������벻�ԣ�");
					break;
				}
				// int compSelect=(int)(Math.random()*3)+1;
				//
				int compfist = computer.myFist();
				switch (compfist) {
				case 1:
					System.out.println(computer.getPlayName() + "��ȭ������");
					break;
				case 2:
					System.out.println(computer.getPlayName() + "��ȭ��ʯͷ");
					break;
				case 3:
					System.out.println(computer.getPlayName() + "��ȭ����");
					break;

				default:

					break;

				}

				if (perfist == 1 && compfist == 2 || perfist == 2 && compfist == 3 || perfist == 3 && compfist == 1) {
					System.out.println("�����ˣ��汿��");
					comptime++;
					computer.setWinTimes(comptime);
					computer.getWinTimes();
				} else if (perfist == 1 && compfist == 1 || perfist == 2 && compfist == 2
						|| perfist == 3 && compfist == 3) {
					System.out.println("ƽ��");
					count++;
				} else {
					System.out.println("��������Ӯ�ˣ�");

					yourtime++;
					person.setWinTimes(yourtime);
					person.getWinTimes();

				}
			}
			tatol = person.getWinTimes() + computer.getWinTimes() + count;
			System.out.println("�Ƿ�ʼ��һ�֣�y/n��");
			nextGame = input.next();

		} while (nextGame.equals("y"));

	}

	public void finalResult() {
		System.out.println("------------------------------------");
		System.out.println(computer.getPlayName() + "  VS  " + person.getPlayName());
		System.out.println("��ս������" + tatol);
		System.out.println("����" + "\t" + "�÷�");
		System.out.println(computer.getPlayName() + "\t" + person.getWinTimes());
		System.out.println(person.getPlayName() + "\t" + computer.getWinTimes());
		if (person.getWinTimes() > computer.getWinTimes()) {
			System.out.println("��Ӯ�ˣ������");
		} else if (person.getWinTimes() == computer.getWinTimes()) {
			System.out.println("����ƽ�֣�");
		} else {
			System.out.println("�Ǻǣ��������´μ��Ͱ���");
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