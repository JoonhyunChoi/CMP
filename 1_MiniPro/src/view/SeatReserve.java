package view;

import java.awt.*;

import javax.swing.*;

public class SeatReserve extends JPanel{
	public SeatReserve(){
		this.setSize(1280, 720);
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		int thisW = this.getWidth();
		int thisH = this.getHeight();
		
		//페이지 제목
		JLabel label = new JLabel("좌석/인원선택");
		label.setBounds(50, 50, 500, 50);
		label.setFont(new Font("SamsSerif", Font.PLAIN, 50));
		this.add(label);
				
		//좌석 표시
		JButton[][] seat = new JButton[12][20];	
		int term = 30;
		int x = 0;
		int y = 0;
		for(int i = 0; i < seat.length; i++){
			x = label.getX();	
			y = label.getY() + 300;
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
		
		//스크린 표시
				Canvas screen = new Canvas();
				screen.setBounds(seat[0][3].getX(), seat[0][3].getY() - 150, 500, 30);
				screen.setBackground(Color.cyan);
				this.add(screen);
				
		
		//성인 인원수 입력
		JLabel adultl = new JLabel("성인");
		adultl.setBounds(screen.getX() + 600, screen.getY(), 100, 30);
		SpinnerNumberModel adultmodel = new SpinnerNumberModel(0, 0, 10, 1);
		JSpinner Adultspin = new JSpinner(adultmodel);
		Adultspin.setBounds(adultl.getX() + 50, adultl.getY(), 70, 30);
		this.add(adultl);
		this.add(Adultspin);
		
		//청소년 인원수 입력
		JLabel teenl = new JLabel("청소년");
		teenl.setBounds(adultl.getX(), adultl.getY() + 50, 100, 30);
		SpinnerNumberModel teenmodel = new SpinnerNumberModel(0, 0, 10, 1);
		JSpinner teenspin = new JSpinner(teenmodel);
		teenspin.setBounds(teenl.getX() + 50, Adultspin.getY() + 50, 70, 30);
		this.add(teenl);
		this.add(teenspin);

	}

}
