package programming.com;

public class BUBBLEsort {

	public static void main(String[] args) {
	
		int a[]=new int[] {32,65,32,54,-65,-6,-43,21,3,-1,43,-76,23,5};
		
		
		System.out.println("\noriginal array");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nArray after sorting using bubble sort");
		
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				int temp=0;
				
				if(a[j-1]>a[j])
				{
					temp=a[j];
					a[j]=a[j-1];
					
					a[j-1]=temp;
				}
				
				
			}
			
		}
      for(int i=0;i<a.length;i++)
      {
    	  System.out.print(a[i]+" ");
      }
	}

}
