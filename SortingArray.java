package DSA.com;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		int temp=0;
    try( Scanner scanner=new Scanner(System.in))
    {
    	
    	System.out.println("Enter size of an array");
    	int n=scanner.nextInt();
    	
    	int[] a=new int[n];
    	System.out.println("Enter element of an array");
    	
    	for(int i=0;i<a.length;i++)
    	{
    		a[i]=scanner.nextInt();
    	}
    	for(int i=0;i<a.length-1;i++)
    	{
    		for(int k=0;k<a.length-1-i;k++)
    		{
    			if(a[k]>a[k+1])
    			{
    				temp=a[k];
    				a[k]=a[k+1];
    				a[k+1]=temp;
    			}
    		}
    	}
    	
    }
	}
    }
