import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AWTCounter extends JFrame {
                       private Label label;
                       private TextField filedField;
                       private Button btnButton;
                       private int count=0;
                       
                       public AWTCounter() {
						setLayout(new FlowLayout());
						
						label=new Label("Counter");
						
						add(label);
						
						filedField=new TextField(count+""+10);
						filedField.setEditable(false);
						
						add(filedField);
						
						btnButton=new Button("Count");
						add(btnButton);
						
						 BtnCounterListener listener=new BtnCounterListener();
						
						btnButton.addActionListener(listener);
						
						setTitle("AWTCounter");
						
						setSize(400,300);
						
						setLocation(250,150);
						
						setVisible(true);
						
						
					}
                       
                       
	public static void main(String[] args) {
		
              new AWTCounter();
	}
	
	private class 	 BtnCounterListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent ac)
		{
			++count;
			
			filedField.setText(count+"");
		}
	}

}
