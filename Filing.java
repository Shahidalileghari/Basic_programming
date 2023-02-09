import java.io.FileWriter;
import java.io.IOException;

public class Filing {

	public static void main(String[] args) {
		
		
		try {
			FileWriter myFile=new FileWriter("MyFile.text");
			
			myFile.write("Currently working on file development");;
			
			myFile.write("I love java programming");
			
			myFile.close();
			
			System.out.println("Filing done");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
