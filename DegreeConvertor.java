import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DegreeConvertor {

	public static void main(String[] args) {
		
		
		convertor convertor=new convertor();
		convertor.setVisible(true);
		
		convertor.setSize(300,200);

	}

}

class convertor extends JFrame
{
	public convertor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JPanel cPanel=new JPanel();
		JPanel fPanel=new JPanel();
		JPanel buttonPanel=new JPanel();
		
		final JTextField cField=new JTextField(20);
		final JTextField fField=new JTextField(20);
		
		cPanel.add(new JLabel("Celsius"));
		cPanel.add(cField);
		
		fPanel.add(new JLabel("Fharenheit"));
		fPanel.add(fField);
		JButton convertButton=new JButton("Convert");
		buttonPanel.add(convertButton);
		add(cPanel,BorderLayout.NORTH);
		add(fPanel,BorderLayout.CENTER);
		add(buttonPanel,BorderLayout.SOUTH);
		convertButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(cField.getText().trim().equals("") && fField.getText().trim().equals(""))
				{
					return;
				}
				if(cField.getText().trim().equals(""))
				{
					String result=fField.getText().trim();
					double number =Double.parseDouble(result);
					number=(number-32)*(5/9);
					cField.setText(number+"");
				}
				
				if(fField.getText().trim().equals(""))
				{
					String result=cField.getText().trim();
					Double number=Double.parseDouble(result);
					
					number=number*(9/5)+32;
					
					fField.setText(number+"");
				}
			}
		});
		
		pack();
		
		
	}
}
