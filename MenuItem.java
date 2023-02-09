import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuItem {
	JMenuBar mBar;
	JMenu menu;
	JMenuItem m1,m2,m3,m4,m5;
	public MenuItem() {
		JFrame frm=new JFrame();
		  mBar=new JMenuBar();
		  
		  menu =new JMenu("Menu");
		  
		  m1=new JMenuItem("m1");
		  m2=new JMenuItem("m2");
		  m3=new JMenuItem("m3");
		  m4=new JMenuItem("m4");
		  m5=new JMenuItem("m5");
		  
		  menu.add(m1);
		  menu.add(m2);
		  menu.add(m3);
		  menu.add(m4);
		  menu.add(m5);
		  
		  mBar.add(menu);
		frm.setJMenuBar(mBar);
		
		frm.setVisible(true);
		
		frm.setSize(300,240);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocation(320,230);
	}
      
      
      
      
      
	public static void main(String[] args) {
		MenuItem mtItem=new  MenuItem();

	}

}
