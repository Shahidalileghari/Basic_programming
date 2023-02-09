package EmPackacage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.ResultSet;

public  class Login extends JFrame  implements ActionListener{
	                                 JTextField  user, puser;
	                                 JButton login,cancel;
	                                 
	                                 JLabel username;
	                                                                
	                                 JCheckBox showBox;
              public Login() {
				
            	  
            	   getContentPane().setBackground(Color.LIGHT_GRAY);
            	   setLayout(null);
            	   
            	   JLabel setJLabel=new JLabel("Login page");
            	   setJLabel.setBounds(140,20,150,30);
            	   setJLabel.setFont(new Font("tahomo",Font.BOLD,24));
            	   add(setJLabel);
            	   
            	 username =new JLabel("Username");
            	   username.setBounds(40,70,100,30);
            	   username.setFont(new Font("tahomo",Font.PLAIN,20));
            	   add(username);
            	   
            	  
            	   
            	    user=new JTextField();
            	   user.setBounds(150,70,150,30);
            	   user.setFont(new Font("tahomo",Font.PLAIN,18));
            	   add(user);
            	   
            	  
            	   
            	   JLabel password=new JLabel("Password");
            	   password.setBounds(40,130,100,30);
            	   password.setFont(new Font("tahomo",Font.PLAIN,20));
            	   add(password);
            	  
            	  
            	   
            	   
            	    puser=new JTextField();
            	   puser.setBounds(150,130,150,30);
            	   puser.setFont(new Font("tahomo",Font.PLAIN,18));
            	   add(puser);
            	   

            	   
            	   
            	   
            	   login =new JButton("Login");
            	   login.setBounds(80,220,110,30);
            	   login.setFont(new Font("tahomo",Font.PLAIN,18));
            	   login.setBackground(Color.black);
            	   login.setForeground(Color.white);
            	   login.addActionListener(this);
             	   add(login);
             	   
             	   
             	  cancel =new JButton("cancel");
             	 cancel.setBounds(220,220,110,30);
             	cancel.setFont(new Font("tahomo",Font.PLAIN,18));
             	cancel.setBackground(Color.black);
             	cancel.setForeground(Color.white);
             	cancel.addActionListener(this);
            	   add(cancel);
             	    
             	    
            	   setTitle("Employee Management System");
            	  setSize(440,380);
            	  setLocation(400,200);
            	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	  setVisible(true);
			            }
              public void actionPerformed(ActionEvent ec)
              {
            	
				if (ec.getSource()==login) {
					
					if ("".equals(user.getText())||"".equals(puser.getText())) {
						JOptionPane.showMessageDialog(null, "You cannot have empty fields");
					} 
					
				
					else {
						setVisible(false);
						
						new Home();
					}
					
				}
				if (ec.getSource()==cancel) {
					
					setVisible(false);
					
			            
				
				}
            	  
              }
             

			
	public static void main(String[] args) {
		  new Login();

	        }
          }
