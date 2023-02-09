import java.util.Arrays;
import java.util.Scanner;

class lab{
	  
	  
	  public int onedimensionallinearsearch(int arr[], int key)
	  {
		  for(int i=0;i<arr.length;i++)
		  {
			  if(arr[i]==key)
			  {
				  System.out.print("Element found at indext :");
				 return i;
			  }
		  }
		  System.out.print("Element not found at index      :");
		  return  -1;
	  }
	  
	  public int onedimensionalbinarysearch(int arr[], int key)
	  {
		  Arrays.sort(arr);
		  
		  int first=0;
		  int last=arr.length-1;
		  
		  int mid=(first+last)/2;
		  
		  while(first>=last)
		  {
			  if(arr[mid]>key)
			  {
				  first=mid+1;
			  }
			  
			  else if(arr[mid]<key)
			  {
				  last=mid-1;
			  }
			  else {
				return mid;
			}
		  }
		  
		  
		  return -1;
	  }
  }
public class labtask {

	public static void main(String[] args) {
	 lab lab=new lab();
	 try (Scanner scanner = new Scanner(System.in)) {
		int [] array= {3,2,6,5,4,8,9,656,44,33,12,42,54,60,50};
		 
		// int [] array2= {3,29,65,5,4,81,9,656,448,333,12,42,54,60,50};
		
		 System.out.print("Enter any number to be searched :");
		 
		 int key=scanner.nextInt();
		 System.out.println("In linear search");
		 System.out.println(key+lab.onedimensionallinearsearch(array,key));
		 
		// System.out.println("In binary search");
		// System.out.println(key+lab.onedimensionalbinarysearch(array2, key));
	}
	}

}
