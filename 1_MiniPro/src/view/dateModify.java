package 프로젝트;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class dateModify {
 
 public dateModify() {
  
	       JFrame mf = new JFrame("==========영화상영 시간표==========");
	  
	       
	       JPanel p1 = new JPanel();
	       JLabel place = new JLabel("KH시네마 강남");
	       place.setFont(new Font(Font.DIALOG, Font.BOLD,30));
	       place.setSize(250, 100);
	       place.setLocation(20, 10);
	       
	       JPanel p2 = new JPanel();
	       p2.add(new Label("승정데스데이 |19세이상 |공포,호러|총120석"));
	       p2.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
	       p2.setSize(800, 100);
	       p2.setLocation(20, 200);
	       
	       p2.setLayout(new FlowLayout(FlowLayout.TRAILING));
	       
	       p2.add(new JButton("1관 | 09:00"));
	       p2.add(new JButton("2관 | 10:00"));
	       p2.add(new JButton("1관 | 11:00"));
	       p2.add(new JButton("2관 | 12:00"));
	       p2.add(new JButton("1관 | 13:00"));
	       p2.add(new JButton("2관 | 14:00"));
	       p2.add(new JButton("1관 | 15:00"));
	       p2.add(new JButton("2관 | 16:00"));
	       p2.add(new JButton("1관 | 17:00"));
	       p2.add(new JButton("2관 | 18:00"));
	       p2.add(new JButton("1관 | 19:00"));
	       p2.add(new JButton("2관 | 20:00"));
	       p2.add(new JButton("1관 | 21:00"));
	    
	       
	       JPanel p3 = new JPanel();
	       p3.add(new Label("승정 : 라그나로크 |15세이상 |판타지|총120석"));
	       p3.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
	       p3.setSize(810, 100);
	       p3.setLocation(20, 350);
	       
	       p3.setLayout(new FlowLayout(FlowLayout.TRAILING));
	       
	       p3.add(new JButton("3관 | 09:00"));
	       p3.add(new JButton("4관 | 10:00"));
	       p3.add(new JButton("3관 | 11:00"));
	       p3.add(new JButton("4관 | 12:00"));
	       p3.add(new JButton("3관 | 13:00"));
	       p3.add(new JButton("4관 | 14:00"));
	       p3.add(new JButton("3관 | 15:00"));
	       p3.add(new JButton("4관 | 16:00"));
	       p3.add(new JButton("3관 | 17:00"));
	       p3.add(new JButton("4관 | 18:00"));
	       p3.add(new JButton("3관 | 19:00"));
	       p3.add(new JButton("4관 | 20:00"));
	       p3.add(new JButton("3관 | 21:00"));
	       
	       JPanel p4 = new JPanel();
	       p4.add(new Label("저스티스승정 |15세이상 |공상과학,SF|총120석"));
	       p4.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
	       p4.setSize(820, 100);
	       p4.setLocation(20, 500);
	       
	       p4.setLayout(new FlowLayout(FlowLayout.TRAILING));
	       
	       p4.add(new JButton("5관 | 09:00"));
	       p4.add(new JButton("6관 | 10:00"));
	       p4.add(new JButton("5관 | 11:00"));
	       p4.add(new JButton("6관 | 12:00"));
	       p4.add(new JButton("5관 | 13:00"));
	       p4.add(new JButton("6관 | 14:00"));
	       p4.add(new JButton("5관 | 15:00"));
	       p4.add(new JButton("6관 | 16:00"));
	       p4.add(new JButton("5관 | 17:00"));
	       p4.add(new JButton("6관 | 18:00"));
	       p4.add(new JButton("5관 | 19:00"));
	       p4.add(new JButton("6관 | 20:00"));
	       p4.add(new JButton("5관 | 21:00"));   
	       
	       

	  JPanel p5 = new JPanel();
	  p5.setSize(810, 100);
      p5.setLocation(20, 50);
      p5.setLayout(new FlowLayout(FlowLayout.TRAILING));
      
	  // 첫번째 매뉴를 생성
	  //JMenu jmenu = new JMenu("날짜");
	  //jmenu.setMnemonic(KeyEvent.VK_1);
	  

 JSpinner spinner;
 
 // Date Model 테스트
 Calendar calendar = Calendar.getInstance();
 Date value = calendar.getTime(); // 현재 날짜
 calendar.add(Calendar.YEAR, -50); // 현재값보다 -50년 증가
 Date start = calendar.getTime();
 calendar.add(Calendar.YEAR, 100); // 주의 +50하면 현재 날짜가 됨
 Date end = calendar.getTime();
 
 SpinnerDateModel dateModel =
		  new SpinnerDateModel(value, start, end, Calendar.YEAR);
		  spinner = new JSpinner(dateModel);
		  // 날짜를 편집할 수 있는 편집기를 지정한다.
		  spinner.setEditor(new JSpinner.DateEditor(spinner, "yyyy/MM/dd"));
		  p5.add(spinner);
		//  p5.add(jmenu);
		
	      mf.setSize(1280, 850);
	      mf.setLayout(null);  
		
		  
	      mf.add(place);
	       mf.add(p2);
	       mf.add(p3);
	       mf.add(p4);
	       mf.add(p5);
	       mf.setVisible(true);
	       mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	 
		 
	public static void main(String[] args) {
		dateModify dv = new dateModify();
		 }
	}
	
 