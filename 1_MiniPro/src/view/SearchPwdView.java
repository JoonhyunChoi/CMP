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

public class SearchPwdView {
	public void SearchPwd(){
		JFrame mf = new JFrame();
		JPanel panel = new JPanel();
		
	
		mf.setBounds(700, 700,600,250);
		mf.setTitle("��� ��ȣ ã��");
		panel.setLayout(null);
		//���̵� ��
		JLabel UserIdL = new JLabel("���̵� : ");
		UserIdL.setBounds(100, 25, 100, 20);
		UserIdL.setFont(new Font("SansSerif", Font.PLAIN, 20));
		
		//���̵� �ؽ�Ʈ
		JTextField UserIdT = new JTextField();
		UserIdT.setBounds(190, 25, 180, 30);
		UserIdT.setFont(new Font("SansSerif", Font.PLAIN, 20));
		//190, 25, 180, 30
		
		panel.add(UserIdL);
		panel.add(UserIdT);
		
		//�̸� ��
		JLabel UserNameL = new JLabel("�̸� : ");
		UserNameL.setBounds(120, 65, 100, 20);
		UserNameL.setFont(new Font("SansSerif", Font.PLAIN, 20));
				//90, 65, 100, 20
		//�̸� �ؽ�Ʈ
		JTextField UserNameT= new JTextField();
		UserNameT.setBounds(190, 65, 180, 30);
		UserNameT.setFont(new Font("SansSerif", Font.PLAIN, 20));
				//190, 65, 180, 30
		panel.add(UserNameL);
		panel.add(UserNameT);
				
				
				
		//����� �Է¶�
		JLabel PhoneL = new JLabel("����� : ");
		PhoneL.setBounds(100, 105, 160, 20);
		PhoneL.setFont(new Font("SansSerif", Font.PLAIN, 20));	
			
		//����� �ؽ�Ʈ
		JPasswordField PhoneT = new JPasswordField();
		PhoneT.setBounds(190, 105, 180, 30);
		PhoneT.setFont(new Font("SansSerif", Font.PLAIN, 20));		
		panel.add(PhoneL);
		panel.add(PhoneT);
				
		
		//���� ��ư
		JButton check = new JButton("����");
		check.setBounds(400, 25, 120, 110);
		panel.add(check);
				
		check.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		
				
		mf.add(panel);
				
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
