package ������Ʈ;

import java.awt.*;

import javax.swing.*;

public class InfoPanel extends JPanel{
	public InfoPanel(){
		this.setLayout(null);
		this.setSize(100, 200);
		
		JButton selButton = new JButton();
		selButton.setBackground(Color.RED);
		selButton.setBounds(0, 00, 20, 20);
		JLabel selLabel = new JLabel("������ �󿵰�");
		selLabel.setBounds(30, 00, 150, 25);
		this.add(selButton);
		this.add(selLabel);
 
	}
}
