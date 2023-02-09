import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		File fw=new File("File.txt");
		Scanner scanner=new Scanner(fw);
		try {
			
			while(scanner.hasNextLine())
			{
				Boolean data=scanner.hasNextLine();
				
				System.out.println(data);
			}
			scanner.close();
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
