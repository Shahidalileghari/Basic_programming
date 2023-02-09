import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
	
		
		int num, sum=0;
		
		try (Scanner nuScanner = new Scanner(System.in)) {
			System.out.println("Enter any number ");
			
			int number=nuScanner.nextInt();
			
			while(number>=100 && number<=200)
			{
				sum+=number;
				
				System.out.println("enter an other number");
				
				num=nuScanner.nextInt();
				
			}
		}
		
		System.out.println("Sum :" +sum);

	}

}
