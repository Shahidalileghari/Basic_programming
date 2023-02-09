import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border {

	public static void main(String[] args) {
		
		
		borders borders=new borders();
		
		borders.setVisible(true);
		
		borders.setSize(400,200);
				
				

	}

}

class borders extends JFrame{
	public borders() {
		setLayout(new BorderLayout());
		JPanel p1=new JPanel();
		p1.setBackground(Color.red);
		JPanel p2=new JPanel();
		p1.setBackground(Color.green);
		JPanel p3=new JPanel();
		p1.setBackground(Color.orange);
		JPanel p4=new JPanel();
		p1.setBackground(Color.white);
		
		JPanel p5=new JPanel();
		p1.setBackground(Color.black);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.WEST);
		add(p3,BorderLayout.CENTER);
		add(p4,BorderLayout.EAST);
		add(p5,BorderLayout.SOUTH);
		
		pack();
		
	}
}
