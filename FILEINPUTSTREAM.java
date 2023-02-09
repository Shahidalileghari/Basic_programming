import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FILEINPUTSTREAM {

	public static void main(String[] args)throws FileNotFoundException {
		
       FileInputStream fileInputStream=new FileInputStream("MYFILE.txt");
       
       try {
		int i=fileInputStream.read();
		
		System.out.println((char)i);
		
		fileInputStream.close();
	      } 
       catch (Exception e)
       {
		
    	}
	}

}
