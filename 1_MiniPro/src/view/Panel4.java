package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel4 extends JPanel{
 
	public Panel4() {
		 this.add(new Label("历胶萍胶铰沥 |15技捞惑 |傍惑苞切,SF|醚120籍"));
		 this.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
		 this.setSize(820, 100);
		 this.setLocation(20, 600);
	       
		 this.setLayout(new FlowLayout(FlowLayout.TRAILING));
	       

	      JButton button1=new JButton("1包 | 09:00");
	      button1.setBackground(Color.GRAY);
	       
	    	  button1.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button1.getBackground() ==Color.GRAY){
	    		    	  button1.setBackground(Color.RED);
	    		  }else if(button1.getBackground() == Color.red) {
	    			  button1.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	     
	      this.add(button1); 
	     
	      
	      
	      
	      JButton button2=new JButton("2包 | 10:00");
	      button2.setBackground(Color.GRAY);
	       
	    	  button2.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button2.getBackground() ==Color.GRAY){
	    		    	  button2.setBackground(Color.RED);
	    		  }else if(button2.getBackground() == Color.red) {
	    			  button2.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button2); 
	      
	      JButton button3=new JButton("1包 | 11:00");
	      button3.setBackground(Color.GRAY);
	       
	    	  button3.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button3.getBackground() ==Color.GRAY){
	    		    	  button3.setBackground(Color.RED);
	    		  }else if(button3.getBackground() == Color.red) {
	    			  button3.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button3); 
	      
	      JButton button4=new JButton("2包 | 12:00");
	      button4.setBackground(Color.GRAY);
	       
	    	  button4.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button4.getBackground() ==Color.GRAY){
	    		    	  button4.setBackground(Color.RED);
	    		  }else if(button4.getBackground() == Color.red) {
	    			  button4.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button4); 
	      
	      JButton button5=new JButton("1包 | 13:00");
	      button5.setBackground(Color.GRAY);
	       
	    	  button5.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button5.getBackground() ==Color.GRAY){
	    		    	  button5.setBackground(Color.RED);
	    		  }else if(button5.getBackground() == Color.red) {
	    			  button5.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button5); 
	       
	      JButton button6=new JButton("2包 | 14:00");
	      button6.setBackground(Color.GRAY);
	       
	    	  button6.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button6.getBackground() ==Color.GRAY){
	    		    	  button6.setBackground(Color.RED);
	    		  }else if(button6.getBackground() == Color.red) {
	    			  button6.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button6); 
	       
	      JButton button7=new JButton("1包 | 15:00");
	      button7.setBackground(Color.GRAY);
	       
	    	  button7.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button7.getBackground() ==Color.GRAY){
	    		    	  button7.setBackground(Color.RED);
	    		  }else if(button7.getBackground() == Color.red) {
	    			  button7.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button7); 
	       
	      JButton button8=new JButton("2包 | 16:00");
	      button8.setBackground(Color.GRAY);
	       
	    	  button8.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button8.getBackground() ==Color.GRAY){
	    		    	  button8.setBackground(Color.RED);
	    		  }else if(button8.getBackground() == Color.red) {
	    			  button8.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button8); 
	      
	      JButton button9=new JButton("1包 | 17:00");
	      button9.setBackground(Color.GRAY);
	       
	    	  button9.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button9.getBackground() ==Color.GRAY){
	    		    	  button9.setBackground(Color.RED);
	    		  }else if(button9.getBackground() == Color.red) {
	    			  button9.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button9); 
	        
	      JButton button10=new JButton("2包 | 18:00");
	      button10.setBackground(Color.GRAY);
	       
	    	  button10.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button10.getBackground() ==Color.GRAY){
	    		    	  button10.setBackground(Color.RED);
	    		  }else if(button10.getBackground() == Color.red) {
	    			  button10.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button10); 
	      
	      JButton button11=new JButton("1包 | 19:00");
	      button11.setBackground(Color.GRAY);
	       
	    	  button11.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button11.getBackground() ==Color.GRAY){
	    		    	  button11.setBackground(Color.RED);
	    		  }else if(button11.getBackground() == Color.red) {
	    			  button11.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button11);  
	       
	      JButton button12=new JButton("2包 | 20:00");
	      button12.setBackground(Color.GRAY);
	       
	    	  button12.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button12.getBackground() ==Color.GRAY){
	    		    	  button12.setBackground(Color.RED);
	    		  }else if(button12.getBackground() == Color.red) {
	    			  button12.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button12);  
	       
	      JButton button13=new JButton("1包 | 21:00");
	      button13.setBackground(Color.GRAY);
	       
	    	  button13.addMouseListener(new MouseAdapter(){
	    		  @Override
	    		  public void mouseClicked(MouseEvent e) {
	    			  if(button13.getBackground() ==Color.GRAY){
	    		    	  button13.setBackground(Color.RED);
	    		  }else if(button13.getBackground() == Color.red) {
	    			  button13.setBackground(Color.gray);
	    		  }
	    	  }
	    	  });
	      
	      this.add(button13);  
		 
		 JTextField text=new JTextField("惑康包捞 急琶登瘤 臼疽嚼聪促.");  

		// 捞亥飘 畴啊促    
		      button1.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						text.setText("1包 | 09:00");
					}
				});
		  
		      this.add(text);
		      
		      button2.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						text.setText("2包 | 10:00");
					}
				});

		    this.add(text);
		    
		    button3.addActionListener(new ActionListener(){
		 			@Override
		 			public void actionPerformed(ActionEvent e) {
		 				text.setText("1包 | 11:00");
		 			}
		 		});

		     this.add(text);
		     
		     button4.addActionListener(new ActionListener(){
		  			@Override
		  			public void actionPerformed(ActionEvent e) {
		  				text.setText("2包 | 12:00");
		  			}
		  		});

		      this.add(text);
		      
		      button5.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						text.setText("1包 | 13:00");
					}
				});

		    this.add(text);
		    
		    button6.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						text.setText("2包 | 14:00");
					}
				});

		    this.add(text);
		    
		    button7.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					text.setText("1包 | 15:00");
				}
			});

		this.add(text);
		      
		button8.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					text.setText("2包 | 16:00");
				}
			});

		this.add(text);


		button9.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("1包 | 17:00");
			}
		});

		this.add(text);

		button10.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("2包 | 18:00");
			}
		});

		this.add(text);

		button11.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("1包 | 19:00");
			}
		});

		this.add(text);
		       
		button12.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("2包 | 20:00");
			}
		});

		this.add(text);
		       
		button13.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("1包 | 21:00");
			}
		});

		this.add(text);
		
		
	}
	}
	