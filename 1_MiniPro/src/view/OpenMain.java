package view;

import java.awt.Component;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenMain {

	public OpenMain(){
		JFrame mf = new JFrame("======================================혼저옵서예=======================================");
		mf.setSize(1280,850);
		mf.setResizable(false);
		mf.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setSize(1280, 850);
		
		Image pic = new ImageIcon("초기메인.jpg").getImage().getScaledInstance(1280, 850, 0);
		JLabel picLabel = new JLabel(new ImageIcon(pic));
		
		p1.setAlignmentX(Component.CENTER_ALIGNMENT);
		p1.add(picLabel);
		
		
		JButton btn1 = new JButton("회원 입 장");
		btn1.setLocation(320, 550);
		btn1.setSize(150, 80);
		btn1.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
		
		JButton btn2 = new JButton("비 회원 입 장");
		btn2.setLocation(820, 550);
		btn2.setSize(150, 80);
		btn2.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
		
		mf.add(btn1);
		mf.add(btn2);
		mf.add(p1);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		new OpenMain();
		
	}

}
