package ������Ʈ;

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
  
	       JFrame mf = new JFrame("==========��ȭ�� �ð�ǥ==========");
	  
	       
	       JPanel p1 = new JPanel();
	       JLabel place = new JLabel("KH�ó׸� ����");
	       place.setFont(new Font(Font.DIALOG, Font.BOLD,30));
	       place.setSize(250, 100);
	       place.setLocation(20, 10);
	       
	       JPanel p2 = new JPanel();
	       p2.add(new Label("������������ |19���̻� |����,ȣ��|��120��"));
	       p2.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
	       p2.setSize(800, 100);
	       p2.setLocation(20, 200);
	       
	       p2.setLayout(new FlowLayout(FlowLayout.TRAILING));
	       
	       p2.add(new JButton("1�� | 09:00"));
	       p2.add(new JButton("2�� | 10:00"));
	       p2.add(new JButton("1�� | 11:00"));
	       p2.add(new JButton("2�� | 12:00"));
	       p2.add(new JButton("1�� | 13:00"));
	       p2.add(new JButton("2�� | 14:00"));
	       p2.add(new JButton("1�� | 15:00"));
	       p2.add(new JButton("2�� | 16:00"));
	       p2.add(new JButton("1�� | 17:00"));
	       p2.add(new JButton("2�� | 18:00"));
	       p2.add(new JButton("1�� | 19:00"));
	       p2.add(new JButton("2�� | 20:00"));
	       p2.add(new JButton("1�� | 21:00"));
	    
	       
	       JPanel p3 = new JPanel();
	       p3.add(new Label("���� : ��׳���ũ |15���̻� |��Ÿ��|��120��"));
	       p3.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
	       p3.setSize(810, 100);
	       p3.setLocation(20, 350);
	       
	       p3.setLayout(new FlowLayout(FlowLayout.TRAILING));
	       
	       p3.add(new JButton("3�� | 09:00"));
	       p3.add(new JButton("4�� | 10:00"));
	       p3.add(new JButton("3�� | 11:00"));
	       p3.add(new JButton("4�� | 12:00"));
	       p3.add(new JButton("3�� | 13:00"));
	       p3.add(new JButton("4�� | 14:00"));
	       p3.add(new JButton("3�� | 15:00"));
	       p3.add(new JButton("4�� | 16:00"));
	       p3.add(new JButton("3�� | 17:00"));
	       p3.add(new JButton("4�� | 18:00"));
	       p3.add(new JButton("3�� | 19:00"));
	       p3.add(new JButton("4�� | 20:00"));
	       p3.add(new JButton("3�� | 21:00"));
	       
	       JPanel p4 = new JPanel();
	       p4.add(new Label("����Ƽ������ |15���̻� |�������,SF|��120��"));
	       p4.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
	       p4.setSize(820, 100);
	       p4.setLocation(20, 500);
	       
	       p4.setLayout(new FlowLayout(FlowLayout.TRAILING));
	       
	       p4.add(new JButton("5�� | 09:00"));
	       p4.add(new JButton("6�� | 10:00"));
	       p4.add(new JButton("5�� | 11:00"));
	       p4.add(new JButton("6�� | 12:00"));
	       p4.add(new JButton("5�� | 13:00"));
	       p4.add(new JButton("6�� | 14:00"));
	       p4.add(new JButton("5�� | 15:00"));
	       p4.add(new JButton("6�� | 16:00"));
	       p4.add(new JButton("5�� | 17:00"));
	       p4.add(new JButton("6�� | 18:00"));
	       p4.add(new JButton("5�� | 19:00"));
	       p4.add(new JButton("6�� | 20:00"));
	       p4.add(new JButton("5�� | 21:00"));   
	       
	       

	  JPanel p5 = new JPanel();
	  p5.setSize(810, 100);
      p5.setLocation(20, 50);
      p5.setLayout(new FlowLayout(FlowLayout.TRAILING));
      
	  // ù��° �Ŵ��� ����
	  //JMenu jmenu = new JMenu("��¥");
	  //jmenu.setMnemonic(KeyEvent.VK_1);
	  

 JSpinner spinner;
 
 // Date Model �׽�Ʈ
 Calendar calendar = Calendar.getInstance();
 Date value = calendar.getTime(); // ���� ��¥
 calendar.add(Calendar.YEAR, -50); // ���簪���� -50�� ����
 Date start = calendar.getTime();
 calendar.add(Calendar.YEAR, 100); // ���� +50�ϸ� ���� ��¥�� ��
 Date end = calendar.getTime();
 
 SpinnerDateModel dateModel =
		  new SpinnerDateModel(value, start, end, Calendar.YEAR);
		  spinner = new JSpinner(dateModel);
		  // ��¥�� ������ �� �ִ� �����⸦ �����Ѵ�.
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
	
 