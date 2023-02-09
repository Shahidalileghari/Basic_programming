package programming.com;
public class QuickSort {
	   public int sortarray(int arr[], int low , int high)
	   {
		   int midlle=(low+high)/2;
		   
		   while(low<=high)
		   {
			   while(arr[low]<midlle)
			   {
				   low++;
			   }
			   
			   while(arr[high]>midlle)
			   {
				   low++;
			   }
			   if(arr[low]<=arr[high])
			   {
				   int temp=arr[low];
				   arr[low]=arr[high];
				   arr[high]=temp;
			   }
		   }
		   return low;
	   }
	   
	   public void recursionquicksort(int arr[], int low, int high)
	   {
		   int pi=sortarray(arr, low, high);
		   if(low<pi-1)
		   {
			   recursionquicksort(arr, low, pi-1);
			   
		   }
		   if(pi<high)
		   {
			   recursionquicksort(arr, low, high);
			   
		   }
		   
	   }
	   
	   public void printarray(int arr[])
	   {
		   for(int i:arr)
		   {
			   System.out.print(arr[i]+",");
		   }
	   }
   


	public static void main(String[] args) {

	QuickSort	sort=new QuickSort();
		int arr[]= {3,2,6,44,87,65,44,21,74,53,90,62};
		
		int lenth=arr.length;
		
		sort.sortarray(arr, 0, lenth-1);
		
		
//	System.out.println(sort.printarray(arr));
		sort.printarray(arr);
	}

}
