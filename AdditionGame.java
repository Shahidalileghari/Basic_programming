
import java.util.Scanner;

public class AdditionGame {

	public static void main(String[] args) {
		char choice;
		int sum=0;
		int number=(int)(Math.random()+10);
		 try (Scanner scanner = new Scanner(System.in)) {
			do {
				
				
				
				
				for(int i=1;i<=number;i++)
				{
					System.out.println(number+"x"+i+"   ="+number*i);
					 sum=+number*i;
				}
					
					System.out.println("Summation :"+sum);
			
				 System.out.println("Continue(Y|N)");
				 
					choice=scanner.next().charAt(0);
				
			} while (choice=='y'||choice=='y');
		}
		
		 
			
			

	}

}
