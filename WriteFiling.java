import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFiling {

	public static void main(String[] args) {
		try {
			FileWriter myFile=new FileWriter("MyFile.text");
			
			Scanner scanner =new Scanner(System.in);
			
			System.out.println("Write in java file");
			
			String string=scanner.nextLine()+"\n";
			
			myFile.write(string);
			
			myFile.close();
			
			System.out.println("Filing done");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
