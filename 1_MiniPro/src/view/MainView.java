package view;


import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.PlaceController;
import vo.PlaceChoice;

public class MainView {
  
private int adultCount;

public MainView() {
  
	       JFrame mf = new JFrame("==========영화상영 시간표==========");
	 
	       JLabel place = new JLabel("KH시네마 강남");
	       place.setFont(new Font(Font.DIALOG, Font.BOLD,30));
	       place.setSize(250, 100);
	       place.setLocation(20, 10);
	 
	       // <데이터 받아올 곳>
	       
	       JPanel p2 = new Panel2();
	       // 1관, 2관 데이터 호출
	       JPanel p3 = new Panel3();
	       // 1관, 2관 데이터 호출
	       JPanel p4 = new Panel4();
	       //1관, 2관 데이터 호출
	       
	       JPanel p6 = new Panel6();
	       // 날짜 및 상영관 데이터 호출
	       
 	 
 	 // 상영관 안내
 	JPanel InfoPanel = new InfoPanel();
 	InfoPanel.setSize(150, 100);
 	InfoPanel.setLocation(700, 200); 
	//seatInfoPanel.setBackground(Color.PINK);
 	mf.add(InfoPanel);
  
 	
 	
 	
		// 결제 버튼
		 PayPanel payPanel = new PayPanel();
		  payPanel.setSize(100, 50);
		  payPanel.setLocation(770, 700);
		
			 
	      mf.setSize(1280, 850);
	      mf.setLayout(null);  
	
	       mf.add(place);
	       mf.add(p2);
	       mf.add(p3);
	       mf.add(p4);
	       mf.add(payPanel);
	       mf.add(p6);
	     //  mf.add(spin);
	       mf.setVisible(true);
	       mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

 public void dateModi(){
	 // 여기에 파일에 저장할 데이터가 들어가야 함.
	 
	 
	 
	 String place="1관";
	 String date="11월 25일";
	 PlaceController dc= new PlaceController();
	 dc.datemodController(place, date);
 }
 
public void dateRead(){
	// 여기서 파일에서 가져와야 함.
	
	
	
	PlaceController dc= new PlaceController();
	PlaceChoice pd = dc.PlacedateGet();
	System.out.println(pd);
	
}
}

 
 		