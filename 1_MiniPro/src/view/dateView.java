package ������Ʈ;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSpinner;
import javax.swing.KeyStroke;
import javax.swing.SpinnerDateModel;

public class dateView extends JFrame implements ActionListener, ItemListener {

	private JMenuBar menuBar;
	 private JMenu menu, submenu;
	 private JMenuItem menuItem1, menuItem2;
	 private JMenuItem sbMenuItem1, sbMenuItem2;
	 private JRadioButtonMenuItem rbMenuItem1, rbMenuItem2;
	 private JCheckBoxMenuItem cbMenuItem1, cbMenuItem2;
	
 public dateView() {
 
	 
	 menuBar = new JMenuBar();
	 
	  // ù��° �Ŵ��� ����
	  menu = new JMenu("��¥");
	  menu.setMnemonic(KeyEvent.VK_1);
	  menuBar.add(menu);	 
	 
	// �޴� �׸���� ����
	  /* menuItem1 = new JMenuItem("�޴� �׸� 1", KeyEvent.VK_1);
	   menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,
	   ActionEvent.ALT_MASK));
	   menuItem1.addActionListener(this);
	   menu.add(menuItem1);
	  
	   ImageIcon icon = new ImageIcon("icon.gif");
	   menuItem2 = new JMenuItem("�޴� �׸� 2", icon);
	   menu.add(menuItem2);
	  */
	  
	 
 setTitle("��¥ ����");
 setSize(500,100);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 JPanel panel = new JPanel();
 JSpinner spinner;
 
 // Date Model �׽�Ʈ
 Calendar calendar = Calendar.getInstance();
 Date value = calendar.getTime(); // ���� ��¥
 calendar.add(Calendar.YEAR, -50); // ���簪���� -50�� ����
 Date start = calendar.getTime();
 calendar.add(Calendar.YEAR, 100); // ���� +50�ϸ� ���� ��¥�� ��
 Date end = calendar.getTime();
 
 SpinnerDateModel dateModel =
		  new SpinnerDateModel(value, start, end, Calendar.YEAR);
		  spinner = new JSpinner(dateModel);
		  // ��¥�� ������ �� �ִ� �����⸦ �����Ѵ�.
		  spinner.setEditor(new JSpinner.DateEditor(spinner, "yyyy/MM/dd"));
		  panel.add(spinner);
		  panel.add(menu);
		  add(panel);
		  
		  
		  
		  setVisible(true);
		  }
		 
		  public static void main(String[] args) {
		  new dateView();
		  }

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		  }