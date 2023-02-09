package EmPackacage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ViewEmployee extends JFrame implements ActionListener  {
	                            JButton baButton,cancelButton;
                             public ViewEmployee() {
                            	 
								setLayout(null);
								
								 JLabel vemplyee=new JLabel("View Employees");
								 vemplyee.setBounds(250,30,400,40);
								 vemplyee.setFont(new Font("tahomo",Font.BOLD,28));
								 vemplyee.setBackground(Color.blue);
								 vemplyee.setForeground(Color.black);
						    	 add(vemplyee);
								
                            	 JLabel something=new JLabel("No data to show here");
                            	 something.setBounds(180,150,400,40);
                            	 something.setFont(new Font("tahomo",Font.PLAIN,18));
                            	 something.setBackground(Color.black);
                            	 something.setForeground(Color.blue);
                            	 add(something);
                            	 
                            	 baButton=new JButton("Back");
                            	 baButton.setBounds(190,300,150,40);
                            	 baButton.setFont(new Font("tahomo",Font.PLAIN,18));
                            	 baButton.setBackground(Color.black);
                            	 baButton.setForeground(Color.white);
                            	 baButton.addActionListener(this);
                            	 add(baButton);
                            	 
                            	 cancelButton=new JButton("Cancel");
                            	 cancelButton.setBounds(400,300,160,40);
                            	 cancelButton.setFont(new Font("tahomo",Font.PLAIN,18));
                            	 cancelButton.setBackground(Color.black);
                            	 cancelButton.setForeground(Color.white);
                            	 cancelButton.addActionListener(this);
                            	 add(cancelButton);
                            	 
                            	 
                            	 setTitle("Employee Management System");
                            	 setVisible(true);
                            	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            	 setSize(800,460);
       	                	     setLocation(350,170);
       	                	  
       	                	  
							}
                             
                             public void actionPerformed(ActionEvent ax)
                             {
                            	 if(ax.getSource()==baButton)
                            	 {
                            		 setVisible(false);
                            		 
                            		 new Home();
                            	 }
                            	 if(ax.getSource()==cancelButton)
                            	 {
                            		
                            		 setVisible(false);
                            		
                            		 //new Splash();
                            		 
                            		// JOptionPane.showConfirmDialog(null, "Are you sure");
                            		 
                            		
                            	 }
                             }
	public static void main(String[] args) {
		
                            	 new ViewEmployee();

	}

}
