package programming.com;

public class SortArray {

	public static void main(String[] args) {

		
int a[]=new int[]{2,3,4,12,65,76,-76,-3,-54,32,65,100,-100,-143,432,543,-876};
     System.out.println("\nOriginal array\nElements of an array");
      for(int i=0;i<a.length;i++)
      {
    	 System.out.print(a[i]+" ");
      }
      
      System.out.println("\nSorted array");
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=i+1;j<a.length;j++)
    	  {
    		  int temp=0;
    		  
    		  if(a[i]>a[j])
    		  {
    			  temp=a[i];
    			  a[i]=a[j];
    			  
    			  a[j]=temp;
    		  }
    		  
    	  }
    	  System.out.print(a[i]+" ");
      }
	}

}
