import java.util.Scanner;

public class Ticketing {
	public static void main(String[] args) {
		try (Scanner inputScanner = new Scanner(System.in)) {
			System.out.println("Enter age");
			
			int age=inputScanner.nextInt();
			
			if(age>0 && age<13)

			{
				System.out.println("Ticket price is $5");
			}
			
			if(age>=13 && age<=45)

			{
				System.out.println("Ticket price is $20");
			}
			
			
			else if(age>45&&age<=65)
			{
				System.out.println("Ticket price is $30");
			}
			
			else {
				System.out.println("Invalid input :"+age);
			
}
		}
	}
}
	
