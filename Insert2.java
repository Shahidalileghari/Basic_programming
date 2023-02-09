package DSA.com;

import java.util.Scanner;

public class Insert2 {

	public static void main(String[] args) {
		
		int n,m,p=0;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size of array:");
			n=scanner.nextInt();
			
			int a[]=new int[n];
			
			int b[]=new int[n+1];
			
			for(int i=0;i<n;i++)
			{
				a[i]=scanner.nextInt();
			}
			
			System.out.println("Enter index of new element ");
			
			m=scanner.nextInt();
			
			System.out.println("Enter element tobe placed");
			
			for(int i=0;i<n+i;i++)
			{
				if(i<m)
				{
					a[i]=b[i];
				}
				
				else if (i==m) {
					b[i]=p;
				}
				else {
					b[i]=a[i-1];
				}
			}
			for(int i=0;i<n+1;i++)
			{
				System.out.println(b[i]);
			}
			
			
		}//scanner
	}

}
