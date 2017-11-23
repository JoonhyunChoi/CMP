package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MemberView {
	// x축 20 y 축 텍스트 마다 30 차이
	public void Member(){
		// x축 20 y 축 텍스트 마다 30 차이
		
				JPanel mp= new JPanel();
				JPanel panel = new JPanel();
				
				mp.setBounds(700,100,600,500);
				mp.setTitle("회원 가입");
				panel.setLayout(null);
				
				//아이디 라벨
				JLabel idL = new JLabel("아이디 : ");
				idL.setBounds(110, 25, 100, 20);
				idL.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				//아이디 텍스트
				JTextField idT= new JTextField();
				idT.setBounds(190, 25, 140, 30);
				idT.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				panel.add(idL);
				panel.add(idT);
				
				//중복 확인 버튼
				JButton check = new JButton("중복확인");
				check.setBounds(350, 25, 90, 30);
				check.setFont(new Font("SansSerif", Font.PLAIN, 15 ));
				
				panel.add(check);
				
				check.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						// 아이디가 파일에 존재하는지 확인하는 과정 기입
						
					}
					
				});
				
				//비밀번호 입력란
				JLabel pwdL = new JLabel("비밀번호 : ");
				pwdL.setBounds(90, 65, 100, 20);
				pwdL.setFont(new Font("SansSerif", Font.PLAIN, 20));	
				
				//비밀번호 텍스트
				JPasswordField pwdT = new JPasswordField();
				pwdT.setBounds(190, 65,250, 30);
				pwdT.setFont(new Font("SansSerif", Font.PLAIN, 20));		
				panel.add(pwdL);
				panel.add(pwdT);
				
				//비밀 번호 재 입력란
				JLabel repwdL = new JLabel("비밀번호확인 : ");
				repwdL.setBounds(50, 100, 140, 20);
				repwdL.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				//비밀번호 재 입력란 텍스트
				JPasswordField repwdT = new JPasswordField();
				repwdT.setBounds(190, 100, 250, 30);
				repwdT.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				panel.add(repwdL);
				panel.add(repwdT);
				
				
				
				//이름 라벨
				JLabel userNameL = new JLabel("이름 : ");
				userNameL.setBounds(130, 140, 100, 20);
				userNameL.setFont(new Font("SansSerif", Font.PLAIN, 20));	
				
				//이름 텍스트
				JTextField userNameT = new JTextField();
				userNameT.setBounds(190, 140, 120, 30);
				userNameT.setFont(new Font("SansSerif", Font.PLAIN, 20));
						
				panel.add(userNameL);
				panel.add(userNameT);
				
				//성별 선택 라디오 버튼
				JPanel sizePanel = new JPanel();
				
				JRadioButton Male = new JRadioButton("남");
				JRadioButton Female =new JRadioButton("여");
				
				ButtonGroup size = new ButtonGroup();
				
				Male.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						
					}
					
				});
				
				Female.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						
					}
					
					
				});
				
				size.add(Male);
				size.add(Female);
				
				
				sizePanel.add(Male);
				sizePanel.add(Female);
				
				
				sizePanel.setBounds(320,135, 100, 30);
				
				Female.setFont(new Font("SansSerif", Font.PLAIN, 15));
				Male.setFont(new Font("SansSerif", Font.PLAIN, 15));
				
				panel.add(sizePanel);
				
				
				//핸드폰 라벨
				JLabel PhoneL = new JLabel("핸드폰 : ");
				PhoneL.setBounds(110, 190, 100, 20);
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
				PhoneList.setBounds(190, 190, 60, 30);
				
				//헨드폰 텍스트
				JTextField PhoneT = new JTextField();
				PhoneT.setBounds(270, 190, 170, 30);
				PhoneT.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				panel.add(PhoneList);
				
				panel.add(PhoneL);
				panel.add(PhoneT);
				
				//이메일 라벨
				JLabel EmailL = new JLabel("이메일 : ");
				EmailL.setBounds(110, 240, 100, 20);
				EmailL.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				
				
				//이메일 텍스트
				JTextField EmailT = new JTextField();
				EmailT.setBounds(190, 240, 250, 30);
				EmailT.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				panel.add(EmailL);
				panel.add(EmailT);
				
				
				//확인 버튼
				JButton Okay = new JButton("확인");
				Okay.setBounds(50,300,200,50);
				Okay.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				Okay.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
				});
				panel.add(Okay);
				
				mp.add(panel);
				
				//취소 버튼
				JButton Cancle = new JButton("취소");
				Cancle.setBounds(270,300,200,50);
				Cancle.setFont(new Font("SansSerif", Font.PLAIN, 20));
				Cancle.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					}});
				panel.add(Cancle);
				
				mp.add(panel);
				      
				mp.setVisible(true);
	

	}

}