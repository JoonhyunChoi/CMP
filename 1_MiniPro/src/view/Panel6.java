package 프로젝트;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel6 extends JPanel{
	String[] theater= {"신촌", "명동", "상봉", "영등포", "강남", "신도림"};
	JComboBox<String> combo;
    JLabel msg;
    
    String[] calendar= {"1201", "1202", "1203", "1204", "1205", "1206"};
	JComboBox<String> combo2;
    JLabel msg2;
    
    
    
	public Panel6() {
		      this.add(new Label("날짜 및 상영관 선택"));
		      this.add(new Label("   "));
		      this.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
		      this.setSize(810, 100);
		      this.setLocation(20, 200);
		      this.setLayout(new FlowLayout(FlowLayout.LEFT));
		      
		      
		      //// 영화관
		      combo = new JComboBox<String>(theater);
		      msg= new JLabel("  ");
		      
		      add(combo, BorderLayout.NORTH);
		      add(msg, BorderLayout.CENTER);
		      
		      combo.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String th1 = combo.getSelectedItem().toString();
				    msg.setText(th1);
				 }
		      });
		      
		      this.add(new Label("   "));
		      
		      
		      /// 달력
		      combo2 = new JComboBox<String>(calendar);
		      msg2= new JLabel("  ");
		      
		      add(combo2, BorderLayout.NORTH);
		      add(msg2, BorderLayout.CENTER);
		      
		      combo2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String th2 = combo2.getSelectedItem().toString();
				    msg2.setText(th2);
				 }
		      });
		    
		      this.add(new Label("   "));
		 
		      this.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
		    
		      this.setSize(810, 100);
		      this.setLocation(40, 200);
		      this.setLayout(new FlowLayout(FlowLayout.LEFT));
		      
		      this.add(new Label("       "));
		      
	}
}
	