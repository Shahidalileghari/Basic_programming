import java.io.File;

public class Filing6 {

	public static void main(String[] args) {
		try {
			File f1=new File("Mathematics.txt");
			if(f1.delete())
			{
				System.out.println(f1.getName()+" has be deleted");
			}
			
		} catch (Exception e) {
		e.printStackTrace();
		}

	}

}
