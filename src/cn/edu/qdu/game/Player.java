package cn.edu.qdu.game;

public abstract class Player {
private String playName;
private int winTimes;
public String getPlayName() {
	return playName;
}
public void setPlayName(String playName) {
	this.playName = playName;
}
public int getWinTimes() {
	return winTimes;
}
public void setWinTimes(int winTimes) {
	this.winTimes = winTimes;
}
public abstract String inputName();
public abstract int myFist();
}
