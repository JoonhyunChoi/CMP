package 프로젝트;

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
		JFrame mf = new JFrame("상영관");

		mf.setSize(400,300);
		 
		JPanel top = new JPanel();
		JPanel p2 = new JPanel();
		JPanel ctp = new JPanel();
		
		
		//String[] year= {"1","2","3","4","5","6","7","8","9","10","11","12"};
		
		//JComboBox yearList = new JComboBox(year);
		//yearList.setSelectedIndex(0);
		 
		JLabel text1 = new JLabel("상영관");
		JLabel text2 = new JLabel("");
		top.add(text1);
		top.add(text2);
	//	top.add(new JComboBox(year));
		
		
	//	JButton mon = new JButton("월");
	//	top.add(new JButton("월"));
		
		//top.setLayout(new GridLayout(1,1));
		
		JLabel text = new JLabel("상영관이 선택되지 않았습니다.");
		ctp.add(text);
		
		
		
	/*	mon.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("월");
			}
		});
	  */
		
		
		mf.add(top, BorderLayout.PAGE_START);
		mf.add(p2, BorderLayout.CENTER);
		mf.add(ctp, BorderLayout.PAGE_END);
		
		JButton one = new JButton("신촌");
		JButton two = new JButton("명동");
		JButton three = new JButton("상봉");
		JButton four = new JButton("영등포");
		JButton five = new JButton("강남");
		JButton six = new JButton("잠실");
 
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
				text.setText("신촌");
			}
		});
	  
		two.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("명동");
			}
		});
	  
		three.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("상봉");
			}
		});
		four.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("영등포");
			}
		});
		
		five.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("강남");
			}
		});
		
		six.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("잠실");
			}
		});
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}

	
	
	}



	