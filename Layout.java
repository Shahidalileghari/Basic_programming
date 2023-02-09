import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout {

	public static void main(String[] args) {
		
		
		Frmaee fr=new Frmaee();
		
		fr.setVisible(true);
		
		fr.setSize(300,200);
	}

}

class Frmaee extends JFrame
{
	public Frmaee() {

 JButton button1=new JButton("First");
 JButton button2=new JButton("Second");
 JButton button3=new JButton("Third");
 
 setLayout(new FlowLayout());
 add(button1);
 add(button2);
 add(button3);
 
 pack();
 
	}
}
