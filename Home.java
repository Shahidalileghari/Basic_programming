package EmPackacage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame implements ActionListener {
	
	                    JButton addbtn,view,update,remove,backbtn,cancel;
	
	            public Home() {
	            	setLayout(null);
	            	JLabel heedinJLabel=new JLabel("Home page");
	            	heedinJLabel.setBounds(180,20,400 ,40);
	            	heedinJLabel.setFont(new Font("tahomo",Font.PLAIN,28));
	            //	heedinJLabel.setBackground(Color.black);
	            	heedinJLabel.setForeground(Color.black);
	            	add(heedinJLabel);
	            	
	            	addbtn=new JButton("Add Employee");
	            	addbtn.setBounds(100,100,150 ,40);
	            	addbtn.addActionListener(this);
	            	add(addbtn);
	            	
	            	         view=new JButton("View Employee");
	            	view.setBounds(300,100,150 ,40);
	            	view.addActionListener(this);
	            	add(view);
	            	
	            	         update=new JButton("Update Employee");
	            	update.setBounds(100,170,150 ,40);
	            	update.addActionListener(this);
	            	add(update);
	            	
	            	         remove=new JButton("Remove Employee");
	            	remove.setBounds(300,170,150 ,40);
	            	remove.addActionListener(this);
	            	add(remove);
	            	
	            	
	            	
	               backbtn=new JButton("Back");
	            	backbtn.setBounds(150,300,80 ,40);
	            	backbtn.setBackground(Color.black);
	            	backbtn.setForeground(Color.white);
	            	backbtn.addActionListener(this);
	            	add(backbtn);
	            	
	                cancel=new JButton("Cancel");
	            	cancel.setBounds(320,300,80 ,40);
	            	cancel.setBackground(Color.black);
	            	cancel.setForeground(Color.white);
	            	
	            	cancel.addActionListener(this);
	            	add(cancel);
	            	
	            	
	            	setTitle("Employee Management System");
	            	setSize(600,400);
	            	  setLocation(400,200);
	            	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          	 setVisible(true);
				}
	            public void actionPerformed(ActionEvent x)
	            
	            {
	            	if (x.getSource()==addbtn) {
	            		
						  setVisible(false);
						  
						  new AddEmployee();
					}
	            	
	            	else if (x.getSource()==view) {
	            		
	            		setVisible(false);
						  
						  new ViewEmployee();
					}
	            	
	            	else if (x.getSource()==update) {
	            		
	            		setVisible(false);
						  
						  new Update_Employee();
					}
	            	else if (x.getSource()==remove) {
	            		
	            		setVisible(false);
						  
						  new Remove_Employee();
					}
	            	else if (x.getSource()==backbtn) {
						setVisible(false);
						
						new Login();
					}
	            	else if (x.getSource()==cancel) {
						setVisible(false);
						
						//new Login();
					}
	            	
	            	}	
	public static void main(String[] args) {
		
              new Home();
	}          }
                     
