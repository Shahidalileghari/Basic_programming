package programming.com;

import java.util.Scanner;


public class BubleSort {

	public static void main(String[] args) {
		
	int a[];
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter size of an array:");
			int arr=scanner.nextInt();

			a=new int[arr];
			System.out.println("Enter elements of an array:");
			
			for(int i=0; i<a.length;i++)
			{
				
				a[i]=scanner.nextInt();
				
			}
			scanner.close();
		}
		
		  System.out.println("\nPrinting elements of an array");
	    
          for(int i=0;i<a.length;i++)
    	  {
    	  System.out.print(a[i]+" ");
      }

	}

}
