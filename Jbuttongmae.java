import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jbuttongmae {

	public static void main(String[] args) {
		
		
Myframe fMyframe=new Myframe();

fMyframe.setVisible(true);

fMyframe.setSize(400,300);
	}

}

 class Myframe extends JFrame

{
	 
	 public Myframe()
	 {
		 JButton button=new JButton("Click");
		 
		 button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				button.setText("Thank you !");
			}
		});
		 add(button);
		 
		 pack();
	 }
	
}
