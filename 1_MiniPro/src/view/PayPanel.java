package view;
 

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PayPanel extends JPanel{
	private JButton payButton;
	
	public PayPanel(){
		this.setSize(100, 50);
		this.setLayout(null);
		payButton = new JButton("결제");
		payButton.setSize(80, 50);
		
		payButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 정호형꺼 호출
			}
		});
		
		
		this.add(payButton);
	}

	public JButton getPayButton() {
		return payButton;
	}

	public void setPayButton(JButton payButton) {
		this.payButton = payButton;
	}
	
	
}
