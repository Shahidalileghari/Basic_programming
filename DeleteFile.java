import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		
		
		File obj=new File("File.txt") ;
		
		try {
			if(obj.delete())
			{
				System.out.println("File has been deleted successfully :"+obj.getName());
			}
			
			else {
				System.out.println("Failed to delete this file");
			}
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		

	}

}
