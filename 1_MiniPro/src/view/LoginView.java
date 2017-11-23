package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView {
	public void login(){
		

		JPanel mp = new JPanel();
		JPanel panel = new JPanel();
		
		//mp.setSize(400, 200);
		mp.setBounds(700, 400,400,200);
		mp.setTitle("회원 로그인");
		panel.setLayout(null);
		//아이디 라벨
		JLabel IdL = new JLabel("아이디 : ");
		IdL.setBounds(30, 25, 100, 20);
		IdL.setFont(new Font("SansSerif", Font.PLAIN, 20));
		//아이디 텍스트
		JTextField IdT = new JTextField();
		IdT.setBounds(85, 25, 120, 20);
		
		panel.add(IdL);
		panel.add(IdT);
		
		//비밀번호 라벨
		JLabel pwdL = new JLabel("비밀번호 : ");
		pwdL.setBounds(20, 45, 100, 20);
		
		//비밀번호 텍스트
		JPasswordField pwdT = new JPasswordField();
		pwdT.setBounds(85, 45, 120, 20);
		
		
		panel.add(pwdL);
		panel.add(pwdT);
		
		//로그인 버튼
		JButton login = new JButton("로그인");
		login.setBounds(220, 20, 90, 50);
		
		panel.add(login);
		
		login.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String text = " id = " + IdT.getText() + "\n"
						+"password = " + pwdT.getText();
				
				char[] pass = pwdT.getPassword();
				
				for(int i =0; i<pass.length; i++){
					System.out.println(pass[i]);
				}
			}
			
		});
		
		
		//회원가입
		JButton mem = new JButton("회원가입");
		mem.setBounds(20, 75, 90, 30);
		
		panel.add(mem);
		
		mem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		
		//ID 찾기
		JButton Ids = new JButton("ID찾기");
		Ids.setBounds(120, 75, 80, 30);
		
		panel.add(Ids);
		
		Ids.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		
		//패스워드 찾기
		JButton Pws = new JButton("PWD찾기");
		Pws.setBounds(210, 75, 90, 30);
		
		
		panel.add(Pws);
		
		Pws.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		
		mp.add(panel);
		
	
		mp.setVisible(true);
	}
	
	
	//비회원 로그인
	public void NotMLogin(){
		JFrame mp = new JFrame();
		JPanel panel = new JPanel();
		
		//mp.setSize(400, 200);
		mp.setBounds(700, 400,500,250);
		mp.setTitle("비회원 로그인");
		panel.setLayout(null);
		
		//ID
		JLabel idL = new JLabel("아이디 : ");
		idL.setBounds(40, 25, 100, 20);
		idL.setFont(new Font("SansSerif", Font.PLAIN, 20));
		
		//ID Text
		JTextField idT = new JTextField();
		idT.setBounds(115, 25, 215, 30);
		idT.setFont(new Font("SansSerif", Font.PLAIN, 20));
		
		panel.add(idL);
		panel.add(idT);
		
		//PassWord L
		JLabel pwdL = new JLabel("비밀번호 : ");
		pwdL.setBounds(20, 60, 100, 20);
		pwdL.setFont(new Font("SansSerif", Font.PLAIN, 20));
		
		//Password T
		JPasswordField pwdT = new JPasswordField();
		pwdT.setBounds(115, 60, 215, 30);
		pwdT.setFont(new Font("SansSerif", Font.PLAIN, 20));
		
		panel.add(pwdL);
		panel.add(pwdT);
		
		//phone L
		JLabel PhoneL = new JLabel("헨드폰 : ");
		PhoneL.setBounds(40, 100, 100, 20);
		PhoneL.setFont(new Font("SansSerif", Font.PLAIN, 20));
		
		String[] Phone = {"010", "011", "016", "018"};
		JComboBox PhoneList = new JComboBox(Phone);
		PhoneList.setSelectedIndex(0);
		
		JLabel label = new JLabel();
		
		PhoneList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JComboBox cb =(JComboBox) e.getSource();
				String name = (String) cb.getSelectedItem();
				
				
			}
		});
		PhoneList.setFont(new Font("SansSerif", Font.PLAIN, 20));
		PhoneList.setBounds(120, 100, 60, 30);
		
		panel.add(PhoneList);
		//Phone T
		JTextField PhoneT= new JTextField();
		PhoneT.setBounds(190, 100, 140, 30);
		PhoneT.setFont(new Font("SansSerif", Font.PLAIN, 20));
		panel.add(PhoneT);
		panel.add(PhoneL);
		
		//login button
		JButton login = new JButton("로그인");
		login.setBounds(340, 20, 120, 120);
		login.setFont(new Font("SansSerif", Font.PLAIN, 20));
		
		panel.add(login);
		
		login.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String text = " id = " + idT.getText() + "\n"
						+"password = " + pwdT.getText();
				
				char[] pass = pwdT.getPassword();
				
				for(int i =0; i<pass.length; i++){
					System.out.println(pass[i]);
				}
			}
			
		});
		

		mp.add(panel);
		
		mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mp.setVisible(true);
	}
}
