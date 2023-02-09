import java.io.File;

public class Filing2 {

	public static void main(String[] args) {
	try {
			
			File fo=new File("Mathematics.txt");
			
			if(fo.createNewFile())
			{
				System.out.println("File "+fo.getName()+" is created successfully");
				
			}
			else {
				System.out.println("File is existed already");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	}


