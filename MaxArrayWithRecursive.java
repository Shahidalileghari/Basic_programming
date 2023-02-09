package programming.com;

import java.util.Scanner;

public class MaxArrayWithRecursive {
      static int a(int a[],int n, int i){
    	  if(i==n-1)
    	  {
    		  return a[i];
    	  }
    	  
    	  int recMax=a(a, n, i+1);
    	  
    	  return Math.max(recMax, a[i]);
    	  
    	  
      }
	public static void main(String[] args) {
//	  int a[]= {21,4534,432,543,67,876,5654,3214,-9};
//	  
//	  int n=a.length;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter size an array");
			int size=scanner.nextInt();
			int array[]=new int[size];
			for(int i=0;i<array.length;i++)
			{
			array[i]=scanner.nextInt();
			}
  int n=array.length;
  
  System.out.println("Largest element in array is :"+a(array, n, 0));
		}

	}

}
