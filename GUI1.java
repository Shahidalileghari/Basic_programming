import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI1 extends  JFrame implements ActionListener{
	
	JButton set,set1,set2;
	JLabel label,labl,top;
	JTextField field,field2;
	
                  public GUI1() {
                	  //start
					setLayout(null);
					
					top=new JLabel("LOGIN FORM");
					top.setBounds(100,10,240,30);
					 top.setFont(new Font("tahomo",Font.BOLD,24));
					top.setForeground(Color.gray);
					add(top);
                	  
                	  set=new JButton("Set");
                	  set.setBounds(20,170,80,40);
                	  set.setBorder(BorderFactory.createLineBorder(Color.black));
                	  set.setBackground(Color.green);
                	  set.setFont(new Font("tahomo",Font.BOLD,24));
                	  add(set);
                	  set.addActionListener(this);
                	  
                	  set1=new JButton("back");
                	  set1.setBounds(110,170,80,40);
                	  set1.setBorder(BorderFactory.createLineBorder(Color.black));
                	  set1.setBackground(Color.green);
                	  set1.setFont(new Font("tahomo",Font.BOLD,24));
                	  add(set1);
                	  set1.addActionListener(this);
                	  
                	  set2=new JButton("cancel");
                	  set2.setBounds(200,170,80,40);
                	  set2.setForeground(Color.black);
                	  set2.setBorder(BorderFactory.createLineBorder(Color.black));
                	  set2.setFont(new Font("tahomo",Font.BOLD,24));
                	  set2.setBackground(Color.green);
                	  add(set2);
                	  set2.addActionListener(this);
                	  
                	  label=new JLabel("Name");
                	  
                	  label.setBounds(20,70,80,20);
                	  label.setFont(new Font("tahomo",Font.BOLD,18));
                	  label.setForeground(Color.blue);
                	  add(label);
                	  
                    labl=new JLabel("Caste");
                    labl.setBounds(20,110,80,20);
                	 labl.setFont(new Font("tahomo",Font.BOLD,18));
                	 labl.setForeground(Color.blue);
                	  add(labl);
                	  
                	  
                	  field =new JTextField();
                	  
                	  field.setBounds(100,70,180,30);
                	   add(field);
                	  
                	   field2 =new JTextField();
                 	  
                 	  field2.setBounds(100,110,180,30);
                 	   add(field2);
                 	   // end
                 	 
                 	
                 	
                 	
                 	
                	  setTitle("First GUI");
                	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                	  setSize(340,300);
                	  setLocation(200,180);
                	  setVisible(true);
                	 
                	  
				}
                  
                  public void actionPerformed(ActionEvent ad)
                  {
                	  if(ad.getSource()==set)
                	  {
                		  field.setText(null);
                		  field2.setText(null);
                	  }
                	  
                	  if(ad.getSource()==set1)
                	  {
                		  //new class will be included
                	  }
                	  
                	  if(ad.getSource()==set2)
                	  {
                		 setVisible(false);
                	  }
                  }
	public static void main(String[] args) {
		new GUI1();
		
	        

	}

}
