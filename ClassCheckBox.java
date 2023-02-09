import javax.swing.JCheckBox;
import javax.swing.JFrame;

class Checkbox extends JFrame
{
	public Checkbox() {
         setLayout(null);
         JCheckBox b1=new JCheckBox("She");
         
         b1.setBounds(30,20,80,50);
         add(b1);
         
         JCheckBox b2=new JCheckBox("He");
         
         b2.setBounds(30,50,80,50);
         add(b2);
         
         
         setSize(320,220);
         setVisible(true);
         
	}
}
public class ClassCheckBox {

	public static void main(String[] args) {
		 
		new Checkbox();

	}

}
