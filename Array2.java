package  DSA.com;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter no of size in array:");
			
			int No=scanner.nextInt();
			
			int a[]=new int[No];
				
  for(int i=0;i<No;i++)
  {
			  a[i]=scanner.nextInt();
  }
  
  System.out.println("\nElement of an array");
			for(int i=0;i<No;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
