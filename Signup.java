import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Signup extends JFrame implements ActionListener {
	
	         JButton backButton,creataccButton;
	         JTextField meterField,usernameField,namefield,passwordField;
	         Choice   accountChoice;
               public Signup() {
            	   
            	   setBounds(450,150,700,460);
				   getContentPane().setBackground(Color.white);
				   setLayout(null);
				   
				   JPanel panel=new JPanel();
				   panel.setBounds(30,30,650,280);
				   panel.setBorder(new TitledBorder(new LineBorder(Color.black,2),"Create Account",TitledBorder.LEADING,TitledBorder.TOP,null,Color.blue));
				   panel.setLayout(null);
				   panel.setForeground(Color.DARK_GRAY);
				   add(panel);
				   
				   JLabel createaccountJLabel=new JLabel("Create Account");
				   createaccountJLabel.setBounds(100,50,140,20);
				   createaccountJLabel.setFont(new Font("Tohoma",Font.BOLD,18));
            	   panel.add(createaccountJLabel);
            	   
            	    accountChoice=new Choice();
            	   
            	   accountChoice.add("Admin");
            	   accountChoice.add("Customer");
            	   
            	   accountChoice.setBounds(260,50,150,20);
            	   panel.add(accountChoice);
            	   
            	   JLabel meterNoJLabel=new JLabel("Meter_No");
            	   meterNoJLabel.setBounds(100,90,140,20);
            	   meterNoJLabel.setFont(new Font("Tohoma",Font.BOLD,18));
            	   panel.add(meterNoJLabel);
            	   
            	   meterField=new JTextField();
            	   
            	   meterField.setBounds(260,90,150,20);
            	   panel.add(meterField);
            	   
            	   JLabel usernameJLabel=new JLabel("Username");
            	   usernameJLabel.setBounds(100,130,140,20);
            	   usernameJLabel.setFont(new Font("Tohoma",Font.BOLD,18));
            	   panel.add(usernameJLabel);
            	   
            	    usernameField=new JTextField();
            	   
            	   usernameField.setBounds(260,130,150,20);
            	   panel.add(usernameField);
            	   
            	   
            	   JLabel nameJLabel=new JLabel("Name");
            	   nameJLabel.setBounds(100,170,140,20);
            	   nameJLabel.setFont(new Font("Tohoma",Font.BOLD,18));
            	   panel.add(nameJLabel);
            	   
            	    namefield=new JTextField();
            	   
            	   namefield.setBounds(260,170,150,20);
            	   panel.add(namefield);
            	   
            	   
            	   JLabel passwordJLabel=new JLabel("Password");
            	   passwordJLabel.setBounds(100,210,140,20);
            	   passwordJLabel.setFont(new Font("Tohoma",Font.BOLD,18));
            	   panel.add(passwordJLabel);
            	   
            	    passwordField=new JTextField();
            	   
            	   passwordField.setBounds(260,210,150,20);
            	   panel.add(passwordField);
            	   
            	   creataccButton=new JButton("Create");
            	   creataccButton.setBounds(140,250,120,20);
            	   creataccButton.setBackground(Color.black);
            	   creataccButton.setForeground(Color.white);
            	   creataccButton.setFont(new Font("Tohoma",Font.BOLD,14));
            	   creataccButton.addActionListener(this);
            	   panel.add(creataccButton);
            	   
            	    backButton=new JButton("Back");
            	   backButton.setBounds(300,250,120,20);
            	   backButton.setBackground(Color.black);
            	   backButton.setForeground(Color.white);
            	   backButton.setFont(new Font("Tohoma",Font.BOLD,14));
            	   backButton.addActionListener(this);
            	   panel.add(backButton);
            	   
//            	   JButton signupButton=new JButton("Signup");
//            	   signupButton.setBounds(300,250,120,20);
//            	   signupButton.setBackground(Color.black);
//            	   signupButton.setForeground(Color.white);
//            	   signupButton.setFont(new Font("Tohoma",Font.BOLD,14));
//            	   panel.add(signupButton);
            	   
            	   setVisible(true);
            	 //  setTitle("Signup Page");
            	   
			}
               
               
               public void actionPerformed(ActionEvent ae)
               {
            	   if (ae.getSource()==backButton) {
					 setVisible(false);
					 
					// new Login();
				}
            	   else if (ae.getSource()==creataccButton) {
					String actype=accountChoice.getSelectedItem();
					String nameString=namefield.getText();
					String usernamString=usernameField.getText();
					String passwordString=passwordField.getText();
					String meteString=meterField.getText();
					
					try {
						//Connection c=new Connection();
						String queryString="Insert into Login values('"+actype+"','"+usernamString+"','"+nameString+"','"+passwordString+"')";
						//c.statement.executeUpdate(queryString);
						
						JOptionPane.showMessageDialog(null, "Account created successfully");
						
						setVisible(false);
						
						new Login();
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
					}
					
					
				}
               }//end of actionlistener
	public static void main(String[] args) {
	
          new Signup();
	}

}
