import java.io.FileWriter;

public class Filing4 {

	public static void main(String[] args) {
		try {
			FileWriter fwriter=new FileWriter("Writin.txt");
			
			fwriter.write("Writing \ncontent\n to a file\n in java\n is file handling");
			
			fwriter.close();
			
			System.out.println("Content to file has been writen to java");
			
		
			
		} catch (Exception e) {
			System.out.println("An unexpected error occured");
			
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
