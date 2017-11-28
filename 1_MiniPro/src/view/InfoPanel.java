package 프로젝트;

import java.awt.*;

import javax.swing.*;

public class InfoPanel extends JPanel{
	public InfoPanel(){
		this.setLayout(null);
		this.setSize(100, 200);
		
		JButton selButton = new JButton();
		selButton.setBackground(Color.RED);
		selButton.setBounds(0, 00, 20, 20);
		JLabel selLabel = new JLabel("선택한 상영관");
		selLabel.setBounds(30, 00, 150, 25);
		this.add(selButton);
		this.add(selLabel);
 
	}
}
