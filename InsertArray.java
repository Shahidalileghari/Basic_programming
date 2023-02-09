package DSA.com;

import java.util.Scanner;

public class InsertArray {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
int n,m,p;
			System.out.println("Enter size of an array");
			n=scanner.nextInt();
			
			int array[]=new int[n];
			
			int array2[]=new int[n+1];
			
			System.out.println("Enter some values of array");
			
			for(int i=0;i<n;i++)
			{
				array[i]=scanner.nextInt();
			}
			System.out.println("Enter index of new element tobe inserted");
			m=scanner.nextInt();
			
			System.out.println("Enter new element tobe inserted");
			p=scanner.nextInt();
			for(int i=0;i<n+1;i++)
			{
				if(i<m)
				{
					array2[i]=array[i];
				}
				else if (i==m) {
					array2[i]=p;
				}
				else {
					array2[i]=array[i-1];
				}
			}
			
			for(int i=0;i<n+1;i++)
			{
				
				System.out.println(+array2[i]);
				
			}}}}
