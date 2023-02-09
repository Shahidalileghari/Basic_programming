import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Inputvalidation  extends JFrame{
	
	JTextField displayfiled;
	
                       public Inputvalidation() {
                    	   Container cp=getContentPane();
                    	   
                    	   cp.setLayout(new FlowLayout());
                    	   
                    	   displayfiled =new JTextField(10);
                    	   
                    	   displayfiled.setEditable(false);
                    	   
                    	   cp.add(displayfiled);
                    	   
                    	   JButton btn=new JButton("Input");
                    	   
                    	   cp.add(btn);
                    	   
                    	   btn.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								boolean validation=false;
								
								int number=0;
								String inputString=JOptionPane.showInputDialog("Enter a number [1-9]");
								
								do {
									try {
										number=Integer.parseInt(inputString);
										
									} 
									catch (NumberFormatException ex) {
										number=-1;
									}
									
									if(number<1 ||number>9 )
									{
										inputString=JOptionPane.showInputDialog("Invalid number ! Enter number[1-9]");
										
									}
									
									else {
										JOptionPane.showInputDialog(null,"You have entered a number "+number);
										validation=true;
										
									}
									
								} 
								while (!validation);
								
								displayfiled.setText(number+"");
								
							}
						});
                    	   setTitle("Input dialogue");
                    	   setVisible(true);
                    	   setSize(300,250);
                    	   setLocation(300,260);
                    	   
                    	   
					
					}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			new Inputvalidation();
			}
		});

	}

}
