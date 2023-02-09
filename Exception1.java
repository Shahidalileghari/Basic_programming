import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		int i=-1;
		while(i<=0)
		{
			i=getNumber();
		}
		System.out.println(i);

	}
public static int getNumber()
{
	try {
		Scanner console=new Scanner(System.in);
		System.out.println("Enter a positive number");
		
		return console.nextInt();
		
	} catch (InputMismatchException  e) {
		return -1;
	}
}
}
