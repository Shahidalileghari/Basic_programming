import java.util.Scanner;

public class FirstExample {

	public static void main(String[] args) {
	try	(Scanner scanner=new Scanner(System.in))
		
		{
		
		
		System.out.print("Enter your name:");
		String name=scanner.nextLine();
		
		System.out.print("Enter your rollno:");
		String roll=scanner.nextLine();
		
		System.out.print("Enter your section:");
		int section=scanner.nextInt();
		
		System.out.print("Enter your dept:");
		String dpt=scanner.nextLine();
		
		System.out.print("Enter your university:");
		String university=scanner.nextLine();
		
		System.out.print("Enter your hostel:");
		String hostel=scanner.nextLine();
		
		System.out.print("Enter your city:");
		String city=scanner.nextLine();
		
		
		System.out.println("Print details of student");
		
		System.out.println("Name of student        :"+name);
		System.out.println("Rollno of student      :"+roll);
		System.out.println("Section of student     :"+section);
		System.out.println("Department of student  :"+dpt);
		System.out.println("University of student  :"+university);
		System.out.println("Hostel of student      :"+hostel);
		System.out.println("City of student        :"+city);
		
		scanner.close();
		}
	}

}
