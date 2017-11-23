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
	// x�� 20 y �� �ؽ�Ʈ ���� 30 ����
	public void Member(){
		// x�� 20 y �� �ؽ�Ʈ ���� 30 ����
		
				JPanel mp= new JPanel();
				JPanel panel = new JPanel();
				
				mp.setBounds(700,100,600,500);
				mp.setTitle("ȸ�� ����");
				panel.setLayout(null);
				
				//���̵� ��
				JLabel idL = new JLabel("���̵� : ");
				idL.setBounds(110, 25, 100, 20);
				idL.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				//���̵� �ؽ�Ʈ
				JTextField idT= new JTextField();
				idT.setBounds(190, 25, 140, 30);
				idT.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				panel.add(idL);
				panel.add(idT);
				
				//�ߺ� Ȯ�� ��ư
				JButton check = new JButton("�ߺ�Ȯ��");
				check.setBounds(350, 25, 90, 30);
				check.setFont(new Font("SansSerif", Font.PLAIN, 15 ));
				
				panel.add(check);
				
				check.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						// ���̵� ���Ͽ� �����ϴ��� Ȯ���ϴ� ���� ����
						
					}
					
				});
				
				//��й�ȣ �Է¶�
				JLabel pwdL = new JLabel("��й�ȣ : ");
				pwdL.setBounds(90, 65, 100, 20);
				pwdL.setFont(new Font("SansSerif", Font.PLAIN, 20));	
				
				//��й�ȣ �ؽ�Ʈ
				JPasswordField pwdT = new JPasswordField();
				pwdT.setBounds(190, 65,250, 30);
				pwdT.setFont(new Font("SansSerif", Font.PLAIN, 20));		
				panel.add(pwdL);
				panel.add(pwdT);
				
				//��� ��ȣ �� �Է¶�
				JLabel repwdL = new JLabel("��й�ȣȮ�� : ");
				repwdL.setBounds(50, 100, 140, 20);
				repwdL.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				//��й�ȣ �� �Է¶� �ؽ�Ʈ
				JPasswordField repwdT = new JPasswordField();
				repwdT.setBounds(190, 100, 250, 30);
				repwdT.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				panel.add(repwdL);
				panel.add(repwdT);
				
				
				
				//�̸� ��
				JLabel userNameL = new JLabel("�̸� : ");
				userNameL.setBounds(130, 140, 100, 20);
				userNameL.setFont(new Font("SansSerif", Font.PLAIN, 20));	
				
				//�̸� �ؽ�Ʈ
				JTextField userNameT = new JTextField();
				userNameT.setBounds(190, 140, 120, 30);
				userNameT.setFont(new Font("SansSerif", Font.PLAIN, 20));
						
				panel.add(userNameL);
				panel.add(userNameT);
				
				//���� ���� ���� ��ư
				JPanel sizePanel = new JPanel();
				
				JRadioButton Male = new JRadioButton("��");
				JRadioButton Female =new JRadioButton("��");
				
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
				
				
				//�ڵ��� ��
				JLabel PhoneL = new JLabel("�ڵ��� : ");
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
				
				//����� �ؽ�Ʈ
				JTextField PhoneT = new JTextField();
				PhoneT.setBounds(270, 190, 170, 30);
				PhoneT.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				panel.add(PhoneList);
				
				panel.add(PhoneL);
				panel.add(PhoneT);
				
				//�̸��� ��
				JLabel EmailL = new JLabel("�̸��� : ");
				EmailL.setBounds(110, 240, 100, 20);
				EmailL.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				
				
				//�̸��� �ؽ�Ʈ
				JTextField EmailT = new JTextField();
				EmailT.setBounds(190, 240, 250, 30);
				EmailT.setFont(new Font("SansSerif", Font.PLAIN, 20));
				
				panel.add(EmailL);
				panel.add(EmailT);
				
				
				//Ȯ�� ��ư
				JButton Okay = new JButton("Ȯ��");
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
				
				//��� ��ư
				JButton Cancle = new JButton("���");
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