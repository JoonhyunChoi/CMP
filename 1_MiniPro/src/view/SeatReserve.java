package view;

import java.awt.*;
import javax.swing.*;

public class SeatReserve extends JPanel{
	public SeatReserve(){
		this.setSize(1920, 1080);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		
		//페이지 제목
		JLabel label = new JLabel("좌석/인원선택");
		label.setBounds(400, 200, 500, 50);
		label.setFont(new Font("SamsSerif", Font.PLAIN, 50));
		this.add(label);
		
		//스크린 표시
		Canvas screen = new Canvas();
		screen.setBounds(475, 350, 500, 30);
		screen.setBackground(Color.cyan);
		this.add(screen);
		
		//좌석 표시
		JButton[][] seat = new JButton[12][20];	
		int term = 30;
		int x = 0;
		int y = 0;
		for(int i = 0; i < seat.length; i++){
			x = 400;	
			y = 500;
			for(int j = 0; j < seat[i].length; j++){
				if(j == 5 || j == 14){
					JLabel seatl = new JLabel((char)('A' + i) + "열");
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
		
		//성인 인원수 입력
		JLabel adultl = new JLabel("성인");
		adultl.setBounds(1270, 300, 100, 30);
		SpinnerNumberModel adultmodel = new SpinnerNumberModel(0, 0, 10, 1);
		JSpinner Adultspin = new JSpinner(adultmodel);
		Adultspin.setBounds(1300, 300, 70, 30);
		this.add(adultl);
		this.add(Adultspin);
		
		//청소년 인원수 입력
		JLabel teenl = new JLabel("청소년");
		teenl.setBounds(1260, 350, 100, 30);
		SpinnerNumberModel teenmodel = new SpinnerNumberModel(0, 0, 10, 1);
		JSpinner teenspin = new JSpinner(teenmodel);
		teenspin.setBounds(1300, 350, 70, 30);
		this.add(teenl);
		this.add(teenspin);

	}

}
