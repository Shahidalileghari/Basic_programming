

import java.util.Scanner;

public class Firstjava {

	public static void main(String[] args) {
		try (Scanner objScanner = new Scanner(System.in)) {
			System.out.print("Enter your name :");
			
			String name=objScanner.nextLine();
			
			
			System.out.print("Enter your roll no:");
			
			String rollno=objScanner.nextLine();
			
			System.out.print("Enter year of admission:");
			
			int year=objScanner.nextInt();
			
			System.out.print("Enter your section:");
			int section=objScanner.nextInt();
			System.out.println("\n\nDetails of student:\n");
			System.out.println("Your name        :"+name);
			
			System.out.println("Your roll No     :"+rollno);
			
			
			System.out.println("Year of admission:"+year);
			
			System.out.println("Your section     :"+section);
		}
			
			
		

	}

}
