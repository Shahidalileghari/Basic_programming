package programming.com;



public class LinearSearch {
          static  int   linearSearch(int[] arr, int n, int value)
               {
            	   for(int i=0;i<n;i++)
            	   {
            		   if(arr[i]==value)
            		   
            			   return i+1;
            		  
            		  
            	   }
            	   return -1;
               }
	public static void main(String[] args) {
	  int arr[] = {32,44,32,11,76,65,54,43};
	  int value=44;
	  int n=arr.length;
	  
	  int result=linearSearch(arr, n, value);
	  
	  System.out.println();
	  System.out.println("Elements of an array");
	  
	  for(int i=0;i<n;i++)
	  {
	 System.out.print(" "+arr[i]);
	  }
	  System.out.println();
	  
	  if(result==-1)
	  {
		  System.out.println(value+" element is not present at "+result);
	  }
	  
	  else {
		System.out.println("Element is found at "+result);
	  }
	  }
      

     }
