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
		mp.setTitle("���̵� ã��");
		panel.setLayout(null);
		
		//�̸� ��
		JLabel UserNameL = new JLabel("�̸� : ");
		UserNameL.setBounds(110, 25, 100, 20);
		UserNameL.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
		//�̸� �ؽ�Ʈ
		JTextField UserNameT= new JTextField();
		UserNameT.setBounds(190, 25, 180, 30);
		UserNameT.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
		panel.add(UserNameL);
		panel.add(UserNameT);
				
				
				
		//����� �Է¶�
		JLabel PhoneL = new JLabel("����� : ");
		PhoneL.setBounds(90, 65, 100, 20);
		PhoneL.setFont(new Font("SansSerif", Font.PLAIN, 20));	
				
		//����� �ؽ�Ʈ
		JPasswordField PhoneT = new JPasswordField();
		PhoneT.setBounds(190, 65, 180, 30);
		PhoneT.setFont(new Font("SansSerif", Font.PLAIN, 20));		
		panel.add(PhoneL);
		panel.add(PhoneT);
				
		
		//���� ��ư
		JButton check = new JButton("����");
		check.setBounds(400, 25, 120, 80);
		panel.add(check);
				
		check.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		// ���̵� ã�� ��
		//���̵� ��� TextFieldTest ���� ���� ���� ��Ÿ������ ��Ÿ���ֵ����Ѵ�.
		JLabel resultIdL = new JLabel("����� ���̵�: ");
		resultIdL.setBounds(40, 105, 160, 20);
		resultIdL.setFont(new Font("SansSerif", Font.PLAIN, 20));
		panel.add(resultIdL);
		
		//���̵� ��� �ؽ�Ʈ 
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
