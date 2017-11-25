package model.dto;

import javax.swing.JCheckBox;

public class PayButton extends JCheckBox {

	private int point;
	private int price;

	public PayButton(){}

	public PayButton(int point, int price){
		this.point = point;
		this.price = price;
	}
	
	public int getPoint() {
		return point;
	}

	public int getPrice() {
		return price;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
