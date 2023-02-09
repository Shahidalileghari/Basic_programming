package EmPackacage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


                
	public class  Update_Employee extends JFrame implements ActionListener  {
        JButton baButton,cancelButton;
     public  Update_Employee() {
    	 
		setLayout(null);
		 JLabel vemplyee=new JLabel("Update Employees Information");
		 vemplyee.setBounds(230,30,450,40);
		 vemplyee.setFont(new Font("tahomo",Font.BOLD,28));
		 vemplyee.setBackground(Color.blue);
		 vemplyee.setForeground(Color.black);
    	 add(vemplyee);
		
		
		
    	 JLabel something=new JLabel("No data to show here");
    	 something.setBounds(180,150,400,40);
    	 something.setFont(new Font("tahomo",Font.PLAIN,18));
    	 something.setBackground(Color.blue);
    	 something.setForeground(Color.blue);
    	 add(something);
    	 
    	 baButton=new JButton("Back");
    	 baButton.setBounds(200,300,150,40);
    	 baButton.setFont(new Font("tahomo",Font.PLAIN,18));
    	 baButton.setBackground(Color.gray);
    	 baButton.setForeground(Color.white);
    	 baButton.addActionListener(this);
    	 add(baButton);
    	 
    	 cancelButton=new JButton("Cancel");
    	 cancelButton.setBounds(400,300,160,40);
    	 cancelButton.setFont(new Font("tahomo",Font.PLAIN,18));
    	cancelButton.setBackground(Color.gray);
    	 cancelButton.setForeground(Color.white);
    	 cancelButton.addActionListener(this);
    	 add(cancelButton);
    	 
    	 
    	 setTitle("Employee Management System");
    	 setVisible(true);
    	 setSize(800,460);
   	     setLocation(350,170);
   	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	  
   	  
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
    		 
    	//	new Splash();
    	 }
              }
          public static void main(String[] args) {

    	 new  Update_Employee();

                  }
                  }
