package programming.com;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		try(Scanner scanner=new Scanner(System.in))
		{
			System.out.println("Enter size of an array");
			
			int size=scanner.nextInt();
			
			int arr[]=new int[size];
			
			System.out.println("Enter elements of an array");
			
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=scanner.nextInt();
			}
			System.out.println("\n Elements of an array");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
			
			System.out.println("\n\nSorting an array with selection sorting technique\n\n");
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+i;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						int temp=0;
						
						temp=arr[i];
						arr[i]=arr[j];
						
						arr[j]=temp;
					}
				}
			}
			
			System.out.println("\nAfter sorting an array");
			
			for(int i=0;i<size;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
			scanner.close();
			
			
	}
				

	}

}
