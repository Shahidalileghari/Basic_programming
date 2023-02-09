package programming.com;

public class BinarySearch {
   public static int Binary(int[] arr, int key, int last, int first )
   
   {
	   
	   int mid=(last+first)/2;
	   
	   while(first<=last)
	   {
		   if(arr[mid]<key)
		   {
			   first=mid+1;
		   }
		   
		   else if(arr[mid]==key)
		   {
			   System.out.println("Elements found at index"+mid);
			   break;
		   }
		  
		   
		   else {
			   last=mid-1;
		   }
		   mid=(last+first)/2;
		   if(first>last)
		   {
			   System.out.println("Element not found");
		   }
	   }
	   
	   
	
	   return 1;
   }
	public static void main(String[] args) {
		
		int arr[]= {21,32,34,43,21,7,5,6,9,3,1,4};
		
		int last=arr.length-1;
		int key=34;
		
		System.out.println(key +" Finding an element at :"+Binary(arr, key, last, 0));
	}

}
