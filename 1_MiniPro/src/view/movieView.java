package ������Ʈ;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class movieView{
	public static void main(String[] args) {
		 
		JButton btn;
		JFrame mf = new JFrame("�󿵰�");

		mf.setSize(400,300);
		 
		JPanel top = new JPanel();
		JPanel p2 = new JPanel();
		JPanel ctp = new JPanel();
		
		
		//String[] year= {"1","2","3","4","5","6","7","8","9","10","11","12"};
		
		//JComboBox yearList = new JComboBox(year);
		//yearList.setSelectedIndex(0);
		 
		JLabel text1 = new JLabel("�󿵰�");
		JLabel text2 = new JLabel("");
		top.add(text1);
		top.add(text2);
	//	top.add(new JComboBox(year));
		
		
	//	JButton mon = new JButton("��");
	//	top.add(new JButton("��"));
		
		//top.setLayout(new GridLayout(1,1));
		
		JLabel text = new JLabel("�󿵰��� ���õ��� �ʾҽ��ϴ�.");
		ctp.add(text);
		
		
		
	/*	mon.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("��");
			}
		});
	  */
		
		
		mf.add(top, BorderLayout.PAGE_START);
		mf.add(p2, BorderLayout.CENTER);
		mf.add(ctp, BorderLayout.PAGE_END);
		
		JButton one = new JButton("����");
		JButton two = new JButton("��");
		JButton three = new JButton("���");
		JButton four = new JButton("������");
		JButton five = new JButton("����");
		JButton six = new JButton("���");
 
		p2.add(one);
		p2.add(two);
		p2.add(three);
		p2.add(four);
		p2.add(five);
		p2.add(six);
		
	
		p2.setLayout(new GridLayout(5,7));
		
		one.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("����");
			}
		});
	  
		two.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("��");
			}
		});
	  
		three.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("���");
			}
		});
		four.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("������");
			}
		});
		
		five.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("����");
			}
		});
		
		six.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("���");
			}
		});
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}

	
	
	}



	