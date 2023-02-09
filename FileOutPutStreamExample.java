import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutPutStreamExample {

	public static void main(String[] args) throws FileNotFoundException  {
		FileOutputStream f=new FileOutputStream("MYFILE.txt");
		
		try {
			String S="Shahid ali leghari";
			
			byte []b=S.getBytes();
			
			f.write(b);
			f.write(9);
			
			f.close();
			System.out.println("Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
