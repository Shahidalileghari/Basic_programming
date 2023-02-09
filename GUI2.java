import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI2 extends JFrame implements ActionListener{
	JButton clik;
               public GUI2()
                 {
            	   setLayout(null);
            	   JLabel lablJLabel=new JLabel("Welcome to login form");
            	   lablJLabel.setBounds(50,50,250,30);
            	   lablJLabel.setFont(new Font("tahomo",Font.BOLD,20));
            	   
            	   add(lablJLabel);
            	   
            	    clik=new JButton("Click");
            	  clik.setBounds(110,140,80,30);
            	   clik.setFont(new Font("tahomo",Font.BOLD,16));
            	   clik.addActionListener(this);
            	   add(clik);
            	   
            	   setTitle("First GUI");
             	  setSize(340,300);
             	  setLocation(200,180);
             	  setVisible(true);
                	 
                 }
               
               public void actionPerformed(ActionEvent g)
               {
            	   if(g.getSource()==clik)
            	   {
            		   setVisible(false);
            		   
            		   new GUI1();
            	   }
               }
	public static void main(String[] args) {
		  
		
		new GUI2();

	}

}
