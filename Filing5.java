import java.io.File;
import java.util.Scanner;


public class Filing5 {

	public static void main(String[] args) {
		try {
			File f1=new File("Writin.txt");
			
			Scanner scanner=new Scanner(f1);
			
			while (scanner.hasNextLine()) {
				
				String datareaderString=scanner.nextLine();
				
				System.out.println(datareaderString);
				
				
				
			}
			
			scanner.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
