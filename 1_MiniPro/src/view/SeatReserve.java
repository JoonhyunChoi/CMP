package view;

import java.awt.*;
import javax.swing.*;

public class SeatReserve extends JPanel{
	public SeatReserve(){
		this.setSize(1920, 1080);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
		//������ ����
		JLabel label = new JLabel("�¼�/�ο�����");
		label.setBounds(400, 200, 500, 50);
		label.setFont(new Font("SamsSerif", Font.PLAIN, 50));
		this.add(label);
		
		//��ũ�� ǥ��
		Canvas screen = new Canvas();
		screen.setBounds(475, 350, 500, 30);
		screen.setBackground(Color.cyan);
		this.add(screen);
		
		//�¼� ǥ��
		JButton[][] seat = new JButton[12][20];	
		int term = 30;
		int x = 0;
		int y = 0;
		for(int i = 0; i < seat.length; i++){
			x = 400;	
			y = 500;
			for(int j = 0; j < seat[i].length; j++){
				if(j == 5 || j == 14){
					JLabel seatl = new JLabel((char)('A' + i) + "��");
					this.add(seatl);
					seatl.setBounds(x + (j * term), y + (i * term), 25, 25);
					x += term;
				}
				if(i == 0){
					JLabel seatl = new JLabel(j + 1 + "");
					this.add(seatl);
					seatl.setBounds(x + (j * term) + 5, y - term, 20, 20);
				}
				this.add(seat[i][j] = new JButton());					
				seat[i][j].setBounds(x + (j * term), y + (i * term), 20, 20);					
			}
		}
		
		//���� �ο��� �Է�
		JLabel adultl = new JLabel("����");
		adultl.setBounds(1270, 300, 100, 30);
		SpinnerNumberModel adultmodel = new SpinnerNumberModel(0, 0, 10, 1);
		JSpinner Adultspin = new JSpinner(adultmodel);
		Adultspin.setBounds(1300, 300, 70, 30);
		this.add(adultl);
		this.add(Adultspin);
		
		//û�ҳ� �ο��� �Է�
		JLabel teenl = new JLabel("û�ҳ�");
		teenl.setBounds(1260, 350, 100, 30);
		SpinnerNumberModel teenmodel = new SpinnerNumberModel(0, 0, 10, 1);
		JSpinner teenspin = new JSpinner(teenmodel);
		teenspin.setBounds(1300, 350, 70, 30);
		this.add(teenl);
		this.add(teenspin);

	}

}
