import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI3 {

	public static void main(String[] args) {
		JFrame gUIframe=new JFrame();
		
		gUIframe.setTitle("ColorsWithGui");
		
		gUIframe.setSize(300,200);
		
		gUIframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel northJPanel =new JPanel();
		
		 northJPanel.setBackground(Color.red);
		 
		 JPanel southJPanel =new JPanel();
			
		 southJPanel.setBackground(Color.red);
		 
		 JPanel eastJPanel =new JPanel();
			
		 eastJPanel.setBackground(Color.blue);
		 
		 JPanel westJPanel =new JPanel();
			
		 westJPanel.setBackground(Color.blue);
		 
		 JPanel centerPanel=new JPanel();
		 
		 centerPanel.setBackground(Color.white);
		 
		 Container pane=gUIframe.getContentPane();
		 
		 pane.add(northJPanel,BorderLayout.NORTH);
		 pane.add(eastJPanel,BorderLayout.EAST);
		 pane.add(southJPanel,BorderLayout.SOUTH);
		 pane.add(westJPanel,BorderLayout.WEST);
		 
		 pane.add(centerPanel,BorderLayout.CENTER);
		 
		 
		 pane.setLayout(new GridLayout(2,2));
		 pane.add(eastJPanel);
		 pane.add(southJPanel);
		 pane.add(westJPanel);
		 pane.add(northJPanel);
		
		 gUIframe.setVisible(true);
		 

	}

}
