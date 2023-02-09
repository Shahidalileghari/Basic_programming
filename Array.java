package programming.com;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int i=0;
			int array=0;
			int []a=new int[20];
			
			for( i=0;i<a.length;i++)
			{
				System.out.println("Enter value of array:");
				 array=scanner.nextInt();
			}
     for(int j=0;j<array;j++)
     {
			  System.out.println(array);
     }
     scanner.close();
		}
	}

}
