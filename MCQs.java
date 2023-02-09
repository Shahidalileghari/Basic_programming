import java.util.Scanner;

public class MCQs {
	public static void main(String[] args) {
		int ans1=890;
		int ans2=790;
		int ans3=1000;
		
		try (Scanner object = new Scanner(System.in)) {
			System.out.println("MCQs");
			
			System.out.println("One kilometer contains ______ meters");
			System.out.println("Options are \n\n");
			System.out.println(ans1);
			System.out.println(ans2);
			System.out.println(ans3);
			
			int answer=object.nextInt();
			
			
			
			
			if(answer==ans3)
			{
				System.out.println("You are correct");
			}
			
			
			
			else {
				System.out.println("Wrong option");
			}
		}
	}
	
}
