import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Main {
	Scanner scanner=new Scanner(System.in);
	
	
	 public void menu()
     {
    	 System.out.println("\n\nMenu ");
    	 System.out.println("1:Input array");
    	 System.out.println("2:Display array");
    	 System.out.println("3:Searching");
    	 System.out.println("4:Update");
    	 System.out.println("5:Insertion");
    	 System.out.println("6:Deletion");
    	 System.out.println("7:Exit");
    	 System.out.println("Enter your choice");
    	 int choice=scanner.nextInt();
    	 
     }
	 
	 public void Input()
	 {
		 System.out.println("This array input method");
	 }
       
	 public void output()
	 {
		 System.out.println("This is display method");
	 }
	 public void Searching()
	 {
		 System.out.println("Searching an array method");
	 }
	 public void update()
	 {
		 System.out.println("Update an array method");
	 }
	 public void insert()
	 {
		 System.out.println("Insert method");
	 }
	 public void deletion()
	 {
		 System.out.println("deletion method");
	 }
	 
	public void Exit()
	{
		System.out.println("Invalid input");
	}
	public static void main(String[] args) {
		
		
	 Main main=new Main();
	 
	 main.menu();
	 
	 
	 
	 
	}

}
