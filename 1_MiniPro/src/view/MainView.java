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
  
	       JFrame mf = new JFrame("==========��ȭ�� �ð�ǥ==========");
	 
	       JLabel place = new JLabel("KH�ó׸� ����");
	       place.setFont(new Font(Font.DIALOG, Font.BOLD,30));
	       place.setSize(250, 100);
	       place.setLocation(20, 10);
	 
	       // <������ �޾ƿ� ��>
	       
	       JPanel p2 = new Panel2();
	       // 1��, 2�� ������ ȣ��
	       JPanel p3 = new Panel3();
	       // 1��, 2�� ������ ȣ��
	       JPanel p4 = new Panel4();
	       //1��, 2�� ������ ȣ��
	       
	       JPanel p6 = new Panel6();
	       // ��¥ �� �󿵰� ������ ȣ��
	       
 	 
 	 // �󿵰� �ȳ�
 	JPanel InfoPanel = new InfoPanel();
 	InfoPanel.setSize(150, 100);
 	InfoPanel.setLocation(700, 200); 
	//seatInfoPanel.setBackground(Color.PINK);
 	mf.add(InfoPanel);
  
 	
 	
 	
		// ���� ��ư
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
	 // ���⿡ ���Ͽ� ������ �����Ͱ� ���� ��.
	 
	 
	 
	 String place="1��";
	 String date="11�� 25��";
	 PlaceController dc= new PlaceController();
	 dc.datemodController(place, date);
 }
 
public void dateRead(){
	// ���⼭ ���Ͽ��� �����;� ��.
	
	
	
	PlaceController dc= new PlaceController();
	PlaceChoice pd = dc.PlacedateGet();
	System.out.println(pd);
	
}
}

 
 		