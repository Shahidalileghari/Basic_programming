package programming.com;

import java.util.Scanner;

public class Transverse {

	public static void main(String[] args) {
      
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of an array");
			
			int size=scanner.nextInt();
			
			int arr[]=new int[size];
			
			System.out.println("Enter elements of an array");
			for(int j=0;j<arr.length;j++)
			{
				arr[j]=scanner.nextInt();
			}
			
		
			
System.out.println("Original  array");

for(int i=0;i<arr.length;i++)
{
			System.out.println(arr[i]);
}


 System.out.println("Sorting an array using  bubble sort technique");
 
 for(int i=0;i<arr.length;i++)
	 
 {
 if(arr[i]>arr[i+1])
 {
		int temp=0;
			temp=arr[i];
			arr[i]=arr[i+1];
			
			arr[i+1]=temp;
			
			System.out.println(arr[i]);
			
 }
 
 
 }
		}
	 
	 
	
	}

}
