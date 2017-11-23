package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SearchIdView {
	public void SearchId(){
		JPanel mp = new JPanel();
		
		JPanel panel = new JPanel();
		
	
		mp.setBounds(700, 400,600,200);
		mp.setTitle("아이디 찾기");
		panel.setLayout(null);
		
		//이름 라벨
		JLabel UserNameL = new JLabel("이름 : ");
		UserNameL.setBounds(110, 25, 100, 20);
		UserNameL.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
		//이름 텍스트
		JTextField UserNameT= new JTextField();
		UserNameT.setBounds(190, 25, 180, 30);
		UserNameT.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
		panel.add(UserNameL);
		panel.add(UserNameT);
				
				
				
		//헨드폰 입력란
		JLabel PhoneL = new JLabel("헨드폰 : ");
		PhoneL.setBounds(90, 65, 100, 20);
		PhoneL.setFont(new Font("SansSerif", Font.PLAIN, 20));	
				
		//헨드폰 텍스트
		JPasswordField PhoneT = new JPasswordField();
		PhoneT.setBounds(190, 65, 180, 30);
		PhoneT.setFont(new Font("SansSerif", Font.PLAIN, 20));		
		panel.add(PhoneL);
		panel.add(PhoneT);
				
		
		//인증 버튼
		JButton check = new JButton("인증");
		check.setBounds(400, 25, 120, 80);
		panel.add(check);
				
		check.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		// 아이디 찾기 라벨
		//아이디 출력 TextFieldTest 에서 제곱 값을 나타내듯이 나타내주도록한다.
		JLabel resultIdL = new JLabel("사용자 아이디: ");
		resultIdL.setBounds(40, 105, 160, 20);
		resultIdL.setFont(new Font("SansSerif", Font.PLAIN, 20));
		panel.add(resultIdL);
		
		//아이디 출력 텍스트 
		JTextField resultIdT = new JTextField();
		
		resultIdT.setBounds(190, 105, 180, 30);
		resultIdT.setFont(new Font("SansSerif", Font.PLAIN, 20));
		resultIdT.setEditable(false);
		panel.add(resultIdT);
		
				
		mp.add(panel);
				
		mp.setVisible(true);
		mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	}
}
