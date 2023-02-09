import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Arithmetic {

	public static void main(String[] args) {
	
		
		PrintWriter pWriter;
		
		try {
			
			
			pWriter=new PrintWriter("Print.txt");
			pWriter.write("Saved");
		} catch  (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Code done");

	}

}
