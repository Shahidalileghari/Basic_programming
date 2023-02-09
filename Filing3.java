import java.io.File;

public class Filing3 {

	public static void main(String[] args) {
try {
			
			File fo=new File("filing.txt");
			
			if(fo.createNewFile())
			{
				System.out.println("File "+fo.getName()+" is created successfully");
				System.out.println("The absolute path of file is"+fo.getAbsolutePath());
				
				System.out.println("Is file readable "+fo.canRead());
				
				System.out.println("Is file writable "+fo.canWrite());
				
				System.out.println("the size of file is "+fo.length());
			}
			else {
				System.out.println("File is existed already");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
