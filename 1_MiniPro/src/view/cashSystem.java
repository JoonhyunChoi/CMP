package �������ý���;

import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.channels.ShutdownChannelGroupException;

import javax.naming.LimitExceededException;
import javax.security.auth.callback.ConfirmationCallback;
import javax.security.auth.callback.LanguageCallback;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class cashSystem {

	int Point;
	int Price;

	public cashSystem() {

		JFrame mf = new JFrame("=============���������ý���===============");

		mf.setSize(650, 650);
		mf.setLayout(null);

		// �ݾ� ���ö�

		ButtonGroup moneyChoice = new ButtonGroup();
		JLabel payLabel;
		PayButton[] buttons = new PayButton[7]; // ��ư �迭 ����

		buttons[0] = new PayButton(32000, 30000); // int ������ buttons �־���
		buttons[1] = new PayButton(42000, 40000);
		buttons[2] = new PayButton(52000, 50000);
		buttons[3] = new PayButton(62000, 60000);
		buttons[4] = new PayButton(72000, 70000);
		buttons[5] = new PayButton(82000, 80000);
		buttons[6] = new PayButton(92000, 90000);

		for (int i = 0; i < buttons.length; i++) {

			buttons[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent arg0) {
					for (int i = 0; i < buttons.length; i++) {
						if (buttons[i].isSelected()) {
							Point = buttons[i].getPoint(); // ���������� ����Ʈ���� Point��
															// �־��ش�.
						}
					}

				}
			});
			moneyChoice.add(buttons[i]);
		}
		JPanel checkPanel = new JPanel();
		for (int i = 0; i < buttons.length; i++) {
			checkPanel.add(buttons[i]);
			checkPanel.add(payLabel = new JLabel(buttons[i].getPrice() + " ��-" + buttons[i].getPoint() + " P")); // üũ�ڽ�
																													// ����
																													// ��¹���
		}
		checkPanel.setBounds(10, 20, 150, 200);

		// ���� ����

		JPanel bank = new JPanel();
		String[] animals = { "��������", "��������", "��ȣ����", "��������", "��������", "�ؿ�����" };
		JComboBox animalList = new JComboBox(animals);
		animalList.setSelectedIndex(0);
		bank.add(new Label("���� ���� : "));
		bank.setFont(new Font(Font.DIALOG, Font.BOLD, 15));
		bank.add(animalList);
		bank.setBounds(40, 240, 200, 150);

		// ī���ȣ �Է� ��
		JPanel cardPanel = new JPanel();
		JTextField card1 = new JTextField(5);
		JTextField card2 = new JTextField(5);
		JTextField card3 = new JTextField(5);
		JTextField card4 = new JTextField(5);

		cardPanel.add(new Label("ī���ȣ :"));
		cardPanel.add(card1);
		cardPanel.add(card2);
		cardPanel.add(card3);
		cardPanel.add(card4);

		// ī���Է¶� �ڵ����� ���� �Է¶����� �Ѿ�� �����
		card1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (card1.getText().length() >= 3) {
					card2.requestFocus();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		card2.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (card2.getText().length() >= 3) {
					card3.requestFocus();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		card3.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				if (card3.getText().length() >= 3) {
					card4.requestFocus();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		cardPanel.setFont(new Font(Font.DIALOG, Font.BOLD, 15));
		cardPanel.setBounds(17, 320, 350, 70);

		// ī��߱� ��, �⵵, cvc��ȣ �Է�
		JPanel cardMonth = new JPanel();
		JPanel cardYear = new JPanel();
		JPanel cardCvc = new JPanel();

		JTextField cardM = new JTextField(4);
		JTextField cardY = new JTextField(4);
		JTextField cardC = new JTextField(4);

		cardMonth.add(new Label("ī����ȿ�Ⱓ ��(MM) :"));
		cardMonth.add(cardM);
		cardMonth.setFont(new Font(Font.DIALOG, Font.BOLD, 11));
		cardMonth.setSize(270, 90);
		cardMonth.setLocation(10, 400);

		cardYear.add(new Label("�⵵(YYYY) :"));
		cardYear.add(cardY);
		cardYear.setFont(new Font(Font.DIALOG, Font.BOLD, 11));
		cardYear.setSize(270, 90);
		cardYear.setLocation(210, 400);

		cardCvc.add(new Label("CVC :"));
		cardCvc.add(cardC);
		cardCvc.setFont(new Font(Font.DIALOG, Font.BOLD, 11));
		cardCvc.setSize(270, 80);
		cardCvc.setLocation(400, 400);

		// ������ư
		JButton ok = new JButton("�� ��");
		ok.setBounds(470, 500, 90, 50);
		ok.setFont(new Font(Font.DIALOG, Font.BOLD, 15));

		// ���� �Ϸ� ��Ʈ
		JLabel charge = new JLabel();
		charge.setBounds(250, 500, 300, 30);

		// ĳ�� �ܾ� ǥ��
		JPanel cashView = new JPanel();
		JTextField result = new JTextField(15);

		cashView.add(new JLabel("ĳ���ܾ� : "));
		result.setEditable(false);
		cashView.add(result);
		cashView.setBounds(400, 50, 200, 100);


		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == ok) {

					 int confirm = JOptionPane.showConfirmDialog(null,"���ݾ��� ���� �Ͻðڽ��ϱ�?","��¥ ����?", JOptionPane.YES_NO_OPTION);
					
					if (confirm == JOptionPane.YES_OPTION) {
						charge.setText(Point + "P ���� �Ǿ����ϴ�.");
						result.setText(Point + " ����Ʈ");
						System.out.println(Point);
					} else if (confirm == JOptionPane.NO_OPTION) {
						
					}
				}
			}
		});

		mf.add(cardPanel);
		mf.add(checkPanel);
		mf.add(bank);
		mf.add(cardMonth);
		mf.add(cardYear);
		mf.add(cardCvc);
		mf.add(ok);
		mf.add(charge);
		mf.add(cashView);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new cashSystem();

	}

}