

public class JavaException {

	public static void main(String[] args) {
	
		try {
			throw new Myexception(6);
			
			
		} catch (Myexception e) {
			
			
			System.out.println(e);
		}
		
	}

}


class Myexception extends Exception{
	int a;
	Myexception(int b)
	{
		a=b;
	}
	
	public String toString()
	{
		return ("My exception number :"+a);
	}
}
