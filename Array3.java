package DSA.com;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			String name[]=new String[5]; 
			name[0]="First";
			name[1]="Second";
			name[2]="Third";
			name[3]="Four";
			name[4]="Five";
			System.out.println("Enter size of an array");
			int size=scanner.nextInt();
			
			int array[]=new int[size];
			
			System.out.println("Enter some values of array");
			
			for(int i=0;i<size;i++)
			{
				array[i]=scanner.nextInt();
			}
			
			for(int i=0;i<size;i++)
			{
				
				System.out.println(+array[i]);
				
			}
		}

	}

}
