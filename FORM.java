import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class AdmissionForm extends JFrame{
	
	JPanel panel;
	JLabel label,name,gmial,password,CNIC,district,city,gender;
	
	JTextField tname,gmail,tpassword,tCNIC;
	
	JComboBox tcity,tdistrict,tgender;
	
	JButton button1,button2,button3;
	JRadioButton rdButton1,rdButton2;
	
	ButtonGroup bg;
	
	public AdmissionForm() {
		setLayout(null);
		
		getContentPane().setBackground(Color.yellow);
	 label=new JLabel("Admission Form");
	 label.setBounds(110,20,220,30);
	 label.setFont(new Font("tahomo",Font.BOLD,20));
	    add(label);
	    
	    //name
	    
	      name=new JLabel("Name");
		  name.setBounds(30,70,220,30);
		  name.setFont(new Font("tahomo",Font.BOLD,20));
		  add(name);
		  
		  //password
		  
		  password=new JLabel("Password");
		  password.setBounds(30,120,220,30);
		  password.setFont(new Font("tahomo",Font.BOLD,20));
		  add(password);
		  
		
		  
		  gmial=new JLabel("Gmail");
		  gmial.setBounds(30,160,220,30);
		  gmial.setFont(new Font("tahomo",Font.BOLD,20));
		  add(gmial);
		  
		  CNIC=new JLabel("CNIC");
		  CNIC.setBounds(30,200,220,30);
		  CNIC.setFont(new Font("tahomo",Font.BOLD,20));
		  add(CNIC);
		  
		  district=new JLabel("District");
		  district.setBounds(30,240,220,30);
		  district.setFont(new Font("tahomo",Font.BOLD,20));
		  add(district);
		  
		city=new JLabel("City");
		  city.setBounds(30,280,280,30);
		  city.setFont(new Font("tahomo",Font.BOLD,20));
		  add(city);
		  
		  gender=new JLabel("Gender");
		  gender.setBounds(30,320,280,30);
		  gender.setFont(new Font("tahomo",Font.BOLD,20));
		  add(gender);
	    
		  // field
		  
		  tname=new JTextField();
		  tname.setBounds(160,70,160,30);
		  
		  add(tname);
		  
		  tpassword=new JTextField();
		  tpassword.setBounds(160,115,160,30);
		  
		  add(tpassword);
		  
		  gmail=new JTextField();
		  gmail.setBounds(160,160,160,30);
		  
		  add(gmail);
		  
		 tCNIC=new JTextField();
		 tCNIC.setBounds(160,200,160,30);
		  
		  add(tCNIC);
		  String []d= {"Karachi","Nawabshah","Sukkur","Hyderabad","Dadu","KNShah","Mehar","Larkano","Noshaehro","Badin","Ghotki"};
		  tdistrict=new JComboBox(d);
		 tdistrict.setBounds(160,240,160,30);
			  
		  add(tdistrict);
			String []s= {"Karachi","Nawabshah","Sukkur","Hyderabad","Dadu","Larkano","Thato","badin","Tharparkar"};  
		 tcity=new JComboBox(s);
		tcity.setBounds(160,280,160,30);
				  
		add(tcity);
		String []gen= {"Male","Female"};
		
		 tgender=new JComboBox(gen);
			tgender.setBounds(160,320,160,30);
					  
			add(tgender);
//		
//		rdButton1=new JRadioButton("Male");
//		rdButton1.setBounds(160,320,160,30);
//		
//		rdButton2=new JRadioButton("Female");
//		rdButton2.setBounds(160,320,160,30);
//		  
//		
//		 bg=new ButtonGroup();
//		
//		bg.add(rdButton1);
//		bg.add(rdButton2);
		
		try {
			FileWriter  writer=new FileWriter("AdmissionForm.txt");
			writer.write("Name      :\n\n"+tname.getText()+"Gmial     :\n\n"+gmail.getText()+"Password  :\n\n"+tpassword.getText()
			+"CNIC      :\t\t"+tCNIC.getText());
			
			
			writer.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			
			//
			button1=new JButton("Submit");
			button1.setBounds(30,390,90,30);
			button1.setForeground(Color.blue);
			button1.setFont(new Font("tahom",Font.BOLD,14));
			add(button1);
			
			button2=new JButton("Reset");
			button2.setBounds(145,390,90,30);
			button2.setForeground(Color.blue);
			button2.setFont(new Font("tahom",Font.BOLD,14));
			add(button2);
		  
			button3=new JButton("Cancel");
			button3.setBounds(260,390,90,30);
			button3.setForeground(Color.blue);
			button3.setFont(new Font("tahom",Font.BOLD,14));
			add(button3);
			
			button1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					JOptionPane.showConfirmDialog(null, "Form submitted successfully");
					
				}
			});
			
			button2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {

                methodRest();
					
				}
			});
			
			button3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {

                  setVisible(false);
					
				}
			});
		  
		setLocation(340,120);
		setSize(400,540);
		setBackground(Color.yellow);
		setTitle("AdmissionForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void methodRest()
	{
		tname.setText(null);
		gmail.setText(null);
		tpassword.setText(null);
		tCNIC.setText(null);
		
	}
	
	
	
}



public class FORM {

	public static void main(String[] args) {
		
         new AdmissionForm();
	}

}
