
import java.util.Arrays;

public class labtask3 {

	int oneDlinearsearch(int arr[], int key)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
		
	}
	
	int[] towDlinearsearch(int arr[][],int key)
	{
		int sub[] = new int[2];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			if(arr[i][j]==key)
			{
				sub[0] = i;
				sub[1] = j;
				return sub;
			}
		}
	}
		
		return  null;
	}
	
	int onedbinarysearch(int []arr, int key)
	{
		 Arrays.sort(arr);
		
		int first=0;
		int last=arr.length-1;
		
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			
			else if(arr[mid]>key)
			{
				last=mid-1;
			}
			
			else {
				return mid;
			}
			
			mid=(first+last)/2;
			
//			if(first>last)
//			{
//				System.out.println("Element not found");
//				
//			}
		}
		
	  return -1;
	}
	
//	static void towDbinarysearch(int arr[][], int key)
//	{
//		 int index=0;
//		  int[] onedarray=new int[arr.length];
//		  
//		  for(int i=0;i<arr.length;i++)
//		  {
//			  for(int j=0;j<arr.length;j++)
//			  {
//				onedarray[index]=arr[i][j];
//				
//				index++;
//			  }
//		  }
//		for(int k=0;k<onedarray.length;k++)
//		{
//			Arrays.sort(onedarray[k]);
//		}
//		
//		for(int i=0;i<arr[i].length;i++)
//		{
//			int first=0;
//			int last=arr.length-1;
//			int mid;
//			
//			mid=(first+last)/2;
//			
//			while(first>=last)
//			{
//				if(arr[i][mid]>=key)
//				{
//					System.out.println(" element found :"+arr[mid]);			}
//			}
//			
//			
//		}
//	
//		
//	}
   
}
