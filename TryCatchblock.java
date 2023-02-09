
public class TryCatchblock {

	public static void main(String[] args) {
		int i=12;
		for(int j=3;j>=-1;j--)
		{
		try {
			System.out.println("You have entered "+i+"  "+j);
			System.out.println("i/j   :"+i/j);
			System.out.println("Ending try block");
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Arithmetic error occured"+e);
			
			System.out.println("After try block");
		}
		}
	}

}
