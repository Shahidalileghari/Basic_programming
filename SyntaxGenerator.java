import java.util.Scanner;

public class SyntaxGenerator {

	public static void main(String[] args) {
		
		try (Scanner syn = new Scanner(System.in)) {
			System.out.println("1==>For loop");
			System.out.println("2==>while loop");
			System.out.println("3==>do while loop");
			
			System.out.println("Enter your choice");
			
			int choice=syn.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Syntax of For loop");
				System.out.println("\nfor(initialization, condition, updation)\n{code tobe executed};");
				break;
				case 2:
				System.out.println("Syntax of while loop");
				System.out.println("\nwhile(condition)\t\tupdation\n\n{code tobe executed};");
				break;
				case 3:
				System.out.println("Syntax of do while loop");
				System.out.println("\ndo{while(condition)\t\tupdation\\n{code tobe executed}};");
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " +choice);
			}
		}

	}

}
