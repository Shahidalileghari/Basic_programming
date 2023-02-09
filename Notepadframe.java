import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Notepadframe extends JFrame{
	
	JTextField t1,t2;
	JButton b1,b2;
	JLabel l1,l2;
	JMenuBar mBar;
	JMenu menu;
	JMenuItem m1,m2,m3,m4,m5;
	public Notepadframe() {
		
		setLayout(null);
		t1=new JTextField();
		t1.setBounds(100,30,100,30);
		
		add(t1);
		l1=new JLabel("Name");
		l1.setBounds(20,30,40,30);
		
		add(l1);
		
		t2=new JTextField();
		t2.setBounds(100,80,100,30);
		
		add(t2);
		
		l2=new JLabel("RollNo");
		l2.setBounds(20,80,40,30);
		
		add(l2);
		
		
		b1=new JButton("Reset");
		
		b1.setBounds(20,120,80,30);
	
		 add(b1);
		 
		 b2=new JButton("cancel");
			
			b2.setBounds(120,120,80,30);
		
			 add(b2);
			 
			  mBar=new JMenuBar();
			  
			  m1=new JMenuItem();
			  m2=new JMenuItem();
			  m3=new JMenuItem();
			  m4=new JMenuItem();
			  m5=new JMenuItem();
			  
			  menu.add(m1);
			  menu.add(m2);
			  menu.add(m3);
			  menu.add(m4);
			  menu.add(m5);
			  
			  mBar.add(menu);
			  
			  
			 
			 
		 
		 b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

            t1.setText(null);
            t2.setText(null);
				
			}
		});
		 
		 b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
           JOptionPane.showConfirmDialog(null, "Are you sure");
            setVisible(false);
				
			}
		});
		
		setJMenuBar(mBar);
		setVisible(true);
		setTitle("Form");
		setSize(300,230);
		setLocation(300,240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
	
Notepadframe	nt=new 	Notepadframe();

	}

}
