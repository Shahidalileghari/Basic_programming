import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class LoadingScreen extends JFrame{
	
	public LoadingScreen() {
		
		JPanel jp=new JPanel();
		jp.setLayout(new BorderLayout());
		
		
		JProgressBar pb=new JProgressBar();
		pb.setStringPainted(true);
		pb.setMaximum(0);
		pb.setMaximum(100);
		jp.add(pb, BorderLayout.SOUTH);
		
		add(jp);
//		JLabel labelA=new JLabel("Please wait\n main project is being loaded");
//		JPanel jPanel=new JPanel();
//		
//		jPanel.add(labelA);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setContentPane(jp);
	    setLocation(200,300);
	    setVisible(true);
	    setTitle("Loading ");
		setSize(400,300);
		
		for(int i=0; i<=1000; i++){
			pb.setValue(i);
			try {
				Thread.sleep(25);
			} 
			catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
			if (i == 100) {
				setVisible(false);
				EventQueue.invokeLater(new Runnable()
				{
					public void run()
					{
						try {
							Employee window = new Employee();
							window.frame.setVisible(true);
							window.frame.setTitle("EMPLOYEE MANAGE");
						} 
						catch (Exception e)
						{
							e.printStackTrace();
						}
					}
				});
				
			}
		}
		
	}
	
	public static void main(String args[]) {
		new LoadingScreen();
	}
}
