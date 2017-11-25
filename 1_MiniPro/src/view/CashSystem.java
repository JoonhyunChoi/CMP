package view;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.security.auth.callback.LanguageCallback;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.dto.PayButton;

public class CashSystem {

	int Point;
	int Price;
	
	public CashSystem(){
		
		JFrame mf = new JFrame("=============정액충전시스템===============");
		
		mf.setSize(650, 650);
		mf.setLayout(null);
		
		//금액 선택란
		/*String[] money = {"30,000원- 32000P", "50,000원- 52000P", "70,000원- 72000P", "90,000원- 92000P"};*/
		ButtonGroup moneyChoice = new ButtonGroup(); 
		JLabel payLabel;
		PayButton[] buttons = new PayButton[7]; //버튼 배열 생성
		
		buttons[0] = new PayButton(32000, 30000); //int 값으로 buttons 넣어줌
		buttons[1] = new PayButton(42000, 40000);
		buttons[2] = new PayButton(52000, 50000);
		buttons[3] = new PayButton(62000, 60000);
		buttons[4] = new PayButton(72000, 70000);
		buttons[5] = new PayButton(82000, 80000);
		buttons[6] = new PayButton(92000, 90000);
		
		for (int i = 0; i < buttons.length; i++) {
			//buttons[i] = new JCheckBox(money[i]);
			buttons[i].addItemListener(new ItemListener() { 
				
				@Override
				public void itemStateChanged(ItemEvent arg0) {
					for (int i = 0; i < buttons.length; i++) {
						if(buttons[i].isSelected()){
							Point = buttons[i].getPoint(); //선택했을때 포인트값을 Point에 넣어준다.
						}
					}
					
				}
			});
			moneyChoice.add(buttons[i]);
		}
		JPanel checkPanel = new JPanel();
		for (int i = 0; i < buttons.length; i++) {
			checkPanel.add(buttons[i]);
			checkPanel.add(payLabel = new JLabel(buttons[i].getPrice() + " 원-" + buttons[i].getPoint() + " P")); //체크박스 제목 출력문구
		}
		checkPanel.setSize(150, 200);
		checkPanel.setLocation(10, 20);
		
		//기타 선택란
		/*JTextField text = new JTextField(15);
		JCheckBox gitar = new JCheckBox("기타금액");
		JPanel gitar1 = new JPanel();
		gitar1.add(gitar);
		gitar1.add(text);
		gitar1.setSize(260, 90);
		gitar1.setLocation(17, 150);*/
		
		//은행 선택
		
		JPanel bank = new JPanel();
		String[] animals = {"승정은행", "준현은행", "정호은행", "종복은행", "훈택은행", "준용은행"};
		JComboBox animalList = new JComboBox(animals);
		animalList.setSelectedIndex(0);
		bank.add(new Label("은행 선택 : "));
		bank.setFont(new Font(Font.DIALOG, Font.BOLD, 15));
		bank.add(animalList);
		bank.setSize(200, 150);
		bank.setLocation(40, 240);
		
		//카드번호 입력 란
		JPanel cardPanel = new JPanel();
		JTextField card1 = new JTextField(5);
		JTextField card2 = new JTextField(5);
		JTextField card3 = new JTextField(5);
		JTextField card4 = new JTextField(5);
		
		cardPanel.add(new Label("카드번호 :"));
		cardPanel.add(card1);
		cardPanel.add(card2);
		cardPanel.add(card3);
		cardPanel.add(card4);
		
		//카드입력란 자동으로 다음 입력란으로 넘어가게 만든거
		card1.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				if(card1.getText().length() >=3){
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
				if(card2.getText().length() >=3){
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
				if(card3.getText().length() >=3){
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
		cardPanel.setSize(350, 70);
		cardPanel.setLocation(17, 320);
		
		//카드발급  월, 년도, cvc번호 입력
		JPanel cardMonth = new JPanel();
		JPanel cardYear = new JPanel();
		JPanel cardCvc = new JPanel();
		
		JTextField cardM = new JTextField(4);
		JTextField cardY = new JTextField(4);
		JTextField cardC = new JTextField(4);
		
		cardMonth.add(new Label("카드유효기간 월(MM) :"));
		cardMonth.add(cardM);
		cardMonth.setFont(new Font(Font.DIALOG, Font.BOLD, 11));
		cardMonth.setSize(270, 90);
		cardMonth.setLocation(10, 400);
	
		cardYear.add(new Label("년도(YYYY) :"));
		cardYear.add(cardY);
		cardYear.setFont(new Font(Font.DIALOG, Font.BOLD, 11));
		cardYear.setSize(270, 90);
		cardYear.setLocation(210, 400);
		
		cardCvc.add(new Label("CVC :"));
		cardCvc.add(cardC);
		cardCvc.setFont(new Font(Font.DIALOG, Font.BOLD, 11));
		cardCvc.setSize(270, 80);
		cardCvc.setLocation(400, 400);
		
		//결제버튼
		JButton ok = new JButton("결 제");
		ok.setLocation(470, 500);
		ok.setSize(90, 50);
		ok.setFont(new Font(Font.DIALOG, Font.BOLD, 15));
		
		//충전 완료 멘트
		JLabel charge = new JLabel();
		charge.setSize(300, 30);
		charge.setLocation(250, 500);
		
		
		ok.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == ok){
					charge.setText(Point + "P 충전 되었습니다.");
				}
			}
			
		});
		
		
		
		mf.add(cardPanel);
		/*mf.add(gitar1);*/
		mf.add(checkPanel);
		mf.add(bank);
		mf.add(cardMonth);
		mf.add(cardYear);
		mf.add(cardCvc);
		mf.add(ok);
		mf.add(charge);
		
		
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		
		new CashSystem();
		
	}

}
