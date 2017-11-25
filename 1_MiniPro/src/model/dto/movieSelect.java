package model.dto;

import javax.swing.JButton;

public class movieSelect extends JButton{

	private int place;
	private int time;
	
	public movieSelect(){}
	
	public movieSelect(int place, int time){
		this.place = place;
		this.time = time;
	
	}

	public int getPlace() {
		return place;
	}

	public int getTime() {
		return time;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public void setTime(int time) {
		this.time = time;
	}

	
}

