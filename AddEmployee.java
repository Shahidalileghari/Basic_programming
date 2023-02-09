package EmPackacage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddEmployee extends JFrame implements ActionListener {
                     
	           JButton AddEmp,setback,viewsetback,reset;
	           JTextField nameField, fnameField, DobField,Esalary,E_Address, E_designation;
	           
	          JTextField E_education,E_phone,E_email;
	
	                  public AddEmployee() {
	                	  setLayout(null);
	                	  JLabel AddEmployee =new JLabel("Add Employees");
	                	  AddEmployee.setBounds(260,40,300,30);
	                	  AddEmployee.setFont(new Font("tahomo",Font.BOLD,28));
	      	            	AddEmployee.setForeground(Color.black);
	                	  add(AddEmployee);
	                	  
	                	  JLabel name=new JLabel("Name");
	                	  name.setBounds(70,80,80,30);
	                	  name.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(name);
	                	  
	                	  nameField =new JTextField();
	                	  nameField.setBounds(160,80,150,26);
	                	  nameField.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(nameField);
	                	  
	                	  JLabel fname=new JLabel("F_name");
	                	  fname.setBounds(70,120,80,30);
	                	  fname.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(fname);
	                	  
	                	 fnameField=new JTextField();
	                	  fnameField.setBounds(160,120,150,26);
	                	  fnameField.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(fnameField);
	                	  
	                	  JLabel DOb=new JLabel("DOB");
	                	  DOb.setBounds(70,160,80,30);
	                	  DOb.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(DOb);
	                	  
	                	   DobField=new JTextField();
	                	  DobField.setBounds(160,160,150,26);
	                	  DobField.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(DobField);
	                	  
	                	  JLabel salary=new JLabel("Salary");
	                	  salary.setBounds(70,195,80,30);
	                	  salary.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(salary);
	                	  
	                	   Esalary=new JTextField();
	                	  Esalary.setBounds(160,200,150,26);
	                	  Esalary.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(Esalary);
	                	  
	                	  JLabel Address=new JLabel("Address");
	                	  Address.setBounds(70,240,80,30);
	                	  Address.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(Address);
	                	  
	                	   E_Address=new JTextField();
	                	  E_Address.setBounds(160,245,150,26);
	                	  E_Address.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(E_Address);
	                	  
	                	
	                	  
	                	  
	                	  JLabel designation=new JLabel("Designation");
	                	  designation.setBounds(350,80,100,30);
	                	  designation.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(designation);
	                	  
	                	   E_designation=new JTextField();
	                	  E_designation.setBounds(500,80,150,26);
	                	  E_designation.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(E_designation);
	                	  
//	                	  JLabel Qualification=new JLabel("Qualification");
//	                	  Qualification.setBounds(350,120,100,30);
//	                	  Qualification.setFont(new Font("tahomo",Font.PLAIN,18));
//	                	  add(Qualification);
//	                	  
//	                	  JTextField E_Qualification=new JTextField();
//	                	  E_Qualification.setBounds(500,120,150,26);
//	                	  E_Qualification.setFont(new Font("tahomo",Font.PLAIN,18));
//	                	  add(E_Qualification);
	                	  
	                	  JLabel education=new JLabel("Education");
	                	  education.setBounds(350,120,100,30);
	                	  education.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(education);
	                	  
	                	   E_education=new JTextField();
	                	  E_education.setBounds(500,120,150,26);
	                	  E_education.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(E_education);
	                	  
	                	  JLabel phone=new JLabel("Phone");
	                	  phone.setBounds(350,160,100,30);
	                	  phone.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(phone);
	                	  
	                	  E_phone=new JTextField();
	                	  E_phone.setBounds(500,160,150,26);
	                	  E_phone.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(E_phone);
	                	  
	                	  JLabel email=new JLabel("Email");
	                	  email.setBounds(350,200,100,30);
	                	  email.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(email);
	                	  
	                	   E_email=new JTextField();
	                	  E_email.setBounds(500,200,150,26);
	                	  E_email.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  add(E_email);
	                	  
	                	  
	                	  
	                	  AddEmp=new JButton("Add details");
	                	  AddEmp.setBounds(60,330,130,30);
	                	  AddEmp.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  AddEmp.setBackground(Color.black);
	                	  AddEmp.setForeground(Color.white);
	                	  AddEmp.addActionListener(this);
	                	  add(AddEmp);
	                	  
	                	  setback=new JButton("Back");
	                	  setback.setBounds(550,330,150,30);
	                	  setback.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  setback.setBackground(Color.black);
	                	  setback.setForeground(Color.white);
	                	  setback.addActionListener(this);
	                	  add(setback);
	                	  
	                	  
	                	  reset=new JButton("Reset");
	                	  reset.setBounds(215,330,150,30);
	                	  reset.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  reset.setBackground(Color.black);
	                	  reset.setForeground(Color.white);
	                	  reset.addActionListener(this);
	                	  add(reset);
	                	  
	                	  viewsetback=new JButton("View details");
	                	  viewsetback.setBounds(380,330,150,30);
	                	  viewsetback.setFont(new Font("tahomo",Font.PLAIN,18));
	                	  viewsetback.setBackground(Color.black);
	                	  viewsetback.setForeground(Color.white);
	                	  viewsetback.addActionListener(this);
	                	  add(viewsetback);
	                	  
	                	  setTitle("Employee Management System");
	                	  setSize(800,460);
	                	  setLocation(350,170);
	                	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            	   setVisible(true);
	            	   
	            	   
	            	  

				}
	                  
	                  public void resetdata()
	                  {
	                	  nameField.setText(null);
	                	  fnameField.setText(null);
	                	  DobField.setText(null);
	                	  Esalary.setText(null);
	                	  E_Address.setText(null);
	                	  E_designation.setText(null);
	                	  E_education.setText(null);
	                	  E_phone.setText(null);
	                	  E_email.setText(null);
	                  }
	                  
	                  public void actionPerformed(ActionEvent eee) 
	                  {
	                	  if(eee.getSource()==AddEmp)
	                	  {
	                		  if ("".equals(nameField.getText())||"".equals( fnameField.getText())||"".equals( DobField.getText())
	                				  ||"".equals( Esalary.getText())||"".equals(E_Address.getText())||"".equals(E_designation.getText())
	                				  ||"".equals( E_education.getText())||"".equals(E_phone.getText())||"".equals(E_email.getText())) {
								
	                			  JOptionPane.showMessageDialog(null, "Please enter data");
							}
	                		  
	                		 
	                		  
	                		  else  {
	                			  JOptionPane.showMessageDialog(null, "Details added successfully");
	                			  
	                			 
	                		  }
	                	  }
	                	  
	                	  else if(eee.getSource()==setback) {
	                		  setVisible(false);
							new Home();
						}
	                	  
	                	  else if(eee.getSource()==viewsetback) {
	                		  setVisible(false);
							  new ViewEmployee();
						}
	                	  else if (eee.getSource()==reset) {
	                		  resetdata();
						}
	                  }
	public static void main(String[] args) {

           new AddEmployee();

	}

}
