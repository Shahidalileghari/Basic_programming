import javax.swing.JOptionPane;

public class CubeSquare {

	public static void main(String[] args) {
		
		
			
	String name=JOptionPane.showInputDialog("Enter your name");
	String message=String.format("Welcome,%s,to java ", name);
	
	JOptionPane.showConfirmDialog(null, message);
	}

}
